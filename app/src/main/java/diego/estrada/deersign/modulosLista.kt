package diego.estrada.deersign


import android.graphics.Color
import android.graphics.drawable.Icon
import android.util.Log.*


//Lista con las categorías, subcategorías y palabras
var modulosLista = mutableListOf(
    category(
        "ABC",
        R.drawable.abc,
        "#eea236",

        mutableListOf(
            subCategorias(
                "ABC I",
                "#eea236",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
            subCategorias(
                "ABC II",
                "#eea236",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
            subCategorias(
                "ABC III",
                "#eea236",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
            subCategorias(
                "ABC IV",
                "#eea236",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
            subCategorias(
                "ABC V",
                "#eea236",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABEJA",
                R.raw.abeja

            ),
            word(
                "AGUILA",
                R.raw.aguila

            ),
            word(
                "ARANA",
                R.raw.arana

            ),
            word(
                "ARDILLA",
                R.raw.ardilla

            ),
            word(
                "BURRO",
                R.raw.burro

            ),
        ),
        5,

        ),
    category(
        "ANIMALES",
        R.drawable.animales,
        "#42a5f5",

        mutableListOf(
            subCategorias(
                "ANIMALES I",
                "#42a5f5",

                mutableListOf(
                    word(
                        "ABEJA",
                        R.raw.abeja

                    ),
                    word(
                        "AGUILA",
                        R.raw.aguila

                    ),
                    word(
                        "ARANA",
                        R.raw.arana

                    ),
                    word(
                        "ARDILLA",
                        R.raw.ardilla

                    ),
                    word(
                        "BURRO",
                        R.raw.burro

                    ),
                )
            ),
            subCategorias(
                "ANIMALES II",
                "#42a5f5",

                mutableListOf(
                    word(
                        "CABALLO",
                        R.raw.caballo

                    ),
                    word(
                        "CERDO",
                        R.raw.cerdo

                    ),
                    word(
                        "CHANGO",
                        R.raw.chango

                    ),
                    word(
                        "CONEJO",
                        R.raw.conejo

                    ),
                    word(
                        "GATO",
                        R.raw.gato

                    ),
                )
            ),
            subCategorias(
                "ANIMALES III",
                "#42a5f5",

                mutableListOf(
                    word(
                        "GORILA",
                        R.raw.gorila

                    ),
                    word(
                        "GUSANO",
                        R.raw.gusano

                    ),
                    word(
                        "JIRAFA",
                        R.raw.jirafa

                    ),
                    word(
                        "LEON",
                        R.raw.leon

                    ),
                    word(
                        "MARIPOSA",
                        R.raw.mariposa

                    ),
                )
            ),
            subCategorias(
                "ANIMALES IV",
                "#42a5f5",

                mutableListOf(
                    word(
                        "OSO",
                        R.raw.oso

                    ),
                    word(
                        "PAJARO",
                        R.raw.pajaro

                    ),
                    word(
                        "PALOMA",
                        R.raw.paloma

                    ),
                    word(
                        "PATO",
                        R.raw.pato

                    ),
                    word(
                        "PERRO",
                        R.raw.perro

                    ),
                )
            ),
            subCategorias(
                "ANIMALES V",
                "#42a5f5",

                mutableListOf(
                    word(
                        "PEZ",
                        R.raw.pez

                    ),
                    word(
                        "RATON",
                        R.raw.raton

                    ),
                    word(
                        "TIGRE",
                        R.raw.tigre

                    ),
                    word(
                        "TORO",
                        R.raw.toro

                    ),
                    word(
                        "TORTUGA",
                        R.raw.tortuga

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABEJA",
                R.raw.abeja

            ),
            word(
                "AGUILA",
                R.raw.aguila

            ),
            word(
                "ARANA",
                R.raw.arana

            ),
            word(
                "ARDILLA",
                R.raw.ardilla

            ),
            word(
                "BURRO",
                R.raw.burro

            ),
            word(
                "CABALLO",
                R.raw.caballo

            ),
            word(
                "CERDO",
                R.raw.cerdo

            ),
            word(
                "CHANGO",
                R.raw.chango

            ),
            word(
                "CONEJO",
                R.raw.conejo

            ),
            word(
                "GATO",
                R.raw.gato

            ),
            word(
                "GORILA",
                R.raw.gorila

            ),
            word(
                "GUSANO",
                R.raw.gusano

            ),
            word(
                "JIRAFA",
                R.raw.jirafa

            ),
            word(
                "LEON",
                R.raw.leon

            ),
            word(
                "MARIPOSA",
                R.raw.mariposa

            ),
            word(
                "OSO",
                R.raw.oso

            ),
            word(
                "PAJARO",
                R.raw.pajaro

            ),
            word(
                "PALOMA",
                R.raw.paloma

            ),
            word(
                "PATO",
                R.raw.pato

            ),
            word(
                "PERRO",
                R.raw.perro

            ),
            word(
                "PEZ",
                R.raw.pez

            ),
            word(
                "RATON",
                R.raw.raton

            ),
            word(
                "TIGRE",
                R.raw.tigre

            ),
            word(
                "TORO",
                R.raw.toro

            ),
            word(
                "TORTUGA",
                R.raw.tortuga

            ),
            word(
                "VACA",
                R.raw.vaca

            ),
            word(
                "VIBORA",
                R.raw.vibora

            ),
        ),
        5,

        ),
    category(
        "COLORES",
        R.drawable.colores,
        "#92d36e",

        mutableListOf(
            subCategorias(
                "COLORES I",
                "#92d36e",

                mutableListOf(
                    word(
                        "AMARILLO",
                        R.raw.amarillo

                    ),
                    word(
                        "AZUL",
                        R.raw.azul

                    ),
                    word(
                        "BLANCO",
                        R.raw.blanco

                    ),
                    word(
                        "CAFE",
                        R.raw.cafe

                    ),
                    word(
                        "GRIS",
                        R.raw.gris

                    ),
                )
            ),
            subCategorias(
                "COLORES II",
                "#92d36e",

                mutableListOf(
                    word(
                        "MORADO",
                        R.raw.morado

                    ),
                    word(
                        "NARANJA",
                        R.raw.naranja

                    ),
                    word(
                        "NEGRO",
                        R.raw.negro

                    ),
                    word(
                        "ORO",
                        R.raw.oro

                    ),
                    word(
                        "PLATA",
                        R.raw.plata

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "AMARILLO",
                R.raw.amarillo

            ),
            word(
                "AZUL",
                R.raw.azul

            ),
            word(
                "BLANCO",
                R.raw.blanco

            ),
            word(
                "CAFE",
                R.raw.cafe

            ),
            word(
                "GRIS",
                R.raw.gris

            ),
            word(
                "MORADO",
                R.raw.morado

            ),
            word(
                "NARANJA",
                R.raw.naranja

            ),
            word(
                "NEGRO",
                R.raw.negro

            ),
            word(
                "ORO",
                R.raw.oro

            ),
            word(
                "PLATA",
                R.raw.plata

            ),
            word(
                "ROJO",
                R.raw.rojo

            ),
            word(
                "ROSA",
                R.raw.rosa

            ),
            word(
                "VERDE",
                R.raw.verde

            ),
        ),
        2,

        ),
    category(
        "COMIDA",
        R.drawable.comida,
        "#ff5d55",

        mutableListOf(
            subCategorias(
                "COMIDA I",
                "#ff5d55",

                mutableListOf(
                    word(
                        "ACEITE",
                        R.raw.aceite

                    ),
                    word(
                        "AGUA",
                        R.raw.agua

                    ),
                    word(
                        "ARROZ",
                        R.raw.arroz

                    ),
                    word(
                        "AZUCAR",
                        R.raw.azucar

                    ),
                    word(
                        "CAFE",
                        R.raw.cafe

                    ),
                )
            ),
            subCategorias(
                "COMIDA II",
                "#ff5d55",

                mutableListOf(
                    word(
                        "CALDO",
                        R.raw.caldo

                    ),
                    word(
                        "CARNE",
                        R.raw.carne

                    ),
                    word(
                        "CERVEZA",
                        R.raw.cerveza

                    ),
                    word(
                        "CHILE",
                        R.raw.chile

                    ),
                    word(
                        "CHOCOLATE",
                        R.raw.chocolate

                    ),
                )
            ),
            subCategorias(
                "COMIDA III",
                "#ff5d55",

                mutableListOf(
                    word(
                        "COCACOLA",
                        R.raw.cocacola

                    ),
                    word(
                        "DULCE",
                        R.raw.dulce

                    ),
                    word(
                        "ENSALADA",
                        R.raw.ensalada

                    ),
                    word(
                        "FRIJOL",
                        R.raw.frijol

                    ),
                    word(
                        "FRUTA",
                        R.raw.fruta

                    ),
                )
            ),
            subCategorias(
                "COMIDA IV",
                "#ff5d55",

                mutableListOf(
                    word(
                        "GALLETA",
                        R.raw.galleta

                    ),
                    word(
                        "HAMBURGUESA",
                        R.raw.hamburguesa

                    ),
                    word(
                        "HUEVO",
                        R.raw.huevo

                    ),
                    word(
                        "LECHE",
                        R.raw.leche

                    ),
                    word(
                        "PAN",
                        R.raw.pan

                    ),
                )
            ),
            subCategorias(
                "COMIDA V",
                "#ff5d55",

                mutableListOf(
                    word(
                        "PASTEL",
                        R.raw.pastel

                    ),
                    word(
                        "PESCADO",
                        R.raw.pescado

                    ),
                    word(
                        "PIZZA",
                        R.raw.pizza

                    ),
                    word(
                        "POLLO",
                        R.raw.pollo

                    ),
                    word(
                        "QUESO",
                        R.raw.queso

                    ),
                )
            ),
            subCategorias(
                "COMIDA VI",
                "#ff5d55",

                mutableListOf(
                    word(
                        "REFRESCO",
                        R.raw.refresco

                    ),
                    word(
                        "SOPA",
                        R.raw.sopa

                    ),
                    word(
                        "TACO",
                        R.raw.taco

                    ),
                    word(
                        "TORTILLA",
                        R.raw.tortilla

                    ),
                    word(
                        "VERDURA",
                        R.raw.verdura

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ACEITE",
                R.raw.aceite

            ),
            word(
                "AGUA",
                R.raw.agua

            ),
            word(
                "ARROZ",
                R.raw.arroz

            ),
            word(
                "AZUCAR",
                R.raw.azucar

            ),
            word(
                "CAFE",
                R.raw.cafe

            ),
            word(
                "CALDO",
                R.raw.caldo

            ),
            word(
                "CARNE",
                R.raw.carne

            ),
            word(
                "CERVEZA",
                R.raw.cerveza

            ),
            word(
                "CHILE",
                R.raw.chile

            ),
            word(
                "CHOCOLATE",
                R.raw.chocolate

            ),
            word(
                "COCACOLA",
                R.raw.cocacola

            ),
            word(
                "DULCE",
                R.raw.dulce

            ),
            word(
                "ENSALADA",
                R.raw.ensalada

            ),
            word(
                "FRIJOL",
                R.raw.frijol

            ),
            word(
                "FRUTA",
                R.raw.fruta

            ),
            word(
                "GALLETA",
                R.raw.galleta

            ),
            word(
                "HAMBURGUESA",
                R.raw.hamburguesa

            ),
            word(
                "HUEVO",
                R.raw.huevo

            ),
            word(
                "LECHE",
                R.raw.leche

            ),
            word(
                "PAN",
                R.raw.pan

            ),
            word(
                "PASTEL",
                R.raw.pastel

            ),
            word(
                "PESCADO",
                R.raw.pescado

            ),
            word(
                "PIZZA",
                R.raw.pizza

            ),
            word(
                "POLLO",
                R.raw.pollo

            ),
            word(
                "QUESO",
                R.raw.queso

            ),
            word(
                "REFRESCO",
                R.raw.refresco

            ),
            word(
                "SOPA",
                R.raw.sopa

            ),
            word(
                "TACO",
                R.raw.taco

            ),
            word(
                "TORTILLA",
                R.raw.tortilla

            ),
            word(
                "VERDURA",
                R.raw.verdura

            ),
        ),
        6,

        ),
    category(
        "CUERPO",
        R.drawable.cuerpo,
        "#c238eb",

        mutableListOf(
            subCategorias(
                "CUERPO I",
                "#c238eb",

                mutableListOf(
                    word(
                        "BOCA",
                        R.raw.boca

                    ),
                    word(
                        "CABEZA",
                        R.raw.cabeza

                    ),
                    word(
                        "CARA",
                        R.raw.cara

                    ),
                    word(
                        "CEJAS",
                        R.raw.cejas

                    ),
                    word(
                        "CORAZON",
                        R.raw.corazon

                    ),
                )
            ),
            subCategorias(
                "CUERPO II",
                "#c238eb",

                mutableListOf(
                    word(
                        "ESTOMAGO",
                        R.raw.estomago

                    ),
                    word(
                        "HUESO",
                        R.raw.hueso

                    ),
                    word(
                        "MANO",
                        R.raw.mano

                    ),
                    word(
                        "NARIZ",
                        R.raw.nariz

                    ),
                    word(
                        "OJOS",
                        R.raw.ojos

                    ),
                )
            ),
            subCategorias(
                "CUERPO III",
                "#c238eb",

                mutableListOf(
                    word(
                        "OREJA",
                        R.raw.oreja

                    ),
                    word(
                        "PESTANAS",
                        R.raw.pestanas

                    ),
                    word(
                        "PIEL",
                        R.raw.piel

                    ),
                    word(
                        "PIES",
                        R.raw.pies

                    ),
                    word(
                        "SANGRE",
                        R.raw.sangre

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "BOCA",
                R.raw.boca

            ),
            word(
                "CABEZA",
                R.raw.cabeza

            ),
            word(
                "CARA",
                R.raw.cara

            ),
            word(
                "CEJAS",
                R.raw.cejas

            ),
            word(
                "CORAZON",
                R.raw.corazon

            ),
            word(
                "ESTOMAGO",
                R.raw.estomago

            ),
            word(
                "HUESO",
                R.raw.hueso

            ),
            word(
                "MANO",
                R.raw.mano

            ),
            word(
                "NARIZ",
                R.raw.nariz

            ),
            word(
                "OJOS",
                R.raw.ojos

            ),
            word(
                "OREJA",
                R.raw.oreja

            ),
            word(
                "PESTANAS",
                R.raw.pestanas

            ),
            word(
                "PIEL",
                R.raw.piel

            ),
            word(
                "PIES",
                R.raw.pies

            ),
            word(
                "SANGRE",
                R.raw.sangre

            ),
        ),
        3,

        ),
    category(
        "DIAS",
        R.drawable.dias,
        "#929292",

        mutableListOf(
            subCategorias(
                "DIAS I",
                "#929292",

                mutableListOf(
                    word(
                        "DOMINGO",
                        R.raw.domingo

                    ),
                    word(
                        "JUEVES",
                        R.raw.jueves

                    ),
                    word(
                        "LUNES",
                        R.raw.lunes

                    ),
                    word(
                        "MARTES",
                        R.raw.martes

                    ),
                    word(
                        "MIERCOLES",
                        R.raw.miercoles

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "DOMINGO",
                R.raw.domingo

            ),
            word(
                "JUEVES",
                R.raw.jueves

            ),
            word(
                "LUNES",
                R.raw.lunes

            ),
            word(
                "MARTES",
                R.raw.martes

            ),
            word(
                "MIERCOLES",
                R.raw.miercoles

            ),
            word(
                "SABADO",
                R.raw.sabado

            ),
            word(
                "VIERNES",
                R.raw.viernes

            ),
        ),
        1,

        ),
    category(
        "FRUTAS",
        R.drawable.frutas,
        "#3CA99B",

        mutableListOf(
            subCategorias(
                "FRUTAS I",
                "#3CA99B",

                mutableListOf(
                    word(
                        "ALMENDRA",
                        R.raw.almendra

                    ),
                    word(
                        "CEREZA",
                        R.raw.cereza

                    ),
                    word(
                        "COCO",
                        R.raw.coco

                    ),
                    word(
                        "DURAZNO",
                        R.raw.durazno

                    ),
                    word(
                        "FRESA",
                        R.raw.fresa

                    ),
                )
            ),
            subCategorias(
                "FRUTAS II",
                "#3CA99B",

                mutableListOf(
                    word(
                        "GUAYABA",
                        R.raw.guayaba

                    ),
                    word(
                        "JAMAICA",
                        R.raw.jamaica

                    ),
                    word(
                        "JICAMA",
                        R.raw.jicama

                    ),
                    word(
                        "LIMON",
                        R.raw.limon

                    ),
                    word(
                        "MANGO",
                        R.raw.mango

                    ),
                )
            ),
            subCategorias(
                "FRUTAS III",
                "#3CA99B",

                mutableListOf(
                    word(
                        "MANZANA",
                        R.raw.manzana

                    ),
                    word(
                        "MELON",
                        R.raw.melon

                    ),
                    word(
                        "NARANJA",
                        R.raw.naranja

                    ),
                    word(
                        "NUEZ",
                        R.raw.nuez

                    ),
                    word(
                        "PAPAYA",
                        R.raw.papaya

                    ),
                )
            ),
            subCategorias(
                "FRUTAS IV",
                "#3CA99B",

                mutableListOf(
                    word(
                        "PERA",
                        R.raw.pera

                    ),
                    word(
                        "PINA",
                        R.raw.pina

                    ),
                    word(
                        "PLATANO",
                        R.raw.platano

                    ),
                    word(
                        "SANDIA",
                        R.raw.sandia

                    ),
                    word(
                        "TAMARINDO",
                        R.raw.tamarindo

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ALMENDRA",
                R.raw.almendra

            ),
            word(
                "CEREZA",
                R.raw.cereza

            ),
            word(
                "COCO",
                R.raw.coco

            ),
            word(
                "DURAZNO",
                R.raw.durazno

            ),
            word(
                "FRESA",
                R.raw.fresa

            ),
            word(
                "GUAYABA",
                R.raw.guayaba

            ),
            word(
                "JAMAICA",
                R.raw.jamaica

            ),
            word(
                "JICAMA",
                R.raw.jicama

            ),
            word(
                "LIMON",
                R.raw.limon

            ),
            word(
                "MANGO",
                R.raw.mango

            ),
            word(
                "MANZANA",
                R.raw.manzana

            ),
            word(
                "MELON",
                R.raw.melon

            ),
            word(
                "NARANJA",
                R.raw.naranja

            ),
            word(
                "NUEZ",
                R.raw.nuez

            ),
            word(
                "PAPAYA",
                R.raw.papaya

            ),
            word(
                "PERA",
                R.raw.pera

            ),
            word(
                "PINA",
                R.raw.pina

            ),
            word(
                "PLATANO",
                R.raw.platano

            ),
            word(
                "SANDIA",
                R.raw.sandia

            ),
            word(
                "TAMARINDO",
                R.raw.tamarindo

            ),
            word(
                "TORONJA",
                R.raw.toronja

            ),
            word(
                "UVA",
                R.raw.uva

            ),
        ),
        4,

        ),
    category(
        "HOGAR",
        R.drawable.hogar,
        "#d68227",

        mutableListOf(
            subCategorias(
                "HOGAR I",
                "#d68227",

                mutableListOf(
                    word(
                        "BANO",
                        R.raw.bano

                    ),
                    word(
                        "CAJA",
                        R.raw.caja

                    ),
                    word(
                        "CAMA",
                        R.raw.cama

                    ),
                    word(
                        "CASA",
                        R.raw.casa

                    ),
                    word(
                        "CELULAR",
                        R.raw.celular

                    ),
                )
            ),
            subCategorias(
                "HOGAR II",
                "#d68227",

                mutableListOf(
                    word(
                        "COCINA",
                        R.raw.cocina

                    ),
                    word(
                        "COMPUTADORA",
                        R.raw.computadora

                    ),
                    word(
                        "CUARTO",
                        R.raw.cuarto

                    ),
                    word(
                        "CUCHARA",
                        R.raw.cuchara

                    ),
                    word(
                        "FOCO",
                        R.raw.foco

                    ),
                )
            ),
            subCategorias(
                "HOGAR III",
                "#d68227",

                mutableListOf(
                    word(
                        "GAS",
                        R.raw.gas

                    ),
                    word(
                        "IMPRESORA",
                        R.raw.impresora

                    ),
                    word(
                        "LAVADORA",
                        R.raw.lavadora

                    ),
                    word(
                        "LICUADORA",
                        R.raw.licuadora

                    ),
                    word(
                        "LLAVE",
                        R.raw.llave

                    ),
                )
            ),
            subCategorias(
                "HOGAR IV",
                "#d68227",

                mutableListOf(
                    word(
                        "LUZ",
                        R.raw.luz

                    ),
                    word(
                        "MESA",
                        R.raw.mesa

                    ),
                    word(
                        "PLANCHA",
                        R.raw.plancha

                    ),
                    word(
                        "PLATO",
                        R.raw.plato

                    ),
                    word(
                        "PUERTA",
                        R.raw.puerta

                    ),
                )
            ),
            subCategorias(
                "HOGAR V",
                "#d68227",

                mutableListOf(
                    word(
                        "SILLA",
                        R.raw.silla

                    ),
                    word(
                        "TELEFONO",
                        R.raw.telefono

                    ),
                    word(
                        "TENEDOR",
                        R.raw.tenedor

                    ),
                    word(
                        "VASO",
                        R.raw.vaso

                    ),
                    word(
                        "VENTANA",
                        R.raw.ventana

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "BANO",
                R.raw.bano

            ),
            word(
                "CAJA",
                R.raw.caja

            ),
            word(
                "CAMA",
                R.raw.cama

            ),
            word(
                "CASA",
                R.raw.casa

            ),
            word(
                "CELULAR",
                R.raw.celular

            ),
            word(
                "COCINA",
                R.raw.cocina

            ),
            word(
                "COMPUTADORA",
                R.raw.computadora

            ),
            word(
                "CUARTO",
                R.raw.cuarto

            ),
            word(
                "CUCHARA",
                R.raw.cuchara

            ),
            word(
                "FOCO",
                R.raw.foco

            ),
            word(
                "GAS",
                R.raw.gas

            ),
            word(
                "IMPRESORA",
                R.raw.impresora

            ),
            word(
                "LAVADORA",
                R.raw.lavadora

            ),
            word(
                "LICUADORA",
                R.raw.licuadora

            ),
            word(
                "LLAVE",
                R.raw.llave

            ),
            word(
                "LUZ",
                R.raw.luz

            ),
            word(
                "MESA",
                R.raw.mesa

            ),
            word(
                "PLANCHA",
                R.raw.plancha

            ),
            word(
                "PLATO",
                R.raw.plato

            ),
            word(
                "PUERTA",
                R.raw.puerta

            ),
            word(
                "SILLA",
                R.raw.silla

            ),
            word(
                "TELEFONO",
                R.raw.telefono

            ),
            word(
                "TENEDOR",
                R.raw.tenedor

            ),
            word(
                "VASO",
                R.raw.vaso

            ),
            word(
                "VENTANA",
                R.raw.ventana

            ),
        ),
        5,

        ),
    category(
        "LUGARES",
        R.drawable.lugares,
        "#eea236",

        mutableListOf(
            subCategorias(
                "LUGARES I",
                "#eea236",

                mutableListOf(
                    word(
                        "ANTRO",
                        R.raw.antro

                    ),
                    word(
                        "BANCO",
                        R.raw.banco

                    ),
                    word(
                        "CALLE",
                        R.raw.calle

                    ),
                    word(
                        "CANTINA",
                        R.raw.cantina

                    ),
                    word(
                        "CASA",
                        R.raw.casa

                    ),
                )
            ),
            subCategorias(
                "LUGARES II",
                "#eea236",

                mutableListOf(
                    word(
                        "CENTRO",
                        R.raw.centro

                    ),
                    word(
                        "CINE",
                        R.raw.cine

                    ),
                    word(
                        "CIUDAD",
                        R.raw.ciudad

                    ),
                    word(
                        "EDIFICIO",
                        R.raw.edificio

                    ),
                    word(
                        "ESCUELA",
                        R.raw.escuela

                    ),
                )
            ),
            subCategorias(
                "LUGARES III",
                "#eea236",

                mutableListOf(
                    word(
                        "FABRICA",
                        R.raw.fabrica

                    ),
                    word(
                        "FERIA",
                        R.raw.feria

                    ),
                    word(
                        "FIESTA",
                        R.raw.fiesta

                    ),
                    word(
                        "HOTEL",
                        R.raw.hotel

                    ),
                    word(
                        "IGLESIA",
                        R.raw.iglesia

                    ),
                )
            ),
            subCategorias(
                "LUGARES IV",
                "#eea236",

                mutableListOf(
                    word(
                        "MERCADO",
                        R.raw.mercado

                    ),
                    word(
                        "MUSEO",
                        R.raw.museo

                    ),
                    word(
                        "RESTAURANTE",
                        R.raw.restaurante

                    ),
                    word(
                        "TEATRO",
                        R.raw.teatro

                    ),
                    word(
                        "TIENDA",
                        R.raw.tienda

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ANTRO",
                R.raw.antro

            ),
            word(
                "BANCO",
                R.raw.banco

            ),
            word(
                "CALLE",
                R.raw.calle

            ),
            word(
                "CANTINA",
                R.raw.cantina

            ),
            word(
                "CASA",
                R.raw.casa

            ),
            word(
                "CENTRO",
                R.raw.centro

            ),
            word(
                "CINE",
                R.raw.cine

            ),
            word(
                "CIUDAD",
                R.raw.ciudad

            ),
            word(
                "EDIFICIO",
                R.raw.edificio

            ),
            word(
                "ESCUELA",
                R.raw.escuela

            ),
            word(
                "FABRICA",
                R.raw.fabrica

            ),
            word(
                "FERIA",
                R.raw.feria

            ),
            word(
                "FIESTA",
                R.raw.fiesta

            ),
            word(
                "HOTEL",
                R.raw.hotel

            ),
            word(
                "IGLESIA",
                R.raw.iglesia

            ),
            word(
                "MERCADO",
                R.raw.mercado

            ),
            word(
                "MUSEO",
                R.raw.museo

            ),
            word(
                "RESTAURANTE",
                R.raw.restaurante

            ),
            word(
                "TEATRO",
                R.raw.teatro

            ),
            word(
                "TIENDA",
                R.raw.tienda

            ),
        ),
        4,

        ),
    category(
        "MESES",
        R.drawable.meses,
        "#42a5f5",

        mutableListOf(
            subCategorias(
                "MESES I",
                "#42a5f5",

                mutableListOf(
                    word(
                        "ABRIL",
                        R.raw.abril

                    ),
                    word(
                        "AGOSTO",
                        R.raw.agosto

                    ),
                    word(
                        "DICIEMBRE",
                        R.raw.diciembre

                    ),
                    word(
                        "ENERO",
                        R.raw.enero

                    ),
                    word(
                        "FEBRERO",
                        R.raw.febrero

                    ),
                )
            ),
            subCategorias(
                "MESES II",
                "#42a5f5",

                mutableListOf(
                    word(
                        "JULIO",
                        R.raw.julio

                    ),
                    word(
                        "JUNIO",
                        R.raw.junio

                    ),
                    word(
                        "MARZO",
                        R.raw.marzo

                    ),
                    word(
                        "MAYO",
                        R.raw.mayo

                    ),
                    word(
                        "NOVIEMBRE",
                        R.raw.noviembre

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABRIL",
                R.raw.abril

            ),
            word(
                "AGOSTO",
                R.raw.agosto

            ),
            word(
                "DICIEMBRE",
                R.raw.diciembre

            ),
            word(
                "ENERO",
                R.raw.enero

            ),
            word(
                "FEBRERO",
                R.raw.febrero

            ),
            word(
                "JULIO",
                R.raw.julio

            ),
            word(
                "JUNIO",
                R.raw.junio

            ),
            word(
                "MARZO",
                R.raw.marzo

            ),
            word(
                "MAYO",
                R.raw.mayo

            ),
            word(
                "NOVIEMBRE",
                R.raw.noviembre

            ),
            word(
                "OCTUBRE",
                R.raw.octubre

            ),
            word(
                "SEPTIEMBRE",
                R.raw.septiembre

            ),
        ),
        2,

        ),
    category(
        "NUMERO",
        R.drawable.numeros,
        "#92d36e",

        mutableListOf(
            subCategorias(
                "NUMERO I",
                "#92d36e",

                mutableListOf(
                    word(
                        "0",
                        R.raw.septiembre

                    ),
                    word(
                        "1",
                        R.raw.septiembre,

                    ),
                    word(
                        "1000000",
                        R.raw.septiembre,

                    ),
                    word(
                        "1000",
                        R.raw.septiembre,

                    ),
                    word(
                        "100",
                        R.raw.septiembre,

                    ),
                )
            ),
            subCategorias(
                "NUMERO II",
                "#92d36e",

                mutableListOf(
                    word(
                        "10",
                        R.raw.septiembre,

                    ),
                    word(
                        "11",
                        R.raw.septiembre,

                    ),
                    word(
                        "12",
                        R.raw.septiembre,

                    ),
                    word(
                        "13",
                        R.raw.septiembre,

                    ),
                    word(
                        "14",
                        R.raw.septiembre,

                    ),
                )
            ),
            subCategorias(
                "NUMERO III",
                "#92d36e",

                mutableListOf(
                    word(
                        "15",
                        R.raw.septiembre,

                    ),
                    word(
                        "16",
                        R.raw.septiembre,

                    ),
                    word(
                        "17",
                        R.raw.septiembre,

                    ),
                    word(
                        "18",
                        R.raw.septiembre,

                    ),
                    word(
                        "19",
                        R.raw.septiembre,

                    ),
                )
            ),
            subCategorias(
                "NUMERO IV",
                "#92d36e",

                mutableListOf(
                    word(
                        "2",
                        R.raw.septiembre,

                    ),
                    word(
                        "200",
                        R.raw.septiembre,

                    ),
                    word(
                        "20",
                        R.raw.septiembre,

                    ),
                    word(
                        "25",
                        R.raw.septiembre,

                    ),
                    word(
                        "3",
                        R.raw.septiembre,

                    ),
                )
            ),
            subCategorias(
                "NUMERO V",
                "#92d36e",

                mutableListOf(
                    word(
                        "300",
                        R.raw.septiembre,

                    ),
                    word(
                        "30",
                        R.raw.septiembre,

                    ),
                    word(
                        "4",
                        R.raw.septiembre,

                    ),
                    word(
                        "400",
                        R.raw.septiembre,

                    ),
                    word(
                        "40",
                        R.raw.septiembre,

                    ),
                )
            ),
            subCategorias(
                "NUMERO VI",
                "#92d36e",

                mutableListOf(
                    word(
                        "300",
                        R.raw.septiembre,

                        ),
                    word(
                        "30",
                        R.raw.septiembre,

                        ),
                    word(
                        "4",
                        R.raw.septiembre,

                        ),
                    word(
                        "400",
                        R.raw.septiembre,

                        ),
                    word(
                        "40",
                        R.raw.septiembre,

                        ),
                )
            ),
            subCategorias(
                "NUMERO VII",
                "#92d36e",

                mutableListOf(
                    word(
                        "300",
                        R.raw.septiembre,

                        ),
                    word(
                        "30",
                        R.raw.septiembre,

                        ),
                    word(
                        "4",
                        R.raw.septiembre,

                        ),
                    word(
                        "400",
                        R.raw.septiembre,

                        ),
                    word(
                        "40",
                        R.raw.septiembre,

                        ),
                )
            ),
            subCategorias(
                "NUMERO VIII",
                "#92d36e",

                mutableListOf(
                    word(
                        "300",
                        R.raw.septiembre,

                        ),
                    word(
                        "30",
                        R.raw.septiembre,

                        ),
                    word(
                        "4",
                        R.raw.septiembre,

                        ),
                    word(
                        "400",
                        R.raw.septiembre,

                        ),
                    word(
                        "40",
                        R.raw.septiembre,

                        ),
                )
            ),
        ),
        mutableListOf(
            word(
                "300",
                R.raw.septiembre,

                ),
            word(
                "30",
                R.raw.septiembre,

                ),
            word(
                "4",
                R.raw.septiembre,

                ),
            word(
                "400",
                R.raw.septiembre,

                ),
            word(
                "40",
                R.raw.septiembre,

                ),
            word(
                "300",
                R.raw.septiembre,

                ),
            word(
                "30",
                R.raw.septiembre,

                ),
            word(
                "4",
                R.raw.septiembre,

                ),
            word(
                "400",
                R.raw.septiembre,

                ),
            word(
                "40",
                R.raw.septiembre,

                ),
            word(
                "300",
                R.raw.septiembre,

                ),
            word(
                "30",
                R.raw.septiembre,

                ),
            word(
                "4",
                R.raw.septiembre,

                ),
            word(
                "400",
                R.raw.septiembre,

                ),
            word(
                "40",
                R.raw.septiembre,

                ),
            word(
                "300",
                R.raw.septiembre,

                ),
            word(
                "30",
                R.raw.septiembre,

                ),
            word(
                "4",
                R.raw.septiembre,

                ),
            word(
                "400",
                R.raw.septiembre,

                ),
            word(
                "40",
                R.raw.septiembre,

                ),
            word(
                "300",
                R.raw.septiembre,

                ),
            word(
                "30",
                R.raw.septiembre,

                ),
            word(
                "4",
                R.raw.septiembre,

                ),
            word(
                "400",
                R.raw.septiembre,

                ),
            word(
                "40",
                R.raw.septiembre,

                ),
        ),
        8,

        ),
    category(
        "PERSONAS",
        R.drawable.personas,
        "#ff5d55",

        mutableListOf(
            subCategorias(
                "PERSONAS I",
                "#ff5d55",

                mutableListOf(
                    word(
                        "ABUELA",
                        R.raw.abuela

                    ),
                    word(
                        "ABUELO",
                        R.raw.abuelo

                    ),
                    word(
                        "ADULTO",
                        R.raw.adulto

                    ),
                    word(
                        "AMANTE",
                        R.raw.amante

                    ),
                    word(
                        "AMIGA",
                        R.raw.amiga

                    ),
                )
            ),
            subCategorias(
                "PERSONAS II",
                "#ff5d55",

                mutableListOf(
                    word(
                        "AMIGO",
                        R.raw.amigo

                    ),
                    word(
                        "ANCIANO",
                        R.raw.anciano

                    ),
                    word(
                        "BEBE",
                        R.raw.bebe

                    ),
                    word(
                        "BISABUELA",
                        R.raw.bisabuela

                    ),
                    word(
                        "BISABUELO",
                        R.raw.bisabuelo

                    ),
                )
            ),
            subCategorias(
                "PERSONAS III",
                "#ff5d55",

                mutableListOf(
                    word(
                        "BISNIETA",
                        R.raw.bisnieta

                    ),
                    word(
                        "BISNIETO",
                        R.raw.bisnieto

                    ),
                    word(
                        "CIEGO",
                        R.raw.ciego

                    ),
                    word(
                        "COMPANERO",
                        R.raw.companero

                    ),
                    word(
                        "CUNADA",
                        R.raw.cunada

                    ),
                )
            ),
            subCategorias(
                "PERSONAS IV",
                "#ff5d55",

                mutableListOf(
                    word(
                        "CUNADO",
                        R.raw.cunado

                    ),
                    word(
                        "DIVORCIADO",
                        R.raw.divorciado

                    ),
                    word(
                        "ESPOSA",
                        R.raw.esposa

                    ),
                    word(
                        "ESPOSO",
                        R.raw.esposo

                    ),
                    word(
                        "HERMANA",
                        R.raw.hermana

                    ),
                )
            ),
            subCategorias(
                "PERSONAS V",
                "#ff5d55",

                mutableListOf(
                    word(
                        "HERMANO",
                        R.raw.hermano

                    ),
                    word(
                        "HIJASTRA",
                        R.raw.hijastra

                    ),
                    word(
                        "HIJASTRO",
                        R.raw.hijastro

                    ),
                    word(
                        "HIJA",
                        R.raw.hija

                    ),
                    word(
                        "HIJO",
                        R.raw.hijo

                    ),
                )
            ),
            subCategorias(
                "PERSONAS VI",
                "#ff5d55",

                mutableListOf(
                    word(
                        "HOMBRE",
                        R.raw.hombre

                    ),
                    word(
                        "HUERFANO",
                        R.raw.huerfano

                    ),
                    word(
                        "MADRASTRA",
                        R.raw.madrastra

                    ),
                    word(
                        "MADRINA",
                        R.raw.madrina

                    ),
                    word(
                        "MAMA",
                        R.raw.mama

                    ),
                )
            ),
            subCategorias(
                "PERSONAS VII",
                "#ff5d55",

                mutableListOf(
                    word(
                        "MATRIMONIO",
                        R.raw.matrimonio

                    ),
                    word(
                        "MEDIAHERMANA",
                        R.raw.mediahermana

                    ),
                    word(
                        "MEDIOHERMANO",
                        R.raw.mediohermano

                    ),
                    word(
                        "MUJER",
                        R.raw.mujer

                    ),
                    word(
                        "NIETA",
                        R.raw.nieta

                    ),
                )
            ),
            subCategorias(
                "PERSONAS VIII",
                "#ff5d55",

                mutableListOf(
                    word(
                        "NIETO",
                        R.raw.nieto

                    ),
                    word(
                        "NINA",
                        R.raw.nina

                    ),
                    word(
                        "NINO",
                        R.raw.nino

                    ),
                    word(
                        "NOVIA",
                        R.raw.novia

                    ),
                    word(
                        "NOVIO",
                        R.raw.novio

                    ),
                )
            ),
            subCategorias(
                "PERSONAS IX",
                "#ff5d55",

                mutableListOf(
                    word(
                        "NUERA",
                        R.raw.nuera

                    ),
                    word(
                        "OYENTE",
                        R.raw.oyente

                    ),
                    word(
                        "PADRASTRO",
                        R.raw.padrastro

                    ),
                    word(
                        "PADRINO",
                        R.raw.padrino

                    ),
                    word(
                        "PAPA",
                        R.raw.papa

                    ),
                )
            ),
            subCategorias(
                "PERSONAS X",
                "#ff5d55",

                mutableListOf(
                    word(
                        "PAREJA",
                        R.raw.pareja

                    ),
                    word(
                        "PERSONA",
                        R.raw.persona

                    ),
                    word(
                        "PRIMA",
                        R.raw.prima

                    ),
                    word(
                        "PRIMO",
                        R.raw.primo

                    ),
                    word(
                        "SENORA",
                        R.raw.senora

                    ),
                )
            ),
            subCategorias(
                "PERSONAS XI",
                "#ff5d55",

                mutableListOf(
                    word(
                        "SENORITA",
                        R.raw.senorita

                    ),
                    word(
                        "SENOR",
                        R.raw.senor

                    ),
                    word(
                        "SEPARADO",
                        R.raw.separado

                    ),
                    word(
                        "SOBRINA",
                        R.raw.sobrina

                    ),
                    word(
                        "SOBRINO",
                        R.raw.sobrino

                    ),
                )
            ),
            subCategorias(
                "PERSONAS XII",
                "#ff5d55",

                mutableListOf(
                    word(
                        "SOLTERO",
                        R.raw.soltero

                    ),
                    word(
                        "SORDO",
                        R.raw.sordo

                    ),
                    word(
                        "SUEGRA",
                        R.raw.suegra

                    ),
                    word(
                        "SUEGRO",
                        R.raw.suegro

                    ),
                    word(
                        "TIA",
                        R.raw.tia

                    ),
                )
            ),
            subCategorias(
                "PERSONAS XIII",
                "#ff5d55",

                mutableListOf(
                    word(
                        "TIO",
                        R.raw.tio

                    ),
                    word(
                        "UNIONLIBRE",
                        R.raw.unionlibre

                    ),
                    word(
                        "VECINO",
                        R.raw.vecino

                    ),
                    word(
                        "VIUDO",
                        R.raw.viudo

                    ),
                    word(
                        "YERNO",
                        R.raw.yerno

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABUELA",
                R.raw.abuela

            ),
            word(
                "ABUELO",
                R.raw.abuelo

            ),
            word(
                "ADULTO",
                R.raw.adulto

            ),
            word(
                "AMANTE",
                R.raw.amante

            ),
            word(
                "AMIGA",
                R.raw.amiga

            ),
            word(
                "AMIGO",
                R.raw.amigo

            ),
            word(
                "ANCIANO",
                R.raw.anciano

            ),
            word(
                "BEBE",
                R.raw.bebe

            ),
            word(
                "BISABUELA",
                R.raw.bisabuela

            ),
            word(
                "BISABUELO",
                R.raw.bisabuelo

            ),
            word(
                "BISNIETA",
                R.raw.bisnieta

            ),
            word(
                "BISNIETO",
                R.raw.bisnieto

            ),
            word(
                "CIEGO",
                R.raw.ciego

            ),
            word(
                "COMPANERO",
                R.raw.companero

            ),
            word(
                "CUNADA",
                R.raw.cunada

            ),
            word(
                "CUNADO",
                R.raw.cunado

            ),
            word(
                "DIVORCIADO",
                R.raw.divorciado

            ),
            word(
                "ESPOSA",
                R.raw.esposa

            ),
            word(
                "ESPOSO",
                R.raw.esposo

            ),
            word(
                "HERMANA",
                R.raw.hermana

            ),
            word(
                "HERMANO",
                R.raw.hermano

            ),
            word(
                "HIJASTRA",
                R.raw.hijastra

            ),
            word(
                "HIJASTRO",
                R.raw.hijastro

            ),
            word(
                "HIJA",
                R.raw.hija

            ),
            word(
                "HIJO",
                R.raw.hijo

            ),
            word(
                "HOMBRE",
                R.raw.hombre

            ),
            word(
                "HUERFANO",
                R.raw.huerfano

            ),
            word(
                "MADRASTRA",
                R.raw.madrastra

            ),
            word(
                "MADRINA",
                R.raw.madrina

            ),
            word(
                "MAMA",
                R.raw.mama

            ),
            word(
                "MATRIMONIO",
                R.raw.matrimonio

            ),
            word(
                "MEDIAHERMANA",
                R.raw.mediahermana

            ),
            word(
                "MEDIOHERMANO",
                R.raw.mediohermano

            ),
            word(
                "MUJER",
                R.raw.mujer

            ),
            word(
                "NIETA",
                R.raw.nieta

            ),
            word(
                "NIETO",
                R.raw.nieto

            ),
            word(
                "NINA",
                R.raw.nina

            ),
            word(
                "NINO",
                R.raw.nino

            ),
            word(
                "NOVIA",
                R.raw.novia

            ),
            word(
                "NOVIO",
                R.raw.novio

            ),
            word(
                "NUERA",
                R.raw.nuera

            ),
            word(
                "OYENTE",
                R.raw.oyente

            ),
            word(
                "PADRASTRO",
                R.raw.padrastro

            ),
            word(
                "PADRINO",
                R.raw.padrino

            ),
            word(
                "PAPA",
                R.raw.papa

            ),
            word(
                "PAREJA",
                R.raw.pareja

            ),
            word(
                "PERSONA",
                R.raw.persona

            ),
            word(
                "PRIMA",
                R.raw.prima

            ),
            word(
                "PRIMO",
                R.raw.primo

            ),
            word(
                "SENORA",
                R.raw.senora

            ),
            word(
                "SENORITA",
                R.raw.senorita

            ),
            word(
                "SENOR",
                R.raw.senor

            ),
            word(
                "SEPARADO",
                R.raw.separado

            ),
            word(
                "SOBRINA",
                R.raw.sobrina

            ),
            word(
                "SOBRINO",
                R.raw.sobrino

            ),
            word(
                "SOLTERO",
                R.raw.soltero

            ),
            word(
                "SORDO",
                R.raw.sordo

            ),
            word(
                "SUEGRA",
                R.raw.suegra

            ),
            word(
                "SUEGRO",
                R.raw.suegro

            ),
            word(
                "TIA",
                R.raw.tia

            ),
            word(
                "TIO",
                R.raw.tio

            ),
            word(
                "UNIONLIBRE",
                R.raw.unionlibre

            ),
            word(
                "VECINO",
                R.raw.vecino

            ),
            word(
                "VIUDO",
                R.raw.viudo

            ),
            word(
                "YERNO",
                R.raw.yerno

            ),
        ),
        13,

        ),
    category(
        "PREGUNTAS",
        R.drawable.preguntas,
        "#c238eb",

        mutableListOf(
            subCategorias(
                "PREGUNTAS I",
                "#c238eb",

                mutableListOf(
                    word(
                        "COMO",
                        R.raw.como

                    ),
                    word(
                        "CUAL",
                        R.raw.cual

                    ),
                    word(
                        "CUANDO",
                        R.raw.cuando

                    ),
                    word(
                        "CUANTO",
                        R.raw.cuanto

                    ),
                    word(
                        "DONDE",
                        R.raw.donde

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "COMO",
                R.raw.como

            ),
            word(
                "CUAL",
                R.raw.cual

            ),
            word(
                "CUANDO",
                R.raw.cuando

            ),
            word(
                "CUANTO",
                R.raw.cuanto

            ),
            word(
                "DONDE",
                R.raw.donde

            ),
            word(
                "PARAQUE",
                R.raw.paraque

            ),
            word(
                "PORQUE",
                R.raw.porque

            ),
            word(
                "QUE",
                R.raw.que

            ),
            word(
                "QUIEN",
                R.raw.quien

            ),
        ),
        1,

        ),
    category(
        "PREP",
        R.drawable.preposiciones,
        "#929292",

        mutableListOf(
            subCategorias(
                "PREP I",
                "#929292",

                mutableListOf(
                    word(
                        "ABAJO",
                        R.raw.abajo

                    ),
                    word(
                        "ABURRIDO",
                        R.raw.aburrido

                    ),
                    word(
                        "ACCIDENTE",
                        R.raw.accidente

                    ),
                    word(
                        "ADENTRO",
                        R.raw.adentro

                    ),
                    word(
                        "AFORTUNADO",
                        R.raw.afortunado

                    ),
                )
            ),
            subCategorias(
                "PREP II",
                "#929292",

                mutableListOf(
                    word(
                        "ALEGREDIVERTIDO",
                        R.raw.alegredivertido

                    ),
                    word(
                        "ALGUNOS",
                        R.raw.algunos

                    ),
                    word(
                        "ALTOESTATURA",
                        R.raw.altoestatura

                    ),
                    word(
                        "AMABLE",
                        R.raw.amable

                    ),
                    word(
                        "ANTES",
                        R.raw.antes

                    ),
                )
            ),
            subCategorias(
                "PREP III",
                "#929292",

                mutableListOf(
                    word(
                        "ARRIBA",
                        R.raw.arriba

                    ),
                    word(
                        "ASUSTADO",
                        R.raw.asustado

                    ),
                    word(
                        "ATENCIONATENTO",
                        R.raw.atencionatento

                    ),
                    word(
                        "BABOSO",
                        R.raw.baboso

                    ),
                    word(
                        "BONITO",
                        R.raw.bonito

                    ),
                )
            ),
            subCategorias(
                "PREP IV",
                "#929292",

                mutableListOf(
                    word(
                        "BROMA",
                        R.raw.broma

                    ),
                    word(
                        "BUENO",
                        R.raw.bueno

                    ),
                    word(
                        "CADA",
                        R.raw.cada

                    ),
                    word(
                        "CALIENTE",
                        R.raw.caliente

                    ),
                    word(
                        "CANSADO",
                        R.raw.cansado

                    ),
                )
            ),
            subCategorias(
                "PREP V",
                "#929292",

                mutableListOf(
                    word(
                        "CARINO",
                        R.raw.carino

                    ),
                    word(
                        "CELOSO",
                        R.raw.celoso

                    ),
                    word(
                        "CHAPARRO",
                        R.raw.chaparro

                    ),
                    word(
                        "CHISTOSO",
                        R.raw.chistoso

                    ),
                    word(
                        "COBARDE",
                        R.raw.cobarde

                    ),
                )
            ),
            subCategorias(
                "PREP VI",
                "#929292",

                mutableListOf(
                    word(
                        "CONTENTO",
                        R.raw.contento

                    ),
                    word(
                        "CURIOSO",
                        R.raw.curioso

                    ),
                    word(
                        "DEBIL",
                        R.raw.debil

                    ),
                    word(
                        "DECENTE",
                        R.raw.decente

                    ),
                    word(
                        "DELGADO",
                        R.raw.delgado

                    ),
                )
            ),
            subCategorias(
                "PREP VII",
                "#929292",

                mutableListOf(
                    word(
                        "DESPACIO",
                        R.raw.despacio

                    ),
                    word(
                        "DIFERENTE",
                        R.raw.diferente

                    ),
                    word(
                        "DIFICIL",
                        R.raw.dificil

                    ),
                    word(
                        "DIPLOMA",
                        R.raw.diploma

                    ),
                    word(
                        "DUDA",
                        R.raw.duda

                    ),
                )
            ),
            subCategorias(
                "PREP VIII",
                "#929292",

                mutableListOf(
                    word(
                        "EGOISTA",
                        R.raw.egoista

                    ),
                    word(
                        "EJEMPLO",
                        R.raw.ejemplo

                    ),
                    word(
                        "EJERCICIO",
                        R.raw.ejercicio

                    ),
                    word(
                        "ENOJADO",
                        R.raw.enojado

                    ),
                    word(
                        "ENVIDIA",
                        R.raw.envidia

                    ),
                )
            ),
            subCategorias(
                "PREP IX",
                "#929292",

                mutableListOf(
                    word(
                        "ESPECIAL",
                        R.raw.especial

                    ),
                    word(
                        "FACIL",
                        R.raw.facil

                    ),
                    word(
                        "FALSO",
                        R.raw.falso

                    ),
                    word(
                        "FELIZ",
                        R.raw.feliz

                    ),
                    word(
                        "FEO",
                        R.raw.feo

                    ),
                )
            ),
            subCategorias(
                "PREP X",
                "#929292",

                mutableListOf(
                    word(
                        "FLOJO",
                        R.raw.flojo

                    ),
                    word(
                        "FUERTE",
                        R.raw.fuerte

                    ),
                    word(
                        "FUERZA",
                        R.raw.fuerza

                    ),
                    word(
                        "GORDO",
                        R.raw.gordo

                    ),
                    word(
                        "GRATIS",
                        R.raw.gratis

                    ),
                )
            ),
            subCategorias(
                "PREP XI",
                "#929292",

                mutableListOf(
                    word(
                        "GROSERO",
                        R.raw.grosero

                    ),
                    word(
                        "GUAPO",
                        R.raw.guapo

                    ),
                    word(
                        "HAMBRE",
                        R.raw.hambre

                    ),
                    word(
                        "HISTORIA",
                        R.raw.historia

                    ),
                    word(
                        "HUMILDE",
                        R.raw.humilde

                    ),
                )
            ),
            subCategorias(
                "PREP XII",
                "#929292",

                mutableListOf(
                    word(
                        "IMPORTANTE",
                        R.raw.importante

                    ),
                    word(
                        "INTELIGENTE",
                        R.raw.inteligente

                    ),
                    word(
                        "JAMAS",
                        R.raw.jamas

                    ),
                    word(
                        "JUNTA",
                        R.raw.junta

                    ),
                    word(
                        "JUNTO",
                        R.raw.junto

                    ),
                )
            ),
            subCategorias(
                "PREP XIII",
                "#929292",

                mutableListOf(
                    word(
                        "LEJOS",
                        R.raw.lejos

                    ),
                    word(
                        "LIBRE",
                        R.raw.libre

                    ),
                    word(
                        "LOCO",
                        R.raw.loco

                    ),
                    word(
                        "LSM",
                        R.raw.lsm

                    ),
                    word(
                        "MALO",
                        R.raw.malo

                    ),
                )
            ),
            subCategorias(
                "PREP XIV",
                "#929292",

                mutableListOf(
                    word(
                        "MAS",
                        R.raw.mas

                    ),
                    word(
                        "MEJOR",
                        R.raw.mejor

                    ),
                    word(
                        "MIEDO",
                        R.raw.miedo

                    ),
                    word(
                        "NECIO",
                        R.raw.necio

                    ),
                    word(
                        "NO",
                        R.raw.no

                    ),
                )
            ),
            subCategorias(
                "PREP XV",
                "#929292",

                mutableListOf(
                    word(
                        "NUEVO",
                        R.raw.nuevo

                    ),
                    word(
                        "NUNCA",
                        R.raw.nunca

                    ),
                    word(
                        "OJALA",
                        R.raw.ojala

                    ),
                    word(
                        "PACIENCIA",
                        R.raw.paciencia

                    ),
                    word(
                        "PEOR",
                        R.raw.peor

                    ),
                )
            ),
            subCategorias(
                "PREP XVI",
                "#929292",

                mutableListOf(
                    word(
                        "PERO",
                        R.raw.pero

                    ),
                    word(
                        "POBRE",
                        R.raw.pobre

                    ),
                    word(
                        "PRESUMIDO",
                        R.raw.presumido

                    ),
                    word(
                        "PROBLEMA",
                        R.raw.problema

                    ),
                    word(
                        "RAPIDOPRONTO",
                        R.raw.rapidopronto

                    ),
                )
            ),
            subCategorias(
                "PREP XVII",
                "#929292",

                mutableListOf(
                    word(
                        "RARO",
                        R.raw.raro

                    ),
                    word(
                        "SECRETO",
                        R.raw.secreto

                    ),
                    word(
                        "SENAPROIPA",
                        R.raw.senaproipa

                    ),
                    word(
                        "SENAS",
                        R.raw.senas

                    ),
                    word(
                        "SI",
                        R.raw.si

                    ),
                )
            ),
            subCategorias(
                "PREP XVIII",
                "#929292",

                mutableListOf(
                    word(
                        "SUCIO",
                        R.raw.sucio

                    ),
                    word(
                        "SUERTE",
                        R.raw.suerte

                    ),
                    word(
                        "TODO",
                        R.raw.todo

                    ),
                    word(
                        "TONTO",
                        R.raw.tonto

                    ),
                    word(
                        "TRAVIESO",
                        R.raw.travieso

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABAJO",
                R.raw.abajo

            ),
            word(
                "ABURRIDO",
                R.raw.aburrido

            ),
            word(
                "ACCIDENTE",
                R.raw.accidente

            ),
            word(
                "ADENTRO",
                R.raw.adentro

            ),
            word(
                "AFORTUNADO",
                R.raw.afortunado

            ),
            word(
                "ALEGREDIVERTIDO",
                R.raw.alegredivertido

            ),
            word(
                "ALGUNOS",
                R.raw.algunos

            ),
            word(
                "ALTOESTATURA",
                R.raw.altoestatura

            ),
            word(
                "AMABLE",
                R.raw.amable

            ),
            word(
                "ANTES",
                R.raw.antes

            ),
            word(
                "ARRIBA",
                R.raw.arriba

            ),
            word(
                "ASUSTADO",
                R.raw.asustado

            ),
            word(
                "ATENCIONATENTO",
                R.raw.atencionatento

            ),
            word(
                "BABOSO",
                R.raw.baboso

            ),
            word(
                "BONITO",
                R.raw.bonito

            ),
            word(
                "BROMA",
                R.raw.broma

            ),
            word(
                "BUENO",
                R.raw.bueno

            ),
            word(
                "CADA",
                R.raw.cada

            ),
            word(
                "CALIENTE",
                R.raw.caliente

            ),
            word(
                "CANSADO",
                R.raw.cansado

            ),
            word(
                "CARINO",
                R.raw.carino

            ),
            word(
                "CELOSO",
                R.raw.celoso

            ),
            word(
                "CHAPARRO",
                R.raw.chaparro

            ),
            word(
                "CHISTOSO",
                R.raw.chistoso

            ),
            word(
                "COBARDE",
                R.raw.cobarde

            ),
            word(
                "CONTENTO",
                R.raw.contento

            ),
            word(
                "CURIOSO",
                R.raw.curioso

            ),
            word(
                "DEBIL",
                R.raw.debil

            ),
            word(
                "DECENTE",
                R.raw.decente

            ),
            word(
                "DELGADO",
                R.raw.delgado

            ),
            word(
                "DESPACIO",
                R.raw.despacio

            ),
            word(
                "DIFERENTE",
                R.raw.diferente

            ),
            word(
                "DIFICIL",
                R.raw.dificil

            ),
            word(
                "DIPLOMA",
                R.raw.diploma

            ),
            word(
                "DUDA",
                R.raw.duda

            ),
            word(
                "EGOISTA",
                R.raw.egoista

            ),
            word(
                "EJEMPLO",
                R.raw.ejemplo

            ),
            word(
                "EJERCICIO",
                R.raw.ejercicio

            ),
            word(
                "ENOJADO",
                R.raw.enojado

            ),
            word(
                "ENVIDIA",
                R.raw.envidia

            ),
            word(
                "ESPECIAL",
                R.raw.especial

            ),
            word(
                "FACIL",
                R.raw.facil

            ),
            word(
                "FALSO",
                R.raw.falso

            ),
            word(
                "FELIZ",
                R.raw.feliz

            ),
            word(
                "FEO",
                R.raw.feo

            ),
            word(
                "FLOJO",
                R.raw.flojo

            ),
            word(
                "FUERTE",
                R.raw.fuerte

            ),
            word(
                "FUERZA",
                R.raw.fuerza

            ),
            word(
                "GORDO",
                R.raw.gordo

            ),
            word(
                "GRATIS",
                R.raw.gratis

            ),
            word(
                "GROSERO",
                R.raw.grosero

            ),
            word(
                "GUAPO",
                R.raw.guapo

            ),
            word(
                "HAMBRE",
                R.raw.hambre

            ),
            word(
                "HISTORIA",
                R.raw.historia

            ),
            word(
                "HUMILDE",
                R.raw.humilde

            ),
            word(
                "IMPORTANTE",
                R.raw.importante

            ),
            word(
                "INTELIGENTE",
                R.raw.inteligente

            ),
            word(
                "JAMAS",
                R.raw.jamas

            ),
            word(
                "JUNTA",
                R.raw.junta

            ),
            word(
                "JUNTO",
                R.raw.junto

            ),
            word(
                "LEJOS",
                R.raw.lejos

            ),
            word(
                "LIBRE",
                R.raw.libre

            ),
            word(
                "LOCO",
                R.raw.loco

            ),
            word(
                "LSM",
                R.raw.lsm

            ),
            word(
                "MALO",
                R.raw.malo

            ),
            word(
                "MAS",
                R.raw.mas

            ),
            word(
                "MEJOR",
                R.raw.mejor

            ),
            word(
                "MIEDO",
                R.raw.miedo

            ),
            word(
                "NECIO",
                R.raw.necio

            ),
            word(
                "NO",
                R.raw.no

            ),
            word(
                "NUEVO",
                R.raw.nuevo

            ),
            word(
                "NUNCA",
                R.raw.nunca

            ),
            word(
                "OJALA",
                R.raw.ojala

            ),
            word(
                "PACIENCIA",
                R.raw.paciencia

            ),
            word(
                "PEOR",
                R.raw.peor

            ),
            word(
                "PERO",
                R.raw.pero

            ),
            word(
                "POBRE",
                R.raw.pobre

            ),
            word(
                "PRESUMIDO",
                R.raw.presumido

            ),
            word(
                "PROBLEMA",
                R.raw.problema

            ),
            word(
                "RAPIDOPRONTO",
                R.raw.rapidopronto

            ),
            word(
                "RARO",
                R.raw.raro

            ),
            word(
                "SECRETO",
                R.raw.secreto

            ),
            word(
                "SENAPROIPA",
                R.raw.senaproipa

            ),
            word(
                "SENAS",
                R.raw.senas

            ),
            word(
                "SI",
                R.raw.si

            ),
            word(
                "SUCIO",
                R.raw.sucio

            ),
            word(
                "SUERTE",
                R.raw.suerte

            ),
            word(
                "TODO",
                R.raw.todo

            ),
            word(
                "TONTO",
                R.raw.tonto

            ),
            word(
                "TRAVIESO",
                R.raw.travieso

            ),
            word(
                "TRISTE",
                R.raw.triste

            ),
            word(
                "VERDAD",
                R.raw.verdad

            ),
            word(
                "VERGUENZA",
                R.raw.verguenza

            ),
        ),
        18,

        ),
    category(
        "PRONOMBRES",
        R.drawable.pronombres,
        "#3CA99B",

        mutableListOf(
            subCategorias(
                "PRONOMBRES I",
                "#3CA99B",

                mutableListOf(
                    word(
                        "ELLA",
                        R.raw.ella

                    ),
                    word(
                        "ELLOS",
                        R.raw.ellos

                    ),
                    word(
                        "EL",
                        R.raw.el

                    ),
                    word(
                        "NOSOTROS",
                        R.raw.nosotros

                    ),
                    word(
                        "TU",
                        R.raw.tu

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ELLA",
                R.raw.ella

            ),
            word(
                "ELLOS",
                R.raw.ellos

            ),
            word(
                "EL",
                R.raw.el

            ),
            word(
                "NOSOTROS",
                R.raw.nosotros

            ),
            word(
                "TU",
                R.raw.tu

            ),
            word(
                "USTEDES",
                R.raw.ustedes

            ),
            word(
                "YO",
                R.raw.yo

            ),
        ),
        1,

        ),
    category(
        "OFICIOS",
        R.drawable.puestos,
        "#d68227",

        mutableListOf(
            subCategorias(
                "OFICIOS I",
                "#d68227",

                mutableListOf(
                    word(
                        "ABOGADO",
                        R.raw.abogado

                    ),
                    word(
                        "ACTOR",
                        R.raw.actor

                    ),
                    word(
                        "ALBANIL",
                        R.raw.albanil

                    ),
                    word(
                        "ALUMNO",
                        R.raw.alumno

                    ),
                    word(
                        "ARQUITECTO",
                        R.raw.arquitecto

                    ),
                )
            ),
            subCategorias(
                "OFICIOS II",
                "#d68227",

                mutableListOf(
                    word(
                        "BOMBERO",
                        R.raw.bombero

                    ),
                    word(
                        "CARPINTERO",
                        R.raw.carpintero

                    ),
                    word(
                        "CHOFER",
                        R.raw.chofer

                    ),
                    word(
                        "DENTISTA",
                        R.raw.dentista

                    ),
                    word(
                        "DIPUTADO",
                        R.raw.diputado

                    ),
                )
            ),
            subCategorias(
                "OFICIOS III",
                "#d68227",

                mutableListOf(
                    word(
                        "DIRECTOR",
                        R.raw.director

                    ),
                    word(
                        "ENFERMERA",
                        R.raw.enfermera

                    ),
                    word(
                        "GOBERNADOR",
                        R.raw.gobernador

                    ),
                    word(
                        "GUARDIA",
                        R.raw.guardia

                    ),
                    word(
                        "INGENIERO",
                        R.raw.ingeniero

                    ),
                )
            ),
            subCategorias(
                "OFICIOS IV",
                "#d68227",

                mutableListOf(
                    word(
                        "INTERPRETE",
                        R.raw.interprete

                    ),
                    word(
                        "JEFE",
                        R.raw.jefe

                    ),
                    word(
                        "LICENCIADO",
                        R.raw.licenciado

                    ),
                    word(
                        "LIDER",
                        R.raw.lider

                    ),
                    word(
                        "MAESTRO",
                        R.raw.maestro

                    ),
                )
            ),
            subCategorias(
                "OFICIOS V",
                "#d68227",

                mutableListOf(
                    word(
                        "MECANICO",
                        R.raw.mecanico

                    ),
                    word(
                        "MEDICO",
                        R.raw.medico

                    ),
                    word(
                        "MESERO",
                        R.raw.mesero

                    ),
                    word(
                        "POLICIA",
                        R.raw.policia

                    ),
                    word(
                        "PRESIDENTE",
                        R.raw.presidente

                    ),
                )
            ),
            subCategorias(
                "OFICIOS VI",
                "#d68227",

                mutableListOf(
                    word(
                        "PROFESOR",
                        R.raw.profesor

                    ),
                    word(
                        "PSICOLOGO",
                        R.raw.psicologo

                    ),
                    word(
                        "SENADOR",
                        R.raw.senador

                    ),
                    word(
                        "SOLDADO",
                        R.raw.soldado

                    ),
                    word(
                        "TAXISTA",
                        R.raw.taxista

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABOGADO",
                R.raw.abogado

            ),
            word(
                "ACTOR",
                R.raw.actor

            ),
            word(
                "ALBANIL",
                R.raw.albanil

            ),
            word(
                "ALUMNO",
                R.raw.alumno

            ),
            word(
                "ARQUITECTO",
                R.raw.arquitecto

            ),
            word(
                "BOMBERO",
                R.raw.bombero

            ),
            word(
                "CARPINTERO",
                R.raw.carpintero

            ),
            word(
                "CHOFER",
                R.raw.chofer

            ),
            word(
                "DENTISTA",
                R.raw.dentista

            ),
            word(
                "DIPUTADO",
                R.raw.diputado

            ),
            word(
                "DIRECTOR",
                R.raw.director

            ),
            word(
                "ENFERMERA",
                R.raw.enfermera

            ),
            word(
                "GOBERNADOR",
                R.raw.gobernador

            ),
            word(
                "GUARDIA",
                R.raw.guardia

            ),
            word(
                "INGENIERO",
                R.raw.ingeniero

            ),
            word(
                "INTERPRETE",
                R.raw.interprete

            ),
            word(
                "JEFE",
                R.raw.jefe

            ),
            word(
                "LICENCIADO",
                R.raw.licenciado

            ),
            word(
                "LIDER",
                R.raw.lider

            ),
            word(
                "MAESTRO",
                R.raw.maestro

            ),
            word(
                "MECANICO",
                R.raw.mecanico

            ),
            word(
                "MEDICO",
                R.raw.medico

            ),
            word(
                "MESERO",
                R.raw.mesero

            ),
            word(
                "POLICIA",
                R.raw.policia

            ),
            word(
                "PRESIDENTE",
                R.raw.presidente

            ),
            word(
                "PROFESOR",
                R.raw.profesor

            ),
            word(
                "PSICOLOGO",
                R.raw.psicologo

            ),
            word(
                "SENADOR",
                R.raw.senador

            ),
            word(
                "SOLDADO",
                R.raw.soldado

            ),
            word(
                "TAXISTA",
                R.raw.taxista

            ),
            word(
                "TECNICO",
                R.raw.tecnico

            ),
            word(
                "VENDEDOR",
                R.raw.vendedor

            ),
        ),
        6,

        ),
    category(
        "ROPA",
        R.drawable.ropa,
        "#eea236",

        mutableListOf(
            subCategorias(
                "ROPA I",
                "#eea236",

                mutableListOf(
                    word(
                        "ABRIGO",
                        R.raw.abrigo

                    ),
                    word(
                        "BRASIER",
                        R.raw.brasier

                    ),
                    word(
                        "BUFANDA",
                        R.raw.bufanda

                    ),
                    word(
                        "CALZON",
                        R.raw.calzon

                    ),
                    word(
                        "CAMISA",
                        R.raw.camisa

                    ),
                )
            ),
            subCategorias(
                "ROPA II",
                "#eea236",

                mutableListOf(
                    word(
                        "CORBATA",
                        R.raw.corbata

                    ),
                    word(
                        "FALDA",
                        R.raw.falda

                    ),
                    word(
                        "MEDIAS",
                        R.raw.medias

                    ),
                    word(
                        "PANTALON",
                        R.raw.pantalon

                    ),
                    word(
                        "TENIS",
                        R.raw.tenis

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ABRIGO",
                R.raw.abrigo

            ),
            word(
                "BRASIER",
                R.raw.brasier

            ),
            word(
                "BUFANDA",
                R.raw.bufanda

            ),
            word(
                "CALZON",
                R.raw.calzon

            ),
            word(
                "CAMISA",
                R.raw.camisa

            ),
            word(
                "CORBATA",
                R.raw.corbata

            ),
            word(
                "FALDA",
                R.raw.falda

            ),
            word(
                "MEDIAS",
                R.raw.medias

            ),
            word(
                "PANTALON",
                R.raw.pantalon

            ),
            word(
                "TENIS",
                R.raw.tenis

            ),
            word(
                "VESTIDO",
                R.raw.vestido

            ),
            word(
                "ZAPATOS",
                R.raw.zapatos

            ),
        ),
        2,

        ),
    category(
        "SALUDOS",
        R.drawable.saludos,
        "#42a5f5",

        mutableListOf(
            subCategorias(
                "SALUDOS I",
                "#42a5f5",

                mutableListOf(
                    word(
                        "ADIOS",
                        R.raw.adios

                    ),
                    word(
                        "BIEN",
                        R.raw.bien

                    ),
                    word(
                        "BUENASNOCHES",
                        R.raw.buenasnoches

                    ),
                    word(
                        "BUENASTARDES",
                        R.raw.buenastardes

                    ),
                    word(
                        "BUENOSDIAS",
                        R.raw.buenosdias

                    ),
                )
            ),
            subCategorias(
                "SALUDOS II",
                "#42a5f5",

                mutableListOf(
                    word(
                        "COMOESTAS",
                        R.raw.comoestas

                    ),
                    word(
                        "COMOTELLAMAS",
                        R.raw.comotellamas

                    ),
                    word(
                        "DENADA",
                        R.raw.denada

                    ),
                    word(
                        "GRACIAS",
                        R.raw.gracias

                    ),
                )
            ),
            subCategorias(
                "SALUDOS III",
                "#42a5f5",

                mutableListOf(
                    word(
                        "GUSTODECONOCERTE",
                        R.raw.gustodeconocerte

                    ),
                    word(
                        "HOLA",
                        R.raw.hola

                    ),
                    word(
                        "MAL",
                        R.raw.mal

                    ),
                    word(
                        "MASOMENOS",
                        R.raw.masomenos

                    ),
                    word(
                        "NOSVEMOS",
                        R.raw.nosvemos

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "ADIOS",
                R.raw.adios

            ),
            word(
                "BIEN",
                R.raw.bien

            ),
            word(
                "BUENASNOCHES",
                R.raw.buenasnoches

            ),
            word(
                "BUENASTARDES",
                R.raw.buenastardes

            ),
            word(
                "BUENOSDIAS",
                R.raw.buenosdias

            ),
            word(
                "COMOESTAS",
                R.raw.comoestas

            ),
            word(
                "COMOTELLAMAS",
                R.raw.comotellamas

            ),
            word(
                "DENADA",
                R.raw.denada

            ),
            word(
                "GRACIAS",
                R.raw.gracias

            ),
            word(
                "GUSTODECONOCERTE",
                R.raw.gustodeconocerte

            ),
            word(
                "HOLA",
                R.raw.hola

            ),
            word(
                "MAL",
                R.raw.mal

            ),
            word(
                "MASOMENOS",
                R.raw.masomenos

            ),
            word(
                "NOSVEMOS",
                R.raw.nosvemos

            ),
            word(
                "PERDON",
                R.raw.perdon

            ),
            word(
                "PORFAVOR",
                R.raw.porfavor

            ),
        ),
        3,

        ),
    category(
        "TIEMPO",
        R.drawable.tiempo,
        "#92d36e",

        mutableListOf(
            subCategorias(
                "TIEMPO I",
                "#92d36e",

                mutableListOf(
                    word(
                        "AHORA",
                        R.raw.ahora

                    ),
                    word(
                        "AHORITA",
                        R.raw.ahorita

                    ),
                    word(
                        "AIRE",
                        R.raw.aire

                    ),
                    word(
                        "ANO",
                        R.raw.ano

                    ),
                    word(
                        "ANTIER",
                        R.raw.antier

                    ),
                )
            ),
            subCategorias(
                "TIEMPO II",
                "#92d36e",

                mutableListOf(
                    word(
                        "AVECES",
                        R.raw.aveces

                    ),
                    word(
                        "AYER",
                        R.raw.ayer

                    ),
                    word(
                        "CALENDARIO",
                        R.raw.calendario

                    ),
                    word(
                        "CALOR",
                        R.raw.calor

                    ),
                    word(
                        "CUMPLEANOS",
                        R.raw.cumpleanos

                    ),
                )
            ),
            subCategorias(
                "TIEMPO III",
                "#92d36e",

                mutableListOf(
                    word(
                        "DESPUES",
                        R.raw.despues

                    ),
                    word(
                        "DIA",
                        R.raw.dia

                    ),
                    word(
                        "EDAD",
                        R.raw.edad

                    ),
                    word(
                        "FECHA",
                        R.raw.fecha

                    ),
                    word(
                        "FRIO",
                        R.raw.frio

                    ),
                )
            ),
            subCategorias(
                "TIEMPO IV",
                "#92d36e",

                mutableListOf(
                    word(
                        "FUTURO",
                        R.raw.futuro

                    ),
                    word(
                        "HASTA",
                        R.raw.hasta

                    ),
                    word(
                        "HORA",
                        R.raw.hora

                    ),
                    word(
                        "HOY",
                        R.raw.hoy

                    ),
                    word(
                        "INVIERNO",
                        R.raw.invierno

                    ),
                )
            ),
            subCategorias(
                "TIEMPO V",
                "#92d36e",

                mutableListOf(
                    word(
                        "MANANA",
                        R.raw.manana

                    ),
                    word(
                        "MEDIODIA",
                        R.raw.mediodia

                    ),
                    word(
                        "MES",
                        R.raw.mes

                    ),
                    word(
                        "MIENTRAS",
                        R.raw.mientras

                    ),
                    word(
                        "MINUTO",
                        R.raw.minuto

                    ),
                )
            ),
            subCategorias(
                "TIEMPO VI",
                "#92d36e",

                mutableListOf(
                    word(
                        "NOCHE",
                        R.raw.noche

                    ),
                    word(
                        "OTONO",
                        R.raw.otono

                    ),
                    word(
                        "OTRAVEZ",
                        R.raw.otravez

                    ),
                    word(
                        "OTRO",
                        R.raw.otro

                    ),
                    word(
                        "PASADO",
                        R.raw.pasado

                    ),
                )
            ),
            subCategorias(
                "TIEMPO VII",
                "#92d36e",

                mutableListOf(
                    word(
                        "PRESENTE",
                        R.raw.presente

                    ),
                    word(
                        "PRIMAVERA",
                        R.raw.primavera

                    ),
                    word(
                        "PRIMERAVEZ",
                        R.raw.primeravez

                    ),
                    word(
                        "PROXIMO",
                        R.raw.proximo

                    ),
                    word(
                        "SEMANA",
                        R.raw.semana

                    ),
                )
            ),
            subCategorias(
                "TIEMPO VIII",
                "#92d36e",

                mutableListOf(
                    word(
                        "SIEMPRE",
                        R.raw.siempre

                    ),
                    word(
                        "TARDE",
                        R.raw.tarde

                    ),
                    word(
                        "TEMPRANO",
                        R.raw.temprano

                    ),
                    word(
                        "UNAVEZ",
                        R.raw.unavez

                    ),
                    word(
                        "VERANO",
                        R.raw.verano

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "AHORA",
                R.raw.ahora

            ),
            word(
                "AHORITA",
                R.raw.ahorita

            ),
            word(
                "AIRE",
                R.raw.aire

            ),
            word(
                "ANO",
                R.raw.ano

            ),
            word(
                "ANTIER",
                R.raw.antier

            ),
            word(
                "AVECES",
                R.raw.aveces

            ),
            word(
                "AYER",
                R.raw.ayer

            ),
            word(
                "CALENDARIO",
                R.raw.calendario

            ),
            word(
                "CALOR",
                R.raw.calor

            ),
            word(
                "CUMPLEANOS",
                R.raw.cumpleanos

            ),
            word(
                "DESPUES",
                R.raw.despues

            ),
            word(
                "DIA",
                R.raw.dia

            ),
            word(
                "EDAD",
                R.raw.edad

            ),
            word(
                "FECHA",
                R.raw.fecha

            ),
            word(
                "FRIO",
                R.raw.frio

            ),
            word(
                "FUTURO",
                R.raw.futuro

            ),
            word(
                "HASTA",
                R.raw.hasta

            ),
            word(
                "HORA",
                R.raw.hora

            ),
            word(
                "HOY",
                R.raw.hoy

            ),
            word(
                "INVIERNO",
                R.raw.invierno

            ),
            word(
                "MANANA",
                R.raw.manana

            ),
            word(
                "MEDIODIA",
                R.raw.mediodia

            ),
            word(
                "MES",
                R.raw.mes

            ),
            word(
                "MIENTRAS",
                R.raw.mientras

            ),
            word(
                "MINUTO",
                R.raw.minuto

            ),
            word(
                "NOCHE",
                R.raw.noche

            ),
            word(
                "OTONO",
                R.raw.otono

            ),
            word(
                "OTRAVEZ",
                R.raw.otravez

            ),
            word(
                "OTRO",
                R.raw.otro

            ),
            word(
                "PASADO",
                R.raw.pasado

            ),
            word(
                "PRESENTE",
                R.raw.presente

            ),
            word(
                "PRIMAVERA",
                R.raw.primavera

            ),
            word(
                "PRIMERAVEZ",
                R.raw.primeravez

            ),
            word(
                "PROXIMO",
                R.raw.proximo

            ),
            word(
                "SEMANA",
                R.raw.semana

            ),
            word(
                "SIEMPRE",
                R.raw.siempre

            ),
            word(
                "TARDE",
                R.raw.tarde

            ),
            word(
                "TEMPRANO",
                R.raw.temprano

            ),
            word(
                "UNAVEZ",
                R.raw.unavez

            ),
            word(
                "VERANO",
                R.raw.verano

            ),
            word(
                "VIENTO",
                R.raw.viento

            ),
        ),
        8,

        ),
    category(
        "TRANSPORTE",
        R.drawable.transporte,
        "#ff5d55",

        mutableListOf(
            subCategorias(
                "TRANSPORTE I",
                "#ff5d55",

                mutableListOf(
                    word(
                        "AVION",
                        R.raw.avion

                    ),
                    word(
                        "BARCO",
                        R.raw.barco

                    ),
                    word(
                        "BICICLETA",
                        R.raw.bicicleta

                    ),
                    word(
                        "CAMION",
                        R.raw.camion

                    ),
                    word(
                        "CARRO",
                        R.raw.carro

                    ),
                )
            ),
            subCategorias(
                "TRANSPORTE II",
                "#ff5d55",

                mutableListOf(
                    word(
                        "CDEAUTOBUSES",
                        R.raw.cdeautobuses

                    ),
                    word(
                        "HELICOPTERO",
                        R.raw.helicoptero

                    ),
                    word(
                        "METRO",
                        R.raw.metro

                    ),
                    word(
                        "MOTOCICLETA",
                        R.raw.motocicleta

                    ),
                    word(
                        "TAXI",
                        R.raw.taxi

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "AVION",
                R.raw.avion

            ),
            word(
                "BARCO",
                R.raw.barco

            ),
            word(
                "BICICLETA",
                R.raw.bicicleta

            ),
            word(
                "CAMION",
                R.raw.camion

            ),
            word(
                "CARRO",
                R.raw.carro

            ),
            word(
                "CDEAUTOBUSES",
                R.raw.cdeautobuses

            ),
            word(
                "HELICOPTERO",
                R.raw.helicoptero

            ),
            word(
                "METRO",
                R.raw.metro

            ),
            word(
                "MOTOCICLETA",
                R.raw.motocicleta

            ),
            word(
                "TAXI",
                R.raw.taxi

            ),
            word(
                "TRANSPORTE",
                R.raw.transporte

            ),
            word(
                "TREN",
                R.raw.tren

            ),
        ),
        2,

        ),
    category(
        "VERBOS",
        R.drawable.verbos,
        "#c238eb",

        mutableListOf(
            subCategorias(
                "VERBOS I",
                "#c238eb",

                mutableListOf(
                    word(
                        "APRENDER",
                        R.raw.aprender

                    ),
                    word(
                        "AVISAR",
                        R.raw.avisar

                    ),
                    word(
                        "AYUDAR",
                        R.raw.ayudar

                    ),
                    word(
                        "COMER",
                        R.raw.comer

                    ),
                    word(
                        "COMPRAR",
                        R.raw.comprar

                    ),
                )
            ),
            subCategorias(
                "VERBOS II",
                "#c238eb",

                mutableListOf(
                    word(
                        "CREER",
                        R.raw.creer

                    ),
                    word(
                        "CUIDAR",
                        R.raw.cuidar

                    ),
                    word(
                        "DAR",
                        R.raw.dar

                    ),
                    word(
                        "DECIR",
                        R.raw.decir

                    ),
                    word(
                        "DESCANSAR",
                        R.raw.descansar

                    ),
                )
            ),
            subCategorias(
                "VERBOS III",
                "#c238eb",

                mutableListOf(
                    word(
                        "DORMIR",
                        R.raw.dormir

                    ),
                    word(
                        "EMPEZAR",
                        R.raw.empezar

                    ),
                    word(
                        "ENSENAR",
                        R.raw.ensenar

                    ),
                    word(
                        "ENTENDER",
                        R.raw.entender

                    ),
                    word(
                        "ESCRIBIR",
                        R.raw.escribir

                    ),
                )
            ),
            subCategorias(
                "VERBOS IV",
                "#c238eb",

                mutableListOf(
                    word(
                        "ESPERAR",
                        R.raw.esperar

                    ),
                    word(
                        "ESTUDIAR",
                        R.raw.estudiar

                    ),
                    word(
                        "EXPLICAR",
                        R.raw.explicar

                    ),
                    word(
                        "HABLAR",
                        R.raw.hablar

                    ),
                    word(
                        "HACER",
                        R.raw.hacer

                    ),
                )
            ),
            subCategorias(
                "VERBOS V",
                "#c238eb",

                mutableListOf(
                    word(
                        "JUGAR",
                        R.raw.jugar

                    ),
                    word(
                        "LIMPIAR",
                        R.raw.limpiar

                    ),
                    word(
                        "NECESITAR",
                        R.raw.necesitar

                    ),
                    word(
                        "OLVIDAR",
                        R.raw.olvidar

                    ),
                    word(
                        "PAGAR",
                        R.raw.pagar

                    ),
                )
            ),
            subCategorias(
                "VERBOS VI",
                "#c238eb",

                mutableListOf(
                    word(
                        "PENSAR",
                        R.raw.pensar

                    ),
                    word(
                        "PERDER",
                        R.raw.perder

                    ),
                    word(
                        "PLATICAR",
                        R.raw.platicar

                    ),
                    word(
                        "PODER",
                        R.raw.poder

                    ),
                    word(
                        "PREGUNTAR",
                        R.raw.preguntar

                    ),
                )
            ),
            subCategorias(
                "VERBOS VII",
                "#c238eb",

                mutableListOf(
                    word(
                        "SENTAR",
                        R.raw.sentar

                    ),
                    word(
                        "TERMINAR",
                        R.raw.terminar

                    ),
                    word(
                        "TRABAJAR",
                        R.raw.trabajar

                    ),
                    word(
                        "VENDER",
                        R.raw.vender

                    ),
                    word(
                        "VER",
                        R.raw.ver

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "APRENDER",
                R.raw.aprender

            ),
            word(
                "AVISAR",
                R.raw.avisar

            ),
            word(
                "AYUDAR",
                R.raw.ayudar

            ),
            word(
                "COMER",
                R.raw.comer

            ),
            word(
                "COMPRAR",
                R.raw.comprar

            ),
            word(
                "CREER",
                R.raw.creer

            ),
            word(
                "CUIDAR",
                R.raw.cuidar

            ),
            word(
                "DAR",
                R.raw.dar

            ),
            word(
                "DECIR",
                R.raw.decir

            ),
            word(
                "DESCANSAR",
                R.raw.descansar

            ),
            word(
                "DORMIR",
                R.raw.dormir

            ),
            word(
                "EMPEZAR",
                R.raw.empezar

            ),
            word(
                "ENSENAR",
                R.raw.ensenar

            ),
            word(
                "ENTENDER",
                R.raw.entender

            ),
            word(
                "ESCRIBIR",
                R.raw.escribir

            ),
            word(
                "ESPERAR",
                R.raw.esperar

            ),
            word(
                "ESTUDIAR",
                R.raw.estudiar

            ),
            word(
                "EXPLICAR",
                R.raw.explicar

            ),
            word(
                "HABLAR",
                R.raw.hablar

            ),
            word(
                "HACER",
                R.raw.hacer

            ),
            word(
                "JUGAR",
                R.raw.jugar

            ),
            word(
                "LIMPIAR",
                R.raw.limpiar

            ),
            word(
                "NECESITAR",
                R.raw.necesitar

            ),
            word(
                "OLVIDAR",
                R.raw.olvidar

            ),
            word(
                "PAGAR",
                R.raw.pagar

            ),
            word(
                "PENSAR",
                R.raw.pensar

            ),
            word(
                "PERDER",
                R.raw.perder

            ),
            word(
                "PLATICAR",
                R.raw.platicar

            ),
            word(
                "PODER",
                R.raw.poder

            ),
            word(
                "PREGUNTAR",
                R.raw.preguntar

            ),
            word(
                "SENTAR",
                R.raw.sentar

            ),
            word(
                "TERMINAR",
                R.raw.terminar

            ),
            word(
                "TRABAJAR",
                R.raw.trabajar

            ),
            word(
                "VENDER",
                R.raw.vender

            ),
            word(
                "VER",
                R.raw.ver

            ),
            word(
                "VIVIR",
                R.raw.vivir

            ),
        ),
        7,

        ),
    category(
        "VERBOS",
        R.drawable.verbos,
        "#929292",

        mutableListOf(
            subCategorias(
                "VERBOS I",
                "#929292",

                mutableListOf(
                    word(
                        "CONOCER",
                        R.raw.conocer

                    ),
                    word(
                        "ENTENDER",
                        R.raw.entender

                    ),
                    word(
                        "GUSTAR",
                        R.raw.gustar

                    ),
                    word(
                        "HABER",
                        R.raw.haber

                    ),
                    word(
                        "NOCONOCER",
                        R.raw.noconocer

                    ),
                )
            ),
            subCategorias(
                "VERBOS II",
                "#929292",

                mutableListOf(
                    word(
                        "NOENTENDER",
                        R.raw.noentender

                    ),
                    word(
                        "NOGUSTAR",
                        R.raw.nogustar

                    ),
                    word(
                        "NOHABER",
                        R.raw.nohaber

                    ),
                    word(
                        "NOPODER",
                        R.raw.nopoder

                    ),
                    word(
                        "NOQUERER",
                        R.raw.noquerer

                    ),
                )
            ),
            subCategorias(
                "VERBOS III",
                "#929292",

                mutableListOf(
                    word(
                        "NOSABER",
                        R.raw.nosaber

                    ),
                    word(
                        "NOSERVIR",
                        R.raw.noservir

                    ),
                    word(
                        "PODER",
                        R.raw.poder

                    ),
                    word(
                        "QUERER",
                        R.raw.querer

                    ),
                    word(
                        "SABER",
                        R.raw.saber

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "CONOCER",
                R.raw.conocer

            ),
            word(
                "ENTENDER",
                R.raw.entender

            ),
            word(
                "GUSTAR",
                R.raw.gustar

            ),
            word(
                "HABER",
                R.raw.haber

            ),
            word(
                "NOCONOCER",
                R.raw.noconocer

            ),
            word(
                "NOENTENDER",
                R.raw.noentender

            ),
            word(
                "NOGUSTAR",
                R.raw.nogustar

            ),
            word(
                "NOHABER",
                R.raw.nohaber

            ),
            word(
                "NOPODER",
                R.raw.nopoder

            ),
            word(
                "NOQUERER",
                R.raw.noquerer

            ),
            word(
                "NOSABER",
                R.raw.nosaber

            ),
            word(
                "NOSERVIR",
                R.raw.noservir

            ),
            word(
                "PODER",
                R.raw.poder

            ),
            word(
                "QUERER",
                R.raw.querer

            ),
            word(
                "SABER",
                R.raw.saber

            ),
            word(
                "SERVIR",
                R.raw.servir

            ),
        ),
        3,

        ),
    category(
        "VERDURAS",
        R.drawable.verduras,
        "#3CA99B",

        mutableListOf(
            subCategorias(
                "VERDURAS I",
                "#3CA99B",

                mutableListOf(
                    word(
                        "AGUACATE",
                        R.raw.aguacate

                    ),
                    word(
                        "AJO",
                        R.raw.ajo

                    ),
                    word(
                        "BETABEL",
                        R.raw.betabel

                    ),
                    word(
                        "CALABACITA",
                        R.raw.calabacita

                    ),
                    word(
                        "CALABAZA",
                        R.raw.calabaza

                    ),
                )
            ),
            subCategorias(
                "VERDURAS II",
                "#3CA99B",

                mutableListOf(
                    word(
                        "CAMOTE",
                        R.raw.camote

                    ),
                    word(
                        "CEBOLLA",
                        R.raw.cebolla

                    ),
                    word(
                        "CHICHARO",
                        R.raw.chicharo

                    ),
                    word(
                        "CHILE",
                        R.raw.chile

                    ),
                    word(
                        "ELOTE",
                        R.raw.elote

                    ),
                )
            ),
            subCategorias(
                "VERDURAS III",
                "#3CA99B",

                mutableListOf(
                    word(
                        "FRIJOL",
                        R.raw.frijol

                    ),
                    word(
                        "HONGO",
                        R.raw.hongo

                    ),
                    word(
                        "JITOMATE",
                        R.raw.jitomate

                    ),
                    word(
                        "LECHUGA",
                        R.raw.lechuga

                    ),
                    word(
                        "NOPAL",
                        R.raw.nopal

                    ),
                )
            ),
        ),
        mutableListOf(
            word(
                "AGUACATE",
                R.raw.aguacate

            ),
            word(
                "AJO",
                R.raw.ajo

            ),
            word(
                "BETABEL",
                R.raw.betabel

            ),
            word(
                "CALABACITA",
                R.raw.calabacita

            ),
            word(
                "CALABAZA",
                R.raw.calabaza

            ),
            word(
                "CAMOTE",
                R.raw.camote

            ),
            word(
                "CEBOLLA",
                R.raw.cebolla

            ),
            word(
                "CHICHARO",
                R.raw.chicharo

            ),
            word(
                "CHILE",
                R.raw.chile

            ),
            word(
                "ELOTE",
                R.raw.elote

            ),
            word(
                "FRIJOL",
                R.raw.frijol

            ),
            word(
                "HONGO",
                R.raw.hongo

            ),
            word(
                "JITOMATE",
                R.raw.jitomate

            ),
            word(
                "LECHUGA",
                R.raw.lechuga

            ),
            word(
                "NOPAL",
                R.raw.nopal

            ),
            word(
                "PAPA",
                R.raw.papa

            ),
            word(
                "PEPINO",
                R.raw.pepino

            ),
            word(
                "ZANAHORIA",
                R.raw.zanahoria

            ),
        ),
        3,

        ),
)

