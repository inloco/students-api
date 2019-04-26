CREATE TABLE institution (
    id serial PRIMARY KEY,
    name text not null,
    foundation_date date not null
);

CREATE TABLE student (
    id serial primary key,
    name text not null,
    born date not null,
    institution_id integer references institution(id)
)