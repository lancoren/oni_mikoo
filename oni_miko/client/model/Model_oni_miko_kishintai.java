/*     */ package oni_miko.client.model;
/*     */ 
/*     */ import com.mojang.blaze3d.vertex.PoseStack;
/*     */ import com.mojang.blaze3d.vertex.VertexConsumer;
/*     */ import net.minecraft.client.model.EntityModel;
/*     */ import net.minecraft.client.model.geom.ModelLayerLocation;
/*     */ import net.minecraft.client.model.geom.ModelPart;
/*     */ import net.minecraft.client.model.geom.PartPose;
/*     */ import net.minecraft.client.model.geom.builders.CubeDeformation;
/*     */ import net.minecraft.client.model.geom.builders.CubeListBuilder;
/*     */ import net.minecraft.client.model.geom.builders.LayerDefinition;
/*     */ import net.minecraft.client.model.geom.builders.MeshDefinition;
/*     */ import net.minecraft.client.model.geom.builders.PartDefinition;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import oni_miko.entity.OnimikoEntity;
/*     */ 
/*     */ public class Model_oni_miko_kishintai<T extends OnimikoEntity>
/*     */   extends EntityModel<T>
/*     */ {
/*  22 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "oni_miko"), "main");
/*     */   private final ModelPart head;
/*     */   private final ModelPart bone;
/*     */   private final ModelPart bone2;
/*     */   private final ModelPart Mask;
/*     */   private final ModelPart bone3;
/*     */   private final ModelPart bone4;
/*     */   private final ModelPart body;
/*     */   private final ModelPart rightArm;
/*     */   private final ModelPart leftArm;
/*     */   private final ModelPart rightLeg;
/*     */   private final ModelPart leftLeg;
/*     */   
/*     */   public Model_oni_miko_kishintai(ModelPart root) {
/*  36 */     this.head = root.m_171324_("head");
/*  37 */     this.bone = this.head.m_171324_("bone");
/*  38 */     this.bone2 = this.head.m_171324_("bone2");
/*  39 */     this.Mask = this.head.m_171324_("Mask");
/*  40 */     this.bone3 = this.Mask.m_171324_("bone3");
/*  41 */     this.bone4 = this.Mask.m_171324_("bone4");
/*  42 */     this.body = root.m_171324_("body");
/*  43 */     this.rightArm = root.m_171324_("rightArm");
/*  44 */     this.leftArm = root.m_171324_("leftArm");
/*  45 */     this.rightLeg = root.m_171324_("rightLeg");
/*  46 */     this.leftLeg = root.m_171324_("leftLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createbodyLayer() {
/*  50 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  51 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*     */     
/*  53 */     PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(54, 16).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
/*  54 */         .m_171514_(32, 0).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
/*  55 */         .m_171514_(0, 5).m_171488_(-1.0F, -8.5952F, 4.0626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/*  56 */         .m_171514_(16, 0).m_171488_(-1.0F, -8.5952F, 4.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/*  58 */     PartDefinition cube_r1 = head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(12, 32).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -6.4451F, 4.6765F, 0.7418F, 0.0F, 0.0F));
/*     */     
/*  60 */     PartDefinition cube_r2 = head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.m_171423_(0.0F, 2.4038F, 8.0037F, 0.4887F, 0.0F, 0.0F));
/*     */     
/*  62 */     PartDefinition cube_r3 = head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(0.0F, -0.9722F, 7.0036F, 0.0873F, 0.0F, 0.0F));
/*     */     
/*  64 */     PartDefinition cube_r4 = head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(23, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -4.7879F, 6.4164F, 0.2182F, 0.0F, 0.0F));
/*     */     
/*  66 */     PartDefinition cube_r5 = head.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(12, 16).m_171488_(-1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -4.0891F, 2.864F, 0.6109F, 0.0F, 0.0F));
/*     */     
/*  68 */     PartDefinition bone = head.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(36, 16).m_171488_(-1.0F, -1.3452F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -6.6548F, 5.25F));
/*     */     
/*  70 */     PartDefinition cube_r6 = bone.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-6.6483F, 5.369F, -1.1183F, -3.0933F, 0.504F, 2.2901F));
/*     */     
/*  72 */     PartDefinition cube_r7 = bone.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 0.6511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-7.8285F, 5.3909F, -1.0182F, -2.9542F, 0.473F, 2.5847F));
/*     */     
/*  74 */     PartDefinition cube_r8 = bone.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-7.0086F, 4.5393F, -0.8598F, -2.9542F, 0.473F, 2.5847F));
/*     */     
/*  76 */     PartDefinition cube_r9 = bone.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 0.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.5448F, 4.4677F, 0.3332F, 3.1416F, 0.0F, 2.4696F));
/*     */     
/*  78 */     PartDefinition cube_r10 = bone.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-5.7517F, 4.598F, 0.3332F, 3.1416F, 0.0F, 2.1904F));
/*     */     
/*  80 */     PartDefinition cube_r11 = bone.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171488_(-3.3409F, 1.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.1781F, 2.5326F, 0.4F, 3.1416F, -0.1745F, 2.0508F));
/*     */     
/*  82 */     PartDefinition cube_r12 = bone.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.4878F, 1.298F, -1.0F, -3.1267F, -0.0581F, 2.3584F));
/*     */     
/*  84 */     PartDefinition cube_r13 = bone.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.6879F, 0.498F, -1.0F, -3.1319F, -0.0591F, 2.4458F));
/*     */     
/*  86 */     PartDefinition cube_r14 = bone.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0879F, 0.398F, -1.0F, 3.1264F, -0.058F, 2.8654F));
/*     */     
/*  88 */     PartDefinition cube_r15 = bone.m_171599_("cube_r15", CubeListBuilder.m_171558_().m_171514_(19, 21).m_171488_(0.8848F, -1.4108F, 0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.9F, -0.2F, 0.0F, -3.1416F, 0.0F, -2.9322F));
/*     */     
/*  90 */     PartDefinition cube_r16 = bone.m_171599_("cube_r16", CubeListBuilder.m_171558_().m_171514_(21, 17).m_171488_(0.9767F, -1.0514F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-0.9F, 0.0F, 0.0F, -3.1416F, 0.0F, -2.2253F));
/*     */     
/*  92 */     PartDefinition cube_r17 = bone.m_171599_("cube_r17", CubeListBuilder.m_171558_().m_171514_(20, 9).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.9032F, -0.2953F, -1.0F, 3.1416F, 0.0F, 2.8536F));
/*     */     
/*  94 */     PartDefinition cube_r18 = bone.m_171599_("cube_r18", CubeListBuilder.m_171558_().m_171514_(19, 9).m_171488_(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-5.8315F, -0.6089F, -1.0F, 3.1416F, 0.0F, 3.1329F));
/*     */     
/*  96 */     PartDefinition cube_r19 = bone.m_171599_("cube_r19", CubeListBuilder.m_171558_().m_171514_(24, 13).m_171488_(-1.3F, 0.3F, 0.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.9283F, 0.4626F, 2.4677F));
/*     */     
/*  98 */     PartDefinition cube_r20 = bone.m_171599_("cube_r20", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.8F, -0.5F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.8127F, 0.392F, 2.7449F));
/*     */     
/* 100 */     PartDefinition cube_r21 = bone.m_171599_("cube_r21", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.8F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.7022F, 0.2598F, 3.0865F));
/*     */     
/* 102 */     PartDefinition cube_r22 = bone.m_171599_("cube_r22", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.5F, -1.3F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.768F, 0.3499F, 2.868F));
/*     */     
/* 104 */     PartDefinition cube_r23 = bone.m_171599_("cube_r23", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-5.2856F, 1.866F, -1.0F, -3.1416F, 0.0F, 2.0159F));
/*     */     
/* 106 */     PartDefinition cube_r24 = bone.m_171599_("cube_r24", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-4.5856F, 1.466F, -1.0F, -3.1416F, 0.0F, 1.8413F));
/*     */     
/* 108 */     PartDefinition cube_r25 = bone.m_171599_("cube_r25", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-5.2856F, 1.066F, -1.0F, -3.1416F, 0.0F, 2.3649F));
/*     */     
/* 110 */     PartDefinition cube_r26 = bone.m_171599_("cube_r26", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-5.8856F, 0.666F, -1.0F, -3.1416F, 0.0F, 2.6616F));
/*     */     
/* 112 */     PartDefinition cube_r27 = bone.m_171599_("cube_r27", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-6.5856F, 0.166F, -1.0F, -3.1416F, 0.0F, 3.0805F));
/*     */     
/* 114 */     PartDefinition cube_r28 = bone.m_171599_("cube_r28", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-7.2856F, -0.734F, -1.0F, -3.1416F, 0.0F, -2.9583F));
/*     */     
/* 116 */     PartDefinition cube_r29 = bone.m_171599_("cube_r29", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, 2.9234F));
/*     */     
/* 118 */     PartDefinition cube_r30 = bone.m_171599_("cube_r30", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, -3.1154F));
/*     */     
/* 120 */     PartDefinition cube_r31 = bone.m_171599_("cube_r31", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-4.1406F, -1.9901F, 0.5F, -3.1416F, 0.0F, -2.6529F));
/*     */     
/* 122 */     PartDefinition cube_r32 = bone.m_171599_("cube_r32", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(3.8848F, -1.2795F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.m_171423_(-0.3406F, -3.7901F, 0.0F, -3.1416F, 0.0F, 2.9845F));
/*     */     
/* 124 */     PartDefinition cube_r33 = bone.m_171599_("cube_r33", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(3.8848F, -1.2795F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.m_171423_(0.7699F, -1.3204F, 0.0F, -3.1416F, 0.0F, -2.81F));
/*     */     
/* 126 */     PartDefinition cube_r34 = bone.m_171599_("cube_r34", CubeListBuilder.m_171558_().m_171514_(22, 12).m_171488_(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.1793F, -0.7032F, -0.4302F, 3.0666F, 0.2775F, -3.0783F));
/*     */     
/* 128 */     PartDefinition bone2 = head.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(36, 16).m_171480_().m_171488_(-1.0F, -1.3452F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171419_(0.0F, -6.6548F, 5.25F));
/*     */     
/* 130 */     PartDefinition cube_r35 = bone2.m_171599_("cube_r35", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(-1.6591F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(6.6483F, 5.369F, -1.1183F, -3.0933F, -0.504F, -2.2901F));
/*     */     
/* 132 */     PartDefinition cube_r36 = bone2.m_171599_("cube_r36", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(0.3409F, 0.6511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(7.8285F, 5.3909F, -1.0182F, -2.9542F, -0.473F, -2.5847F));
/*     */     
/* 134 */     PartDefinition cube_r37 = bone2.m_171599_("cube_r37", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(-1.6591F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(7.0086F, 4.5393F, -0.8598F, -2.9542F, -0.473F, -2.5847F));
/*     */     
/* 136 */     PartDefinition cube_r38 = bone2.m_171599_("cube_r38", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(0.3409F, 0.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.5448F, 4.4677F, 0.3332F, 3.1416F, 0.0F, -2.4696F));
/*     */     
/* 138 */     PartDefinition cube_r39 = bone2.m_171599_("cube_r39", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(1.3409F, 1.3511F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.7517F, 4.598F, 0.3332F, 3.1416F, 0.0F, -2.1904F));
/*     */     
/* 140 */     PartDefinition cube_r40 = bone2.m_171599_("cube_r40", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171480_().m_171488_(0.3409F, 1.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.1781F, 2.5326F, 0.4F, 3.1416F, 0.1745F, -2.0508F));
/*     */     
/* 142 */     PartDefinition cube_r41 = bone2.m_171599_("cube_r41", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.4878F, 1.298F, -1.0F, -3.1267F, 0.0581F, -2.3584F));
/*     */     
/* 144 */     PartDefinition cube_r42 = bone2.m_171599_("cube_r42", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(3.6879F, 0.498F, -1.0F, -3.1319F, 0.0591F, -2.4458F));
/*     */     
/* 146 */     PartDefinition cube_r43 = bone2.m_171599_("cube_r43", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.0879F, 0.398F, -1.0F, 3.1264F, 0.058F, -2.8654F));
/*     */     
/* 148 */     PartDefinition cube_r44 = bone2.m_171599_("cube_r44", CubeListBuilder.m_171558_().m_171514_(19, 21).m_171480_().m_171488_(-6.8848F, -1.4108F, 0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.9F, -0.2F, 0.0F, -3.1416F, 0.0F, 2.9322F));
/*     */     
/* 150 */     PartDefinition cube_r45 = bone2.m_171599_("cube_r45", CubeListBuilder.m_171558_().m_171514_(21, 17).m_171480_().m_171488_(-3.9767F, -1.0514F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(0.9F, 0.0F, 0.0F, -3.1416F, 0.0F, 2.2253F));
/*     */     
/* 152 */     PartDefinition cube_r46 = bone2.m_171599_("cube_r46", CubeListBuilder.m_171558_().m_171514_(20, 9).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.9032F, -0.2953F, -1.0F, 3.1416F, 0.0F, -2.8536F));
/*     */     
/* 154 */     PartDefinition cube_r47 = bone2.m_171599_("cube_r47", CubeListBuilder.m_171558_().m_171514_(19, 9).m_171480_().m_171488_(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(5.8315F, -0.6089F, -1.0F, 3.1416F, 0.0F, -3.1329F));
/*     */     
/* 156 */     PartDefinition cube_r48 = bone2.m_171599_("cube_r48", CubeListBuilder.m_171558_().m_171514_(24, 13).m_171480_().m_171488_(-0.7F, 0.3F, 0.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.9283F, -0.4626F, -2.4677F));
/*     */     
/* 158 */     PartDefinition cube_r49 = bone2.m_171599_("cube_r49", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.2F, -0.5F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.8127F, -0.392F, -2.7449F));
/*     */     
/* 160 */     PartDefinition cube_r50 = bone2.m_171599_("cube_r50", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.2F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.7022F, -0.2598F, -3.0865F));
/*     */     
/* 162 */     PartDefinition cube_r51 = bone2.m_171599_("cube_r51", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.5F, -1.3F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.768F, -0.3499F, -2.868F));
/*     */     
/* 164 */     PartDefinition cube_r52 = bone2.m_171599_("cube_r52", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(5.2856F, 1.866F, -1.0F, -3.1416F, 0.0F, -2.0159F));
/*     */     
/* 166 */     PartDefinition cube_r53 = bone2.m_171599_("cube_r53", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(4.5856F, 1.466F, -1.0F, -3.1416F, 0.0F, -1.8413F));
/*     */     
/* 168 */     PartDefinition cube_r54 = bone2.m_171599_("cube_r54", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(5.2856F, 1.066F, -1.0F, -3.1416F, 0.0F, -2.3649F));
/*     */     
/* 170 */     PartDefinition cube_r55 = bone2.m_171599_("cube_r55", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(5.8856F, 0.666F, -1.0F, -3.1416F, 0.0F, -2.6616F));
/*     */     
/* 172 */     PartDefinition cube_r56 = bone2.m_171599_("cube_r56", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(6.5856F, 0.166F, -1.0F, -3.1416F, 0.0F, -3.0805F));
/*     */     
/* 174 */     PartDefinition cube_r57 = bone2.m_171599_("cube_r57", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(7.2856F, -0.734F, -1.0F, -3.1416F, 0.0F, 2.9583F));
/*     */     
/* 176 */     PartDefinition cube_r58 = bone2.m_171599_("cube_r58", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, -2.9234F));
/*     */     
/* 178 */     PartDefinition cube_r59 = bone2.m_171599_("cube_r59", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, 3.1154F));
/*     */     
/* 180 */     PartDefinition cube_r60 = bone2.m_171599_("cube_r60", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(4.1406F, -1.9901F, 0.5F, -3.1416F, 0.0F, 2.6529F));
/*     */     
/* 182 */     PartDefinition cube_r61 = bone2.m_171599_("cube_r61", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171480_().m_171488_(-6.8848F, -1.2795F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), PartPose.m_171423_(0.3406F, -3.7901F, 0.0F, -3.1416F, 0.0F, -2.9845F));
/*     */     
/* 184 */     PartDefinition cube_r62 = bone2.m_171599_("cube_r62", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171480_().m_171488_(-5.8848F, -1.2795F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).m_171555_(false), PartPose.m_171423_(-0.7699F, -1.3204F, 0.0F, -3.1416F, 0.0F, 2.81F));
/*     */     
/* 186 */     PartDefinition cube_r63 = bone2.m_171599_("cube_r63", CubeListBuilder.m_171558_().m_171514_(22, 12).m_171480_().m_171488_(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(2.1793F, -0.7032F, -0.4302F, 3.0666F, -0.2775F, 3.0783F));
/*     */     
/* 188 */     PartDefinition Mask = head.m_171599_("Mask", CubeListBuilder.m_171558_().m_171514_(37, 28).m_171488_(-0.425F, 5.2332F, 3.2735F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
/* 189 */         .m_171514_(37, 28).m_171488_(-0.425F, -0.9668F, 3.2735F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 190 */         .m_171514_(37, 28).m_171488_(-0.425F, 1.0332F, 3.2735F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 191 */         .m_171514_(37, 28).m_171488_(-0.425F, 3.0332F, 3.2735F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
/* 192 */         .m_171514_(37, 28).m_171488_(-0.425F, 3.4332F, 3.2735F, 7.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
/* 193 */         .m_171514_(47, 40).m_171488_(0.2839F, 2.7171F, 2.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 194 */         .m_171514_(36, 36).m_171488_(0.7839F, 2.7171F, 2.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 195 */         .m_171514_(0, 48).m_171488_(0.5726F, 3.0058F, 2.1735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
/* 196 */         .m_171514_(47, 40).m_171480_().m_171488_(4.8661F, 2.7171F, 2.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false)
/* 197 */         .m_171514_(36, 36).m_171480_().m_171488_(4.3661F, 2.7171F, 2.2235F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false)
/* 198 */         .m_171514_(0, 48).m_171480_().m_171488_(4.5774F, 3.0058F, 2.1735F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).m_171555_(false), PartPose.m_171419_(-3.075F, -6.8332F, -7.9985F));
/*     */     
/* 200 */     PartDefinition cube_r64 = Mask.m_171599_("cube_r64", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.239F, 3.9609F, 4.7645F, -0.0821F, -0.2594F, -0.7294F));
/*     */     
/* 202 */     PartDefinition cube_r65 = Mask.m_171599_("cube_r65", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false)
/* 203 */         .m_171514_(43, 17).m_171480_().m_171488_(-0.5F, -1.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false)
/* 204 */         .m_171514_(43, 17).m_171480_().m_171488_(0.5F, -1.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false)
/* 205 */         .m_171514_(43, 17).m_171480_().m_171488_(-0.5F, -1.0F, -0.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.7209F, 2.4498F, 3.7912F, -0.1109F, -0.3684F, 0.4919F));
/*     */     
/* 207 */     PartDefinition cube_r66 = Mask.m_171599_("cube_r66", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171488_(0.0F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-0.6985F, 0.6779F, 3.3417F, 0.2277F, 0.3119F, 0.4548F));
/*     */     
/* 209 */     PartDefinition cube_r67 = Mask.m_171599_("cube_r67", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-1.0F, -0.6F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(6.8485F, 0.6779F, 3.3417F, 0.2277F, -0.3119F, -0.4548F));
/*     */     
/* 211 */     PartDefinition cube_r68 = Mask.m_171599_("cube_r68", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.5209F, 3.0498F, 3.7912F, 0.0F, -0.384F, 0.192F));
/*     */     
/* 213 */     PartDefinition cube_r69 = Mask.m_171599_("cube_r69", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false)
/* 214 */         .m_171514_(43, 17).m_171480_().m_171488_(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.3209F, 4.5498F, 3.8912F, 0.1566F, -0.3521F, -0.2373F));
/*     */     
/* 216 */     PartDefinition cube_r70 = Mask.m_171599_("cube_r70", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(6.9209F, 2.7498F, 3.1912F, 0.0F, -0.1047F, 0.192F));
/*     */     
/* 218 */     PartDefinition cube_r71 = Mask.m_171599_("cube_r71", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171480_().m_171488_(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(6.4167F, 2.5376F, 4.0903F, 0.001F, 0.2263F, 1.0858F));
/*     */     
/* 220 */     PartDefinition cube_r72 = Mask.m_171599_("cube_r72", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171480_().m_171488_(-0.7F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(6.7255F, 1.1406F, 3.2912F, -0.3615F, -0.4801F, -0.1069F));
/*     */     
/* 222 */     PartDefinition cube_r73 = Mask.m_171599_("cube_r73", CubeListBuilder.m_171558_().m_171514_(24, 36).m_171480_().m_171488_(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.8322F, 1.5669F, 2.6752F, 0.0F, -0.0524F, -0.1396F));
/*     */     
/* 224 */     PartDefinition cube_r74 = Mask.m_171599_("cube_r74", CubeListBuilder.m_171558_().m_171514_(0, 36).m_171480_().m_171488_(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.754F, 1.9503F, 2.7343F, -0.2443F, 0.0F, 1.1257F));
/*     */     
/* 226 */     PartDefinition cube_r75 = Mask.m_171599_("cube_r75", CubeListBuilder.m_171558_().m_171514_(24, 36).m_171488_(-0.8F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(1.1786F, 2.5571F, 2.6752F, 0.0018F, 0.0523F, 0.1746F));
/*     */     
/* 228 */     PartDefinition cube_r76 = Mask.m_171599_("cube_r76", CubeListBuilder.m_171558_().m_171514_(24, 36).m_171480_().m_171488_(-1.2F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(4.9714F, 2.5571F, 2.6752F, 0.0018F, -0.0523F, -0.1746F));
/*     */     
/* 230 */     PartDefinition cube_r77 = Mask.m_171599_("cube_r77", CubeListBuilder.m_171558_().m_171514_(13, 35).m_171488_(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.5262F, 0.7241F, 2.8589F, -0.2524F, 0.2478F, 1.013F));
/*     */     
/* 232 */     PartDefinition cube_r78 = Mask.m_171599_("cube_r78", CubeListBuilder.m_171558_().m_171514_(13, 35).m_171480_().m_171488_(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.6238F, 0.7241F, 2.8589F, -0.2524F, -0.2478F, -1.013F));
/*     */     
/* 234 */     PartDefinition cube_r79 = Mask.m_171599_("cube_r79", CubeListBuilder.m_171558_().m_171514_(13, 35).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.3023F, 1.1613F, 2.7097F, -0.192F, 0.0F, -1.2654F));
/*     */     
/* 236 */     PartDefinition cube_r80 = Mask.m_171599_("cube_r80", CubeListBuilder.m_171558_().m_171514_(24, 31).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.55F, 2.9332F, 2.7235F, 0.0F, -0.0524F, -0.1571F));
/*     */     
/* 238 */     PartDefinition cube_r81 = Mask.m_171599_("cube_r81", CubeListBuilder.m_171558_().m_171514_(34, 31).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).m_171555_(false), PartPose.m_171423_(5.8607F, 3.457F, 2.4235F, 0.1047F, 0.0F, -1.1781F));
/*     */     
/* 240 */     PartDefinition cube_r82 = Mask.m_171599_("cube_r82", CubeListBuilder.m_171558_().m_171514_(30, 31).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).m_171555_(false), PartPose.m_171423_(5.6951F, 3.6475F, 2.4235F, 0.1047F, 0.0F, -0.5323F));
/*     */     
/* 242 */     PartDefinition cube_r83 = Mask.m_171599_("cube_r83", CubeListBuilder.m_171558_().m_171514_(30, 31).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).m_171555_(false), PartPose.m_171423_(5.3941F, 3.7571F, 2.4235F, 0.0F, 0.0F, -0.1658F));
/*     */     
/* 244 */     PartDefinition cube_r84 = Mask.m_171599_("cube_r84", CubeListBuilder.m_171558_().m_171514_(47, 38).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).m_171555_(false), PartPose.m_171423_(4.3952F, 3.3999F, 2.7181F, 0.0F, 0.1047F, 0.3316F));
/*     */     
/* 246 */     PartDefinition cube_r85 = Mask.m_171599_("cube_r85", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171480_().m_171488_(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(3.375F, 4.5161F, 3.4441F, -0.2601F, -0.3677F, -0.3008F));
/*     */     
/* 248 */     PartDefinition cube_r86 = Mask.m_171599_("cube_r86", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171480_().m_171488_(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.575F, 4.2332F, 3.8735F, -0.2261F, -0.0107F, -0.5363F));
/*     */     
/* 250 */     PartDefinition cube_r87 = Mask.m_171599_("cube_r87", CubeListBuilder.m_171558_().m_171514_(30, 31).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.m_171423_(0.7559F, 3.7571F, 2.4235F, 0.0F, 0.0F, 0.1658F));
/*     */     
/* 252 */     PartDefinition cube_r88 = Mask.m_171599_("cube_r88", CubeListBuilder.m_171558_().m_171514_(30, 31).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.m_171423_(0.4548F, 3.6475F, 2.4235F, 0.1047F, 0.0F, 0.5323F));
/*     */     
/* 254 */     PartDefinition cube_r89 = Mask.m_171599_("cube_r89", CubeListBuilder.m_171558_().m_171514_(34, 31).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.m_171423_(0.2892F, 3.457F, 2.4235F, 0.1047F, 0.0F, 1.1781F));
/*     */     
/* 256 */     PartDefinition cube_r90 = Mask.m_171599_("cube_r90", CubeListBuilder.m_171558_().m_171514_(24, 31).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.6F, 2.9332F, 2.7235F, 0.0F, 0.0524F, 0.1571F));
/*     */     
/* 258 */     PartDefinition cube_r91 = Mask.m_171599_("cube_r91", CubeListBuilder.m_171558_().m_171514_(47, 38).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.m_171423_(1.7548F, 3.3999F, 2.7181F, 0.0F, -0.1047F, -0.3316F));
/*     */     
/* 260 */     PartDefinition cube_r92 = Mask.m_171599_("cube_r92", CubeListBuilder.m_171558_().m_171514_(0, 36).m_171488_(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.396F, 1.9503F, 2.7343F, -0.2443F, 0.0F, -1.1257F));
/*     */     
/* 262 */     PartDefinition cube_r93 = Mask.m_171599_("cube_r93", CubeListBuilder.m_171558_().m_171514_(13, 35).m_171488_(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.8477F, 1.1613F, 2.7097F, -0.192F, 0.0F, 1.2654F));
/*     */     
/* 264 */     PartDefinition cube_r94 = Mask.m_171599_("cube_r94", CubeListBuilder.m_171558_().m_171514_(24, 36).m_171488_(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.3178F, 1.5669F, 2.6752F, 0.0F, 0.0524F, 0.1396F));
/*     */     
/* 266 */     PartDefinition cube_r95 = Mask.m_171599_("cube_r95", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171480_().m_171488_(0.5F, -0.5F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false)
/* 267 */         .m_171514_(43, 17).m_171480_().m_171488_(0.5F, -0.7F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.1557F, 4.424F, 3.816F, -0.0562F, -0.38F, 0.3424F));
/*     */     
/* 269 */     PartDefinition cube_r96 = Mask.m_171599_("cube_r96", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171480_().m_171488_(0.5F, -0.3F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.3389F, 4.6471F, 3.9058F, 0.1566F, -0.3521F, -0.2373F));
/*     */     
/* 271 */     PartDefinition cube_r97 = Mask.m_171599_("cube_r97", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171480_().m_171488_(0.5F, 0.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(7.6233F, 2.7429F, 3.7751F, 0.0F, -0.384F, 0.192F));
/*     */     
/* 273 */     PartDefinition cube_r98 = Mask.m_171599_("cube_r98", CubeListBuilder.m_171558_().m_171514_(37, 28).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).m_171555_(false), PartPose.m_171423_(8.0814F, 2.0759F, 3.4028F, -0.2864F, -0.131F, 1.1534F));
/*     */     
/* 275 */     PartDefinition cube_r99 = Mask.m_171599_("cube_r99", CubeListBuilder.m_171558_().m_171514_(37, 28).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.m_171423_(-1.9314F, 2.0759F, 3.4028F, -0.2864F, 0.131F, -1.1534F));
/*     */     
/* 277 */     PartDefinition cube_r100 = Mask.m_171599_("cube_r100", CubeListBuilder.m_171558_().m_171514_(42, 26).m_171480_().m_171488_(-0.6F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(0.675F, 6.5832F, 3.1235F, -2.618F, 1.1868F, -2.6005F));
/*     */     
/* 279 */     PartDefinition cube_r101 = Mask.m_171599_("cube_r101", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171480_().m_171488_(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(1.1603F, 6.5924F, 3.1235F, 0.0F, 0.0F, -0.4189F));
/*     */     
/* 281 */     PartDefinition cube_r102 = Mask.m_171599_("cube_r102", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171480_().m_171488_(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(1.5603F, 6.7924F, 3.1235F, 0.0F, 0.0F, -0.4189F));
/*     */     
/* 283 */     PartDefinition cube_r103 = Mask.m_171599_("cube_r103", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171480_().m_171488_(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(1.9603F, 6.9924F, 3.1235F, 0.0F, 0.0F, -0.4189F));
/*     */     
/* 285 */     PartDefinition cube_r104 = Mask.m_171599_("cube_r104", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171480_().m_171488_(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(2.9603F, 6.7924F, 3.1235F, 0.0F, 0.0F, -1.2043F));
/*     */     
/* 287 */     PartDefinition cube_r105 = Mask.m_171599_("cube_r105", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171480_().m_171488_(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(2.4603F, 6.9924F, 3.1235F, 0.0F, 0.0F, -0.7679F));
/*     */     
/* 289 */     PartDefinition cube_r106 = Mask.m_171599_("cube_r106", CubeListBuilder.m_171558_().m_171514_(42, 33).m_171480_().m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(2.4601F, 7.1981F, 2.9618F, 0.1366F, 0.0289F, -0.2075F));
/*     */     
/* 291 */     PartDefinition cube_r107 = Mask.m_171599_("cube_r107", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171480_().m_171488_(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(1.7708F, 7.0382F, 3.6733F, 0.1343F, 0.2443F, 0.4025F));
/*     */     
/* 293 */     PartDefinition cube_r108 = Mask.m_171599_("cube_r108", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171480_().m_171488_(-2.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(2.1992F, 7.6075F, 2.848F, 0.267F, 0.6559F, 0.6924F));
/*     */     
/* 295 */     PartDefinition cube_r109 = Mask.m_171599_("cube_r109", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171480_().m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.4477F, 6.0207F, 3.8568F, 0.5488F, 0.2857F, 1.1966F));
/*     */     
/* 297 */     PartDefinition cube_r110 = Mask.m_171599_("cube_r110", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171480_().m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.1835F, 5.1065F, 4.0084F, 0.5911F, 0.0564F, 1.3627F));
/*     */     
/* 299 */     PartDefinition cube_r111 = Mask.m_171599_("cube_r111", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.9665F, 5.1065F, 4.0084F, 0.5911F, -0.0564F, -1.3627F));
/*     */     
/* 301 */     PartDefinition cube_r112 = Mask.m_171599_("cube_r112", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.7023F, 6.0207F, 3.8568F, 0.5488F, -0.2857F, -1.1966F));
/*     */     
/* 303 */     PartDefinition cube_r113 = Mask.m_171599_("cube_r113", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171488_(1.2F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.9508F, 7.6075F, 2.848F, 0.267F, -0.6559F, -0.6924F));
/*     */     
/* 305 */     PartDefinition cube_r114 = Mask.m_171599_("cube_r114", CubeListBuilder.m_171558_().m_171514_(41, 33).m_171488_(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.3792F, 7.0382F, 3.6733F, 0.1343F, -0.2443F, -0.4025F));
/*     */     
/* 307 */     PartDefinition cube_r115 = Mask.m_171599_("cube_r115", CubeListBuilder.m_171558_().m_171514_(42, 33).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0048F, 7.1059F, 2.8488F, 0.1396F, 0.0F, 0.0F));
/*     */     
/* 309 */     PartDefinition cube_r116 = Mask.m_171599_("cube_r116", CubeListBuilder.m_171558_().m_171514_(42, 33).m_171488_(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.6899F, 7.1981F, 2.9618F, 0.1366F, -0.0289F, 0.2075F));
/*     */     
/* 311 */     PartDefinition cube_r117 = Mask.m_171599_("cube_r117", CubeListBuilder.m_171558_().m_171514_(42, 26).m_171488_(-0.4F, -0.7F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(5.475F, 6.5832F, 3.1235F, -2.618F, -1.1868F, 2.6005F));
/*     */     
/* 313 */     PartDefinition cube_r118 = Mask.m_171599_("cube_r118", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(2.9896F, 6.8924F, 3.1235F, 0.0F, 0.0F, 0.7156F));
/*     */     
/* 315 */     PartDefinition cube_r119 = Mask.m_171599_("cube_r119", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(3.1897F, 6.7924F, 3.1235F, 0.0F, 0.0F, 1.2043F));
/*     */     
/* 317 */     PartDefinition cube_r120 = Mask.m_171599_("cube_r120", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(3.6897F, 6.9924F, 3.1235F, 0.0F, 0.0F, 0.7679F));
/*     */     
/* 319 */     PartDefinition cube_r121 = Mask.m_171599_("cube_r121", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(4.1897F, 6.9924F, 3.1235F, 0.0F, 0.0F, 0.4189F));
/*     */     
/* 321 */     PartDefinition cube_r122 = Mask.m_171599_("cube_r122", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(4.5896F, 6.7924F, 3.1235F, 0.0F, 0.0F, 0.4189F));
/*     */     
/* 323 */     PartDefinition cube_r123 = Mask.m_171599_("cube_r123", CubeListBuilder.m_171558_().m_171514_(43, 38).m_171488_(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(4.9896F, 6.5924F, 3.1235F, 0.0F, 0.0F, 0.4189F));
/*     */     
/* 325 */     PartDefinition cube_r124 = Mask.m_171599_("cube_r124", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(3.175F, 5.3832F, 3.0235F, -0.2039F, 0.559F, 0.8434F));
/*     */     
/* 327 */     PartDefinition cube_r125 = Mask.m_171599_("cube_r125", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(2.775F, 5.4832F, 3.0235F, -0.2039F, 0.559F, 0.8434F));
/*     */     
/* 329 */     PartDefinition cube_r126 = Mask.m_171599_("cube_r126", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(2.275F, 5.5832F, 2.7235F, -0.0997F, 0.1F, 0.7487F));
/*     */     
/* 331 */     PartDefinition cube_r127 = Mask.m_171599_("cube_r127", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(1.775F, 5.4832F, 3.0235F, -0.2039F, 0.559F, 0.8434F));
/*     */     
/* 333 */     PartDefinition cube_r128 = Mask.m_171599_("cube_r128", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171480_().m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).m_171555_(false), PartPose.m_171423_(1.475F, 5.3832F, 3.0235F, -0.2039F, 0.559F, 0.8434F));
/*     */     
/* 335 */     PartDefinition cube_r129 = Mask.m_171599_("cube_r129", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171480_().m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(0.911F, 3.9609F, 4.7645F, -0.0821F, 0.2594F, 0.7294F));
/*     */     
/* 337 */     PartDefinition cube_r130 = Mask.m_171599_("cube_r130", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171480_().m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(1.9572F, 4.7653F, 4.1101F, -0.0979F, 0.6245F, 0.6931F));
/*     */     
/* 339 */     PartDefinition cube_r131 = Mask.m_171599_("cube_r131", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171480_().m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(2.0249F, 4.719F, 4.033F, -0.2628F, 0.359F, 0.2661F));
/*     */     
/* 341 */     PartDefinition cube_r132 = Mask.m_171599_("cube_r132", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(4.675F, 5.3832F, 3.0235F, -0.2039F, -0.559F, -0.8434F));
/*     */     
/* 343 */     PartDefinition cube_r133 = Mask.m_171599_("cube_r133", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(2.975F, 5.3832F, 3.0235F, -0.2039F, -0.559F, -0.8434F));
/*     */     
/* 345 */     PartDefinition cube_r134 = Mask.m_171599_("cube_r134", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(3.375F, 5.4832F, 3.0235F, -0.2039F, -0.559F, -0.8434F));
/*     */     
/* 347 */     PartDefinition cube_r135 = Mask.m_171599_("cube_r135", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(4.375F, 5.4832F, 3.0235F, -0.2039F, -0.559F, -0.8434F));
/*     */     
/* 349 */     PartDefinition cube_r136 = Mask.m_171599_("cube_r136", CubeListBuilder.m_171558_().m_171514_(31, 45).m_171488_(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.m_171423_(3.875F, 5.5832F, 2.7235F, -0.0997F, -0.1F, -0.7487F));
/*     */     
/* 351 */     PartDefinition cube_r137 = Mask.m_171599_("cube_r137", CubeListBuilder.m_171558_().m_171514_(31, 41).m_171480_().m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false)
/* 352 */         .m_171514_(31, 41).m_171488_(5.7244F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.0372F, 5.5332F, 4.49F, -0.5236F, 0.0F, 0.0F));
/*     */     
/* 354 */     PartDefinition cube_r138 = Mask.m_171599_("cube_r138", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171488_(0.5F, -1.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F))
/* 355 */         .m_171514_(43, 17).m_171488_(-0.5F, -1.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F))
/* 356 */         .m_171514_(43, 17).m_171488_(-0.5F, -1.0F, -0.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
/* 357 */         .m_171514_(42, 16).m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.5709F, 2.4498F, 3.7912F, -0.1109F, 0.3684F, -0.4919F));
/*     */     
/* 359 */     PartDefinition cube_r139 = Mask.m_171599_("cube_r139", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171488_(-0.5F, -0.7F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
/* 360 */         .m_171514_(43, 17).m_171488_(-0.5F, -0.5F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.0057F, 4.424F, 3.816F, -0.0562F, 0.38F, -0.3424F));
/*     */     
/* 362 */     PartDefinition cube_r140 = Mask.m_171599_("cube_r140", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171488_(-0.5F, -0.3F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.1889F, 4.6471F, 3.9058F, 0.1566F, 0.3521F, 0.2373F));
/*     */     
/* 364 */     PartDefinition cube_r141 = Mask.m_171599_("cube_r141", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171488_(-0.5F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
/* 365 */         .m_171514_(43, 17).m_171488_(-0.5F, 0.0F, -0.7F, 1.0F, 0.0F, 0.0F, new CubeDeformation(0.1F))
/* 366 */         .m_171514_(42, 16).m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.1709F, 4.5498F, 3.8912F, 0.1566F, 0.3521F, 0.2373F));
/*     */     
/* 368 */     PartDefinition cube_r142 = Mask.m_171599_("cube_r142", CubeListBuilder.m_171558_().m_171514_(43, 17).m_171488_(-0.5F, 0.0F, -0.7F, 0.0F, 1.0F, 0.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.4733F, 2.7429F, 3.7751F, 0.0F, 0.384F, -0.192F));
/*     */     
/* 370 */     PartDefinition cube_r143 = Mask.m_171599_("cube_r143", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-1.3709F, 3.0498F, 3.7912F, 0.0F, 0.384F, -0.192F));
/*     */     
/* 372 */     PartDefinition cube_r144 = Mask.m_171599_("cube_r144", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171488_(-0.3F, 0.0F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(-0.5755F, 1.1406F, 3.2912F, -0.3615F, 0.4801F, 0.1069F));
/*     */     
/* 374 */     PartDefinition cube_r145 = Mask.m_171599_("cube_r145", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171488_(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.7709F, 2.7498F, 3.1912F, 0.0F, 0.1047F, -0.192F));
/*     */     
/* 376 */     PartDefinition cube_r146 = Mask.m_171599_("cube_r146", CubeListBuilder.m_171558_().m_171514_(42, 16).m_171488_(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.6683F, 2.7298F, 4.1857F, 0.0F, 0.1047F, -0.192F));
/*     */     
/* 378 */     PartDefinition cube_r147 = Mask.m_171599_("cube_r147", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.1928F, 4.7653F, 4.1101F, -0.0979F, -0.6245F, -0.6931F));
/*     */     
/* 380 */     PartDefinition cube_r148 = Mask.m_171599_("cube_r148", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.1251F, 4.719F, 4.033F, -0.2628F, -0.359F, -0.2661F));
/*     */     
/* 382 */     PartDefinition cube_r149 = Mask.m_171599_("cube_r149", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171488_(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.2667F, 2.5376F, 4.0903F, 0.001F, -0.2263F, -1.0858F));
/*     */     
/* 384 */     PartDefinition cube_r150 = Mask.m_171599_("cube_r150", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171488_(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.575F, 4.2332F, 3.8735F, -0.2261F, 0.0107F, 0.5363F));
/*     */     
/* 386 */     PartDefinition cube_r151 = Mask.m_171599_("cube_r151", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.775F, 4.5161F, 3.4441F, -0.2601F, 0.3677F, 0.3008F));
/*     */     
/* 388 */     PartDefinition cube_r152 = Mask.m_171599_("cube_r152", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.075F, 3.225F, 4.175F, -0.7679F, 0.0F, 0.0F));
/*     */     
/* 390 */     PartDefinition cube_r153 = Mask.m_171599_("cube_r153", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.5F, 0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.1F))
/* 391 */         .m_171514_(20, 22).m_171488_(-0.5F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.075F, 4.1332F, 3.3735F, -0.2618F, 0.0F, 0.0F));
/*     */     
/* 393 */     PartDefinition cube_r154 = Mask.m_171599_("cube_r154", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171480_().m_171488_(-0.5F, -1.3F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(4.375F, 1.8332F, 4.1735F, 2.9613F, 1.2623F, -2.6128F));
/*     */     
/* 395 */     PartDefinition cube_r155 = Mask.m_171599_("cube_r155", CubeListBuilder.m_171558_().m_171514_(20, 23).m_171488_(-1.5F, -1.3F, -1.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(1.775F, 1.8332F, 4.1735F, 2.9613F, -1.2623F, 2.6128F));
/*     */     
/* 397 */     PartDefinition cube_r156 = Mask.m_171599_("cube_r156", CubeListBuilder.m_171558_().m_171514_(20, 22).m_171488_(-0.3F, -0.7F, -1.3F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.075F, 0.1562F, 4.4125F, -0.0742F, -0.074F, -0.7827F));
/*     */     
/* 399 */     PartDefinition cube_r157 = Mask.m_171599_("cube_r157", CubeListBuilder.m_171558_().m_171514_(19, 22).m_171488_(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.075F, 4.6332F, 3.9735F, -0.2618F, 0.0F, 0.0F));
/*     */     
/* 401 */     PartDefinition bone3 = Mask.m_171599_("bone3", CubeListBuilder.m_171558_(), PartPose.m_171423_(0.0F, -1.5F, 0.0F, 0.0F, 0.1309F, 0.0F));
/*     */     
/* 403 */     PartDefinition cube_r158 = bone3.m_171599_("cube_r158", CubeListBuilder.m_171558_().m_171514_(6, 27).m_171480_().m_171488_(-1.2271F, -1.6938F, -1.2449F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)).m_171555_(false), PartPose.m_171423_(6.936F, -1.2824F, 0.7824F, -1.5029F, -0.6017F, 0.3388F));
/*     */     
/* 405 */     PartDefinition cube_r159 = bone3.m_171599_("cube_r159", CubeListBuilder.m_171558_().m_171514_(6, 27).m_171480_().m_171488_(-1.357F, -1.7127F, -2.0914F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)).m_171555_(false), PartPose.m_171423_(6.2067F, 0.7597F, 1.167F, -1.3722F, -0.4235F, 0.2953F));
/*     */     
/* 407 */     PartDefinition cube_r160 = bone3.m_171599_("cube_r160", CubeListBuilder.m_171558_().m_171514_(7, 28).m_171480_().m_171488_(-1.3996F, -1.6771F, -0.8753F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)).m_171555_(false), PartPose.m_171423_(6.2067F, 0.7597F, 1.167F, -1.218F, -0.3841F, 0.1695F));
/*     */     
/* 409 */     PartDefinition cube_r161 = bone3.m_171599_("cube_r161", CubeListBuilder.m_171558_().m_171514_(7, 28).m_171480_().m_171488_(-0.9896F, -2.76F, -0.7186F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)).m_171555_(false), PartPose.m_171423_(5.8941F, 2.3282F, 0.7611F, -0.9971F, -0.4054F, 0.0132F));
/*     */     
/* 411 */     PartDefinition cube_r162 = bone3.m_171599_("cube_r162", CubeListBuilder.m_171558_().m_171514_(4, 17).m_171480_().m_171488_(-1.621F, -1.3028F, 0.2926F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).m_171555_(false), PartPose.m_171423_(5.9F, 1.9332F, 2.1235F, -0.2753F, -0.1699F, -0.2194F));
/*     */     
/* 413 */     PartDefinition cube_r163 = bone3.m_171599_("cube_r163", CubeListBuilder.m_171558_().m_171514_(8, 29).m_171480_().m_171488_(-1.2054F, -2.4886F, 0.8511F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171423_(5.9F, 2.1992F, 0.5025F, -0.5416F, -0.206F, -0.1652F));
/*     */     
/* 415 */     PartDefinition cube_r164 = bone3.m_171599_("cube_r164", CubeListBuilder.m_171558_().m_171514_(7, 28).m_171488_(-1.404F, -2.2054F, -1.0868F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.m_171423_(0.2559F, 2.3282F, 0.7611F, -0.9956F, 0.3007F, -0.0127F));
/*     */     
/* 417 */     PartDefinition cube_r165 = bone3.m_171599_("cube_r165", CubeListBuilder.m_171558_().m_171514_(6, 27).m_171488_(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.8F)), PartPose.m_171423_(-0.786F, -1.2824F, 0.7824F, -1.4633F, 0.5025F, -0.318F));
/*     */     
/* 419 */     PartDefinition cube_r166 = bone3.m_171599_("cube_r166", CubeListBuilder.m_171558_().m_171514_(6, 27).m_171488_(-1.0F, -1.1F, -2.4F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.m_171423_(-0.0567F, 0.7597F, 1.167F, -1.3401F, 0.3231F, -0.2836F));
/*     */     
/* 421 */     PartDefinition cube_r167 = bone3.m_171599_("cube_r167", CubeListBuilder.m_171558_().m_171514_(7, 28).m_171488_(-1.0F, -1.1F, -1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.m_171423_(-0.0567F, 0.7597F, 1.167F, -1.1997F, 0.2808F, -0.1635F));
/*     */     
/* 423 */     PartDefinition cube_r168 = bone3.m_171599_("cube_r168", CubeListBuilder.m_171558_().m_171514_(8, 29).m_171488_(-1.3041F, -2.1054F, 0.4132F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.25F, 2.1992F, 0.5025F, -0.5589F, 0.1027F, 0.1625F));
/*     */     
/* 425 */     PartDefinition cube_r169 = bone3.m_171599_("cube_r169", CubeListBuilder.m_171558_().m_171514_(4, 17).m_171488_(-1.0F, -1.0F, -0.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.m_171423_(0.25F, 1.9332F, 2.1235F, -0.2981F, 0.0677F, 0.2167F));
/*     */     
/* 427 */     PartDefinition bone4 = Mask.m_171599_("bone4", CubeListBuilder.m_171558_(), PartPose.m_171423_(6.15F, -0.5F, 0.0F, 0.0F, -0.1309F, 0.0F));
/*     */     
/* 429 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(54, 32).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 430 */         .m_171514_(46, 59).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
/* 431 */         .m_171514_(44, 75).m_171488_(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*     */     
/* 433 */     PartDefinition rightArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(16, 64).m_171488_(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 434 */         .m_171514_(68, 76).m_171488_(-2.0F, 1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.25F))
/* 435 */         .m_171514_(40, 43).m_171488_(-2.0F, 0.95F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/*     */     
/* 437 */     PartDefinition rightArmLayer_r1 = rightArm.m_171599_("rightArmLayer_r1", CubeListBuilder.m_171558_().m_171514_(32, 80).m_171488_(-0.5F, -2.5F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.m_171423_(-2.2627F, 5.3996F, 0.0F, 0.0F, 0.0F, 0.2618F));
/*     */     
/* 439 */     PartDefinition leftArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(30, 64).m_171488_(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 440 */         .m_171514_(0, 78).m_171488_(-1.0F, 0.975F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.25F))
/* 441 */         .m_171514_(42, 80).m_171488_(-1.0F, 0.925F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/*     */     
/* 443 */     PartDefinition leftArmLayer_r1 = leftArm.m_171599_("leftArmLayer_r1", CubeListBuilder.m_171558_().m_171514_(56, 80).m_171488_(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.m_171423_(2.3921F, 5.8825F, 0.0F, 0.0F, 0.0F, -0.2618F));
/*     */     
/* 445 */     PartDefinition rightLeg = partdefinition.m_171599_("rightLeg", CubeListBuilder.m_171558_().m_171514_(0, 62).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 446 */         .m_171514_(78, 32).m_171488_(1.3729F, 0.3864F, -2.25F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
/* 447 */         .m_171514_(0, 16).m_171488_(1.3729F, -0.1136F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
/* 448 */         .m_171514_(82, 80).m_171488_(1.3729F, -0.1136F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/* 449 */         .m_171514_(14, 83).m_171488_(1.3729F, 0.3864F, 1.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
/* 450 */         .m_171514_(0, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-1.9F, 12.0F, 0.0F));
/*     */     
/* 452 */     PartDefinition rightLegLayer_r1 = rightLeg.m_171599_("rightLegLayer_r1", CubeListBuilder.m_171558_().m_171514_(70, 48).m_171488_(-2.5F, -6.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.m_171423_(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
/*     */     
/* 454 */     PartDefinition leftLeg = partdefinition.m_171599_("leftLeg", CubeListBuilder.m_171558_().m_171514_(64, 0).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
/* 455 */         .m_171514_(80, 0).m_171488_(-2.3729F, 0.3864F, -2.25F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F))
/* 456 */         .m_171514_(18, 83).m_171488_(-2.3729F, 0.3864F, 1.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
/* 457 */         .m_171514_(22, 83).m_171488_(-2.3729F, -0.1136F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
/* 458 */         .m_171514_(0, 18).m_171488_(-2.3729F, -0.1136F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(1.9F, 12.0F, 0.0F));
/*     */     
/* 460 */     PartDefinition leftLegLayer_r1 = leftLeg.m_171599_("leftLegLayer_r1", CubeListBuilder.m_171558_().m_171514_(70, 62).m_171488_(-1.5F, -6.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)), PartPose.m_171423_(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
/*     */     
/* 462 */     return LayerDefinition.m_171565_(meshdefinition, 256, 256);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(OnimikoEntity p_102866_, float p_102867_, float p_102868_, float p_102869_, float p_102870_, float p_102871_) {
/* 467 */     boolean flag = (p_102866_.m_21256_() > 4);
/* 468 */     boolean flag1 = p_102866_.m_6067_();
/* 469 */     this.head.f_104204_ = p_102870_ * 0.017453292F;
/* 470 */     if (flag) {
/* 471 */       this.head.f_104203_ = -0.7853982F;
/*     */     } else {
/* 473 */       this.head.f_104203_ = p_102871_ * 0.017453292F;
/*     */     } 
/*     */     
/* 476 */     this.body.f_104204_ = 0.0F;
/* 477 */     this.rightArm.f_104202_ = 0.0F;
/* 478 */     this.rightArm.f_104200_ = -5.0F;
/* 479 */     this.leftArm.f_104202_ = 0.0F;
/* 480 */     this.leftArm.f_104200_ = 5.0F;
/* 481 */     float f = 1.0F;
/* 482 */     if (flag) {
/* 483 */       f = (float)p_102866_.m_20184_().m_82556_();
/* 484 */       f /= 0.2F;
/* 485 */       f *= f * f;
/*     */     } 
/*     */     
/* 488 */     if (f < 1.0F) {
/* 489 */       f = 1.0F;
/*     */     }
/*     */     
/* 492 */     this.rightArm.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F + 3.1415927F) * 2.0F * p_102868_ * 0.5F / f;
/* 493 */     this.leftArm.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F) * 2.0F * p_102868_ * 0.5F / f;
/* 494 */     this.rightArm.f_104205_ = 0.0F;
/* 495 */     this.leftArm.f_104205_ = 0.0F;
/* 496 */     this.rightLeg.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F) * 1.4F * p_102868_ / f;
/* 497 */     this.leftLeg.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F + 3.1415927F) * 1.4F * p_102868_ / f;
/* 498 */     this.rightLeg.f_104204_ = 0.005F;
/* 499 */     this.leftLeg.f_104204_ = -0.005F;
/* 500 */     this.rightLeg.f_104205_ = 0.005F;
/* 501 */     this.leftLeg.f_104205_ = -0.005F;
/* 502 */     if (this.f_102609_) {
/* 503 */       this.rightArm.f_104203_ += -0.62831855F;
/* 504 */       this.leftArm.f_104203_ += -0.62831855F;
/* 505 */       this.rightLeg.f_104203_ = -1.4137167F;
/* 506 */       this.rightLeg.f_104204_ = 0.31415927F;
/* 507 */       this.rightLeg.f_104205_ = 0.07853982F;
/* 508 */       this.leftLeg.f_104203_ = -1.4137167F;
/* 509 */       this.leftLeg.f_104204_ = -0.31415927F;
/* 510 */       this.leftLeg.f_104205_ = -0.07853982F;
/*     */     } 
/*     */     
/* 513 */     this.rightArm.f_104204_ = 0.0F;
/* 514 */     this.leftArm.f_104204_ = 0.0F;
/*     */ 
/*     */     
/* 517 */     this.body.f_104203_ = 0.0F;
/* 518 */     this.rightLeg.f_104202_ = 0.0F;
/* 519 */     this.leftLeg.f_104202_ = 0.0F;
/* 520 */     this.rightLeg.f_104201_ = 12.0F;
/* 521 */     this.leftLeg.f_104201_ = 12.0F;
/* 522 */     this.head.f_104201_ = 0.0F;
/* 523 */     this.body.f_104201_ = 0.0F;
/* 524 */     this.leftArm.f_104201_ = 2.0F;
/* 525 */     this.rightArm.f_104201_ = 2.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 530 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 531 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 532 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 533 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 534 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 535 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\model\Model_oni_miko_kishintai.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */