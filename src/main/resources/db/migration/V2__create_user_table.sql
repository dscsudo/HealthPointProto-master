CREATE TABLE IF NOT EXISTS "user"
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    create_dt timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    name text COLLATE pg_catalog."default" NOT NULL,
    update_dt timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT primary_key PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

CREATE TRIGGER update_steps_dt_tri
    BEFORE UPDATE
    ON public."user"
    FOR EACH ROW
    EXECUTE PROCEDURE public.set_update_time();
