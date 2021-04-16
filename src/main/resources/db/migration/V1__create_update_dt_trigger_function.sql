CREATE OR REPLACE FUNCTION public.set_update_time()
    RETURNS trigger
    LANGUAGE 'plpgsql'
    COST 100
    VOLATILE NOT LEAKPROOF
AS $BODY$
begin
    new.update_dt := 'now';
    return new;
  end;
$BODY$;
