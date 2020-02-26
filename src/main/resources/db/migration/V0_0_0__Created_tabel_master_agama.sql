create table master_agama(
	agama_id character varying(50) not null primary key unique,
	nama_agama character varying(50) not null unique,
	deskripsi character varying(200),
	created_date Timestamp not null,
	created_by character varying(50)
);