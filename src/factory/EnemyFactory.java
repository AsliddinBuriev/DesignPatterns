package factory;

public class EnemyFactory {
    public Enemy makeEnemy(EnemyTypes newEnemy){
        if(newEnemy == EnemyTypes.UFO){
            return new UFOEnemy();
        }else if(newEnemy == EnemyTypes.Rocket){
            return new RocketEnemy();
        }else if(newEnemy == EnemyTypes.FighterJet){
            return new FighterJetEnemy();
        }
        return null;
    }
}
