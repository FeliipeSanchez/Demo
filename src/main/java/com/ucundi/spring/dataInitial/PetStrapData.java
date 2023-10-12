package com.ucundi.spring.dataInitial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ucundi.spring.domain.camasEntity;
import com.ucundi.spring.domain.combosEntity;
import com.ucundi.spring.domain.comidaEntity;
import com.ucundi.spring.domain.ropaEntity;
import com.ucundi.spring.domain.serviciosEntity;
import com.ucundi.spring.repositories.camasRepositories;
import com.ucundi.spring.repositories.combosRepositories;
import com.ucundi.spring.repositories.comidaRepositories;
import com.ucundi.spring.repositories.ropaRepositories;
import com.ucundi.spring.repositories.serviciosRepositories;

@Component
public class PetStrapData implements CommandLineRunner {

        private final camasRepositories camasRepositorio;

        private final comidaRepositories comidaRepositorio;

        private final ropaRepositories ropaRepositorio;

        private final serviciosRepositories serviciosRepositorio;

        public PetStrapData(camasRepositories camasRepositorio, comidaRepositories comidaRepositorio,
                        ropaRepositories ropaRepositorio, serviciosRepositories serviciosRepositorio) {
                this.camasRepositorio = camasRepositorio;
                this.comidaRepositorio = comidaRepositorio;
                this.ropaRepositorio = ropaRepositorio;
                this.serviciosRepositorio = serviciosRepositorio;
        }

        @Override
        public void run(String... args) throws Exception {

                // Crear 10 instancias de camasEntity con datos diferentes

                camasEntity agregarCama1 = new camasEntity("King", "Grande", "Matrimonial", 245, "Negro");
                camasEntity agregarCama2 = new camasEntity("Queen", "Grande", "Matrimonial", 299, "Blanco");
                camasEntity agregarCama3 = new camasEntity("Doble", "Mediana", "Individual", 150, "Azul");
                camasEntity agregarCama4 = new camasEntity("Individual", "Pequeña", "Individual", 99, "Rojo");
                camasEntity agregarCama5 = new camasEntity("King", "Grande", "Matrimonial", 279, "Gris");
                camasEntity agregarCama6 = new camasEntity("Queen", "Grande", "Matrimonial", 329, "Verde");
                camasEntity agregarCama7 = new camasEntity("Doble", "Mediana", "Individual", 175, "Amarillo");
                camasEntity agregarCama8 = new camasEntity("Individual", "Pequeña", "Individual", 110, "Blanco");
                camasEntity agregarCama9 = new camasEntity("King", "Grande", "Matrimonial", 259, "Marrón");
                camasEntity agregarCama10 = new camasEntity("Queen", "Grande", "Matrimonial", 299, "Negro");

                camasRepositorio.save(agregarCama1);
                camasRepositorio.save(agregarCama2);
                camasRepositorio.save(agregarCama3);
                camasRepositorio.save(agregarCama4);
                camasRepositorio.save(agregarCama5);
                camasRepositorio.save(agregarCama6);
                camasRepositorio.save(agregarCama7);
                camasRepositorio.save(agregarCama8);
                camasRepositorio.save(agregarCama9);
                camasRepositorio.save(agregarCama10);

                // Crear 10 instancias de comidaEntity con datos diferentes

                comidaEntity agregarComida1 = new comidaEntity("Comida para perro cachorro", "1 Bulto de 10.000gr",
                                "Dog show",
                                50, "Pequeña");
                comidaEntity agregarComida2 = new comidaEntity("Comida para gato adulto", "2 Bolsas de 3.500gr",
                                "Cat Delight",
                                30, "Mediana");
                comidaEntity agregarComida3 = new comidaEntity("Comida para perro adulto", "1 Bulto de 15.000gr",
                                "Healthy Paws", 65, "Grande");
                comidaEntity agregarComida4 = new comidaEntity("Comida para gato cachorro", "1 Bolsa de 5.000gr",
                                "Kitten Joy",
                                40, "Pequeña");
                comidaEntity agregarComida5 = new comidaEntity("Comida para perro senior", "2 Bolsas de 7.500gr",
                                "Golden Years", 55, "Mediana");
                comidaEntity agregarComida6 = new comidaEntity("Comida para gato adulto", "1 Bulto de 12.000gr",
                                "Whisker's Delight", 50, "Grande");
                comidaEntity agregarComida7 = new comidaEntity("Comida para perro cachorro", "3 Bolsas de 4.000gr",
                                "Puppy Love", 45, "Pequeña");
                comidaEntity agregarComida8 = new comidaEntity("Comida para gato senior", "1 Bulto de 9.000gr",
                                "Senior Whiskers", 35, "Mediana");
                comidaEntity agregarComida9 = new comidaEntity("Comida para perro adulto", "2 Bolsas de 6.000gr",
                                "Active Paws",
                                60, "Grande");
                comidaEntity agregarComida10 = new comidaEntity("Comida para gato cachorro", "1 Bolsa de 3.000gr",
                                "Kitten Crunch", 38, "Pequeña");

                comidaRepositorio.save(agregarComida1);
                comidaRepositorio.save(agregarComida2);
                comidaRepositorio.save(agregarComida3);
                comidaRepositorio.save(agregarComida4);
                comidaRepositorio.save(agregarComida5);
                comidaRepositorio.save(agregarComida6);
                comidaRepositorio.save(agregarComida7);
                comidaRepositorio.save(agregarComida8);
                comidaRepositorio.save(agregarComida9);
                comidaRepositorio.save(agregarComida10);

                // Crear 10 instancias de ropaEntity para ropa de mascotas con datos diferentes

                ropaEntity agregarRopa1 = new ropaEntity("Suéter para perro", "Petmod", 25, "Pequeña", "Blanco");
                ropaEntity agregarRopa2 = new ropaEntity("Camisa para gato", "PawStyle", 15, "Mediana", "Azul");
                ropaEntity agregarRopa3 = new ropaEntity("Abrigo para perro", "FurryChic", 35, "Grande", "Negro");
                ropaEntity agregarRopa4 = new ropaEntity("Vestido para perro", "PurrfectFashion", 20, "Pequeña",
                                "Rosa");
                ropaEntity agregarRopa5 = new ropaEntity("Chaqueta para gato", "TailWaggers", 30, "Mediana", "Gris");
                ropaEntity agregarRopa6 = new ropaEntity("Pantalones para perro", "PetCouture", 28, "Grande", "Verde");
                ropaEntity agregarRopa7 = new ropaEntity("Falda para gato", "Catwalk", 18, "Pequeña", "Amarillo");
                ropaEntity agregarRopa8 = new ropaEntity("Jersey para perro", "BarkStyle", 22, "Mediana", "Rojo");
                ropaEntity agregarRopa9 = new ropaEntity("Pijama para gato", "CozyPets", 27, "Grande", "Morado");
                ropaEntity agregarRopa10 = new ropaEntity("Sombrero para perro", "PetElegance", 12, "Pequeño",
                                "Naranja");

                ropaRepositorio.save(agregarRopa1);
                ropaRepositorio.save(agregarRopa2);
                ropaRepositorio.save(agregarRopa3);
                ropaRepositorio.save(agregarRopa4);
                ropaRepositorio.save(agregarRopa5);
                ropaRepositorio.save(agregarRopa6);
                ropaRepositorio.save(agregarRopa7);
                ropaRepositorio.save(agregarRopa8);
                ropaRepositorio.save(agregarRopa9);
                ropaRepositorio.save(agregarRopa10);

                // Crear 10 instancias de serviciosEntity con datos diferentes

                serviciosEntity agregarServicio1 = new serviciosEntity("Peluquería canina", "2 Horas", 30, "Perro",
                                "Grande");
                serviciosEntity agregarServicio2 = new serviciosEntity("Baño para gatos", "1 Hora", 20, "Gato",
                                "Pequeño");
                serviciosEntity agregarServicio3 = new serviciosEntity("Paseo de perros", "30 Minutos", 15, "Perro",
                                "Mediano");
                serviciosEntity agregarServicio4 = new serviciosEntity("Corte de uñas para gatos", "30 Minutos", 10,
                                "Gato",
                                "Pequeño");
                serviciosEntity agregarServicio5 = new serviciosEntity("Entrenamiento de perros", "1 Hora", 40, "Perro",
                                "Grande");
                serviciosEntity agregarServicio6 = new serviciosEntity("Limpieza de orejas para gatos", "15 Minutos", 8,
                                "Gato",
                                "Pequeño");
                serviciosEntity agregarServicio7 = new serviciosEntity("Guardería para perros", "4 Horas", 50, "Perro",
                                "Mediano");
                serviciosEntity agregarServicio8 = new serviciosEntity("Baño de lujo para gatos", "1 Hora", 30, "Gato",
                                "Grande");
                serviciosEntity agregarServicio9 = new serviciosEntity("Paseo a domicilio para perros", "45 Minutos",
                                25,
                                "Perro", "Mediano");
                serviciosEntity agregarServicio10 = new serviciosEntity("Masaje relajante para gatos", "30 Minutos", 12,
                                "Gato",
                                "Pequeño");
                

                serviciosRepositorio.save(agregarServicio1);
                serviciosRepositorio.save(agregarServicio2);
                serviciosRepositorio.save(agregarServicio3);
                serviciosRepositorio.save(agregarServicio4);
                serviciosRepositorio.save(agregarServicio5);
                serviciosRepositorio.save(agregarServicio6);
                serviciosRepositorio.save(agregarServicio7);
                serviciosRepositorio.save(agregarServicio8);
                serviciosRepositorio.save(agregarServicio9);
                serviciosRepositorio.save(agregarServicio10);



                combosEntity agregarcombo1 = new combosEntity("Combo canino", "200", "20", "0", "1", "2");
                


                System.out.println("Cantidad de Camas");
                System.out.println("Camas: " + camasRepositorio.count());
                System.out.println("\nCantidad de Comidas");
                System.out.println("Comidas: " + comidaRepositorio.count());
                System.out.println("\nCantidad de Ropa");
                System.out.println("Ropa: " + ropaRepositorio.count());
                System.out.println("\nCantidad de Servicios");
                System.out.println("Servicios: " + serviciosRepositorio.count());

        }

}
