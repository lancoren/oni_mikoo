package oni_miko.entity.skill;

public interface ISkill<T extends oni_miko.entity.OnimikoEntity> {
  boolean run(T paramT);
  
  void skillMain(T paramT);
  
  String id();
}


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\entity\skill\ISkill.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */