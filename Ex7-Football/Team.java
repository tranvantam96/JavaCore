import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList<Player> listplayer;
    ArrayList<Player> selectedTeam;

    public List<Player> getAllPlayer() {
        listplayer = new ArrayList<Player>();
        listplayer.add(new Player("Marc-André ter Stegen", Position.GK, 1));
        listplayer.add(new Player("Sergiño Dest", Position.DF, 2));
        listplayer.add(new Player("Gerard Piqué", Position.DF, 3));
        listplayer.add(new Player("Ronald Araújo", Position.DF, 4));
        listplayer.add(new Player("Sergio Busquets", Position.MF, 5));
        listplayer.add(new Player("Antoine Griezmann", Position.FW, 6));
        listplayer.add(new Player("Miralem Pjanić", Position.MF, 7));
        listplayer.add(new Player("Martin Braithwaite", Position.FW, 8));
        listplayer.add(new Player("Lionel Messi", Position.FW, 9));
        listplayer.add(new Player("Ousmane Dembélé", Position.FW, 10));
        listplayer.add(new Player("Riqui Puig", Position.MF, 11));
        listplayer.add(new Player("Neto", Position.GK, 12));
        listplayer.add(new Player("Clément Lenglet", Position.DF, 13));
        listplayer.add(new Player("Pedri", Position.MF, 14));
        listplayer.add(new Player("Francisco Trincão", Position.FW, 15));
        listplayer.add(new Player("Jordi Alba", Position.DF, 16));
        listplayer.add(new Player("Matheus Fernandes", Position.MF, 17));
        listplayer.add(new Player("Sergi Roberto", Position.DF, 18));
        listplayer.add(new Player("Frenkie de Jong", Position.MF, 19));
        listplayer.add(new Player("Ansu Fati", Position.FW, 20));
        listplayer.add(new Player("Samuel Umtiti", Position.DF, 21));
        listplayer.add(new Player("Junior Firpo", Position.DF, 22));
        for (Player player : listplayer) {
            System.out.println(player.toString());
        }
        return listplayer;
    }

    public List<Player> buildTeam(int i, int j, int k) {
        Random genneral = new Random();
        int thumon = 0;
        int hauve = 0;
        int trungve = 0;
        int tiendao = 0;
        while (thumon < 1) {
            int rdThumon = genneral.nextInt(22);
            if (listplayer.get(rdThumon).getPosition().equals(Position.GK)) {
                selectedTeam.add(listplayer.get(rdThumon));
                thumon++;
            }
        }
        while (hauve < i) {
            int rdHauve = genneral.nextInt(22);
            if (listplayer.get(rdHauve).getPosition().equals(Position.DF) && !selectedTeam.contains(listplayer.get(rdHauve))) {
                selectedTeam.add(listplayer.get(rdHauve));
                hauve++;
            }
        }
        while (trungve < j) {
            int rdTrungve = genneral.nextInt(22);
            if (listplayer.get(rdTrungve).getPosition().equals(Position.MF) && ! selectedTeam.add(listplayer.get(trungve))) {
                selectedTeam.add(listplayer.get(rdTrungve));
                trungve++;
            }
        }
        while (tiendao < k) {
            int rdTiendao = genneral.nextInt(22);
            if (listplayer.get(rdTiendao).getPosition().equals(Position.MF) && ! selectedTeam.add(listplayer.get(tiendao))) {
                selectedTeam.add(listplayer.get(rdTiendao));
                tiendao++;
            }
        }
        return selectedTeam;

    }
    public void showTeam(){
        for ( Player list : listplayer){
System.out.println(list.toString());
        }
    }
    public void showBuild(){
        for (Player build : selectedTeam){
            System.out.println(build.toString());
        }
    }

}
