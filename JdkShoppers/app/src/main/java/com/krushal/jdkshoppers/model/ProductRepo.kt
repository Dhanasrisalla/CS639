package com.krushal.jdkshoppers.model

class ProductRepo(private val productDao: ProductDao) {
    suspend fun allProducts(): List<Product> {
        return productDao.getAllProducts()
    }

    private suspend fun insert(product: Product) {
        productDao.insert(product = product)
    }

    suspend fun seedProducts() {
            insert(
                Product(
                    0L,
                    "Sweaters",
                    "winter sweater",
                    "https://t4.ftcdn.net/jpg/04/93/30/65/240_F_493306500_qZB8rv6YtalaGn51U5BOs7fKpHsuhC9X.jpg",
                    11.99
                )
            )
        insert(
            Product(
                0L,
                "Sweaters",
                " Medium sweater",
                "https://t3.ftcdn.net/jpg/02/39/26/78/240_F_239267866_HsyDC6qjv8Hp5BHc3OrVlqL3jlS6bpci.jpg",
                10.99
            )
        )
        insert(
            Product(
                0L,
                "Sweaters",
                " winter wear",
                "https://t4.ftcdn.net/jpg/06/32/83/41/240_F_632834120_yKe6xRXBI6It9k4nyCZ7irLKMGJvkBej.jpg",
                15.99
            )
        )
        insert(
            Product(
                0L,
                "Sweaters",
                " swater2-",
                "https://t4.ftcdn.net/jpg/03/05/07/53/240_F_305075339_XpVgQ6k8Veby7PmQ1AltKrUIlpLVmBb9.jpg",
                13.99
            )
        )

        insert(
            Product(
                    0L,
                    "winter cap",
                    "small cap",
                    "https://t3.ftcdn.net/jpg/03/22/48/48/240_F_322484851_SiMIDrfoFY9iGY0D46TtdTVt7yW2352M.jpg",
                    5.00
                )
            )
        insert(
            Product(
                0L,
                "winter cap",
                "cap",
                "https://t3.ftcdn.net/jpg/00/58/14/00/240_F_58140005_dMgx7GApgAOzFtpyZkx9VlPjlQpNISul.jpg",
                9.00
            )
        )
        insert(
            Product(
                0L,
                "winter cap",
                "wolf cap",
                "https://t3.ftcdn.net/jpg/00/58/14/00/240_F_58140051_Zm75f2uXZJ0hzIXGZMm9YHM3D6vbuYaK.jpg",
                5.00
            )
        )
        insert(
            Product(
                0L,
                "sneakers",
                "small sneakers",
                "https://t4.ftcdn.net/jpg/02/24/25/91/240_F_224259194_y38nqsedF6UBBkI6qCiJDe721wXp55Tu.jpg",
                35.00
            )
        )
        insert(
            Product(
                0L,
                "sneakers",
                "white sneakers",
                "https://t4.ftcdn.net/jpg/00/94/09/69/240_F_94096982_HmT3TIDVxpk3yXsIm8rQRpijeWUxzf57.jpg",
                29.00
            )
        )
        insert(
            Product(
                0L,
                "sneakers",
                "color sneakers",
                "https://t4.ftcdn.net/jpg/05/06/36/71/240_F_506367145_aTN8tLqtKXDYxzHQs5DH4HGsbVT9OgMn.jpg",
                26.00
            )
        )
        insert(
            Product(
                0L,
                "sneakers",
                "small sneakers",
                "https://t3.ftcdn.net/jpg/02/64/98/34/240_F_264983445_wXVAKMmZe0Q1jJN6R6riVJsajb7fGvx3.jpg",
                13.99
            )
        )
        insert(
            Product(
                0L,
                "Variety of socks",
                "color socks",
                "https://t4.ftcdn.net/jpg/04/67/77/85/240_F_467778506_JipIyLOyQl6xP0YpXBmnVCWZwQ1Jczii.jpg",
                5.99
            )
        )
        insert(
            Product(
                0L,
                "Variety of socks",
                "small socks",
                "https://t3.ftcdn.net/jpg/02/18/13/72/240_F_218137246_8S5g7oJZTQdKP21JqxGxutpzhxz0WCwU.jpg",
                06.00
            )
        )
        insert(
            Product(
                0L,
                "Variety of socks",
                "medium socks",
                "https://t3.ftcdn.net/jpg/06/41/51/00/240_F_641510057_GLayTOZTtKEemix8Be7eiEhLuxdojwKG.jpg",
                10.00
            )
        )
        insert(
            Product(
                0L,
                "Variety of socks",
                "white socks",
                "https://as.ftcdn.net/v1/pics/placeholders/spacer.gif",
                09.99
            )
        )
        insert(
            Product(
                0L,
                "Variety of socks",
                "puma  socks",
                "https://t3.ftcdn.net/jpg/02/18/13/72/240_F_218137258_tcVOIddHMvjK3Ny2Y0pqJj7qciEr4pgo.jpghttps://t3.ftcdn.net/jpg/02/18/13/72/240_F_218137258_tcVOIddHMvjK3Ny2Y0pqJj7qciEr4pgo.jpg",
                13.50
            )
        )
        insert(
            Product(
                0L,
                "bag",
                "Hand Bag",
                "https://t4.ftcdn.net/jpg/05/35/43/37/240_F_535433774_pykrpms7SkMmhdR8WvdfPCddQMJsGGjk.jpg",
                11.00
            )
        )
        insert(
            Product(
                0L,
                "bag",
                "red Bag",
                "https://t4.ftcdn.net/jpg/02/86/03/39/240_F_286033919_yHuw1GLVJFlOBaJhVYSmMsC8E7SgUqTJ.jpg",
                125.00
            )
        )
        insert(
            Product(
                0L,
                "bag",
                "coach  Bag",
                "https://t3.ftcdn.net/jpg/04/79/58/66/240_F_479586624_399ccy3c5zxCL4dEI3U3o6e2aR3bu3AD.jpg",
                132.00
            )
        )
        insert(
            Product(
                0L,
                "bag",
                "red tape   Bag",
                "https://t4.ftcdn.net/jpg/01/92/12/81/240_F_192128130_O6NfhNmgjHGiaZfCd1M8ULhzsJwH5B3K.jpg",
                150.00
            )
        )
        insert(
            Product(
                0L,
                "bag",
                "Kate spade Bag",
                "https://t3.ftcdn.net/jpg/02/02/38/98/240_F_202389840_RtPcE03PuFbdiAfAViDPTYWKrJwPsaN9.jpg",
                350.99
            )
        )
        insert(
            Product(
                0L,
                "sandals",
                "Stylish sandals",
                "https://t4.ftcdn.net/jpg/01/12/89/91/240_F_112899113_4wFQ3Mb87ufF7F6pkv7d0twj9CI0xpCs.jpg",
                90.00
            )
        )
        insert(
            Product(
                0L,
                "sandals",
                "red sandals",
                "https://t3.ftcdn.net/jpg/02/24/61/68/240_F_224616827_jOE8HUG5LwQWtFKVP0KOI9fYxp2KRRh0.jpg",
                17.22
            )
        )

        insert(
            Product(
                0L,
                "sandals",
                "white  sandals",
                "https://t3.ftcdn.net/jpg/03/61/44/96/240_F_361449695_rIw41OcPbWBHm2vjasBEcnuey9ktUEdB.jpg",
                56.99
            )
        )
        insert(
            Product(
                0L,
                "sandals",
                "Black sandals",
                "https://t4.ftcdn.net/jpg/01/24/21/81/240_F_124218175_diDV5hxwddOmQC3X9qgubjR4qvosdw67.jpg",
                32.22
            )
        )
        insert(
            Product(
                0L,
                "perfume",
                "Rose",
                "https://t4.ftcdn.net/jpg/04/85/77/91/240_F_485779181_IZQMgXmoi68q7ZQcBXcFNLvhjyW7tFds.jpg",
                23.33
            )
        )
        insert(
            Product(
                0L,
                "perfume",
                "water",
                "https://t3.ftcdn.net/jpg/04/39/32/54/240_F_439325404_RyVWWixAOj84vacOe2oDRmchGAXcVVpn.jpg",
                20.00
            )
        )
        insert(
            Product(
                0L,
                "perfume",
                "spice",
                "https://t4.ftcdn.net/jpg/02/03/99/47/240_F_203994732_L1G7s1weHA5bherdeEJIiRDVpsD7LFyW.jpg",
                24.00
            )
        )
        insert(
            Product(
                0L,
                "perfume",
                "sandal wood ",
                "https://t3.ftcdn.net/jpg/00/17/95/42/240_F_17954287_eAGnjjPKE1N1737Bz2CsDneAO0qxIicn.jpg",
                23.00
            )
        )
        insert(
            Product(
                0L,
                "Christmas gifts",
                "Surprise Gift ",
                "https://t3.ftcdn.net/jpg/03/89/54/82/240_F_389548240_MCHKDPEnQK7ctT4ljeY3WKcglmsCL6EY.jpg",
                12.00
            )
        )
        insert(
            Product(
                0L,
                "Christmas gifts",
                "Watch Gift ",
                "https://t3.ftcdn.net/jpg/03/05/27/22/240_F_305272228_N7WwL9eY61P8W3tRWoNXmTxKUdbeoEH2.jpg",
                33.00
            )
        )
        insert(
            Product(
                0L,
                "Christmas gifts",
                "Gold ",
                "https://t3.ftcdn.net/jpg/01/78/88/64/240_F_178886437_WK3n9jbvTIFU5XeOdPBEskaVzQeLvd7H.jpg",
                66.00
            )
        )
        insert(
            Product(
                0L,
                "Christmas gifts",
                "Chocolate ",
                "https://t4.ftcdn.net/jpg/06/32/35/67/240_F_632356718_bZdUpPlhovKmTiyyzXnfUEL9DhNmcyzp.jpg",
                09.00
            )
        )
        insert(
            Product(
                0L,
                "Christmas gifts",
                "Small gift ",
                "https://t4.ftcdn.net/jpg/01/76/66/51/240_F_176665199_yGQ6Sqs23yTHkidRlyj4Kq1lsp0we63T.jpg",
                11.00
            )
        )



    }

    suspend fun deleteAll() {
        productDao.deleteAllProducts()
    }


}
