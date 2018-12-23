package com.robin.tabletoppers.framework

import com.robin.data.GezelschapsspelPersistenceSource
import com.robin.domain.Bordspel
import com.robin.domain.Dobbelsteenspel
import com.robin.domain.Kaartspel
import com.robin.domain.Gezelschapsspel
import kotlin.random.Random

class ValseGezelschapsspelenRepository: GezelschapsspelPersistenceSource{
    override fun getGezelschapsspelen(): List<Gezelschapsspel> {
        val bordspelNamen = arrayOf("Gloomhaven", "Pandemic Legacy Season 2", "Through the Ages A New Story of Civilization", "Terraforming Mars", "Twilight Struggle", "Star Wars Rebellion", "Scythe", "Gaia Project", "Great Western Trail", "Terra Mystica")
        val bordspelFotos = arrayOf("gloomhaven", "pandemic_legacy_season_2", "through_the_ages", "terraforming_mars", "twilight_struggle", "star_wars_rebellion", "scythe", "gaia_project", "great_western_trail", "terra_mystica")

        val dobbelsteenspelNamen = arrayOf("Blueprints", "Panamax", "Qwixx", "Bang The Dice Game", "Zombie Dice 2", "Formula D", "Marvel Dice Masters", "Pandemic The Cure", "King of Tokyo", "Roll For The Galaxy")
        var dobbelsteenspelFotos = arrayOf("blueprints", "panamax", "qwixx", "bang", "zombie_dice_2", "formula_d", "marvel_dice_masters", "pandemic_the_cure", "king_of_tokyo", "roll_for_the_galaxy")

        val kaartspelNamen = arrayOf("Town Of Salem", "Uno" , "Snake Oil", "Joking Hazard", "Noir Black Box Edition Boxed Card Game", "Town Of Salem The Savior of Salem", "Pokemon Trading Card Game", "YuGiOh", "Magic The Gathering", "Epic Spell Wars of the Battle Wizards Duel at Mt Skullzfyre")
        val kaartspelFotos = arrayOf("town_of_salem", "uno", "snake_oil", "joking_hazard", "noir", "tos_savior_of_salem", "pokemon_trading_card_game", "yugioh", "magic_the_gathering", "epic_spell_wars")

        val spelenRepository = mutableListOf<Gezelschapsspel>()

        for(spelId in 1..10){
            val spelType = Random.nextInt(1,3)
            val spelIndex = Random.nextInt(1, 10)
            val speelduur = IntArray(2)
            speelduur[0] = Random.nextInt(3, 100)*10
            speelduur[1] = Random.nextInt(speelduur[0]+30, speelduur[0]+150)

            val aantalSpelers = IntArray(2)
            aantalSpelers[0] = Random.nextInt(1, 30)
            aantalSpelers[1] = Random.nextInt(aantalSpelers[0], aantalSpelers[0]+30)

            val omschrijving = "\n" +
                    "\n" +
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ultrices posuere pellentesque. Phasellus eget malesuada lorem, non molestie turpis. Nam ac ligula orci. Phasellus dignissim ultrices nisl, sit amet auctor sem lobortis quis. Nunc in venenatis mi, pharetra convallis ipsum. Ut at luctus velit. Aenean eu tincidunt dolor, sed hendrerit neque. Sed auctor finibus nisi, sit amet finibus libero dictum sed.\n" +
                    "\n" +
                    "Pellentesque vel neque molestie, convallis nibh in, ornare lacus. Donec quis urna ac enim commodo malesuada ac ac augue. Donec porta ex tellus, sit amet scelerisque tellus tincidunt ut. Etiam malesuada dictum lorem, ut luctus nisi eleifend vel. Ut feugiat, enim ut fermentum dapibus, ex lectus eleifend sapien, ut consequat velit justo id lacus. Integer ornare ipsum sed lacus placerat ullamcorper. Morbi rhoncus massa quis ex pretium finibus quis et dolor. Fusce erat libero, maximus nec sapien eu, molestie feugiat dolor. Fusce sit amet eros eget velit malesuada ornare. In erat nibh, ullamcorper quis ex sit amet, gravida bibendum magna. Duis faucibus dui sed nisl ultricies, at fringilla ante eleifend. Sed nulla turpis, accumsan venenatis ligula sed, laoreet semper nibh. Mauris aliquam, est sit amet gravida convallis, sem erat convallis enim, eu ultrices massa velit a orci.\n" +
                    "\n" +
                    "Donec non dolor nibh. Sed hendrerit dictum rhoncus. Sed suscipit ante sem, et vulputate nunc finibus in. Sed volutpat aliquam erat. Integer dapibus molestie aliquet. Praesent at magna a risus molestie rutrum sed ac quam. Aliquam pharetra nec magna sit amet consequat. Nulla at nunc a sapien porta euismod. Ut tristique, dui ut pulvinar faucibus, neque nisi laoreet ante, vitae rutrum quam orci a erat. Donec efficitur tortor et lorem euismod, sit amet dignissim urna sagittis. Proin vel pharetra nulla. Nunc malesuada felis eu sapien ornare, non tincidunt lorem fringilla. Nullam risus tellus, efficitur at fermentum at, venenatis vel urna.\n" +
                    "\n" +
                    "Suspendisse ornare turpis at urna aliquam, sit amet malesuada nisi tincidunt. Proin tincidunt lectus sit amet scelerisque porttitor. Suspendisse a enim ut felis molestie auctor a at augue. Donec vulputate augue ac nibh pharetra congue. Morbi ut diam vitae arcu interdum venenatis in eget sem. Nulla vitae lorem et ex sagittis rutrum sit amet a elit. Sed bibendum pulvinar mi. Praesent ex tellus, vulputate ut lectus nec, dictum vehicula est. Duis consectetur blandit scelerisque. Praesent fringilla tortor quam, in feugiat elit consequat quis. Donec quis purus eu lacus maximus vehicula non nec lorem.\n" +
                    "\n" +
                    "Donec ut erat justo. Donec eu cursus ligula. Morbi risus orci, blandit at posuere sit amet, elementum in velit. Sed ullamcorper urna in quam malesuada aliquam. Sed porttitor tempus nisl, a auctor turpis vestibulum sit amet. Sed mattis pretium tortor at cursus. In suscipit vel nisl ut suscipit. Maecenas vehicula ligula quis elit vehicula, et lacinia mi gravida. Vestibulum fringilla lectus eget faucibus elementum. Nunc in rutrum libero, in cursus erat. Vivamus non semper magna."

            if(spelType == 1){
                val bordspel = Bordspel(
                    spelId.toLong(),
                    bordspelNamen[spelIndex],
                    omschrijving,
                    "Uitgever",
                    Random.nextInt(1950, 2018),
                    speelduur,
                    aantalSpelers,
                    Random.nextDouble(0.toDouble(), 10.toDouble()),
                    bordspelFotos[spelIndex],
                    doubleArrayOf(Random.nextDouble(1.toDouble(), 10.toDouble()), Random.nextDouble(1.toDouble()), 10.toDouble())
                )
                spelenRepository.add(bordspel)
            }

            else if(spelType == 2){
                val kaartspel = Kaartspel(
                    spelId.toLong(),
                    kaartspelNamen[spelIndex],
                    omschrijving,
                    "Uitgever",
                    Random.nextInt(1950, 2018),
                    speelduur,
                    aantalSpelers,
                    Random.nextDouble(0.toDouble(), 10.toDouble()),
                    doubleArrayOf(Random.nextDouble(1.toDouble()), 10.toDouble(), Random.nextDouble(1.toDouble()), 10.toDouble()),
                    kaartspelFotos[spelIndex],
                    Random.nextInt(15, 250)
                )
                spelenRepository.add(kaartspel)
            }

            else {
                val dobbelsteenspel = Dobbelsteenspel(
                    spelId.toLong(),
                    dobbelsteenspelNamen[spelIndex],
                    omschrijving,
                    "Uitgever",
                    Random.nextInt(1950, 2018),
                    speelduur,
                    aantalSpelers,
                    Random.nextDouble(0.toDouble(), 10.toDouble()),
                    doubleArrayOf(Random.nextDouble(1.toDouble()), 10.toDouble(), Random.nextDouble(1.toDouble()), 10.toDouble()),
                    dobbelsteenspelFotos[spelIndex],
                    Random.nextInt(1, 15)
                )
                spelenRepository.add(dobbelsteenspel)
            }
        }
        return spelenRepository
    }
}