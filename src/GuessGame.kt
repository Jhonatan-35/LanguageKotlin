import javax.swing.*           //Imports for make interfaces of the app
import java.awt.*
import kotlin.random.Random

fun main() {
    SwingUtilities.invokeLater{
        GuessGameUI()
    }
}
class GuessGameUI :JFrame(){                         // The class for the  create number of the guessing Game
    private var numberSecret = Random.nextInt(1,101)
    private  var trieds = 0

    private val titles = JLabel("🎯Guess Game", SwingConstants.CENTER)   //The labels of the  Guessing game
    private val message = JLabel ("Guessing on Between number 1 to 100",SwingConstants.CENTER)
    private val fieldText = JTextField()
    private val buttonGuessing = JButton("Guess")
    private val buttonReboot = JButton("Reboot")
    private val triedsLabel = JLabel("trieds: 0",SwingConstants.CENTER,)


    init {                                         //Personalize  of styles for the Guessing game
        title = "Guess Game"                       //Title of the Guessing game
        size = Dimension(400,300)
        defaultCloseOperation= EXIT_ON_CLOSE
        layout =BorderLayout()

        val panel = JPanel()                       //Guessing  layout for the guessing and color size in different things
        panel.layout = GridLayout(6,1,10,10)
        panel.border = BorderFactory.createEmptyBorder(15,15,15,1)
        panel.background =Color(30,30,30)

        titles.font = Font("Arial",Font.BOLD,20) //stylize for  fonts  and choose random
        titles.foreground = Color.WHITE

        message.foreground = Color.LIGHT_GRAY
        triedsLabel.foreground = Color.CYAN

        fieldText.font = Font("Arial",Font.PLAIN,16)

        buttonGuessing.background = Color(0,120,215)
        buttonGuessing.foreground = Color.WHITE

        buttonReboot.background = Color(200,50,50)
        buttonReboot.foreground =Color.WHITE


        buttonGuessing.addActionListener {
            verificarNumber()
        }
        buttonReboot.addActionListener {
            rebootGuess()
        }                             // Styles of the different things of and bottons  and interfaces
        panel.add(titles)
        panel.add(message)
        panel.add(fieldText)
        panel.add(buttonGuessing)
        panel.add(triedsLabel)
        panel.add(buttonReboot)

        add(panel)
        isVisible = true


    }
    private fun verificarNumber(){                    // The conditions of the  app
          val tried =fieldText.text.toIntOrNull()

          if (tried == null){
              message.text = "Enter the Number valid"
              return
              }
               trieds ++
               triedsLabel.text ="Trieds :$trieds"
          when {
              tried <numberSecret ->message.text = "Very high 🔼"
              tried <numberSecret ->message.text = "Very Low 🔽"
              else -> message.text ="🎆Correct"

          }

    }
    private fun rebootGuess(){
        numberSecret = Random.nextInt(1,101)
        trieds =0
        triedsLabel.text = "Trieds: 0"
        message.text ="Guessing on between number 1 to 100"
        fieldText.text = ""
    }

}