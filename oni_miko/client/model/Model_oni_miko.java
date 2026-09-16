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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Model_oni_miko<T extends OnimikoEntity>
/*     */   extends EntityModel<T>
/*     */ {
/*  27 */   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("oni_miko", "modeloni_miko_kishintai"), "main");
/*     */   public final ModelPart head;
/*     */   public final ModelPart bone;
/*     */   public final ModelPart bone2;
/*     */   public final ModelPart body;
/*     */   public final ModelPart rightArm;
/*     */   public final ModelPart leftArm;
/*     */   public final ModelPart rightLeg;
/*     */   public final ModelPart leftLeg;
/*     */   
/*     */   public Model_oni_miko(ModelPart root) {
/*  38 */     this.head = root.m_171324_("head");
/*  39 */     this.bone = this.head.m_171324_("bone");
/*  40 */     this.bone2 = this.head.m_171324_("bone2");
/*  41 */     this.body = root.m_171324_("body");
/*  42 */     this.rightArm = root.m_171324_("rightArm");
/*  43 */     this.leftArm = root.m_171324_("leftArm");
/*  44 */     this.rightLeg = root.m_171324_("rightLeg");
/*  45 */     this.leftLeg = root.m_171324_("leftLeg");
/*     */   }
/*     */   
/*     */   public static LayerDefinition createbodyLayer() {
/*  49 */     MeshDefinition meshdefinition = new MeshDefinition();
/*  50 */     PartDefinition partdefinition = meshdefinition.m_171576_();
/*  51 */     PartDefinition head = partdefinition.m_171599_("head", 
/*  52 */         CubeListBuilder.m_171558_().m_171514_(54, 16).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).m_171514_(32, 0).m_171488_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).m_171514_(0, 5)
/*  53 */         .m_171488_(-1.0F, -8.5952F, 4.0626F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(16, 0).m_171488_(-1.0F, -8.5952F, 4.8126F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  54 */         PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/*  55 */     PartDefinition cube_r1 = head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(12, 32).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  56 */         PartPose.m_171423_(0.0F, -6.4451F, 4.6765F, 0.7418F, 0.0F, 0.0F));
/*  57 */     PartDefinition cube_r2 = head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.2F)), 
/*  58 */         PartPose.m_171423_(0.0F, 2.4038F, 8.0037F, 0.4887F, 0.0F, 0.0F));
/*  59 */     PartDefinition cube_r3 = head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 23).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.1F)), 
/*  60 */         PartPose.m_171423_(0.0F, -0.9722F, 7.0036F, 0.0873F, 0.0F, 0.0F));
/*  61 */     PartDefinition cube_r4 = head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(23, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  62 */         PartPose.m_171423_(0.0F, -4.7879F, 6.4164F, 0.2182F, 0.0F, 0.0F));
/*  63 */     PartDefinition cube_r5 = head.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(12, 16).m_171488_(-1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/*  64 */         PartPose.m_171423_(0.0F, -4.0891F, 2.864F, 0.6109F, 0.0F, 0.0F));
/*  65 */     PartDefinition bone = head.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(36, 16).m_171488_(-1.0F, -1.3452F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, -6.6548F, 5.25F));
/*  66 */     PartDefinition cube_r6 = bone.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  67 */         PartPose.m_171423_(-6.6483F, 5.369F, -1.1183F, -3.0933F, 0.504F, 2.2901F));
/*  68 */     PartDefinition cube_r7 = bone.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 0.6511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  69 */         PartPose.m_171423_(-7.8285F, 5.3909F, -1.0182F, -2.9542F, 0.473F, 2.5847F));
/*  70 */     PartDefinition cube_r8 = bone.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  71 */         PartPose.m_171423_(-7.0086F, 4.5393F, -0.8598F, -2.9542F, 0.473F, 2.5847F));
/*  72 */     PartDefinition cube_r9 = bone.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 0.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  73 */         PartPose.m_171423_(-5.5448F, 4.4677F, 0.3332F, 3.1416F, 0.0F, 2.4696F));
/*  74 */     PartDefinition cube_r10 = bone.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171488_(-3.3409F, 1.3511F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  75 */         PartPose.m_171423_(-5.7517F, 4.598F, 0.3332F, 3.1416F, 0.0F, 2.1904F));
/*  76 */     PartDefinition cube_r11 = bone.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171488_(-3.3409F, 1.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  77 */         PartPose.m_171423_(-4.1781F, 2.5326F, 0.4F, 3.1416F, -0.1745F, 2.0508F));
/*  78 */     PartDefinition cube_r12 = bone.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  79 */         PartPose.m_171423_(-4.4878F, 1.298F, -1.0F, -3.1267F, -0.0581F, 2.3584F));
/*  80 */     PartDefinition cube_r13 = bone.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  81 */         PartPose.m_171423_(-3.6879F, 0.498F, -1.0F, -3.1319F, -0.0591F, 2.4458F));
/*  82 */     PartDefinition cube_r14 = bone.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  83 */         PartPose.m_171423_(-4.0879F, 0.398F, -1.0F, 3.1264F, -0.058F, 2.8654F));
/*  84 */     PartDefinition cube_r15 = bone.m_171599_("cube_r15", CubeListBuilder.m_171558_().m_171514_(19, 21).m_171488_(0.8848F, -1.4108F, 0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  85 */         PartPose.m_171423_(-0.9F, -0.2F, 0.0F, -3.1416F, 0.0F, -2.9322F));
/*  86 */     PartDefinition cube_r16 = bone.m_171599_("cube_r16", CubeListBuilder.m_171558_().m_171514_(21, 17).m_171488_(0.9767F, -1.0514F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), 
/*  87 */         PartPose.m_171423_(-0.9F, 0.0F, 0.0F, -3.1416F, 0.0F, -2.2253F));
/*  88 */     PartDefinition cube_r17 = bone.m_171599_("cube_r17", CubeListBuilder.m_171558_().m_171514_(20, 9).m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/*  89 */         PartPose.m_171423_(-4.9032F, -0.2953F, -1.0F, 3.1416F, 0.0F, 2.8536F));
/*  90 */     PartDefinition cube_r18 = bone.m_171599_("cube_r18", CubeListBuilder.m_171558_().m_171514_(19, 9).m_171488_(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), 
/*  91 */         PartPose.m_171423_(-5.8315F, -0.6089F, -1.0F, 3.1416F, 0.0F, 3.1329F));
/*  92 */     PartDefinition cube_r19 = bone.m_171599_("cube_r19", CubeListBuilder.m_171558_().m_171514_(24, 13).m_171488_(-1.3F, 0.3F, 0.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/*  93 */         PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.9283F, 0.4626F, 2.4677F));
/*  94 */     PartDefinition cube_r20 = bone.m_171599_("cube_r20", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.8F, -0.5F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/*  95 */         PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.8127F, 0.392F, 2.7449F));
/*  96 */     PartDefinition cube_r21 = bone.m_171599_("cube_r21", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.8F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/*  97 */         PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.7022F, 0.2598F, 3.0865F));
/*  98 */     PartDefinition cube_r22 = bone.m_171599_("cube_r22", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.5F, -1.3F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/*  99 */         PartPose.m_171423_(-7.0856F, 7.266F, -1.9F, -2.768F, 0.3499F, 2.868F));
/* 100 */     PartDefinition cube_r23 = bone.m_171599_("cube_r23", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 101 */         PartPose.m_171423_(-5.2856F, 1.866F, -1.0F, -3.1416F, 0.0F, 2.0159F));
/* 102 */     PartDefinition cube_r24 = bone.m_171599_("cube_r24", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 103 */         PartPose.m_171423_(-4.5856F, 1.466F, -1.0F, -3.1416F, 0.0F, 1.8413F));
/* 104 */     PartDefinition cube_r25 = bone.m_171599_("cube_r25", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 105 */         PartPose.m_171423_(-5.2856F, 1.066F, -1.0F, -3.1416F, 0.0F, 2.3649F));
/* 106 */     PartDefinition cube_r26 = bone.m_171599_("cube_r26", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 107 */         PartPose.m_171423_(-5.8856F, 0.666F, -1.0F, -3.1416F, 0.0F, 2.6616F));
/* 108 */     PartDefinition cube_r27 = bone.m_171599_("cube_r27", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 109 */         PartPose.m_171423_(-6.5856F, 0.166F, -1.0F, -3.1416F, 0.0F, 3.0805F));
/* 110 */     PartDefinition cube_r28 = bone.m_171599_("cube_r28", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 111 */         PartPose.m_171423_(-7.2856F, -0.734F, -1.0F, -3.1416F, 0.0F, -2.9583F));
/* 112 */     PartDefinition cube_r29 = bone.m_171599_("cube_r29", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 113 */         PartPose.m_171423_(-3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, 2.9234F));
/* 114 */     PartDefinition cube_r30 = bone.m_171599_("cube_r30", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 115 */         PartPose.m_171423_(-3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, -3.1154F));
/* 116 */     PartDefinition cube_r31 = bone.m_171599_("cube_r31", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171488_(2.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)), 
/* 117 */         PartPose.m_171423_(-4.1406F, -1.9901F, 0.5F, -3.1416F, 0.0F, -2.6529F));
/* 118 */     PartDefinition cube_r32 = bone.m_171599_("cube_r32", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(3.8848F, -1.2795F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)), 
/* 119 */         PartPose.m_171423_(-0.3406F, -3.7901F, 0.0F, -3.1416F, 0.0F, 2.9845F));
/* 120 */     PartDefinition cube_r33 = bone.m_171599_("cube_r33", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171488_(3.8848F, -1.2795F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)), 
/* 121 */         PartPose.m_171423_(0.7699F, -1.3204F, 0.0F, -3.1416F, 0.0F, -2.81F));
/* 122 */     PartDefinition cube_r34 = bone.m_171599_("cube_r34", CubeListBuilder.m_171558_().m_171514_(22, 12).m_171488_(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 123 */         PartPose.m_171423_(-2.1793F, -0.7032F, -0.4302F, 3.0666F, 0.2775F, -3.0783F));
/* 124 */     PartDefinition bone2 = head.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(36, 16).m_171480_().m_171488_(-1.0F, -1.3452F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), PartPose.m_171419_(0.0F, -6.6548F, 5.25F));
/* 125 */     PartDefinition cube_r35 = bone2.m_171599_("cube_r35", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(-1.6591F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 126 */         PartPose.m_171423_(6.6483F, 5.369F, -1.1183F, -3.0933F, -0.504F, -2.2901F));
/* 127 */     PartDefinition cube_r36 = bone2.m_171599_("cube_r36", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(0.3409F, 0.6511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 128 */         PartPose.m_171423_(7.8285F, 5.3909F, -1.0182F, -2.9542F, -0.473F, -2.5847F));
/* 129 */     PartDefinition cube_r37 = bone2.m_171599_("cube_r37", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(-1.6591F, 1.3511F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 130 */         PartPose.m_171423_(7.0086F, 4.5393F, -0.8598F, -2.9542F, -0.473F, -2.5847F));
/* 131 */     PartDefinition cube_r38 = bone2.m_171599_("cube_r38", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(0.3409F, 0.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 132 */         PartPose.m_171423_(5.5448F, 4.4677F, 0.3332F, 3.1416F, 0.0F, -2.4696F));
/* 133 */     PartDefinition cube_r39 = bone2.m_171599_("cube_r39", CubeListBuilder.m_171558_().m_171514_(6, 23).m_171480_().m_171488_(1.3409F, 1.3511F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 134 */         PartPose.m_171423_(5.7517F, 4.598F, 0.3332F, 3.1416F, 0.0F, -2.1904F));
/* 135 */     PartDefinition cube_r40 = bone2.m_171599_("cube_r40", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171480_().m_171488_(0.3409F, 1.3511F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 136 */         PartPose.m_171423_(4.1781F, 2.5326F, 0.4F, 3.1416F, 0.1745F, -2.0508F));
/* 137 */     PartDefinition cube_r41 = bone2.m_171599_("cube_r41", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 138 */         PartPose.m_171423_(4.4878F, 1.298F, -1.0F, -3.1267F, 0.0581F, -2.3584F));
/* 139 */     PartDefinition cube_r42 = bone2.m_171599_("cube_r42", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 140 */         PartPose.m_171423_(3.6879F, 0.498F, -1.0F, -3.1319F, 0.0591F, -2.4458F));
/* 141 */     PartDefinition cube_r43 = bone2.m_171599_("cube_r43", CubeListBuilder.m_171558_().m_171514_(4, 21).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 142 */         PartPose.m_171423_(4.0879F, 0.398F, -1.0F, 3.1264F, 0.058F, -2.8654F));
/* 143 */     PartDefinition cube_r44 = bone2.m_171599_("cube_r44", CubeListBuilder.m_171558_().m_171514_(19, 21).m_171480_().m_171488_(-6.8848F, -1.4108F, 0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 144 */         PartPose.m_171423_(0.9F, -0.2F, 0.0F, -3.1416F, 0.0F, 2.9322F));
/* 145 */     PartDefinition cube_r45 = bone2.m_171599_("cube_r45", CubeListBuilder.m_171558_().m_171514_(21, 17).m_171480_().m_171488_(-3.9767F, -1.0514F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 146 */         PartPose.m_171423_(0.9F, 0.0F, 0.0F, -3.1416F, 0.0F, 2.2253F));
/* 147 */     PartDefinition cube_r46 = bone2.m_171599_("cube_r46", CubeListBuilder.m_171558_().m_171514_(20, 9).m_171480_().m_171488_(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 148 */         PartPose.m_171423_(4.9032F, -0.2953F, -1.0F, 3.1416F, 0.0F, -2.8536F));
/* 149 */     PartDefinition cube_r47 = bone2.m_171599_("cube_r47", CubeListBuilder.m_171558_().m_171514_(19, 9).m_171480_().m_171488_(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 150 */         PartPose.m_171423_(5.8315F, -0.6089F, -1.0F, 3.1416F, 0.0F, -3.1329F));
/* 151 */     PartDefinition cube_r48 = bone2.m_171599_("cube_r48", CubeListBuilder.m_171558_().m_171514_(24, 13).m_171480_().m_171488_(-0.7F, 0.3F, 0.4F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 152 */         PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.9283F, -0.4626F, -2.4677F));
/* 153 */     PartDefinition cube_r49 = bone2.m_171599_("cube_r49", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.2F, -0.5F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 154 */         PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.8127F, -0.392F, -2.7449F));
/* 155 */     PartDefinition cube_r50 = bone2.m_171599_("cube_r50", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.2F, -2.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 156 */         PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.7022F, -0.2598F, -3.0865F));
/* 157 */     PartDefinition cube_r51 = bone2.m_171599_("cube_r51", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.5F, -1.3F, 0.4F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 158 */         PartPose.m_171423_(7.0856F, 7.266F, -1.9F, -2.768F, -0.3499F, -2.868F));
/* 159 */     PartDefinition cube_r52 = bone2.m_171599_("cube_r52", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 160 */         PartPose.m_171423_(5.2856F, 1.866F, -1.0F, -3.1416F, 0.0F, -2.0159F));
/* 161 */     PartDefinition cube_r53 = bone2.m_171599_("cube_r53", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 162 */         PartPose.m_171423_(4.5856F, 1.466F, -1.0F, -3.1416F, 0.0F, -1.8413F));
/* 163 */     PartDefinition cube_r54 = bone2.m_171599_("cube_r54", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-2.0F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 164 */         PartPose.m_171423_(5.2856F, 1.066F, -1.0F, -3.1416F, 0.0F, -2.3649F));
/* 165 */     PartDefinition cube_r55 = bone2.m_171599_("cube_r55", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 166 */         PartPose.m_171423_(5.8856F, 0.666F, -1.0F, -3.1416F, 0.0F, -2.6616F));
/* 167 */     PartDefinition cube_r56 = bone2.m_171599_("cube_r56", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 168 */         PartPose.m_171423_(6.5856F, 0.166F, -1.0F, -3.1416F, 0.0F, -3.0805F));
/* 169 */     PartDefinition cube_r57 = bone2.m_171599_("cube_r57", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 170 */         PartPose.m_171423_(7.2856F, -0.734F, -1.0F, -3.1416F, 0.0F, 2.9583F));
/* 171 */     PartDefinition cube_r58 = bone2.m_171599_("cube_r58", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 172 */         PartPose.m_171423_(3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, -2.9234F));
/* 173 */     PartDefinition cube_r59 = bone2.m_171599_("cube_r59", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 174 */         PartPose.m_171423_(3.5406F, -2.8901F, 0.5F, -3.1416F, 0.0F, 3.1154F));
/* 175 */     PartDefinition cube_r60 = bone2.m_171599_("cube_r60", CubeListBuilder.m_171558_().m_171514_(23, 13).m_171480_().m_171488_(-4.8848F, -0.2795F, 1.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 176 */         PartPose.m_171423_(4.1406F, -1.9901F, 0.5F, -3.1416F, 0.0F, 2.6529F));
/* 177 */     PartDefinition cube_r61 = bone2.m_171599_("cube_r61", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171480_().m_171488_(-6.8848F, -1.2795F, 0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.001F)).m_171555_(false), 
/* 178 */         PartPose.m_171423_(0.3406F, -3.7901F, 0.0F, -3.1416F, 0.0F, -2.9845F));
/* 179 */     PartDefinition cube_r62 = bone2.m_171599_("cube_r62", CubeListBuilder.m_171558_().m_171514_(23, 12).m_171480_().m_171488_(-5.8848F, -1.2795F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.002F)).m_171555_(false), 
/* 180 */         PartPose.m_171423_(-0.7699F, -1.3204F, 0.0F, -3.1416F, 0.0F, 2.81F));
/* 181 */     PartDefinition cube_r63 = bone2.m_171599_("cube_r63", CubeListBuilder.m_171558_().m_171514_(22, 12).m_171480_().m_171488_(-2.0F, -1.0F, -0.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).m_171555_(false), 
/* 182 */         PartPose.m_171423_(2.1793F, -0.7032F, -0.4302F, 3.0666F, -0.2775F, 3.0783F));
/* 183 */     PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(54, 32).m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(46, 59)
/* 184 */         .m_171488_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).m_171514_(44, 75).m_171488_(-4.0F, 11.0F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
/* 185 */     PartDefinition rightArm = partdefinition.m_171599_("rightArm", CubeListBuilder.m_171558_().m_171514_(16, 64).m_171488_(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(68, 76)
/* 186 */         .m_171488_(-2.0F, 1.0F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).m_171514_(40, 43).m_171488_(-2.0F, 0.95F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
/* 187 */     PartDefinition rightArmLayer_r1 = rightArm.m_171599_("rightArmLayer_r1", CubeListBuilder.m_171558_().m_171514_(32, 80).m_171488_(-0.5F, -2.5F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), 
/* 188 */         PartPose.m_171423_(-2.2627F, 5.3996F, 0.0F, 0.0F, 0.0F, 0.2618F));
/* 189 */     PartDefinition leftArm = partdefinition.m_171599_("leftArm", CubeListBuilder.m_171558_().m_171514_(30, 64).m_171488_(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 78)
/* 190 */         .m_171488_(-1.0F, 0.975F, -2.0F, 3.0F, 7.0F, 4.0F, new CubeDeformation(0.25F)).m_171514_(42, 80).m_171488_(-1.0F, 0.925F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
/* 191 */     PartDefinition leftArmLayer_r1 = leftArm.m_171599_("leftArmLayer_r1", CubeListBuilder.m_171558_().m_171514_(56, 80).m_171488_(-0.5F, -3.0F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.25F)), 
/* 192 */         PartPose.m_171423_(2.3921F, 5.8825F, 0.0F, 0.0F, 0.0F, -0.2618F));
/* 193 */     PartDefinition rightLeg = partdefinition.m_171599_("rightLeg", 
/* 194 */         CubeListBuilder.m_171558_().m_171514_(0, 62).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(78, 32).m_171488_(1.3729F, 0.3864F, -2.25F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 16)
/* 195 */         .m_171488_(1.3729F, -0.1136F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(82, 80).m_171488_(1.3729F, -0.1136F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(14, 83)
/* 196 */         .m_171488_(1.3729F, 0.3864F, 1.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), 
/* 197 */         PartPose.m_171419_(-1.9F, 12.0F, 0.0F));
/* 198 */     PartDefinition rightLegLayer_r1 = rightLeg.m_171599_("rightLegLayer_r1", CubeListBuilder.m_171558_().m_171514_(70, 48).m_171488_(-2.5F, -6.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)), 
/* 199 */         PartPose.m_171423_(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
/* 200 */     PartDefinition leftLeg = partdefinition.m_171599_("leftLeg", 
/* 201 */         CubeListBuilder.m_171558_().m_171514_(64, 0).m_171488_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(80, 0).m_171488_(-2.3729F, 0.3864F, -2.25F, 1.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(18, 83)
/* 202 */         .m_171488_(-2.3729F, 0.3864F, 1.25F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).m_171514_(22, 83).m_171488_(-2.3729F, -0.1136F, -2.25F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).m_171514_(0, 18)
/* 203 */         .m_171488_(-2.3729F, -0.1136F, 1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), 
/* 204 */         PartPose.m_171419_(1.9F, 12.0F, 0.0F));
/* 205 */     PartDefinition leftLegLayer_r1 = leftLeg.m_171599_("leftLegLayer_r1", CubeListBuilder.m_171558_().m_171514_(70, 62).m_171488_(-1.5F, -6.0F, -2.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.25F)), 
/* 206 */         PartPose.m_171423_(0.0F, 6.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
/* 207 */     return LayerDefinition.m_171565_(meshdefinition, 256, 256);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
/* 212 */     this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 213 */     this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 214 */     this.rightArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 215 */     this.leftArm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 216 */     this.rightLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/* 217 */     this.leftLeg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setupAnim(OnimikoEntity p_102866_, float p_102867_, float p_102868_, float p_102869_, float p_102870_, float p_102871_) {
/* 222 */     boolean flag = (p_102866_.m_21256_() > 4);
/* 223 */     boolean flag1 = p_102866_.m_6067_();
/* 224 */     this.head.f_104204_ = p_102870_ * 0.017453292F;
/* 225 */     if (flag) {
/* 226 */       this.head.f_104203_ = -0.7853982F;
/*     */     } else {
/* 228 */       this.head.f_104203_ = p_102871_ * 0.017453292F;
/*     */     } 
/*     */     
/* 231 */     this.body.f_104204_ = 0.0F;
/* 232 */     this.rightArm.f_104202_ = 0.0F;
/* 233 */     this.rightArm.f_104200_ = -5.0F;
/* 234 */     this.leftArm.f_104202_ = 0.0F;
/* 235 */     this.leftArm.f_104200_ = 5.0F;
/* 236 */     float f = 1.0F;
/* 237 */     if (flag) {
/* 238 */       f = (float)p_102866_.m_20184_().m_82556_();
/* 239 */       f /= 0.2F;
/* 240 */       f *= f * f;
/*     */     } 
/*     */     
/* 243 */     if (f < 1.0F) {
/* 244 */       f = 1.0F;
/*     */     }
/*     */     
/* 247 */     this.rightArm.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F + 3.1415927F) * 2.0F * p_102868_ * 0.5F / f;
/* 248 */     this.leftArm.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F) * 2.0F * p_102868_ * 0.5F / f;
/* 249 */     this.rightArm.f_104205_ = 0.0F;
/* 250 */     this.leftArm.f_104205_ = 0.0F;
/* 251 */     this.rightLeg.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F) * 1.4F * p_102868_ / f;
/* 252 */     this.leftLeg.f_104203_ = Mth.m_14089_(p_102867_ * 0.6662F + 3.1415927F) * 1.4F * p_102868_ / f;
/* 253 */     this.rightLeg.f_104204_ = 0.005F;
/* 254 */     this.leftLeg.f_104204_ = -0.005F;
/* 255 */     this.rightLeg.f_104205_ = 0.005F;
/* 256 */     this.leftLeg.f_104205_ = -0.005F;
/* 257 */     if (this.f_102609_) {
/* 258 */       this.rightArm.f_104203_ += -0.62831855F;
/* 259 */       this.leftArm.f_104203_ += -0.62831855F;
/* 260 */       this.rightLeg.f_104203_ = -1.4137167F;
/* 261 */       this.rightLeg.f_104204_ = 0.31415927F;
/* 262 */       this.rightLeg.f_104205_ = 0.07853982F;
/* 263 */       this.leftLeg.f_104203_ = -1.4137167F;
/* 264 */       this.leftLeg.f_104204_ = -0.31415927F;
/* 265 */       this.leftLeg.f_104205_ = -0.07853982F;
/*     */     } 
/*     */     
/* 268 */     this.rightArm.f_104204_ = 0.0F;
/* 269 */     this.leftArm.f_104204_ = 0.0F;
/*     */ 
/*     */     
/* 272 */     this.body.f_104203_ = 0.0F;
/* 273 */     this.rightLeg.f_104202_ = 0.0F;
/* 274 */     this.leftLeg.f_104202_ = 0.0F;
/* 275 */     this.rightLeg.f_104201_ = 12.0F;
/* 276 */     this.leftLeg.f_104201_ = 12.0F;
/* 277 */     this.head.f_104201_ = 0.0F;
/* 278 */     this.body.f_104201_ = 0.0F;
/* 279 */     this.leftArm.f_104201_ = 2.0F;
/* 280 */     this.rightArm.f_104201_ = 2.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin1\Desktop\oni_miko.jar!\oni_miko\client\model\Model_oni_miko.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */