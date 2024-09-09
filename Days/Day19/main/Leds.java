package day19;
public class Leds
{
    private int leds;
    private String m;
        public Leds(String m)
        {
            leds=0;
            this.m=m;
        }
        public String getM()
        {
            return m;
        }
        public void setM(String m)
        {
            this.m = m;
        }
        public int getLeds()
        {
            return leds;
        }
        public void setLeds(int leds)
        {
            this.leds = leds;
        }
        public int indicadorDeLeds()
        {
            for(int i=0;i<m.length();i++)
            {
               char c = m.charAt(i);
                switch(c)
                {
                case '1' -> leds +=2;
                case '2' -> leds +=5;
                case '3' -> leds +=5;
                case '4' -> leds +=4;
                case '5' -> leds +=5;
                case '6' -> leds += 6;
                case '7' -> leds += 3;
                case '8' -> leds += 7;
                case '9' -> leds += 6;
                case '0' -> leds += 6;
                default -> {}
                }
            }
            return leds;
        }
}
