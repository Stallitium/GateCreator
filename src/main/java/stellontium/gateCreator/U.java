package stellontium.gateCreator;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class U {
    //アイテム渡す
    public static void addItem(Player player,ItemStack item) {
        if (player.getInventory().firstEmpty() == -1) {
            player.getWorld().dropItem(player.getLocation(),item);
        } else {
            player.getInventory().addItem(item);
        }
    }

    //stringをlocationに
    public static Location strToLoc(String loc) {
        String[] str = loc.split("/");
        return new Location(Bukkit.getWorld(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3]));
    }

    //locationをstringに
    public static String locToStr(Location string) {
        return string.getWorld().getName()+"/"+string.getBlockX()+"/"+string.getBlockY()+"/"+string.getBlockZ();
    }
}
