public class Field {
   
   private Minion[] ally;
   private Minion[] enemy;
   private int ally_minion;
   private int enemy_minion;
   
   public Field(int difficulty)
   {
      // ���̵��� ���� �ϼ��� ���� ����
   }
   
   public boolean attack(String name_of_ally, String name_of_enemy)
   {
      boolean ok_ally = false, ok_enemy = false;
      int i, j;
      
      for (i = 0 ; i < ally_minion ; i++)
      {
         if (ally[i].getName() == name_of_ally && ally[i].canAttack())
         {
            ok_ally = true;
            break;
         }
      }
      
      for (j = 0 ; j < enemy_minion ; j++)
      {
         if (enemy[j].getName() == name_of_enemy)
         {
            ok_enemy = true;
            break;
         }
      }
      
      if (ok_ally && ok_enemy)
      {
         ally[i].attack(enemy[j]);
      }
      else return false;
      
      return true;
   }

   public void minionDead(Minion dead_minion, boolean isAlly) 
   {
      // ���� �ϼ����� �迭���� �����ϰ� �ٸ� �ϼ��ο��� �ϼ����� ������ �˸� (�̺�Ʈ ��������)
   }
}