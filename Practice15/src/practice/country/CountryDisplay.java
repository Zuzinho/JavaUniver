package practice.country;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CountryDisplay extends JFrame {
    Country[] countries = {new Country("Australia","Australia, officially the Commonwealth of Australia, is a\n" +
            "sovereign country comprising the mainland of the Australian continent, the island of Tasmania,\n" +
            "and numerous smaller islands. With an area of 7,617,930 square kilometres\n" +
            "Australia is the largest country by area in Oceania and the world's sixth-largest country."),
    new Country("China","China, officially the People's Republic of China (PRC),\n" +
            "is a country in East Asia. It is the world's most populous country with a population exceeding 1.4\n" +
            "billion people. China spans five geographical time zones and borders fourteen countries by land,\n" +
            "the most of any country in the world, tied with Russia. China also has a narrow maritime boundary with the\n" +
            "disputed Taiwan."),
    new Country("England","England is a country that is part of the United Kingdom. It shares land borders \n" +
            "with Wales to its west and Scotland to its north. The Irish Sea lies northwest and the Celtic Sea to the\n" +
            "southwest. It is separated from continental Europe by the North Sea to the east and the English Channel to\n" +
            "the south. The country covers five-eighths of the island of Great Britain, which lies in the North Atlantic, and\n" +
            "includes over 100 smaller islands, such as the Isles of Scilly and the Isle of Wight."),
    new Country("Russia","Russia or the Russian Federation,\n" +
            " is a transcontinental country spanning Eastern Europe and Northern Asia. It is the largest country in the world,\n" +
            " covering over 17,098,246 square kilometres, and encompassing one-eighth of Earth's inhabitable\n" +
            "landmass. Russia extends across eleven time zones sharing land boundaries with fourteen countries, more than \n" +
            "any other country but China. It is the ninth-most populous country in the world and the most populous country in\n" +
            " Europe, with a population of 146 million. ")};
    JComboBox<Country> comboBox = new JComboBox<>(countries);
    JTextArea textArea;
    CountryDisplay(){
        super("Countries");
        setDefaultCloseOperation(3);
        setSize(700,500);
        setLayout(new FlowLayout());
        comboBox.setBounds(50,50,90,20);
        add(comboBox);
        textArea = new JTextArea(comboBox.getItemAt(comboBox.getSelectedIndex()).getDescription(),8,10);
        add(textArea);
        comboBox.addItemListener(e -> {
            textArea.setText(comboBox.getItemAt(comboBox.getSelectedIndex()).getDescription());
        });
    }
}
