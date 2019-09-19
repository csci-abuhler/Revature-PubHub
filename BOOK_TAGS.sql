-- Table: public.book_tags

-- DROP TABLE public.book_tags;

CREATE TABLE public.book_tags
(
    isbn_13 character varying(255) COLLATE pg_catalog."default" NOT NULL,
    tag_name character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT isbn_13 FOREIGN KEY (isbn_13)
        REFERENCES public.books (isbn_13) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.book_tags
    OWNER to postgres;
	
-- insert into book_tags values (1111111111111, 'fiction');
-- insert into book_tags values (1111111111111, 'fiction');

select * from book_tags;