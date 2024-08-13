INSERT INTO public.modeadministration (id, descriptionmode) VALUES 
(1, 'Oral'),
(2, 'Topical');

INSERT INTO public.unitmeasurement (idum, nameum, codeum) VALUES 
(1, 'Milligram', 'mg'),
(2, 'Liter', 'L');

INSERT INTO public.activeprinciple (idap, nameap) VALUES 
(1, 'Acetaminophen'),
(2, 'Ibuprofen');

INSERT INTO public.medicine (id, proceedings, namemedicine, healthregister, description, idcodeadmin, codeadmin, idum, codeum) VALUES 
(1, 'Pain relief', 'Tylenol', 'HR123', 'Used for pain and fever', 1, 'Oral', 1, 'mg'),
(2, 'Anti-inflammatory', 'Advil', 'HR124', 'Used for pain and inflammation', 2, 'Oral', 2, 'L');

INSERT INTO public.laboratory (id, namelab, codecityreg) VALUES 
(1, 'LabCorp', 'C001'),
(2, 'Quest Diagnostics', 'C002');

INSERT INTO public.customer (idcustomer, namecustomer, lastnamecustomer, codecitycustomer, birthdate, emailcustomer, phonecustomer, latitud, longitud) VALUES 
(1, 'John', 'Doe', 'C001', '1985-06-15', 'johndoe@example.com', '555-1234', 34.0522, -118.2437),
(2, 'Jane', 'Smith', 'C002', '1990-09-23', 'janesmith@example.com', '555-5678', 40.7128, -74.0060);

INSERT INTO public.farmacy (idfarmacy, namefarmacy, addressfarmacy, codecityfarmacy, long, lat, logo) VALUES 
(1, 'Pharmacy One', '123 Main St', 'C001', -118.2437, 34.0522, 'logo1.png'),
(2, 'Pharmacy Two', '456 Elm St', 'C002', -74.0060, 40.7128, 'logo2.png');

INSERT INTO public.city (codecity, namecity, codecountry) VALUES 
('C001', 'Los Angeles', 'US'),
('C002', 'New York', 'US');
INSERT INTO public.region (codereg, namereg, codecountry) VALUES 
('R001', 'California', 'US'),
('R002', 'New York State', 'US');

INSERT INTO public.country (codecountry, namecountry) VALUES 
('US', 'United States'),
('MX', 'Mexico');