package factory_method;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameApp {
    public static void main(String [] args){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy fighterJetEnemy = enemyFactory.makeEnemy(EnemyTypes.FighterJet);
        Enemy rocketEnemy = enemyFactory.makeEnemy(EnemyTypes.Rocket);
        scheduler.schedule(() -> {
            fighterJetEnemy.displayEnemyShip();
        }, 1, TimeUnit.SECONDS);

        scheduler.schedule(()->{
            fighterJetEnemy.startShooting();
        }, 2, TimeUnit.SECONDS);

        scheduler.schedule(()->{
            rocketEnemy.displayEnemyShip();
        }, 1, TimeUnit.SECONDS);
        scheduler.schedule(()->{
            rocketEnemy.startShooting();
        }, 1, TimeUnit.SECONDS);

    }
}
