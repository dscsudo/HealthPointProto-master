CREATE TABLE IF NOT EXISTS public.steps
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    user_id integer NOT NULL,
    step integer NOT NULL,
    record_timestamp timestamp with time zone NOT NULL,
    create_dt timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_dt timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT steps_pkey PRIMARY KEY (id),
    CONSTRAINT ext_user_id FOREIGN KEY (user_id)
        REFERENCES public."user" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

CREATE TRIGGER update_steps_dt_tri
    BEFORE UPDATE
    ON public.steps
    FOR EACH ROW
    EXECUTE PROCEDURE public.set_update_time();
