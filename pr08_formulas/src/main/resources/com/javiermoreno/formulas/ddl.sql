DROP TABLE "APP"."EMPLEADOS";
CREATE TABLE "APP"."EMPLEADOS"
(
   ID_EMP int PRIMARY KEY NOT NULL GENERATED ALWAYS AS IDENTITY,
   NASS_EMP char(14),
   NOMBRE_EMP varchar(255),
   SUELDO_BASE_EMP decimal(6,2),
   CATEGORIA_EMP int
);

INSERT INTO  "APP"."EMPLEADOS"  
    (NASS_EMP, NOMBRE_EMP, SUELDO_BASE_EMP, CATEGORIA_EMP)
VALUES ('01/0123457/01', 'John Smith', 1000, 25)