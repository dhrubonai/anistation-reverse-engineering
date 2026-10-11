.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static Q0:Z = false

.field public static R0:Z = false

.field public static final S0:[I

.field public static final T0:F

.field public static final U0:Z

.field public static final V0:Z

.field public static final W0:Z

.field public static final X0:[Ljava/lang/Class;

.field public static final Y0:Lo0/c;

.field public static final Z0:Lm3/x0;


# instance fields
.field public final A:Landroid/graphics/Rect;

.field public A0:Z

.field public final B:Landroid/graphics/Rect;

.field public B0:Z

.field public final C:Landroid/graphics/RectF;

.field public final C0:Lm3/c0;

.field public D:Lm3/d0;

.field public D0:Z

.field public E:Lm3/k0;

.field public E0:Lm3/c1;

.field public final F:Ljava/util/ArrayList;

.field public final F0:[I

.field public final G:Ljava/util/ArrayList;

.field public G0:Lg0/u;

.field public final H:Ljava/util/ArrayList;

.field public final H0:[I

.field public I:Lm3/n0;

.field public final I0:[I

.field public J:Z

.field public final J0:[I

.field public K:Z

.field public final K0:Ljava/util/ArrayList;

.field public L:Z

.field public final L0:Lm3/b0;

.field public M:I

.field public M0:Z

.field public N:Z

.field public N0:I

.field public O:Z

.field public O0:I

.field public P:Z

.field public final P0:Lm3/c0;

.field public Q:I

.field public R:Z

.field public final S:Landroid/view/accessibility/AccessibilityManager;

.field public T:Z

.field public U:Z

.field public V:I

.field public W:I

.field public final a:F

.field public a0:Lm3/g0;

.field public final b:Lm3/s0;

.field public b0:Landroid/widget/EdgeEffect;

.field public final c:La3/h;

.field public c0:Landroid/widget/EdgeEffect;

.field public d:Lm3/t0;

.field public d0:Landroid/widget/EdgeEffect;

.field public e:Lm3/b;

.field public e0:Landroid/widget/EdgeEffect;

.field public f:Lm3/c;

.field public f0:Lm3/h0;

.field public g0:I

.field public h0:I

.field public i0:Landroid/view/VelocityTracker;

.field public j0:I

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:I

.field public o0:Lm3/m0;

.field public final p0:I

.field public final q0:I

.field public final r0:F

.field public final s0:F

.field public t0:Z

.field public final u0:Lm3/z0;

.field public v0:Lm3/q;

.field public final w0:Ln/g;

.field public final x:Lm3/m1;

.field public final x0:Lm3/w0;

.field public y:Z

.field public y0:Lm3/o0;

.field public final z:Lm3/b0;

.field public z0:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const v0, 0x1010436

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    .line 9
    .line 10
    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    const-wide v2, 0x3feccccccccccccdL    # 0.9

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    div-double/2addr v0, v2

    .line 29
    double-to-float v0, v0

    .line 30
    sput v0, Landroidx/recyclerview/widget/RecyclerView;->T0:F

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->U0:Z

    .line 34
    .line 35
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->V0:Z

    .line 36
    .line 37
    sput-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->W0:Z

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    new-array v1, v1, [Ljava/lang/Class;

    .line 41
    .line 42
    const-class v2, Landroid/content/Context;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aput-object v2, v1, v3

    .line 46
    .line 47
    const-class v2, Landroid/util/AttributeSet;

    .line 48
    .line 49
    aput-object v2, v1, v0

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    const/4 v3, 0x2

    .line 54
    aput-object v2, v1, v3

    .line 55
    .line 56
    const/4 v3, 0x3

    .line 57
    aput-object v2, v1, v3

    .line 58
    .line 59
    sput-object v1, Landroidx/recyclerview/widget/RecyclerView;->X0:[Ljava/lang/Class;

    .line 60
    .line 61
    new-instance v1, Lo0/c;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Lo0/c;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v1, Landroidx/recyclerview/widget/RecyclerView;->Y0:Lo0/c;

    .line 67
    .line 68
    new-instance v0, Lm3/x0;

    .line 69
    .line 70
    invoke-direct {v0}, Lm3/x0;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->Z0:Lm3/x0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04037c

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 18

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move/from16 v13, p3

    .line 2
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, Lm3/s0;

    invoke-direct {v0, v10}, Lm3/s0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->b:Lm3/s0;

    .line 4
    new-instance v0, La3/h;

    invoke-direct {v0, v10}, La3/h;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 5
    new-instance v0, Lm3/m1;

    const/4 v14, 0x0

    invoke-direct {v0, v14}, Lm3/m1;-><init>(I)V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->x:Lm3/m1;

    .line 6
    new-instance v0, Lm3/b0;

    invoke-direct {v0, v10, v14}, Lm3/b0;-><init>(Landroidx/recyclerview/widget/RecyclerView;I)V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->z:Lm3/b0;

    .line 7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->A:Landroid/graphics/Rect;

    .line 8
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->B:Landroid/graphics/Rect;

    .line 9
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->C:Landroid/graphics/RectF;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->F:Ljava/util/ArrayList;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->H:Ljava/util/ArrayList;

    .line 13
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 14
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 15
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 16
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 17
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 18
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->Z0:Lm3/x0;

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 19
    new-instance v0, Lm3/j;

    invoke-direct {v0}, Lm3/j;-><init>()V

    iput-object v0, v10, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 20
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    const/4 v0, -0x1

    .line 21
    iput v0, v10, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    const/4 v1, 0x1

    .line 22
    iput v1, v10, Landroidx/recyclerview/widget/RecyclerView;->r0:F

    .line 23
    iput v1, v10, Landroidx/recyclerview/widget/RecyclerView;->s0:F

    const/4 v7, 0x1

    .line 24
    iput-boolean v7, v10, Landroidx/recyclerview/widget/RecyclerView;->t0:Z

    .line 25
    new-instance v1, Lm3/z0;

    invoke-direct {v1, v10}, Lm3/z0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 26
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->W0:Z

    if-eqz v1, :cond_0

    new-instance v1, Ln/g;

    invoke-direct {v1, v7}, Ln/g;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->w0:Ln/g;

    .line 27
    new-instance v1, Lm3/w0;

    invoke-direct {v1}, Lm3/w0;-><init>()V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 28
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 29
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->B0:Z

    .line 30
    new-instance v1, Lm3/c0;

    invoke-direct {v1, v10}, Lm3/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->C0:Lm3/c0;

    .line 31
    iput-boolean v14, v10, Landroidx/recyclerview/widget/RecyclerView;->D0:Z

    const/4 v8, 0x2

    new-array v2, v8, [I

    .line 32
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->F0:[I

    new-array v2, v8, [I

    .line 33
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    new-array v2, v8, [I

    .line 34
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    new-array v2, v8, [I

    .line 35
    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 36
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->K0:Ljava/util/ArrayList;

    .line 37
    new-instance v2, Lm3/b0;

    invoke-direct {v2, v10, v7}, Lm3/b0;-><init>(Landroidx/recyclerview/widget/RecyclerView;I)V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->L0:Lm3/b0;

    .line 38
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->N0:I

    .line 39
    iput v14, v10, Landroidx/recyclerview/widget/RecyclerView;->O0:I

    .line 40
    new-instance v2, Lm3/c0;

    invoke-direct {v2, v10}, Lm3/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->P0:Lm3/c0;

    .line 41
    invoke-virtual {v10, v7}, Landroid/view/View;->setScrollContainer(Z)V

    .line 42
    invoke-virtual {v10, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 43
    invoke-static/range {p1 .. p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 44
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, v10, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 45
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_1

    .line 46
    sget-object v5, Lg0/b1;->a:Ljava/lang/reflect/Method;

    .line 47
    invoke-static {v2}, Lg0/z0;->a(Landroid/view/ViewConfiguration;)F

    move-result v5

    goto :goto_1

    .line 48
    :cond_1
    invoke-static {v2, v11}, Lg0/b1;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v5

    .line 49
    :goto_1
    iput v5, v10, Landroidx/recyclerview/widget/RecyclerView;->r0:F

    if-lt v3, v4, :cond_2

    .line 50
    invoke-static {v2}, Lg0/z0;->b(Landroid/view/ViewConfiguration;)F

    move-result v5

    goto :goto_2

    .line 51
    :cond_2
    invoke-static {v2, v11}, Lg0/b1;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v5

    .line 52
    :goto_2
    iput v5, v10, Landroidx/recyclerview/widget/RecyclerView;->s0:F

    .line 53
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v5

    iput v5, v10, Landroidx/recyclerview/widget/RecyclerView;->p0:I

    .line 54
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, v10, Landroidx/recyclerview/widget/RecyclerView;->q0:I

    .line 55
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v5, 0x43200000    # 160.0f

    mul-float/2addr v2, v5

    const v5, 0x43c10b3d

    mul-float/2addr v2, v5

    const v5, 0x3f570a3d    # 0.84f

    mul-float/2addr v2, v5

    .line 56
    iput v2, v10, Landroidx/recyclerview/widget/RecyclerView;->a:F

    .line 57
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    if-ne v2, v8, :cond_3

    move v2, v7

    goto :goto_3

    :cond_3
    move v2, v14

    :goto_3
    invoke-virtual {v10, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 58
    iget-object v2, v10, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 59
    iput-object v1, v2, Lm3/h0;->a:Lm3/c0;

    .line 60
    new-instance v1, Lm3/b;

    new-instance v2, Lm3/c0;

    invoke-direct {v2, v10}, Lm3/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v1, v2}, Lm3/b;-><init>(Lm3/c0;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 61
    new-instance v1, Lm3/c;

    new-instance v2, Lm3/c0;

    invoke-direct {v2, v10}, Lm3/c0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v1, v2}, Lm3/c;-><init>(Lm3/c0;)V

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 62
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    if-lt v3, v4, :cond_4

    .line 63
    invoke-static/range {p0 .. p0}, Lg0/p0;->b(Landroid/view/View;)I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v14

    :goto_4
    const/16 v9, 0x8

    if-nez v1, :cond_5

    if-lt v3, v4, :cond_5

    .line 64
    invoke-static {v10, v9}, Lg0/p0;->l(Landroid/view/View;I)V

    .line 65
    :cond_5
    invoke-static/range {p0 .. p0}, Lg0/h0;->c(Landroid/view/View;)I

    move-result v1

    if-nez v1, :cond_6

    .line 66
    invoke-static {v10, v7}, Lg0/h0;->s(Landroid/view/View;I)V

    .line 67
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "accessibility"

    .line 68
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, v10, Landroidx/recyclerview/widget/RecyclerView;->S:Landroid/view/accessibility/AccessibilityManager;

    .line 69
    new-instance v1, Lm3/c1;

    invoke-direct {v1, v10}, Lm3/c1;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v10, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lm3/c1;)V

    .line 70
    sget-object v3, Ll3/a;->a:[I

    invoke-virtual {v11, v12, v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object v5, v6

    move-object v15, v6

    move/from16 v6, p3

    .line 71
    invoke-static/range {v1 .. v6}, Lg0/y0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 72
    invoke-virtual {v15, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 73
    invoke-virtual {v15, v8, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    if-ne v1, v0, :cond_7

    const/high16 v0, 0x40000

    .line 74
    invoke-virtual {v10, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 75
    :cond_7
    invoke-virtual {v15, v7, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v10, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    const/4 v0, 0x3

    .line 76
    invoke-virtual {v15, v0, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_9

    const/4 v0, 0x6

    .line 77
    invoke-virtual {v15, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    const/4 v0, 0x7

    .line 78
    invoke-virtual {v15, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 79
    invoke-virtual {v15, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/StateListDrawable;

    const/4 v0, 0x5

    .line 80
    invoke-virtual {v15, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    if-eqz v3, :cond_8

    if-eqz v4, :cond_8

    if-eqz v5, :cond_8

    if-eqz v6, :cond_8

    .line 81
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 82
    new-instance v1, Lm3/o;

    const v2, 0x7f0700b5

    .line 83
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    const v2, 0x7f0700b7

    .line 84
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    const v2, 0x7f0700b6

    .line 85
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v9

    const/4 v0, 0x4

    const/16 v17, 0x2

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v9}, Lm3/o;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    move v1, v0

    move/from16 v8, v17

    goto :goto_5

    .line 86
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trying to set fast scroller without both required drawables."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    invoke-static {v10, v1}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_9
    :goto_5
    invoke-virtual {v15}, Landroid/content/res/TypedArray;->recycle()V

    const-string v2, ": Could not instantiate the LayoutManager: "

    if-eqz v16, :cond_d

    .line 90
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    .line 92
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_a

    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_6
    move-object v3, v0

    goto :goto_7

    :cond_a
    const-string v3, "."

    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_6

    .line 95
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    .line 96
    :goto_7
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 97
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_8

    .line 98
    :cond_c
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 99
    :goto_8
    invoke-static {v3, v14, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v4, Lm3/k0;

    .line 100
    invoke-virtual {v0, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2

    .line 101
    :try_start_1
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->X0:[Ljava/lang/Class;

    .line 102
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v11, v1, v14

    const/4 v5, 0x1

    aput-object v12, v1, v5

    .line 103
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v1, v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x3

    aput-object v5, v1, v6
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v15, v1

    goto :goto_9

    :catch_0
    move-exception v0

    move-object v1, v0

    :try_start_2
    new-array v0, v14, [Ljava/lang/Class;

    .line 104
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v15, 0x0

    :goto_9
    const/4 v1, 0x1

    .line 105
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 106
    invoke-virtual {v0, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm3/k0;

    invoke-virtual {v10, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lm3/k0;)V

    goto/16 :goto_a

    :catch_1
    move-exception v0

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 108
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Error creating LayoutManager "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    move-exception v0

    .line 109
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Class is not a LayoutManager "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    .line 110
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Cannot access non-public constructor "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_4
    move-exception v0

    .line 111
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_5
    move-exception v0

    .line 112
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_6
    move-exception v0

    .line 113
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": Unable to find LayoutManager "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 114
    :cond_d
    :goto_a
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->S0:[I

    invoke-virtual {v11, v12, v3, v13, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object v5, v0

    move/from16 v6, p3

    .line 115
    invoke-static/range {v1 .. v6}, Lg0/y0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 v1, 0x1

    .line 116
    invoke-virtual {v0, v14, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 117
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 118
    invoke-virtual {v10, v1}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    const v0, 0x7f0a0106

    .line 119
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v10, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static G(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->G(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    return-object v3

    .line 34
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return-object v1
.end method

.method public static L(Landroid/view/View;)Lm3/a1;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lm3/l0;

    .line 10
    .line 11
    iget-object p0, p0, Lm3/l0;->a:Lm3/a1;

    .line 12
    .line 13
    return-object p0
.end method

.method private Z(IF)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    div-float/2addr p2, v0

    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {v0}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 41
    .line 42
    neg-float p1, p1

    .line 43
    invoke-static {v0, p1, p2}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    neg-float p1, p1

    .line 48
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 49
    .line 50
    invoke-static {p2}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    cmpl-float p2, p2, v1

    .line 55
    .line 56
    if-nez p2, :cond_1

    .line 57
    .line 58
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 61
    .line 62
    .line 63
    :cond_1
    move v1, p1

    .line 64
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-static {v0}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    cmpl-float v0, v0, v1

    .line 77
    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    const/4 v0, 0x1

    .line 81
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 94
    .line 95
    const/high16 v2, 0x3f800000    # 1.0f

    .line 96
    .line 97
    sub-float/2addr v2, p2

    .line 98
    invoke-static {v0, p1, v2}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 103
    .line 104
    invoke-static {p2}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    cmpl-float p2, p2, v1

    .line 109
    .line 110
    if-nez p2, :cond_4

    .line 111
    .line 112
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 115
    .line 116
    .line 117
    :cond_4
    move v1, p1

    .line 118
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-float p1, p1

    .line 126
    mul-float/2addr v1, p1

    .line 127
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    return p1
.end method

.method public static synthetic b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getScrollingChildHelper()Lg0/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G0:Lg0/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lg0/u;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lg0/u;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G0:Lg0/u;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G0:Lg0/u;

    .line 13
    .line 14
    return-object v0
.end method

.method public static l(Lm3/a1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm3/a1;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    :goto_0
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v2, p0, Lm3/a1;->a:Landroid/view/View;

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iput-object v1, p0, Lm3/a1;->b:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    :cond_3
    return-void
.end method

.method public static o(ILandroid/widget/EdgeEffect;Landroid/widget/EdgeEffect;I)I
    .locals 4

    .line 1
    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40800000    # 4.0f

    .line 5
    .line 6
    if-lez p0, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    cmpl-float v3, v3, v1

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    neg-int p2, p0

    .line 19
    int-to-float p2, p2

    .line 20
    mul-float/2addr p2, v2

    .line 21
    int-to-float v1, p3

    .line 22
    div-float/2addr p2, v1

    .line 23
    neg-int p3, p3

    .line 24
    int-to-float p3, p3

    .line 25
    div-float/2addr p3, v2

    .line 26
    invoke-static {p1, p2, v0}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    mul-float/2addr p2, p3

    .line 31
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eq p2, p0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->finish()V

    .line 38
    .line 39
    .line 40
    :cond_0
    sub-int/2addr p0, p2

    .line 41
    return p0

    .line 42
    :cond_1
    if-gez p0, :cond_3

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-static {p2}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    cmpl-float p1, p1, v1

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    int-to-float p1, p0

    .line 55
    mul-float/2addr p1, v2

    .line 56
    int-to-float p3, p3

    .line 57
    div-float/2addr p1, p3

    .line 58
    div-float/2addr p3, v2

    .line 59
    invoke-static {p2, p1, v0}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    mul-float/2addr p1, p3

    .line 64
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eq p1, p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->finish()V

    .line 71
    .line 72
    .line 73
    :cond_2
    sub-int/2addr p0, p1

    .line 74
    :cond_3
    return p0
.end method

.method public static setDebugAssertionsEnabled(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 2
    .line 3
    return-void
.end method

.method public static setVerboseLoggingEnabled(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->R0:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 7
    .line 8
    check-cast v0, Lm3/x0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
.end method

.method public final B()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/ViewGroup;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", adapter:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", layout:"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", context:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final C(Lm3/w0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 9
    .line 10
    iget-object v0, v0, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final D(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    :goto_1
    return-object p1
.end method

.method public final E(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_6

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Lm3/n0;

    .line 20
    .line 21
    move-object v6, v5

    .line 22
    check-cast v6, Lm3/o;

    .line 23
    .line 24
    iget v7, v6, Lm3/o;->v:I

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v9, 0x2

    .line 28
    if-ne v7, v8, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    invoke-virtual {v6, v7, v10}, Lm3/o;->d(FF)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    invoke-virtual {v6, v10, v11}, Lm3/o;->c(FF)Z

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-nez v11, :cond_4

    .line 59
    .line 60
    if-nez v7, :cond_0

    .line 61
    .line 62
    if-eqz v10, :cond_4

    .line 63
    .line 64
    :cond_0
    if-eqz v10, :cond_1

    .line 65
    .line 66
    iput v8, v6, Lm3/o;->w:I

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    float-to-int v7, v7

    .line 73
    int-to-float v7, v7

    .line 74
    iput v7, v6, Lm3/o;->p:F

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    if-eqz v7, :cond_2

    .line 78
    .line 79
    iput v9, v6, Lm3/o;->w:I

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    float-to-int v7, v7

    .line 86
    int-to-float v7, v7

    .line 87
    iput v7, v6, Lm3/o;->m:F

    .line 88
    .line 89
    :cond_2
    :goto_1
    invoke-virtual {v6, v9}, Lm3/o;->e(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    if-ne v7, v9, :cond_4

    .line 94
    .line 95
    :goto_2
    move v6, v8

    .line 96
    goto :goto_3

    .line 97
    :cond_4
    move v6, v3

    .line 98
    :goto_3
    if-eqz v6, :cond_5

    .line 99
    .line 100
    const/4 v6, 0x3

    .line 101
    if-eq v0, v6, :cond_5

    .line 102
    .line 103
    iput-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->I:Lm3/n0;

    .line 104
    .line 105
    return v8

    .line 106
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_6
    return v3
.end method

.method public final F([I)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm3/c;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    aput v0, p1, v2

    .line 13
    .line 14
    aput v0, p1, v1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const v3, 0x7fffffff

    .line 18
    .line 19
    .line 20
    const/high16 v4, -0x80000000

    .line 21
    .line 22
    move v5, v2

    .line 23
    :goto_0
    if-ge v5, v0, :cond_4

    .line 24
    .line 25
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 26
    .line 27
    invoke-virtual {v6, v5}, Lm3/c;->d(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v6}, Lm3/a1;->p()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v6}, Lm3/a1;->d()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v3, :cond_2

    .line 47
    .line 48
    move v3, v6

    .line 49
    :cond_2
    if-le v6, v4, :cond_3

    .line 50
    .line 51
    move v4, v6

    .line 52
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    aput v3, p1, v2

    .line 56
    .line 57
    aput v4, p1, v1

    .line 58
    .line 59
    return-void
.end method

.method public final H(I)Lm3/a1;
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lm3/c;->h()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_3

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Lm3/c;->g(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v3}, Lm3/a1;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Lm3/a1;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ne v4, p1, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 41
    .line 42
    iget-object v4, v3, Lm3/a1;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Lm3/c;->j(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    move-object v1, v3

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    return-object v3

    .line 53
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return-object v1
.end method

.method public final I(Lm3/a1;)I
    .locals 7

    .line 1
    iget v0, p1, Lm3/a1;->j:I

    .line 2
    .line 3
    const/16 v1, 0x20c

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    if-nez v0, :cond_9

    .line 14
    .line 15
    invoke-virtual {p1}, Lm3/a1;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 23
    .line 24
    iget p1, p1, Lm3/a1;->c:I

    .line 25
    .line 26
    iget-object v0, v0, Lm3/b;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :goto_1
    if-ge v1, v3, :cond_a

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lm3/a;

    .line 39
    .line 40
    iget v5, v4, Lm3/a;->a:I

    .line 41
    .line 42
    if-eq v5, v2, :cond_7

    .line 43
    .line 44
    const/4 v6, 0x2

    .line 45
    if-eq v5, v6, :cond_5

    .line 46
    .line 47
    const/16 v6, 0x8

    .line 48
    .line 49
    if-eq v5, v6, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    iget v5, v4, Lm3/a;->b:I

    .line 53
    .line 54
    if-ne v5, p1, :cond_3

    .line 55
    .line 56
    iget p1, v4, Lm3/a;->d:I

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    if-ge v5, p1, :cond_4

    .line 60
    .line 61
    add-int/lit8 p1, p1, -0x1

    .line 62
    .line 63
    :cond_4
    iget v4, v4, Lm3/a;->d:I

    .line 64
    .line 65
    if-gt v4, p1, :cond_8

    .line 66
    .line 67
    add-int/lit8 p1, p1, 0x1

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_5
    iget v5, v4, Lm3/a;->b:I

    .line 71
    .line 72
    if-gt v5, p1, :cond_8

    .line 73
    .line 74
    iget v4, v4, Lm3/a;->d:I

    .line 75
    .line 76
    add-int/2addr v5, v4

    .line 77
    if-le v5, p1, :cond_6

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    sub-int/2addr p1, v4

    .line 81
    goto :goto_2

    .line 82
    :cond_7
    iget v5, v4, Lm3/a;->b:I

    .line 83
    .line 84
    if-gt v5, p1, :cond_8

    .line 85
    .line 86
    iget v4, v4, Lm3/a;->d:I

    .line 87
    .line 88
    add-int/2addr p1, v4

    .line 89
    :cond_8
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_9
    :goto_3
    const/4 p1, -0x1

    .line 93
    :cond_a
    return p1
.end method

.method public final J(Lm3/a1;)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 2
    .line 3
    iget-boolean v0, v0, Lm3/d0;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p1, Lm3/a1;->e:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p1, p1, Lm3/a1;->c:I

    .line 11
    .line 12
    int-to-long v0, p1

    .line 13
    :goto_0
    return-wide v0
.end method

.method public final K(Landroid/view/View;)Lm3/a1;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "View "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " is not a direct child of "

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final M(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lm3/l0;

    .line 6
    .line 7
    iget-boolean v1, v0, Lm3/l0;->c:Z

    .line 8
    .line 9
    iget-object v2, v0, Lm3/l0;->b:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 15
    .line 16
    iget-boolean v1, v1, Lm3/w0;->g:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Lm3/l0;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lm3/l0;->a:Lm3/a1;

    .line 27
    .line 28
    invoke-virtual {v1}, Lm3/a1;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    :cond_1
    return-object v2

    .line 35
    :cond_2
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    move v5, v1

    .line 46
    :goto_0
    if-ge v5, v4, :cond_3

    .line 47
    .line 48
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Landroid/graphics/Rect;

    .line 49
    .line 50
    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Lm3/i0;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lm3/l0;

    .line 67
    .line 68
    invoke-virtual {v7}, Lm3/l0;->a()I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 72
    .line 73
    .line 74
    iget v7, v2, Landroid/graphics/Rect;->left:I

    .line 75
    .line 76
    iget v8, v6, Landroid/graphics/Rect;->left:I

    .line 77
    .line 78
    add-int/2addr v7, v8

    .line 79
    iput v7, v2, Landroid/graphics/Rect;->left:I

    .line 80
    .line 81
    iget v7, v2, Landroid/graphics/Rect;->top:I

    .line 82
    .line 83
    iget v8, v6, Landroid/graphics/Rect;->top:I

    .line 84
    .line 85
    add-int/2addr v7, v8

    .line 86
    iput v7, v2, Landroid/graphics/Rect;->top:I

    .line 87
    .line 88
    iget v7, v2, Landroid/graphics/Rect;->right:I

    .line 89
    .line 90
    iget v8, v6, Landroid/graphics/Rect;->right:I

    .line 91
    .line 92
    add-int/2addr v7, v8

    .line 93
    iput v7, v2, Landroid/graphics/Rect;->right:I

    .line 94
    .line 95
    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 96
    .line 97
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 98
    .line 99
    add-int/2addr v7, v6

    .line 100
    iput v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    iput-boolean v1, v0, Lm3/l0;->c:Z

    .line 106
    .line 107
    return-object v2
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    return v0
.end method

.method public final O(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lm3/k0;->m0(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final P()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm3/c;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, 0x1

    .line 10
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 13
    .line 14
    invoke-virtual {v4, v2}, Lm3/c;->g(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lm3/l0;

    .line 23
    .line 24
    iput-boolean v3, v4, Lm3/l0;->c:Z

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 30
    .line 31
    iget-object v0, v0, La3/h;->e:Ljava/lang/Cloneable;

    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_1
    if-ge v1, v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lm3/a1;

    .line 46
    .line 47
    iget-object v4, v4, Lm3/a1;->a:Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lm3/l0;

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    iput-boolean v3, v4, Lm3/l0;->c:Z

    .line 58
    .line 59
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
.end method

.method public final Q(IIZ)V
    .locals 12

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm3/c;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const-string v3, " now at position "

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    const-string v5, "RecyclerView"

    .line 15
    .line 16
    const-string v6, " holder "

    .line 17
    .line 18
    if-ge v2, v1, :cond_4

    .line 19
    .line 20
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 21
    .line 22
    invoke-virtual {v7, v2}, Lm3/c;->g(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    if-eqz v7, :cond_3

    .line 31
    .line 32
    invoke-virtual {v7}, Lm3/a1;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    if-nez v8, :cond_3

    .line 37
    .line 38
    iget v8, v7, Lm3/a1;->c:I

    .line 39
    .line 40
    const/4 v9, 0x1

    .line 41
    const-string v10, "offsetPositionRecordsForRemove attached child "

    .line 42
    .line 43
    iget-object v11, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 44
    .line 45
    if-lt v8, v0, :cond_1

    .line 46
    .line 47
    sget-boolean v4, Landroidx/recyclerview/widget/RecyclerView;->R0:Z

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v3, v7, Lm3/a1;->c:I

    .line 69
    .line 70
    sub-int/2addr v3, p2

    .line 71
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    :cond_0
    neg-int v3, p2

    .line 82
    invoke-virtual {v7, v3, p3}, Lm3/a1;->m(IZ)V

    .line 83
    .line 84
    .line 85
    iput-boolean v9, v11, Lm3/w0;->f:Z

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    if-lt v8, p1, :cond_3

    .line 89
    .line 90
    sget-boolean v3, Landroidx/recyclerview/widget/RecyclerView;->R0:Z

    .line 91
    .line 92
    if-eqz v3, :cond_2

    .line 93
    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v3, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v6, " now REMOVED"

    .line 109
    .line 110
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_2
    add-int/lit8 v3, p1, -0x1

    .line 121
    .line 122
    neg-int v5, p2

    .line 123
    invoke-virtual {v7, v4}, Lm3/a1;->b(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v5, p3}, Lm3/a1;->m(IZ)V

    .line 127
    .line 128
    .line 129
    iput v3, v7, Lm3/a1;->c:I

    .line 130
    .line 131
    iput-boolean v9, v11, Lm3/w0;->f:Z

    .line 132
    .line 133
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 137
    .line 138
    iget-object v2, v1, La3/h;->e:Ljava/lang/Cloneable;

    .line 139
    .line 140
    check-cast v2, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    :cond_5
    :goto_2
    add-int/lit8 v7, v7, -0x1

    .line 147
    .line 148
    if-ltz v7, :cond_8

    .line 149
    .line 150
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Lm3/a1;

    .line 155
    .line 156
    if-eqz v8, :cond_5

    .line 157
    .line 158
    iget v9, v8, Lm3/a1;->c:I

    .line 159
    .line 160
    if-lt v9, v0, :cond_7

    .line 161
    .line 162
    sget-boolean v9, Landroidx/recyclerview/widget/RecyclerView;->R0:Z

    .line 163
    .line 164
    if-eqz v9, :cond_6

    .line 165
    .line 166
    new-instance v9, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v10, "offsetPositionRecordsForRemove cached "

    .line 169
    .line 170
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget v10, v8, Lm3/a1;->c:I

    .line 186
    .line 187
    sub-int/2addr v10, p2

    .line 188
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-static {v5, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    :cond_6
    neg-int v9, p2

    .line 199
    invoke-virtual {v8, v9, p3}, Lm3/a1;->m(IZ)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    if-lt v9, p1, :cond_5

    .line 204
    .line 205
    invoke-virtual {v8, v4}, Lm3/a1;->b(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v7}, La3/h;->h(I)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 6
    .line 7
    return-void
.end method

.method public final S(Z)V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_7

    .line 8
    .line 9
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ltz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "layout or scroll counter cannot go below zero.Some calls are not matching"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 34
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 35
    .line 36
    if-eqz p1, :cond_7

    .line 37
    .line 38
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 39
    .line 40
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Landroid/view/accessibility/AccessibilityManager;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v1, v0

    .line 56
    :goto_1
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/16 v1, 0x800

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, p1}, Lh0/b;->b(Landroid/view/accessibility/AccessibilityEvent;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K0:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v1, -0x1

    .line 80
    add-int/2addr v0, v1

    .line 81
    :goto_2
    if-ltz v0, :cond_6

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Lm3/a1;

    .line 88
    .line 89
    iget-object v3, v2, Lm3/a1;->a:Landroid/view/View;

    .line 90
    .line 91
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-ne v3, p0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v2}, Lm3/a1;->p()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    iget v3, v2, Lm3/a1;->q:I

    .line 105
    .line 106
    if-eq v3, v1, :cond_5

    .line 107
    .line 108
    sget-object v4, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 109
    .line 110
    iget-object v4, v2, Lm3/a1;->a:Landroid/view/View;

    .line 111
    .line 112
    invoke-static {v4, v3}, Lg0/h0;->s(Landroid/view/View;I)V

    .line 113
    .line 114
    .line 115
    iput v1, v2, Lm3/a1;->q:I

    .line 116
    .line 117
    :cond_5
    :goto_3
    add-int/lit8 v0, v0, -0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 121
    .line 122
    .line 123
    :cond_7
    return-void
.end method

.method public final T(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    add-float/2addr v1, v2

    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 33
    .line 34
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, v2

    .line 41
    float-to-int p1, p1

    .line 42
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 43
    .line 44
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final U()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->L0:Lm3/b0;

    .line 12
    .line 13
    invoke-static {p0, v0}, Lg0/h0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D0:Z

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final V()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 7
    .line 8
    iget-object v2, v0, Lm3/b;->b:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lm3/b;->l(Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lm3/b;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Lm3/b;->l(Ljava/util/ArrayList;)V

    .line 16
    .line 17
    .line 18
    iput v1, v0, Lm3/b;->f:I

    .line 19
    .line 20
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 25
    .line 26
    invoke-virtual {v0}, Lm3/k0;->W()V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lm3/k0;->y0()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    move v0, v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v0, v1

    .line 45
    :goto_0
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 48
    .line 49
    invoke-virtual {v0}, Lm3/b;->j()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 54
    .line 55
    invoke-virtual {v0}, Lm3/b;->c()V

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 59
    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Z

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v0, v1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move v0, v2

    .line 70
    :goto_3
    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 71
    .line 72
    if-eqz v3, :cond_7

    .line 73
    .line 74
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 75
    .line 76
    if-eqz v3, :cond_7

    .line 77
    .line 78
    iget-boolean v3, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 79
    .line 80
    if-nez v3, :cond_5

    .line 81
    .line 82
    if-nez v0, :cond_5

    .line 83
    .line 84
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 85
    .line 86
    iget-boolean v4, v4, Lm3/k0;->f:Z

    .line 87
    .line 88
    if-eqz v4, :cond_7

    .line 89
    .line 90
    :cond_5
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 93
    .line 94
    iget-boolean v3, v3, Lm3/d0;->b:Z

    .line 95
    .line 96
    if-eqz v3, :cond_7

    .line 97
    .line 98
    :cond_6
    move v3, v2

    .line 99
    goto :goto_4

    .line 100
    :cond_7
    move v3, v1

    .line 101
    :goto_4
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 102
    .line 103
    iput-boolean v3, v4, Lm3/w0;->j:Z

    .line 104
    .line 105
    if-eqz v3, :cond_9

    .line 106
    .line 107
    if-eqz v0, :cond_9

    .line 108
    .line 109
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 110
    .line 111
    if-nez v0, :cond_9

    .line 112
    .line 113
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 114
    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 118
    .line 119
    invoke-virtual {v0}, Lm3/k0;->y0()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    move v0, v2

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    move v0, v1

    .line 128
    :goto_5
    if-eqz v0, :cond_9

    .line 129
    .line 130
    move v1, v2

    .line 131
    :cond_9
    iput-boolean v1, v4, Lm3/w0;->k:Z

    .line 132
    .line 133
    return-void
.end method

.method public final W(Z)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Lm3/c;->h()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    const/4 v2, 0x6

    .line 18
    if-ge v1, p1, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 21
    .line 22
    invoke-virtual {v3, v1}, Lm3/c;->g(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3}, Lm3/a1;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Lm3/a1;->b(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 48
    .line 49
    iget-object v1, p1, La3/h;->e:Ljava/lang/Cloneable;

    .line 50
    .line 51
    check-cast v1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    :goto_1
    if-ge v0, v3, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lm3/a1;

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    invoke-virtual {v4, v2}, Lm3/a1;->b(I)V

    .line 68
    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-virtual {v4, v5}, Lm3/a1;->a(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-object v0, p1, La3/h;->i:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-boolean v0, v0, Lm3/d0;->b:Z

    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    :cond_4
    invoke-virtual {p1}, La3/h;->g()V

    .line 90
    .line 91
    .line 92
    :cond_5
    return-void
.end method

.method public final X(Lm3/a1;Lz1/h;)V
    .locals 4

    .line 1
    iget v0, p1, Lm3/a1;->j:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x2001

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    or-int/2addr v0, v1

    .line 7
    iput v0, p1, Lm3/a1;->j:I

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 10
    .line 11
    iget-boolean v2, v2, Lm3/w0;->h:Z

    .line 12
    .line 13
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Lm3/m1;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    and-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    :cond_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lm3/a1;->j()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Lm3/a1;->p()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->J(Lm3/a1;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iget-object v2, v3, Lm3/m1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Ln/i;

    .line 43
    .line 44
    invoke-virtual {v2, p1, v0, v1}, Ln/i;->f(Ljava/lang/Object;J)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {v3, p1, p2}, Lm3/m1;->c(Lm3/a1;Lz1/h;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final Y(IF)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    div-float/2addr p2, v0

    .line 7
    int-to-float p1, p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    int-to-float v0, v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {v0}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    cmpl-float v0, v0, v1

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 41
    .line 42
    neg-float p1, p1

    .line 43
    const/high16 v2, 0x3f800000    # 1.0f

    .line 44
    .line 45
    sub-float/2addr v2, p2

    .line 46
    invoke-static {v0, p1, v2}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    neg-float p1, p1

    .line 51
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 52
    .line 53
    invoke-static {p2}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    cmpl-float p2, p2, v1

    .line 58
    .line 59
    if-nez p2, :cond_1

    .line 60
    .line 61
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 64
    .line 65
    .line 66
    :cond_1
    move v1, p1

    .line 67
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-static {v0}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    cmpl-float v0, v0, v1

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 97
    .line 98
    invoke-static {v0, p1, p2}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 103
    .line 104
    invoke-static {p2}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    cmpl-float p2, p2, v1

    .line 109
    .line 110
    if-nez p2, :cond_4

    .line 111
    .line 112
    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 115
    .line 116
    .line 117
    :cond_4
    move v1, p1

    .line 118
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 119
    .line 120
    .line 121
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-float p1, p1

    .line 126
    mul-float/2addr v1, p1

    .line 127
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    return p1
.end method

.method public final a0(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Landroid/graphics/Rect;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lm3/l0;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lm3/l0;

    .line 29
    .line 30
    iget-boolean v1, v0, Lm3/l0;->c:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget v1, v3, Landroid/graphics/Rect;->left:I

    .line 35
    .line 36
    iget-object v0, v0, Lm3/l0;->b:Landroid/graphics/Rect;

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    iget v1, v3, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 46
    .line 47
    add-int/2addr v1, v2

    .line 48
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iget v1, v3, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    sub-int/2addr v1, v2

    .line 55
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    :cond_1
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 73
    .line 74
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Landroid/graphics/Rect;

    .line 75
    .line 76
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 77
    .line 78
    const/4 v1, 0x1

    .line 79
    xor-int/lit8 v9, v0, 0x1

    .line 80
    .line 81
    if-nez p2, :cond_3

    .line 82
    .line 83
    move v10, v1

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move v10, v4

    .line 86
    :goto_1
    move-object v6, p0

    .line 87
    move-object v7, p1

    .line 88
    invoke-virtual/range {v5 .. v10}, Lm3/k0;->j0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b0()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    or-int/2addr v0, v1

    .line 39
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    or-int/2addr v0, v1

    .line 53
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    or-int/2addr v0, v1

    .line 67
    :cond_4
    if-eqz v0, :cond_5

    .line 68
    .line 69
    sget-object v0, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-static {p0}, Lg0/h0;->k(Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    return-void
.end method

.method public final c0(IILandroid/view/MotionEvent;I)Z
    .locals 20

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move/from16 v9, p1

    .line 4
    .line 5
    move/from16 v10, p2

    .line 6
    .line 7
    move-object/from16 v11, p3

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 13
    .line 14
    iget-object v12, v8, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 15
    .line 16
    const/4 v13, 0x1

    .line 17
    const/4 v14, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    aput v14, v12, v14

    .line 21
    .line 22
    aput v14, v12, v13

    .line 23
    .line 24
    invoke-virtual {v8, v9, v10, v12}, Landroidx/recyclerview/widget/RecyclerView;->d0(II[I)V

    .line 25
    .line 26
    .line 27
    aget v0, v12, v14

    .line 28
    .line 29
    aget v1, v12, v13

    .line 30
    .line 31
    sub-int v2, v9, v0

    .line 32
    .line 33
    sub-int v3, v10, v1

    .line 34
    .line 35
    move v15, v0

    .line 36
    move v7, v1

    .line 37
    move/from16 v16, v2

    .line 38
    .line 39
    move/from16 v17, v3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v7, v14

    .line 43
    move v15, v7

    .line 44
    move/from16 v16, v15

    .line 45
    .line 46
    move/from16 v17, v16

    .line 47
    .line 48
    :goto_0
    iget-object v0, v8, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 60
    .line 61
    aput v14, v6, v14

    .line 62
    .line 63
    aput v14, v6, v13

    .line 64
    .line 65
    iget-object v5, v8, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    .line 66
    .line 67
    move-object/from16 v0, p0

    .line 68
    .line 69
    move v1, v15

    .line 70
    move v2, v7

    .line 71
    move/from16 v3, v16

    .line 72
    .line 73
    move/from16 v4, v17

    .line 74
    .line 75
    move-object/from16 v18, v6

    .line 76
    .line 77
    move/from16 v6, p4

    .line 78
    .line 79
    move/from16 v19, v7

    .line 80
    .line 81
    move-object/from16 v7, v18

    .line 82
    .line 83
    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->v(IIII[II[I)V

    .line 84
    .line 85
    .line 86
    aget v0, v12, v14

    .line 87
    .line 88
    sub-int v1, v16, v0

    .line 89
    .line 90
    aget v2, v12, v13

    .line 91
    .line 92
    sub-int v3, v17, v2

    .line 93
    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v0, v14

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    :goto_1
    move v0, v13

    .line 102
    :goto_2
    iget v2, v8, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 103
    .line 104
    iget-object v4, v8, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    .line 105
    .line 106
    aget v5, v4, v14

    .line 107
    .line 108
    sub-int/2addr v2, v5

    .line 109
    iput v2, v8, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 110
    .line 111
    iget v2, v8, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 112
    .line 113
    aget v4, v4, v13

    .line 114
    .line 115
    sub-int/2addr v2, v4

    .line 116
    iput v2, v8, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 117
    .line 118
    iget-object v2, v8, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 119
    .line 120
    aget v6, v2, v14

    .line 121
    .line 122
    add-int/2addr v6, v5

    .line 123
    aput v6, v2, v14

    .line 124
    .line 125
    aget v5, v2, v13

    .line 126
    .line 127
    add-int/2addr v5, v4

    .line 128
    aput v5, v2, v13

    .line 129
    .line 130
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const/4 v4, 0x2

    .line 135
    if-eq v2, v4, :cond_a

    .line 136
    .line 137
    if-eqz v11, :cond_9

    .line 138
    .line 139
    const/16 v2, 0x2002

    .line 140
    .line 141
    invoke-static {v11, v2}, Lcom/bumptech/glide/d;->H(Landroid/view/MotionEvent;I)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_9

    .line 146
    .line 147
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getX()F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-float v1, v1

    .line 152
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getY()F

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    int-to-float v3, v3

    .line 157
    const/4 v5, 0x0

    .line 158
    cmpg-float v6, v1, v5

    .line 159
    .line 160
    const/high16 v7, 0x3f800000    # 1.0f

    .line 161
    .line 162
    if-gez v6, :cond_4

    .line 163
    .line 164
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->y()V

    .line 165
    .line 166
    .line 167
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 168
    .line 169
    neg-float v11, v1

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    int-to-float v12, v12

    .line 175
    div-float/2addr v11, v12

    .line 176
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    int-to-float v12, v12

    .line 181
    div-float/2addr v4, v12

    .line 182
    sub-float v4, v7, v4

    .line 183
    .line 184
    invoke-static {v6, v11, v4}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    cmpl-float v6, v1, v5

    .line 189
    .line 190
    if-lez v6, :cond_5

    .line 191
    .line 192
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->z()V

    .line 193
    .line 194
    .line 195
    iget-object v6, v8, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 196
    .line 197
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    int-to-float v11, v11

    .line 202
    div-float v11, v1, v11

    .line 203
    .line 204
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    int-to-float v12, v12

    .line 209
    div-float/2addr v4, v12

    .line 210
    invoke-static {v6, v11, v4}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 211
    .line 212
    .line 213
    :goto_3
    move v4, v13

    .line 214
    goto :goto_4

    .line 215
    :cond_5
    move v4, v14

    .line 216
    :goto_4
    cmpg-float v6, v3, v5

    .line 217
    .line 218
    if-gez v6, :cond_6

    .line 219
    .line 220
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->A()V

    .line 221
    .line 222
    .line 223
    iget-object v4, v8, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 224
    .line 225
    neg-float v6, v3

    .line 226
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    int-to-float v7, v7

    .line 231
    div-float/2addr v6, v7

    .line 232
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    int-to-float v7, v7

    .line 237
    div-float/2addr v2, v7

    .line 238
    invoke-static {v4, v6, v2}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 239
    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_6
    cmpl-float v6, v3, v5

    .line 243
    .line 244
    if-lez v6, :cond_7

    .line 245
    .line 246
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->x()V

    .line 247
    .line 248
    .line 249
    iget-object v4, v8, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 250
    .line 251
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    int-to-float v6, v6

    .line 256
    div-float v6, v3, v6

    .line 257
    .line 258
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    int-to-float v11, v11

    .line 263
    div-float/2addr v2, v11

    .line 264
    sub-float/2addr v7, v2

    .line 265
    invoke-static {v4, v6, v7}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 266
    .line 267
    .line 268
    :goto_5
    move v4, v13

    .line 269
    :cond_7
    if-nez v4, :cond_8

    .line 270
    .line 271
    cmpl-float v1, v1, v5

    .line 272
    .line 273
    if-nez v1, :cond_8

    .line 274
    .line 275
    cmpl-float v1, v3, v5

    .line 276
    .line 277
    if-eqz v1, :cond_9

    .line 278
    .line 279
    :cond_8
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 280
    .line 281
    invoke-static/range {p0 .. p0}, Lg0/h0;->k(Landroid/view/View;)V

    .line 282
    .line 283
    .line 284
    :cond_9
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    .line 285
    .line 286
    .line 287
    :cond_a
    move/from16 v1, v19

    .line 288
    .line 289
    if-nez v15, :cond_b

    .line 290
    .line 291
    if-eqz v1, :cond_c

    .line 292
    .line 293
    :cond_b
    invoke-virtual {v8, v15, v1}, Landroidx/recyclerview/widget/RecyclerView;->w(II)V

    .line 294
    .line 295
    .line 296
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-nez v2, :cond_d

    .line 301
    .line 302
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    .line 303
    .line 304
    .line 305
    :cond_d
    if-nez v0, :cond_f

    .line 306
    .line 307
    if-nez v15, :cond_f

    .line 308
    .line 309
    if-eqz v1, :cond_e

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_e
    move v13, v14

    .line 313
    :cond_f
    :goto_6
    return v13
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lm3/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 6
    .line 7
    check-cast p1, Lm3/l0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lm3/k0;->f(Lm3/l0;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return p1
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->j(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->k(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeHorizontalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->l(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->m(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->n(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final computeVerticalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lm3/k0;->o(Lm3/w0;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    return v1
.end method

.method public final d0(II[I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 5
    .line 6
    .line 7
    sget v0, Lc0/n;->a:I

    .line 8
    .line 9
    const-string v0, "RV Scroll"

    .line 10
    .line 11
    invoke-static {v0}, Lc0/m;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->C(Lm3/w0;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 25
    .line 26
    invoke-virtual {v3, p1, v1, v0}, Lm3/k0;->l0(ILa3/h;Lm3/w0;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 35
    .line 36
    invoke-virtual {v3, p2, v1, v0}, Lm3/k0;->n0(ILa3/h;Lm3/w0;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move p2, v2

    .line 42
    :goto_1
    invoke-static {}, Lc0/m;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 46
    .line 47
    invoke-virtual {v0}, Lm3/c;->e()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    move v1, v2

    .line 52
    :goto_2
    if-ge v1, v0, :cond_4

    .line 53
    .line 54
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Lm3/c;->d(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)Lm3/a1;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iget-object v4, v4, Lm3/a1;->i:Lm3/a1;

    .line 67
    .line 68
    if-eqz v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iget-object v4, v4, Lm3/a1;->a:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-ne v5, v6, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eq v3, v6, :cond_3

    .line 91
    .line 92
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    add-int/2addr v6, v5

    .line 97
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    add-int/2addr v7, v3

    .line 102
    invoke-virtual {v4, v5, v3, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 103
    .line 104
    .line 105
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    const/4 v0, 0x1

    .line 109
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 113
    .line 114
    .line 115
    if-eqz p3, :cond_5

    .line 116
    .line 117
    aput p1, p3, v2

    .line 118
    .line 119
    aput p2, p3, v0

    .line 120
    .line 121
    :cond_5
    return-void
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lg0/u;->a(FFZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lg0/u;->b(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lg0/u;->c(III[I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-virtual/range {v0 .. v7}, Lg0/u;->e(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Lm3/i0;

    .line 19
    .line 20
    invoke-virtual {v4, p1, p0}, Lm3/i0;->b(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v4, v2

    .line 51
    :goto_1
    const/high16 v5, 0x43870000    # 270.0f

    .line 52
    .line 53
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    neg-int v5, v5

    .line 61
    add-int/2addr v5, v4

    .line 62
    int-to-float v4, v5

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    move v4, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v4, v2

    .line 80
    :goto_2
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move v4, v2

    .line 85
    :goto_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    int-to-float v5, v5

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    int-to-float v6, v6

    .line 113
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 114
    .line 115
    .line 116
    :cond_4
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    move v5, v3

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move v5, v2

    .line 129
    :goto_4
    or-int/2addr v4, v5

    .line 130
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 131
    .line 132
    .line 133
    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_9

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 152
    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move v6, v2

    .line 161
    :goto_5
    const/high16 v7, 0x42b40000    # 90.0f

    .line 162
    .line 163
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    .line 164
    .line 165
    .line 166
    int-to-float v6, v6

    .line 167
    neg-int v5, v5

    .line 168
    int-to-float v5, v5

    .line 169
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 170
    .line 171
    .line 172
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 173
    .line 174
    if-eqz v5, :cond_8

    .line 175
    .line 176
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-eqz v5, :cond_8

    .line 181
    .line 182
    move v5, v3

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    move v5, v2

    .line 185
    :goto_6
    or-int/2addr v4, v5

    .line 186
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 187
    .line 188
    .line 189
    :cond_9
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 190
    .line 191
    if-eqz v1, :cond_c

    .line 192
    .line 193
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_c

    .line 198
    .line 199
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    const/high16 v5, 0x43340000    # 180.0f

    .line 204
    .line 205
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 206
    .line 207
    .line 208
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 209
    .line 210
    if-eqz v5, :cond_a

    .line 211
    .line 212
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    neg-int v5, v5

    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    add-int/2addr v6, v5

    .line 222
    int-to-float v5, v6

    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    neg-int v6, v6

    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    add-int/2addr v7, v6

    .line 233
    int-to-float v6, v7

    .line 234
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    neg-int v5, v5

    .line 243
    int-to-float v5, v5

    .line 244
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    neg-int v6, v6

    .line 249
    int-to-float v6, v6

    .line 250
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 251
    .line 252
    .line 253
    :goto_7
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 254
    .line 255
    if-eqz v5, :cond_b

    .line 256
    .line 257
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_b

    .line 262
    .line 263
    move v2, v3

    .line 264
    :cond_b
    or-int/2addr v4, v2

    .line 265
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 266
    .line 267
    .line 268
    :cond_c
    if-nez v4, :cond_d

    .line 269
    .line 270
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 271
    .line 272
    if-eqz p1, :cond_d

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-lez p1, :cond_d

    .line 279
    .line 280
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 281
    .line 282
    invoke-virtual {p1}, Lm3/h0;->f()Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_d

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_d
    move v3, v4

    .line 290
    :goto_8
    if-eqz v3, :cond_e

    .line 291
    .line 292
    sget-object p1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 293
    .line 294
    invoke-static {p0}, Lg0/h0;->k(Landroid/view/View;)V

    .line 295
    .line 296
    .line 297
    :cond_e
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final e0(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 11
    .line 12
    iget-object v1, v0, Lm3/z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lm3/k0;->e:Lm3/w;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lm3/w;->i()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const-string p1, "RecyclerView"

    .line 38
    .line 39
    const-string v0, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 40
    .line 41
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-virtual {v0, p1}, Lm3/k0;->m0(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final f0(Landroid/widget/EdgeEffect;II)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-static {p1}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    int-to-float p3, p3

    .line 10
    mul-float/2addr p1, p3

    .line 11
    neg-int p2, p2

    .line 12
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    int-to-float p2, p2

    .line 17
    const p3, 0x3eb33333    # 0.35f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p2, p3

    .line 21
    iget p3, p0, Landroidx/recyclerview/widget/RecyclerView;->a:F

    .line 22
    .line 23
    const v1, 0x3c75c28f    # 0.015f

    .line 24
    .line 25
    .line 26
    mul-float/2addr p3, v1

    .line 27
    div-float/2addr p2, p3

    .line 28
    float-to-double v1, p2

    .line 29
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    sget p2, Landroidx/recyclerview/widget/RecyclerView;->T0:F

    .line 34
    .line 35
    float-to-double v3, p2

    .line 36
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 37
    .line 38
    sub-double v5, v3, v5

    .line 39
    .line 40
    float-to-double p2, p3

    .line 41
    div-double/2addr v3, v5

    .line 42
    mul-double/2addr v3, v1

    .line 43
    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v1

    .line 47
    mul-double/2addr v1, p2

    .line 48
    double-to-float p2, v1

    .line 49
    cmpg-float p1, p2, p1

    .line 50
    .line 51
    if-gez p1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x0

    .line 55
    :goto_0
    return v0
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v2

    .line 29
    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 34
    .line 35
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 36
    .line 37
    const/16 v6, 0x21

    .line 38
    .line 39
    const/16 v7, 0x11

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x2

    .line 43
    if-eqz v0, :cond_b

    .line 44
    .line 45
    if-eq p2, v9, :cond_1

    .line 46
    .line 47
    if-ne p2, v1, :cond_b

    .line 48
    .line 49
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 50
    .line 51
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    if-ne p2, v9, :cond_2

    .line 58
    .line 59
    const/16 v0, 0x82

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    move v0, v6

    .line 63
    :goto_1
    invoke-virtual {v3, p0, p1, v0}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    move v0, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move v0, v2

    .line 72
    :goto_2
    if-nez v0, :cond_8

    .line 73
    .line 74
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 75
    .line 76
    invoke-virtual {v10}, Lm3/k0;->d()Z

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    if-eqz v10, :cond_8

    .line 81
    .line 82
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 83
    .line 84
    invoke-virtual {v0}, Lm3/k0;->A()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-ne v0, v1, :cond_4

    .line 89
    .line 90
    move v0, v1

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    move v0, v2

    .line 93
    :goto_3
    if-ne p2, v9, :cond_5

    .line 94
    .line 95
    move v10, v1

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    move v10, v2

    .line 98
    :goto_4
    xor-int/2addr v0, v10

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    const/16 v0, 0x42

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_6
    move v0, v7

    .line 105
    :goto_5
    invoke-virtual {v3, p0, p1, v0}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-nez v0, :cond_7

    .line 110
    .line 111
    move v0, v1

    .line 112
    goto :goto_6

    .line 113
    :cond_7
    move v0, v2

    .line 114
    :cond_8
    :goto_6
    if-eqz v0, :cond_a

    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v0, :cond_9

    .line 124
    .line 125
    return-object v8

    .line 126
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 127
    .line 128
    .line 129
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 130
    .line 131
    invoke-virtual {v0, p1, p2, v5, v4}, Lm3/k0;->Q(Landroid/view/View;ILa3/h;Lm3/w0;)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 135
    .line 136
    .line 137
    :cond_a
    invoke-virtual {v3, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    goto :goto_7

    .line 142
    :cond_b
    invoke-virtual {v3, p0, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-nez v3, :cond_d

    .line 147
    .line 148
    if-eqz v0, :cond_d

    .line 149
    .line 150
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-nez v0, :cond_c

    .line 158
    .line 159
    return-object v8

    .line 160
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 164
    .line 165
    invoke-virtual {v0, p1, p2, v5, v4}, Lm3/k0;->Q(Landroid/view/View;ILa3/h;Lm3/w0;)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_d
    move-object v0, v3

    .line 174
    :goto_7
    if-eqz v0, :cond_f

    .line 175
    .line 176
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_f

    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v1, :cond_e

    .line 187
    .line 188
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1

    .line 193
    :cond_e
    invoke-virtual {p0, v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->a0(Landroid/view/View;Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :cond_f
    if-eqz v0, :cond_23

    .line 198
    .line 199
    if-eq v0, p0, :cond_23

    .line 200
    .line 201
    if-ne v0, p1, :cond_10

    .line 202
    .line 203
    goto/16 :goto_b

    .line 204
    .line 205
    :cond_10
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-nez v3, :cond_11

    .line 210
    .line 211
    move v1, v2

    .line 212
    goto/16 :goto_c

    .line 213
    .line 214
    :cond_11
    if-nez p1, :cond_12

    .line 215
    .line 216
    goto/16 :goto_c

    .line 217
    .line 218
    :cond_12
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-nez v3, :cond_13

    .line 223
    .line 224
    goto/16 :goto_c

    .line 225
    .line 226
    :cond_13
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Landroid/graphics/Rect;

    .line 235
    .line 236
    invoke-virtual {v5, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Landroid/graphics/Rect;

    .line 248
    .line 249
    invoke-virtual {v8, v2, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p1, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v0, v8}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 256
    .line 257
    .line 258
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 259
    .line 260
    invoke-virtual {v2}, Lm3/k0;->A()I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-ne v2, v1, :cond_14

    .line 265
    .line 266
    const/4 v2, -0x1

    .line 267
    goto :goto_8

    .line 268
    :cond_14
    move v2, v1

    .line 269
    :goto_8
    iget v3, v5, Landroid/graphics/Rect;->left:I

    .line 270
    .line 271
    iget v4, v8, Landroid/graphics/Rect;->left:I

    .line 272
    .line 273
    if-lt v3, v4, :cond_15

    .line 274
    .line 275
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 276
    .line 277
    if-gt v10, v4, :cond_16

    .line 278
    .line 279
    :cond_15
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 280
    .line 281
    iget v11, v8, Landroid/graphics/Rect;->right:I

    .line 282
    .line 283
    if-ge v10, v11, :cond_16

    .line 284
    .line 285
    move v3, v1

    .line 286
    goto :goto_9

    .line 287
    :cond_16
    iget v10, v5, Landroid/graphics/Rect;->right:I

    .line 288
    .line 289
    iget v11, v8, Landroid/graphics/Rect;->right:I

    .line 290
    .line 291
    if-gt v10, v11, :cond_17

    .line 292
    .line 293
    if-lt v3, v11, :cond_18

    .line 294
    .line 295
    :cond_17
    if-le v3, v4, :cond_18

    .line 296
    .line 297
    const/4 v3, -0x1

    .line 298
    goto :goto_9

    .line 299
    :cond_18
    const/4 v3, 0x0

    .line 300
    :goto_9
    iget v4, v5, Landroid/graphics/Rect;->top:I

    .line 301
    .line 302
    iget v10, v8, Landroid/graphics/Rect;->top:I

    .line 303
    .line 304
    if-lt v4, v10, :cond_19

    .line 305
    .line 306
    iget v11, v5, Landroid/graphics/Rect;->bottom:I

    .line 307
    .line 308
    if-gt v11, v10, :cond_1a

    .line 309
    .line 310
    :cond_19
    iget v11, v5, Landroid/graphics/Rect;->bottom:I

    .line 311
    .line 312
    iget v12, v8, Landroid/graphics/Rect;->bottom:I

    .line 313
    .line 314
    if-ge v11, v12, :cond_1a

    .line 315
    .line 316
    move v4, v1

    .line 317
    goto :goto_a

    .line 318
    :cond_1a
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 319
    .line 320
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 321
    .line 322
    if-gt v5, v8, :cond_1b

    .line 323
    .line 324
    if-lt v4, v8, :cond_1c

    .line 325
    .line 326
    :cond_1b
    if-le v4, v10, :cond_1c

    .line 327
    .line 328
    const/4 v4, -0x1

    .line 329
    goto :goto_a

    .line 330
    :cond_1c
    const/4 v4, 0x0

    .line 331
    :goto_a
    if-eq p2, v1, :cond_22

    .line 332
    .line 333
    if-eq p2, v9, :cond_21

    .line 334
    .line 335
    if-eq p2, v7, :cond_20

    .line 336
    .line 337
    if-eq p2, v6, :cond_1f

    .line 338
    .line 339
    const/16 v2, 0x42

    .line 340
    .line 341
    if-eq p2, v2, :cond_1e

    .line 342
    .line 343
    const/16 v2, 0x82

    .line 344
    .line 345
    if-ne p2, v2, :cond_1d

    .line 346
    .line 347
    if-lez v4, :cond_23

    .line 348
    .line 349
    goto :goto_c

    .line 350
    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 351
    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v1, "Invalid direction: "

    .line 355
    .line 356
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p2

    .line 366
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    throw p1

    .line 370
    :cond_1e
    if-lez v3, :cond_23

    .line 371
    .line 372
    goto :goto_c

    .line 373
    :cond_1f
    if-gez v4, :cond_23

    .line 374
    .line 375
    goto :goto_c

    .line 376
    :cond_20
    if-gez v3, :cond_23

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_21
    if-gtz v4, :cond_24

    .line 380
    .line 381
    if-nez v4, :cond_23

    .line 382
    .line 383
    mul-int/2addr v3, v2

    .line 384
    if-lez v3, :cond_23

    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_22
    if-ltz v4, :cond_24

    .line 388
    .line 389
    if-nez v4, :cond_23

    .line 390
    .line 391
    mul-int/2addr v3, v2

    .line 392
    if-gez v3, :cond_23

    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_23
    :goto_b
    const/4 v1, 0x0

    .line 396
    :cond_24
    :goto_c
    if-eqz v1, :cond_25

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_25
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :goto_d
    return-object v0
.end method

.method public final g0(IIZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move p1, v1

    .line 26
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 27
    .line 28
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    move p2, v1

    .line 35
    :cond_3
    if-nez p1, :cond_4

    .line 36
    .line 37
    if-eqz p2, :cond_8

    .line 38
    .line 39
    :cond_4
    if-eqz p3, :cond_7

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    if-eqz p1, :cond_5

    .line 43
    .line 44
    move v1, p3

    .line 45
    :cond_5
    if-eqz p2, :cond_6

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    :cond_6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, v1, p3}, Lg0/u;->g(II)Z

    .line 54
    .line 55
    .line 56
    :cond_7
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 57
    .line 58
    const/high16 v0, -0x80000000

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {p3, p1, p2, v0, v1}, Lm3/z0;->c(IIILandroid/view/animation/Interpolator;)V

    .line 62
    .line 63
    .line 64
    :cond_8
    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm3/k0;->r()Lm3/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "RecyclerView has no LayoutManager"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lm3/k0;->s(Landroid/content/Context;Landroid/util/AttributeSet;)Lm3/l0;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    if-eqz v0, :cond_0

    .line 13
    invoke-virtual {v0, p1}, Lm3/k0;->t(Landroid/view/ViewGroup$LayoutParams;)Lm3/l0;

    move-result-object p1

    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "androidx.recyclerview.widget.RecyclerView"

    return-object v0
.end method

.method public getAdapter()Lm3/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public getClipToPadding()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public getCompatAccessibilityDelegate()Lm3/c1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E0:Lm3/c1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEdgeEffectFactory()Lm3/g0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemAnimator()Lm3/h0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getLayoutManager()Lm3/k0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:I

    .line 2
    .line 3
    return v0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->W0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getOnFlingListener()Lm3/m0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->o0:Lm3/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Z

    .line 2
    .line 3
    return v0
.end method

.method public getRecycledViewPool()Lm3/q0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 2
    .line 3
    invoke-virtual {v0}, La3/h;->c()Lm3/q0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getScrollState()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(Lm3/a1;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lm3/a1;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, p0, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)Lm3/a1;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v3, v4}, La3/h;->m(Lm3/a1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lm3/a1;->l()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v3, -0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v0, v3, v1, v2}, Lm3/c;->b(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v3, v2}, Lm3/c;->a(Landroid/view/View;IZ)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 48
    .line 49
    iget-object v1, p1, Lm3/c;->a:Lm3/c0;

    .line 50
    .line 51
    iget-object v1, v1, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ltz v1, :cond_3

    .line 58
    .line 59
    iget-object v2, p1, Lm3/c;->b:Lk2/c;

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Lk2/c;->h(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Lm3/c;->i(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void

    .line 68
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "view is not a child, cannot hide "

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lg0/u;->f(I)Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    :cond_0
    return v1
.end method

.method public final i(Lm3/i0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "Cannot add item decoration during a scroll  or layout"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lm3/k0;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final i0(Z)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_1

    .line 5
    .line 6
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "stopInterceptRequestLayout was called more times than startInterceptRequestLayout."

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 34
    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 38
    .line 39
    :cond_2
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 40
    .line 41
    if-ne v2, v1, :cond_4

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 50
    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->r()V

    .line 62
    .line 63
    .line 64
    :cond_3
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    .line 68
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 69
    .line 70
    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 71
    .line 72
    sub-int/2addr p1, v1

    .line 73
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 74
    .line 75
    return-void
.end method

.method public final isAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLayoutSuppressed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lg0/u;->d:Z

    .line 6
    .line 7
    return v0
.end method

.method public final j(Lm3/o0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final j0(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lg0/u;->h(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 33
    .line 34
    if-lez p1, :cond_2

    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, ""

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "RecyclerView"

    .line 53
    .line 54
    const-string v1, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."

    .line 55
    .line 56
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final m()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm3/c;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, -0x1

    .line 10
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 13
    .line 14
    invoke-virtual {v4, v2}, Lm3/c;->g(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Lm3/a1;->p()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iput v3, v4, Lm3/a1;->d:I

    .line 29
    .line 30
    iput v3, v4, Lm3/a1;->g:I

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 36
    .line 37
    iget-object v2, v0, La3/h;->e:Ljava/lang/Cloneable;

    .line 38
    .line 39
    check-cast v2, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    move v5, v1

    .line 46
    :goto_1
    if-ge v5, v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lm3/a1;

    .line 53
    .line 54
    iput v3, v6, Lm3/a1;->d:I

    .line 55
    .line 56
    iput v3, v6, Lm3/a1;->g:I

    .line 57
    .line 58
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    iget-object v2, v0, La3/h;->c:Ljava/lang/Cloneable;

    .line 62
    .line 63
    check-cast v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    move v5, v1

    .line 70
    :goto_2
    if-ge v5, v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, Lm3/a1;

    .line 77
    .line 78
    iput v3, v6, Lm3/a1;->d:I

    .line 79
    .line 80
    iput v3, v6, Lm3/a1;->g:I

    .line 81
    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    iget-object v2, v0, La3/h;->d:Ljava/lang/Cloneable;

    .line 86
    .line 87
    check-cast v2, Ljava/util/ArrayList;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :goto_3
    if-ge v1, v2, :cond_4

    .line 96
    .line 97
    iget-object v4, v0, La3/h;->d:Ljava/lang/Cloneable;

    .line 98
    .line 99
    check-cast v4, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Lm3/a1;

    .line 106
    .line 107
    iput v3, v4, Lm3/a1;->d:I

    .line 108
    .line 109
    iput v3, v4, Lm3/a1;->g:I

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    return-void
.end method

.method public final n(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    or-int/2addr v0, p1

    .line 50
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    if-lez p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    or-int/2addr v0, p1

    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    if-gez p2, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    or-int/2addr v0, p1

    .line 98
    :cond_3
    if-eqz v0, :cond_4

    .line 99
    .line 100
    sget-object p1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 101
    .line 102
    invoke-static {p0}, Lg0/h0;->k(Landroid/view/View;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 9
    .line 10
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    move v2, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v0

    .line 23
    :goto_0
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 26
    .line 27
    invoke-virtual {v2}, La3/h;->e()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iput-boolean v1, v2, Lm3/k0;->g:Z

    .line 35
    .line 36
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D0:Z

    .line 37
    .line 38
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->W0:Z

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    sget-object v0, Lm3/q;->e:Ljava/lang/ThreadLocal;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lm3/q;

    .line 49
    .line 50
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 51
    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    new-instance v1, Lm3/q;

    .line 55
    .line 56
    invoke-direct {v1}, Lm3/q;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 60
    .line 61
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 62
    .line 63
    invoke-static {p0}, Lg0/i0;->b(Landroid/view/View;)Landroid/view/Display;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/high16 v2, 0x41f00000    # 30.0f

    .line 80
    .line 81
    cmpl-float v2, v1, v2

    .line 82
    .line 83
    if-ltz v2, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/high16 v1, 0x42700000    # 60.0f

    .line 87
    .line 88
    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 89
    .line 90
    const v3, 0x4e6e6b28    # 1.0E9f

    .line 91
    .line 92
    .line 93
    div-float/2addr v3, v1

    .line 94
    float-to-long v3, v3

    .line 95
    iput-wide v3, v2, Lm3/q;->c:J

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 106
    .line 107
    iget-object v0, v0, Lm3/q;->a:Ljava/util/ArrayList;

    .line 108
    .line 109
    if-eqz v1, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string v1, "RecyclerView already present in worker list!"

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_5
    :goto_2
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_6
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lm3/h0;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 16
    .line 17
    iget-object v2, v1, Lm3/z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Lm3/k0;->e:Lm3/w;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Lm3/w;->i()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v0, v1, Lm3/k0;->g:Z

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Lm3/k0;->P(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->K0:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->L0:Lm3/b0;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Lm3/m1;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object v1, Lm3/l1;->d:Lp/f;

    .line 65
    .line 66
    invoke-virtual {v1}, Lp/f;->j()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v1, v0

    .line 74
    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 75
    .line 76
    iget-object v3, v2, La3/h;->e:Ljava/lang/Cloneable;

    .line 77
    .line 78
    check-cast v3, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-ge v1, v4, :cond_4

    .line 85
    .line 86
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lm3/a1;

    .line 91
    .line 92
    iget-object v2, v2, Lm3/a1;->a:Landroid/view/View;

    .line 93
    .line 94
    invoke-static {v2}, Lz7/c;->c(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    iget-object v1, v2, La3/h;->i:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 103
    .line 104
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 105
    .line 106
    invoke-virtual {v2, v1, v0}, La3/h;->f(Lm3/d0;Z)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lg0/f1;

    .line 110
    .line 111
    invoke-direct {v1, p0, v0}, Lg0/f1;-><init>(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    :goto_2
    invoke-virtual {v1}, Lg0/f1;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v2, 0x0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1}, Lg0/f1;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Landroid/view/View;

    .line 126
    .line 127
    const v3, 0x7f0a0176

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, Lm0/a;

    .line 135
    .line 136
    if-nez v4, :cond_5

    .line 137
    .line 138
    new-instance v4, Lm0/a;

    .line 139
    .line 140
    invoke-direct {v4}, Lm0/a;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    iget-object v0, v4, Lm0/a;->a:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-static {v0}, Lcom/bumptech/glide/c;->w(Ljava/util/List;)I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    const/4 v4, -0x1

    .line 153
    if-lt v4, v3, :cond_6

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    throw v2

    .line 164
    :cond_7
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->W0:Z

    .line 165
    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    iget-object v0, v0, Lm3/q;->a:Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 179
    .line 180
    if-eqz v1, :cond_9

    .line 181
    .line 182
    if-eqz v0, :cond_8

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 186
    .line 187
    const-string v1, "RecyclerView removal failed!"

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_9
    :goto_3
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 194
    .line 195
    :cond_a
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lm3/i0;

    .line 18
    .line 19
    invoke-virtual {v2, p0}, Lm3/i0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 15

    .line 1
    move-object v6, p0

    .line 2
    move-object/from16 v7, p1

    .line 3
    .line 4
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 5
    .line 6
    const/4 v8, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return v8

    .line 10
    :cond_0
    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    return v8

    .line 15
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    if-ne v0, v1, :cond_12

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    and-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 33
    .line 34
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const/16 v0, 0x9

    .line 41
    .line 42
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    neg-float v0, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move v0, v1

    .line 49
    :goto_0
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 50
    .line 51
    invoke-virtual {v2}, Lm3/k0;->d()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    invoke-virtual {v7, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/high16 v2, 0x400000

    .line 69
    .line 70
    and-int/2addr v0, v2

    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    const/16 v0, 0x1a

    .line 74
    .line 75
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 80
    .line 81
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    neg-float v0, v2

    .line 88
    :cond_4
    move v2, v1

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 91
    .line 92
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    move v0, v1

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    move v0, v1

    .line 101
    move v2, v0

    .line 102
    :goto_1
    cmpl-float v3, v0, v1

    .line 103
    .line 104
    if-nez v3, :cond_7

    .line 105
    .line 106
    cmpl-float v1, v2, v1

    .line 107
    .line 108
    if-eqz v1, :cond_12

    .line 109
    .line 110
    :cond_7
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->r0:F

    .line 111
    .line 112
    mul-float/2addr v2, v1

    .line 113
    float-to-int v1, v2

    .line 114
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->s0:F

    .line 115
    .line 116
    mul-float/2addr v0, v2

    .line 117
    float-to-int v0, v0

    .line 118
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 119
    .line 120
    if-nez v2, :cond_8

    .line 121
    .line 122
    const-string v0, "RecyclerView"

    .line 123
    .line 124
    const-string v1, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 125
    .line 126
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    goto/16 :goto_7

    .line 130
    .line 131
    :cond_8
    iget-boolean v3, v6, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    goto/16 :goto_7

    .line 136
    .line 137
    :cond_9
    iget-object v9, v6, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 138
    .line 139
    aput v8, v9, v8

    .line 140
    .line 141
    const/4 v10, 0x1

    .line 142
    aput v8, v9, v10

    .line 143
    .line 144
    invoke-virtual {v2}, Lm3/k0;->d()Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    iget-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 149
    .line 150
    invoke-virtual {v2}, Lm3/k0;->e()Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_a

    .line 155
    .line 156
    or-int/lit8 v2, v11, 0x2

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_a
    move v2, v11

    .line 160
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    invoke-virtual {p0, v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->Y(IF)I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    sub-int v13, v1, v3

    .line 173
    .line 174
    invoke-direct {p0, v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->Z(IF)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    sub-int v14, v0, v1

    .line 179
    .line 180
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0, v2, v10}, Lg0/u;->g(II)Z

    .line 185
    .line 186
    .line 187
    if-eqz v11, :cond_b

    .line 188
    .line 189
    move v1, v13

    .line 190
    goto :goto_3

    .line 191
    :cond_b
    move v1, v8

    .line 192
    :goto_3
    if-eqz v12, :cond_c

    .line 193
    .line 194
    move v2, v14

    .line 195
    goto :goto_4

    .line 196
    :cond_c
    move v2, v8

    .line 197
    :goto_4
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 198
    .line 199
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    .line 200
    .line 201
    const/4 v3, 0x1

    .line 202
    move-object v0, p0

    .line 203
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->u(III[I[I)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_d

    .line 208
    .line 209
    aget v0, v9, v8

    .line 210
    .line 211
    sub-int/2addr v13, v0

    .line 212
    aget v0, v9, v10

    .line 213
    .line 214
    sub-int/2addr v14, v0

    .line 215
    :cond_d
    if-eqz v11, :cond_e

    .line 216
    .line 217
    move v0, v13

    .line 218
    goto :goto_5

    .line 219
    :cond_e
    move v0, v8

    .line 220
    :goto_5
    if-eqz v12, :cond_f

    .line 221
    .line 222
    move v1, v14

    .line 223
    goto :goto_6

    .line 224
    :cond_f
    move v1, v8

    .line 225
    :goto_6
    invoke-virtual {p0, v0, v1, v7, v10}, Landroidx/recyclerview/widget/RecyclerView;->c0(IILandroid/view/MotionEvent;I)Z

    .line 226
    .line 227
    .line 228
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 229
    .line 230
    if-eqz v0, :cond_11

    .line 231
    .line 232
    if-nez v13, :cond_10

    .line 233
    .line 234
    if-eqz v14, :cond_11

    .line 235
    .line 236
    :cond_10
    invoke-virtual {v0, p0, v13, v14}, Lm3/q;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 237
    .line 238
    .line 239
    :cond_11
    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 240
    .line 241
    .line 242
    :cond_12
    :goto_7
    return v8
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:Lm3/n0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->E(Landroid/view/MotionEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 21
    .line 22
    .line 23
    return v2

    .line 24
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    return v1

    .line 29
    :cond_2
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 34
    .line 35
    invoke-virtual {v3}, Lm3/k0;->e()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 48
    .line 49
    :cond_3
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 50
    .line 51
    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/4 v6, 0x2

    .line 63
    const/high16 v7, 0x3f000000    # 0.5f

    .line 64
    .line 65
    if-eqz v4, :cond_c

    .line 66
    .line 67
    if-eq v4, v2, :cond_b

    .line 68
    .line 69
    if-eq v4, v6, :cond_7

    .line 70
    .line 71
    const/4 v0, 0x3

    .line 72
    if-eq v4, v0, :cond_6

    .line 73
    .line 74
    const/4 v0, 0x5

    .line 75
    if-eq v4, v0, :cond_5

    .line 76
    .line 77
    const/4 v0, 0x6

    .line 78
    if-eq v4, v0, :cond_4

    .line 79
    .line 80
    goto/16 :goto_2

    .line 81
    .line 82
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->T(Landroid/view/MotionEvent;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_5
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 92
    .line 93
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-float/2addr v0, v7

    .line 98
    float-to-int v0, v0

    .line 99
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 100
    .line 101
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 102
    .line 103
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    add-float/2addr p1, v7

    .line 108
    float-to-int p1, p1

    .line 109
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 110
    .line 111
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 112
    .line 113
    goto/16 :goto_2

    .line 114
    .line 115
    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_2

    .line 122
    .line 123
    :cond_7
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 124
    .line 125
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-gez v4, :cond_8

    .line 130
    .line 131
    new-instance p1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v0, "Error processing scroll; pointer index for id "

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v0, " not found. Did any MotionEvents get skipped?"

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    const-string v0, "RecyclerView"

    .line 153
    .line 154
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    return v1

    .line 158
    :cond_8
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    add-float/2addr v5, v7

    .line 163
    float-to-int v5, v5

    .line 164
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    add-float/2addr p1, v7

    .line 169
    float-to-int p1, p1

    .line 170
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 171
    .line 172
    if-eq v4, v2, :cond_15

    .line 173
    .line 174
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 175
    .line 176
    sub-int v4, v5, v4

    .line 177
    .line 178
    iget v6, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 179
    .line 180
    sub-int v6, p1, v6

    .line 181
    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 189
    .line 190
    if-le v0, v4, :cond_9

    .line 191
    .line 192
    iput v5, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 193
    .line 194
    move v0, v2

    .line 195
    goto :goto_0

    .line 196
    :cond_9
    move v0, v1

    .line 197
    :goto_0
    if-eqz v3, :cond_a

    .line 198
    .line 199
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 204
    .line 205
    if-le v3, v4, :cond_a

    .line 206
    .line 207
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 208
    .line 209
    move v0, v2

    .line 210
    :cond_a
    if-eqz v0, :cond_15

    .line 211
    .line 212
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_2

    .line 216
    .line 217
    :cond_b
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 218
    .line 219
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_2

    .line 226
    .line 227
    :cond_c
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 228
    .line 229
    if-eqz v4, :cond_d

    .line 230
    .line 231
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 232
    .line 233
    :cond_d
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    add-float/2addr v4, v7

    .line 244
    float-to-int v4, v4

    .line 245
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 246
    .line 247
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    add-float/2addr v4, v7

    .line 254
    float-to-int v4, v4

    .line 255
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 256
    .line 257
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 258
    .line 259
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 260
    .line 261
    const/high16 v5, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/4 v7, -0x1

    .line 264
    const/4 v8, 0x0

    .line 265
    if-eqz v4, :cond_e

    .line 266
    .line 267
    invoke-static {v4}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    cmpl-float v4, v4, v8

    .line 272
    .line 273
    if-eqz v4, :cond_e

    .line 274
    .line 275
    invoke-virtual {p0, v7}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    if-nez v4, :cond_e

    .line 280
    .line 281
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 282
    .line 283
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    int-to-float v10, v10

    .line 292
    div-float/2addr v9, v10

    .line 293
    sub-float v9, v5, v9

    .line 294
    .line 295
    invoke-static {v4, v8, v9}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 296
    .line 297
    .line 298
    move v4, v2

    .line 299
    goto :goto_1

    .line 300
    :cond_e
    move v4, v1

    .line 301
    :goto_1
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 302
    .line 303
    if-eqz v9, :cond_f

    .line 304
    .line 305
    invoke-static {v9}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    cmpl-float v9, v9, v8

    .line 310
    .line 311
    if-eqz v9, :cond_f

    .line 312
    .line 313
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-nez v9, :cond_f

    .line 318
    .line 319
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    int-to-float v10, v10

    .line 330
    div-float/2addr v9, v10

    .line 331
    invoke-static {v4, v8, v9}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 332
    .line 333
    .line 334
    move v4, v2

    .line 335
    :cond_f
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 336
    .line 337
    if-eqz v9, :cond_10

    .line 338
    .line 339
    invoke-static {v9}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 340
    .line 341
    .line 342
    move-result v9

    .line 343
    cmpl-float v9, v9, v8

    .line 344
    .line 345
    if-eqz v9, :cond_10

    .line 346
    .line 347
    invoke-virtual {p0, v7}, Landroid/view/View;->canScrollVertically(I)Z

    .line 348
    .line 349
    .line 350
    move-result v7

    .line 351
    if-nez v7, :cond_10

    .line 352
    .line 353
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 354
    .line 355
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 360
    .line 361
    .line 362
    move-result v9

    .line 363
    int-to-float v9, v9

    .line 364
    div-float/2addr v7, v9

    .line 365
    invoke-static {v4, v8, v7}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 366
    .line 367
    .line 368
    move v4, v2

    .line 369
    :cond_10
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 370
    .line 371
    if-eqz v7, :cond_11

    .line 372
    .line 373
    invoke-static {v7}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 374
    .line 375
    .line 376
    move-result v7

    .line 377
    cmpl-float v7, v7, v8

    .line 378
    .line 379
    if-eqz v7, :cond_11

    .line 380
    .line 381
    invoke-virtual {p0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    if-nez v7, :cond_11

    .line 386
    .line 387
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 388
    .line 389
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 394
    .line 395
    .line 396
    move-result v7

    .line 397
    int-to-float v7, v7

    .line 398
    div-float/2addr p1, v7

    .line 399
    sub-float/2addr v5, p1

    .line 400
    invoke-static {v4, v8, v5}, Lj5/a;->O(Landroid/widget/EdgeEffect;FF)F

    .line 401
    .line 402
    .line 403
    move v4, v2

    .line 404
    :cond_11
    if-nez v4, :cond_12

    .line 405
    .line 406
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 407
    .line 408
    if-ne p1, v6, :cond_13

    .line 409
    .line 410
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->j0(I)V

    .line 421
    .line 422
    .line 423
    :cond_13
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 424
    .line 425
    aput v1, p1, v2

    .line 426
    .line 427
    aput v1, p1, v1

    .line 428
    .line 429
    if-eqz v3, :cond_14

    .line 430
    .line 431
    or-int/lit8 v0, v0, 0x2

    .line 432
    .line 433
    :cond_14
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-virtual {p1, v0, v1}, Lg0/u;->g(II)Z

    .line 438
    .line 439
    .line 440
    :cond_15
    :goto_2
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 441
    .line 442
    if-ne p1, v2, :cond_16

    .line 443
    .line 444
    move v1, v2

    .line 445
    :cond_16
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sget p1, Lc0/n;->a:I

    .line 2
    .line 3
    const-string p1, "RV OnLayout"

    .line 4
    .line 5
    invoke-static {p1}, Lc0/m;->a(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->r()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lc0/m;->b()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 16
    .line 17
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->q(II)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Lm3/k0;->J()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 16
    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 28
    .line 29
    iget-object v5, v5, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    invoke-virtual {v5, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->q(II)V

    .line 32
    .line 33
    .line 34
    const/high16 v5, 0x40000000    # 2.0f

    .line 35
    .line 36
    if-ne v0, v5, :cond_1

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    move v2, v1

    .line 41
    :cond_1
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->M0:Z

    .line 42
    .line 43
    if-nez v2, :cond_5

    .line 44
    .line 45
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    iget v0, v3, Lm3/w0;->d:I

    .line 51
    .line 52
    if-ne v0, v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->s()V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 58
    .line 59
    invoke-virtual {v0, p1, p2}, Lm3/k0;->p0(II)V

    .line 60
    .line 61
    .line 62
    iput-boolean v1, v3, Lm3/w0;->i:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 68
    .line 69
    invoke-virtual {v0, p1, p2}, Lm3/k0;->r0(II)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 73
    .line 74
    invoke-virtual {v0}, Lm3/k0;->u0()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {v0, v2, v4}, Lm3/k0;->p0(II)V

    .line 99
    .line 100
    .line 101
    iput-boolean v1, v3, Lm3/w0;->i:Z

    .line 102
    .line 103
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 107
    .line 108
    invoke-virtual {v0, p1, p2}, Lm3/k0;->r0(II)V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N0:I

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O0:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_5
    :goto_0
    return-void

    .line 125
    :cond_6
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 126
    .line 127
    if-eqz v0, :cond_7

    .line 128
    .line 129
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 130
    .line 131
    iget-object v0, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 132
    .line 133
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->q(II)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_7
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R:Z

    .line 138
    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 151
    .line 152
    .line 153
    iget-boolean v0, v3, Lm3/w0;->k:Z

    .line 154
    .line 155
    if-eqz v0, :cond_8

    .line 156
    .line 157
    iput-boolean v1, v3, Lm3/w0;->g:Z

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 161
    .line 162
    invoke-virtual {v0}, Lm3/b;->c()V

    .line 163
    .line 164
    .line 165
    iput-boolean v2, v3, Lm3/w0;->g:Z

    .line 166
    .line 167
    :goto_1
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->R:Z

    .line 168
    .line 169
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_9
    iget-boolean v0, v3, Lm3/w0;->k:Z

    .line 174
    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_a
    :goto_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 190
    .line 191
    if-eqz v0, :cond_b

    .line 192
    .line 193
    invoke-virtual {v0}, Lm3/d0;->a()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    iput v0, v3, Lm3/w0;->e:I

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_b
    iput v2, v3, Lm3/w0;->e:I

    .line 201
    .line 202
    :goto_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 206
    .line 207
    iget-object v0, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 208
    .line 209
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->q(II)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 213
    .line 214
    .line 215
    iput-boolean v2, v3, Lm3/w0;->g:Z

    .line 216
    .line 217
    :goto_4
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lm3/t0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lm3/t0;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lm3/t0;

    .line 12
    .line 13
    iget-object p1, p1, Ln0/b;->a:Landroid/os/Parcelable;

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lm3/t0;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lm3/t0;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lm3/t0;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lm3/t0;->c:Landroid/os/Parcelable;

    .line 15
    .line 16
    iput-object v1, v0, Lm3/t0;->c:Landroid/os/Parcelable;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Lm3/k0;->d0()Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, Lm3/t0;->c:Landroid/os/Parcelable;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    iput-object v1, v0, Lm3/t0;->c:Landroid/os/Parcelable;

    .line 32
    .line 33
    :goto_0
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p3, :cond_0

    .line 5
    .line 6
    if-eq p2, p4, :cond_1

    .line 7
    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 25

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    if-nez v0, :cond_77

    .line 9
    .line 10
    iget-boolean v0, v6, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3d

    .line 15
    .line 16
    :cond_0
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->I:Lm3/n0;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v9, 0x1

    .line 22
    const/4 v4, 0x3

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    move v0, v8

    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_1
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->E(Landroid/view/MotionEvent;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_2
    check-cast v0, Lm3/o;

    .line 41
    .line 42
    iget v5, v0, Lm3/o;->v:I

    .line 43
    .line 44
    if-nez v5, :cond_3

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_7

    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    invoke-virtual {v0, v5, v10}, Lm3/o;->d(FF)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    invoke-virtual {v0, v10, v11}, Lm3/o;->c(FF)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-nez v5, :cond_4

    .line 79
    .line 80
    if-eqz v10, :cond_12

    .line 81
    .line 82
    :cond_4
    if-eqz v10, :cond_5

    .line 83
    .line 84
    iput v9, v0, Lm3/o;->w:I

    .line 85
    .line 86
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    float-to-int v5, v5

    .line 91
    int-to-float v5, v5

    .line 92
    iput v5, v0, Lm3/o;->p:F

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    if-eqz v5, :cond_6

    .line 96
    .line 97
    iput v1, v0, Lm3/o;->w:I

    .line 98
    .line 99
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    float-to-int v5, v5

    .line 104
    int-to-float v5, v5

    .line 105
    iput v5, v0, Lm3/o;->m:F

    .line 106
    .line 107
    :cond_6
    :goto_0
    invoke-virtual {v0, v1}, Lm3/o;->e(I)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_4

    .line 111
    .line 112
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-ne v5, v9, :cond_8

    .line 117
    .line 118
    iget v5, v0, Lm3/o;->v:I

    .line 119
    .line 120
    if-ne v5, v1, :cond_8

    .line 121
    .line 122
    iput v3, v0, Lm3/o;->m:F

    .line 123
    .line 124
    iput v3, v0, Lm3/o;->p:F

    .line 125
    .line 126
    invoke-virtual {v0, v9}, Lm3/o;->e(I)V

    .line 127
    .line 128
    .line 129
    iput v8, v0, Lm3/o;->w:I

    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-ne v5, v1, :cond_12

    .line 138
    .line 139
    iget v5, v0, Lm3/o;->v:I

    .line 140
    .line 141
    if-ne v5, v1, :cond_12

    .line 142
    .line 143
    invoke-virtual {v0}, Lm3/o;->f()V

    .line 144
    .line 145
    .line 146
    iget v5, v0, Lm3/o;->w:I

    .line 147
    .line 148
    const/high16 v10, 0x40000000    # 2.0f

    .line 149
    .line 150
    iget v11, v0, Lm3/o;->b:I

    .line 151
    .line 152
    if-ne v5, v9, :cond_d

    .line 153
    .line 154
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    iget-object v12, v0, Lm3/o;->y:[I

    .line 159
    .line 160
    aput v11, v12, v8

    .line 161
    .line 162
    iget v13, v0, Lm3/o;->q:I

    .line 163
    .line 164
    sub-int/2addr v13, v11

    .line 165
    aput v13, v12, v9

    .line 166
    .line 167
    int-to-float v14, v11

    .line 168
    int-to-float v13, v13

    .line 169
    invoke-static {v13, v5}, Ljava/lang/Math;->min(FF)F

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-static {v14, v5}, Ljava/lang/Math;->max(FF)F

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    iget v13, v0, Lm3/o;->o:I

    .line 178
    .line 179
    int-to-float v13, v13

    .line 180
    sub-float/2addr v13, v5

    .line 181
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    cmpg-float v13, v13, v10

    .line 186
    .line 187
    if-gez v13, :cond_9

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_9
    iget v13, v0, Lm3/o;->p:F

    .line 191
    .line 192
    iget-object v14, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 193
    .line 194
    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 195
    .line 196
    .line 197
    move-result v14

    .line 198
    iget-object v15, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 199
    .line 200
    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    iget v3, v0, Lm3/o;->q:I

    .line 205
    .line 206
    aget v17, v12, v9

    .line 207
    .line 208
    aget v12, v12, v8

    .line 209
    .line 210
    sub-int v12, v17, v12

    .line 211
    .line 212
    if-nez v12, :cond_b

    .line 213
    .line 214
    :cond_a
    move v3, v8

    .line 215
    goto :goto_1

    .line 216
    :cond_b
    sub-float v13, v5, v13

    .line 217
    .line 218
    int-to-float v12, v12

    .line 219
    div-float/2addr v13, v12

    .line 220
    sub-int/2addr v14, v3

    .line 221
    int-to-float v3, v14

    .line 222
    mul-float/2addr v13, v3

    .line 223
    float-to-int v3, v13

    .line 224
    add-int/2addr v15, v3

    .line 225
    if-ge v15, v14, :cond_a

    .line 226
    .line 227
    if-ltz v15, :cond_a

    .line 228
    .line 229
    :goto_1
    if-eqz v3, :cond_c

    .line 230
    .line 231
    iget-object v12, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    invoke-virtual {v12, v3, v8}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 234
    .line 235
    .line 236
    :cond_c
    iput v5, v0, Lm3/o;->p:F

    .line 237
    .line 238
    :cond_d
    :goto_2
    iget v3, v0, Lm3/o;->w:I

    .line 239
    .line 240
    if-ne v3, v1, :cond_12

    .line 241
    .line 242
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    iget-object v5, v0, Lm3/o;->x:[I

    .line 247
    .line 248
    aput v11, v5, v8

    .line 249
    .line 250
    iget v12, v0, Lm3/o;->r:I

    .line 251
    .line 252
    sub-int/2addr v12, v11

    .line 253
    aput v12, v5, v9

    .line 254
    .line 255
    int-to-float v11, v11

    .line 256
    int-to-float v12, v12

    .line 257
    invoke-static {v12, v3}, Ljava/lang/Math;->min(FF)F

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    invoke-static {v11, v3}, Ljava/lang/Math;->max(FF)F

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    iget v11, v0, Lm3/o;->l:I

    .line 266
    .line 267
    int-to-float v11, v11

    .line 268
    sub-float/2addr v11, v3

    .line 269
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    cmpg-float v10, v11, v10

    .line 274
    .line 275
    if-gez v10, :cond_e

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_e
    iget v10, v0, Lm3/o;->m:F

    .line 279
    .line 280
    iget-object v11, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 281
    .line 282
    invoke-virtual {v11}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    iget-object v12, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    iget v13, v0, Lm3/o;->r:I

    .line 293
    .line 294
    aget v14, v5, v9

    .line 295
    .line 296
    aget v5, v5, v8

    .line 297
    .line 298
    sub-int/2addr v14, v5

    .line 299
    if-nez v14, :cond_10

    .line 300
    .line 301
    :cond_f
    move v5, v8

    .line 302
    goto :goto_3

    .line 303
    :cond_10
    sub-float v5, v3, v10

    .line 304
    .line 305
    int-to-float v10, v14

    .line 306
    div-float/2addr v5, v10

    .line 307
    sub-int/2addr v11, v13

    .line 308
    int-to-float v10, v11

    .line 309
    mul-float/2addr v5, v10

    .line 310
    float-to-int v5, v5

    .line 311
    add-int/2addr v12, v5

    .line 312
    if-ge v12, v11, :cond_f

    .line 313
    .line 314
    if-ltz v12, :cond_f

    .line 315
    .line 316
    :goto_3
    if-eqz v5, :cond_11

    .line 317
    .line 318
    iget-object v10, v0, Lm3/o;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 319
    .line 320
    invoke-virtual {v10, v8, v5}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 321
    .line 322
    .line 323
    :cond_11
    iput v3, v0, Lm3/o;->m:F

    .line 324
    .line 325
    :cond_12
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eq v0, v4, :cond_13

    .line 330
    .line 331
    if-ne v0, v9, :cond_14

    .line 332
    .line 333
    :cond_13
    iput-object v2, v6, Landroidx/recyclerview/widget/RecyclerView;->I:Lm3/n0;

    .line 334
    .line 335
    :cond_14
    move v0, v9

    .line 336
    :goto_5
    if-eqz v0, :cond_15

    .line 337
    .line 338
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 342
    .line 343
    .line 344
    return v9

    .line 345
    :cond_15
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 346
    .line 347
    if-nez v0, :cond_16

    .line 348
    .line 349
    return v8

    .line 350
    :cond_16
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 355
    .line 356
    invoke-virtual {v0}, Lm3/k0;->e()Z

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 361
    .line 362
    if-nez v0, :cond_17

    .line 363
    .line 364
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iput-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 369
    .line 370
    :cond_17
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    iget-object v12, v6, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 379
    .line 380
    if-nez v0, :cond_18

    .line 381
    .line 382
    aput v8, v12, v9

    .line 383
    .line 384
    aput v8, v12, v8

    .line 385
    .line 386
    :cond_18
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 387
    .line 388
    .line 389
    move-result-object v13

    .line 390
    aget v5, v12, v8

    .line 391
    .line 392
    int-to-float v5, v5

    .line 393
    aget v14, v12, v9

    .line 394
    .line 395
    int-to-float v14, v14

    .line 396
    invoke-virtual {v13, v5, v14}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 397
    .line 398
    .line 399
    const/high16 v5, 0x3f000000    # 0.5f

    .line 400
    .line 401
    if-eqz v0, :cond_74

    .line 402
    .line 403
    const-string v14, "RecyclerView"

    .line 404
    .line 405
    if-eq v0, v9, :cond_2b

    .line 406
    .line 407
    if-eq v0, v1, :cond_1c

    .line 408
    .line 409
    if-eq v0, v4, :cond_1b

    .line 410
    .line 411
    const/4 v1, 0x5

    .line 412
    if-eq v0, v1, :cond_1a

    .line 413
    .line 414
    const/4 v1, 0x6

    .line 415
    if-eq v0, v1, :cond_19

    .line 416
    .line 417
    goto/16 :goto_d

    .line 418
    .line 419
    :cond_19
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->T(Landroid/view/MotionEvent;)V

    .line 420
    .line 421
    .line 422
    goto/16 :goto_d

    .line 423
    .line 424
    :cond_1a
    invoke-virtual {v7, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 429
    .line 430
    invoke-virtual {v7, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    add-float/2addr v0, v5

    .line 435
    float-to-int v0, v0

    .line 436
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 437
    .line 438
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 439
    .line 440
    invoke-virtual {v7, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    add-float/2addr v0, v5

    .line 445
    float-to-int v0, v0

    .line 446
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 447
    .line 448
    iput v0, v6, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 449
    .line 450
    goto/16 :goto_d

    .line 451
    .line 452
    :cond_1b
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 456
    .line 457
    .line 458
    goto/16 :goto_d

    .line 459
    .line 460
    :cond_1c
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 461
    .line 462
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-gez v0, :cond_1d

    .line 467
    .line 468
    new-instance v0, Ljava/lang/StringBuilder;

    .line 469
    .line 470
    const-string v1, "Error processing scroll; pointer index for id "

    .line 471
    .line 472
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 476
    .line 477
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    const-string v1, " not found. Did any MotionEvents get skipped?"

    .line 481
    .line 482
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-static {v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    return v8

    .line 493
    :cond_1d
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 494
    .line 495
    .line 496
    move-result v1

    .line 497
    add-float/2addr v1, v5

    .line 498
    float-to-int v14, v1

    .line 499
    invoke-virtual {v7, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    add-float/2addr v0, v5

    .line 504
    float-to-int v15, v0

    .line 505
    iget v0, v6, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 506
    .line 507
    sub-int/2addr v0, v14

    .line 508
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 509
    .line 510
    sub-int/2addr v1, v15

    .line 511
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 512
    .line 513
    if-eq v2, v9, :cond_22

    .line 514
    .line 515
    if-eqz v10, :cond_1f

    .line 516
    .line 517
    if-lez v0, :cond_1e

    .line 518
    .line 519
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 520
    .line 521
    sub-int/2addr v0, v2

    .line 522
    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    goto :goto_6

    .line 527
    :cond_1e
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 528
    .line 529
    add-int/2addr v0, v2

    .line 530
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    :goto_6
    if-eqz v0, :cond_1f

    .line 535
    .line 536
    move v2, v9

    .line 537
    goto :goto_7

    .line 538
    :cond_1f
    move v2, v8

    .line 539
    :goto_7
    if-eqz v11, :cond_21

    .line 540
    .line 541
    if-lez v1, :cond_20

    .line 542
    .line 543
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 544
    .line 545
    sub-int/2addr v1, v3

    .line 546
    invoke-static {v8, v1}, Ljava/lang/Math;->max(II)I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    goto :goto_8

    .line 551
    :cond_20
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 552
    .line 553
    add-int/2addr v1, v3

    .line 554
    invoke-static {v8, v1}, Ljava/lang/Math;->min(II)I

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    :goto_8
    if-eqz v1, :cond_21

    .line 559
    .line 560
    move v2, v9

    .line 561
    :cond_21
    if-eqz v2, :cond_22

    .line 562
    .line 563
    invoke-virtual {v6, v9}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 564
    .line 565
    .line 566
    :cond_22
    iget v2, v6, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 567
    .line 568
    if-ne v2, v9, :cond_2a

    .line 569
    .line 570
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 571
    .line 572
    aput v8, v5, v8

    .line 573
    .line 574
    aput v8, v5, v9

    .line 575
    .line 576
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 577
    .line 578
    .line 579
    move-result v2

    .line 580
    invoke-virtual {v6, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Y(IF)I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    sub-int v16, v0, v2

    .line 585
    .line 586
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    invoke-direct {v6, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Z(IF)I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    sub-int v17, v1, v0

    .line 595
    .line 596
    if-eqz v10, :cond_23

    .line 597
    .line 598
    move/from16 v1, v16

    .line 599
    .line 600
    goto :goto_9

    .line 601
    :cond_23
    move v1, v8

    .line 602
    :goto_9
    if-eqz v11, :cond_24

    .line 603
    .line 604
    move/from16 v2, v17

    .line 605
    .line 606
    goto :goto_a

    .line 607
    :cond_24
    move v2, v8

    .line 608
    :goto_a
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->J0:[I

    .line 609
    .line 610
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    .line 611
    .line 612
    const/16 v18, 0x0

    .line 613
    .line 614
    move-object/from16 v0, p0

    .line 615
    .line 616
    move-object/from16 v19, v3

    .line 617
    .line 618
    move/from16 v3, v18

    .line 619
    .line 620
    move-object/from16 v18, v5

    .line 621
    .line 622
    move-object/from16 v5, v19

    .line 623
    .line 624
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->u(III[I[I)Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->H0:[I

    .line 629
    .line 630
    if-eqz v0, :cond_25

    .line 631
    .line 632
    aget v0, v18, v8

    .line 633
    .line 634
    sub-int v16, v16, v0

    .line 635
    .line 636
    aget v0, v18, v9

    .line 637
    .line 638
    sub-int v17, v17, v0

    .line 639
    .line 640
    aget v0, v12, v8

    .line 641
    .line 642
    aget v2, v1, v8

    .line 643
    .line 644
    add-int/2addr v0, v2

    .line 645
    aput v0, v12, v8

    .line 646
    .line 647
    aget v0, v12, v9

    .line 648
    .line 649
    aget v2, v1, v9

    .line 650
    .line 651
    add-int/2addr v0, v2

    .line 652
    aput v0, v12, v9

    .line 653
    .line 654
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-interface {v0, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 659
    .line 660
    .line 661
    :cond_25
    move/from16 v0, v16

    .line 662
    .line 663
    move/from16 v2, v17

    .line 664
    .line 665
    aget v3, v1, v8

    .line 666
    .line 667
    sub-int/2addr v14, v3

    .line 668
    iput v14, v6, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 669
    .line 670
    aget v1, v1, v9

    .line 671
    .line 672
    sub-int/2addr v15, v1

    .line 673
    iput v15, v6, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 674
    .line 675
    if-eqz v10, :cond_26

    .line 676
    .line 677
    move v1, v0

    .line 678
    goto :goto_b

    .line 679
    :cond_26
    move v1, v8

    .line 680
    :goto_b
    if-eqz v11, :cond_27

    .line 681
    .line 682
    move v3, v2

    .line 683
    goto :goto_c

    .line 684
    :cond_27
    move v3, v8

    .line 685
    :goto_c
    invoke-virtual {v6, v1, v3, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->c0(IILandroid/view/MotionEvent;I)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_28

    .line 690
    .line 691
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    invoke-interface {v1, v9}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 696
    .line 697
    .line 698
    :cond_28
    iget-object v1, v6, Landroidx/recyclerview/widget/RecyclerView;->v0:Lm3/q;

    .line 699
    .line 700
    if-eqz v1, :cond_2a

    .line 701
    .line 702
    if-nez v0, :cond_29

    .line 703
    .line 704
    if-eqz v2, :cond_2a

    .line 705
    .line 706
    :cond_29
    invoke-virtual {v1, v6, v0, v2}, Lm3/q;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 707
    .line 708
    .line 709
    :cond_2a
    :goto_d
    move-object v0, v6

    .line 710
    move-object/from16 v20, v13

    .line 711
    .line 712
    goto/16 :goto_3a

    .line 713
    .line 714
    :cond_2b
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 715
    .line 716
    invoke-virtual {v0, v13}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 717
    .line 718
    .line 719
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 720
    .line 721
    iget v1, v6, Landroidx/recyclerview/widget/RecyclerView;->q0:I

    .line 722
    .line 723
    int-to-float v3, v1

    .line 724
    const/16 v4, 0x3e8

    .line 725
    .line 726
    invoke-virtual {v0, v4, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 727
    .line 728
    .line 729
    if-eqz v10, :cond_2c

    .line 730
    .line 731
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 732
    .line 733
    iget v3, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 734
    .line 735
    invoke-virtual {v0, v3}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    neg-float v0, v0

    .line 740
    goto :goto_e

    .line 741
    :cond_2c
    const/4 v0, 0x0

    .line 742
    :goto_e
    if-eqz v11, :cond_2d

    .line 743
    .line 744
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 745
    .line 746
    iget v4, v6, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 747
    .line 748
    invoke-virtual {v3, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    neg-float v3, v3

    .line 753
    goto :goto_f

    .line 754
    :cond_2d
    const/4 v3, 0x0

    .line 755
    :goto_f
    const/4 v4, 0x0

    .line 756
    cmpl-float v5, v0, v4

    .line 757
    .line 758
    if-nez v5, :cond_2f

    .line 759
    .line 760
    cmpl-float v5, v3, v4

    .line 761
    .line 762
    if-eqz v5, :cond_2e

    .line 763
    .line 764
    goto :goto_10

    .line 765
    :cond_2e
    move-object v0, v6

    .line 766
    move v1, v8

    .line 767
    move-object/from16 v20, v13

    .line 768
    .line 769
    goto/16 :goto_38

    .line 770
    .line 771
    :cond_2f
    :goto_10
    float-to-int v0, v0

    .line 772
    float-to-int v3, v3

    .line 773
    iget-object v4, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 774
    .line 775
    if-nez v4, :cond_30

    .line 776
    .line 777
    const-string v0, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 778
    .line 779
    invoke-static {v14, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 780
    .line 781
    .line 782
    goto :goto_11

    .line 783
    :cond_30
    iget-boolean v5, v6, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 784
    .line 785
    if-eqz v5, :cond_31

    .line 786
    .line 787
    goto :goto_11

    .line 788
    :cond_31
    invoke-virtual {v4}, Lm3/k0;->d()Z

    .line 789
    .line 790
    .line 791
    move-result v4

    .line 792
    iget-object v5, v6, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 793
    .line 794
    invoke-virtual {v5}, Lm3/k0;->e()Z

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    iget v7, v6, Landroidx/recyclerview/widget/RecyclerView;->p0:I

    .line 799
    .line 800
    if-eqz v4, :cond_32

    .line 801
    .line 802
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 803
    .line 804
    .line 805
    move-result v10

    .line 806
    if-ge v10, v7, :cond_33

    .line 807
    .line 808
    :cond_32
    move v0, v8

    .line 809
    :cond_33
    if-eqz v5, :cond_34

    .line 810
    .line 811
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 812
    .line 813
    .line 814
    move-result v10

    .line 815
    if-ge v10, v7, :cond_35

    .line 816
    .line 817
    :cond_34
    move v3, v8

    .line 818
    :cond_35
    if-nez v0, :cond_37

    .line 819
    .line 820
    if-nez v3, :cond_37

    .line 821
    .line 822
    :cond_36
    :goto_11
    move v0, v8

    .line 823
    goto/16 :goto_16

    .line 824
    .line 825
    :cond_37
    if-eqz v0, :cond_3a

    .line 826
    .line 827
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 828
    .line 829
    if-eqz v7, :cond_38

    .line 830
    .line 831
    invoke-static {v7}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 832
    .line 833
    .line 834
    move-result v7

    .line 835
    const/4 v10, 0x0

    .line 836
    cmpl-float v7, v7, v10

    .line 837
    .line 838
    if-eqz v7, :cond_38

    .line 839
    .line 840
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 841
    .line 842
    neg-int v10, v0

    .line 843
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 844
    .line 845
    .line 846
    move-result v11

    .line 847
    invoke-virtual {v6, v7, v10, v11}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/widget/EdgeEffect;II)Z

    .line 848
    .line 849
    .line 850
    move-result v7

    .line 851
    if-eqz v7, :cond_39

    .line 852
    .line 853
    iget-object v0, v6, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 854
    .line 855
    invoke-virtual {v0, v10}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 856
    .line 857
    .line 858
    goto :goto_12

    .line 859
    :cond_38
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 860
    .line 861
    if-eqz v7, :cond_3a

    .line 862
    .line 863
    invoke-static {v7}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 864
    .line 865
    .line 866
    move-result v7

    .line 867
    const/4 v10, 0x0

    .line 868
    cmpl-float v7, v7, v10

    .line 869
    .line 870
    if-eqz v7, :cond_3a

    .line 871
    .line 872
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 873
    .line 874
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 875
    .line 876
    .line 877
    move-result v10

    .line 878
    invoke-virtual {v6, v7, v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/widget/EdgeEffect;II)Z

    .line 879
    .line 880
    .line 881
    move-result v7

    .line 882
    if-eqz v7, :cond_39

    .line 883
    .line 884
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 885
    .line 886
    invoke-virtual {v7, v0}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 887
    .line 888
    .line 889
    :goto_12
    move v0, v8

    .line 890
    :cond_39
    move v7, v0

    .line 891
    move v0, v8

    .line 892
    goto :goto_13

    .line 893
    :cond_3a
    move v7, v8

    .line 894
    :goto_13
    if-eqz v3, :cond_3d

    .line 895
    .line 896
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 897
    .line 898
    if-eqz v10, :cond_3b

    .line 899
    .line 900
    invoke-static {v10}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 901
    .line 902
    .line 903
    move-result v10

    .line 904
    const/4 v11, 0x0

    .line 905
    cmpl-float v10, v10, v11

    .line 906
    .line 907
    if-eqz v10, :cond_3b

    .line 908
    .line 909
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 910
    .line 911
    neg-int v11, v3

    .line 912
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 913
    .line 914
    .line 915
    move-result v12

    .line 916
    invoke-virtual {v6, v10, v11, v12}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/widget/EdgeEffect;II)Z

    .line 917
    .line 918
    .line 919
    move-result v10

    .line 920
    if-eqz v10, :cond_3c

    .line 921
    .line 922
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 923
    .line 924
    invoke-virtual {v3, v11}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 925
    .line 926
    .line 927
    goto :goto_14

    .line 928
    :cond_3b
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 929
    .line 930
    if-eqz v10, :cond_3d

    .line 931
    .line 932
    invoke-static {v10}, Lj5/a;->u(Landroid/widget/EdgeEffect;)F

    .line 933
    .line 934
    .line 935
    move-result v10

    .line 936
    const/4 v11, 0x0

    .line 937
    cmpl-float v10, v10, v11

    .line 938
    .line 939
    if-eqz v10, :cond_3d

    .line 940
    .line 941
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 942
    .line 943
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 944
    .line 945
    .line 946
    move-result v11

    .line 947
    invoke-virtual {v6, v10, v3, v11}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/widget/EdgeEffect;II)Z

    .line 948
    .line 949
    .line 950
    move-result v10

    .line 951
    if-eqz v10, :cond_3c

    .line 952
    .line 953
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 954
    .line 955
    invoke-virtual {v10, v3}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 956
    .line 957
    .line 958
    :goto_14
    move v3, v8

    .line 959
    :cond_3c
    move v10, v8

    .line 960
    goto :goto_15

    .line 961
    :cond_3d
    move v10, v3

    .line 962
    move v3, v8

    .line 963
    :goto_15
    iget-object v11, v6, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 964
    .line 965
    if-nez v7, :cond_3e

    .line 966
    .line 967
    if-eqz v3, :cond_3f

    .line 968
    .line 969
    :cond_3e
    neg-int v12, v1

    .line 970
    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    .line 971
    .line 972
    .line 973
    move-result v7

    .line 974
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    .line 975
    .line 976
    .line 977
    move-result v7

    .line 978
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 979
    .line 980
    .line 981
    move-result v3

    .line 982
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 983
    .line 984
    .line 985
    move-result v3

    .line 986
    invoke-virtual {v11, v7, v3}, Lm3/z0;->a(II)V

    .line 987
    .line 988
    .line 989
    :cond_3f
    if-nez v0, :cond_41

    .line 990
    .line 991
    if-nez v10, :cond_41

    .line 992
    .line 993
    if-nez v7, :cond_40

    .line 994
    .line 995
    if-eqz v3, :cond_36

    .line 996
    .line 997
    :cond_40
    move v0, v9

    .line 998
    :goto_16
    move-object/from16 v20, v13

    .line 999
    .line 1000
    goto/16 :goto_37

    .line 1001
    .line 1002
    :cond_41
    int-to-float v3, v0

    .line 1003
    int-to-float v7, v10

    .line 1004
    invoke-virtual {v6, v3, v7}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v12

    .line 1008
    if-nez v12, :cond_71

    .line 1009
    .line 1010
    if-nez v4, :cond_43

    .line 1011
    .line 1012
    if-eqz v5, :cond_42

    .line 1013
    .line 1014
    goto :goto_17

    .line 1015
    :cond_42
    move v12, v8

    .line 1016
    goto :goto_18

    .line 1017
    :cond_43
    :goto_17
    move v12, v9

    .line 1018
    :goto_18
    invoke-virtual {v6, v3, v7, v12}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 1019
    .line 1020
    .line 1021
    iget-object v3, v6, Landroidx/recyclerview/widget/RecyclerView;->o0:Lm3/m0;

    .line 1022
    .line 1023
    if-eqz v3, :cond_6e

    .line 1024
    .line 1025
    check-cast v3, Lm3/e1;

    .line 1026
    .line 1027
    iget-object v7, v3, Lm3/e1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 1028
    .line 1029
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lm3/k0;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v7

    .line 1033
    if-nez v7, :cond_44

    .line 1034
    .line 1035
    goto :goto_19

    .line 1036
    :cond_44
    iget-object v14, v3, Lm3/e1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 1037
    .line 1038
    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lm3/d0;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v14

    .line 1042
    if-nez v14, :cond_45

    .line 1043
    .line 1044
    :goto_19
    move/from16 v22, v1

    .line 1045
    .line 1046
    move/from16 v24, v4

    .line 1047
    .line 1048
    move-object/from16 v21, v11

    .line 1049
    .line 1050
    move-object/from16 v20, v13

    .line 1051
    .line 1052
    goto/16 :goto_34

    .line 1053
    .line 1054
    :cond_45
    iget-object v14, v3, Lm3/e1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 1055
    .line 1056
    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView;->getMinFlingVelocity()I

    .line 1057
    .line 1058
    .line 1059
    move-result v14

    .line 1060
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    .line 1061
    .line 1062
    .line 1063
    move-result v15

    .line 1064
    if-gt v15, v14, :cond_47

    .line 1065
    .line 1066
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 1067
    .line 1068
    .line 1069
    move-result v15

    .line 1070
    if-le v15, v14, :cond_46

    .line 1071
    .line 1072
    goto :goto_1a

    .line 1073
    :cond_46
    move/from16 v22, v1

    .line 1074
    .line 1075
    move/from16 v24, v4

    .line 1076
    .line 1077
    move-object/from16 v21, v11

    .line 1078
    .line 1079
    move-object/from16 v20, v13

    .line 1080
    .line 1081
    goto/16 :goto_33

    .line 1082
    .line 1083
    :cond_47
    :goto_1a
    instance-of v14, v7, Lm3/v0;

    .line 1084
    .line 1085
    if-nez v14, :cond_48

    .line 1086
    .line 1087
    goto :goto_1e

    .line 1088
    :cond_48
    check-cast v3, Lm3/x;

    .line 1089
    .line 1090
    iget v15, v3, Lm3/x;->d:I

    .line 1091
    .line 1092
    packed-switch v15, :pswitch_data_0

    .line 1093
    .line 1094
    .line 1095
    goto :goto_1b

    .line 1096
    :pswitch_0
    if-nez v14, :cond_49

    .line 1097
    .line 1098
    goto :goto_1c

    .line 1099
    :cond_49
    new-instance v2, Lm3/a0;

    .line 1100
    .line 1101
    iget-object v9, v3, Lm3/e1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 1102
    .line 1103
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v9

    .line 1107
    invoke-direct {v2, v8, v9, v3}, Lm3/a0;-><init>(ILandroid/content/Context;Ljava/lang/Object;)V

    .line 1108
    .line 1109
    .line 1110
    goto :goto_1d

    .line 1111
    :goto_1b
    if-nez v14, :cond_4a

    .line 1112
    .line 1113
    :goto_1c
    const/4 v2, 0x0

    .line 1114
    goto :goto_1d

    .line 1115
    :cond_4a
    new-instance v2, Lm3/a0;

    .line 1116
    .line 1117
    iget-object v9, v3, Lm3/e1;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 1118
    .line 1119
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v9

    .line 1123
    const/4 v8, 0x1

    .line 1124
    invoke-direct {v2, v8, v9, v3}, Lm3/a0;-><init>(ILandroid/content/Context;Ljava/lang/Object;)V

    .line 1125
    .line 1126
    .line 1127
    :goto_1d
    if-nez v2, :cond_4b

    .line 1128
    .line 1129
    :goto_1e
    move/from16 v22, v1

    .line 1130
    .line 1131
    move/from16 v24, v4

    .line 1132
    .line 1133
    move-object/from16 v21, v11

    .line 1134
    .line 1135
    move-object/from16 v20, v13

    .line 1136
    .line 1137
    goto/16 :goto_31

    .line 1138
    .line 1139
    :cond_4b
    const/4 v8, -0x1

    .line 1140
    packed-switch v15, :pswitch_data_1

    .line 1141
    .line 1142
    .line 1143
    move-object/from16 v20, v13

    .line 1144
    .line 1145
    goto/16 :goto_24

    .line 1146
    .line 1147
    :pswitch_1
    if-nez v14, :cond_4c

    .line 1148
    .line 1149
    goto :goto_1f

    .line 1150
    :cond_4c
    invoke-virtual {v7}, Lm3/k0;->z()I

    .line 1151
    .line 1152
    .line 1153
    move-result v9

    .line 1154
    if-nez v9, :cond_4d

    .line 1155
    .line 1156
    goto :goto_1f

    .line 1157
    :cond_4d
    invoke-virtual {v3, v7}, Lm3/x;->c(Lm3/k0;)Landroid/view/View;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v14

    .line 1161
    if-nez v14, :cond_4e

    .line 1162
    .line 1163
    goto :goto_1f

    .line 1164
    :cond_4e
    invoke-static {v14}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1165
    .line 1166
    .line 1167
    move-result v14

    .line 1168
    if-ne v14, v8, :cond_4f

    .line 1169
    .line 1170
    goto :goto_1f

    .line 1171
    :cond_4f
    move-object v15, v7

    .line 1172
    check-cast v15, Lm3/v0;

    .line 1173
    .line 1174
    add-int/lit8 v8, v9, -0x1

    .line 1175
    .line 1176
    invoke-interface {v15, v8}, Lm3/v0;->a(I)Landroid/graphics/PointF;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v15

    .line 1180
    if-nez v15, :cond_50

    .line 1181
    .line 1182
    :goto_1f
    move-object/from16 v20, v13

    .line 1183
    .line 1184
    goto/16 :goto_26

    .line 1185
    .line 1186
    :cond_50
    invoke-virtual {v7}, Lm3/k0;->d()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v17

    .line 1190
    if-eqz v17, :cond_51

    .line 1191
    .line 1192
    move/from16 v17, v8

    .line 1193
    .line 1194
    invoke-virtual {v3, v7}, Lm3/x;->h(Lm3/k0;)Lm3/y;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v8

    .line 1198
    move-object/from16 v20, v13

    .line 1199
    .line 1200
    const/4 v13, 0x0

    .line 1201
    invoke-virtual {v3, v7, v8, v0, v13}, Lm3/x;->f(Lm3/k0;Lm3/y;II)I

    .line 1202
    .line 1203
    .line 1204
    move-result v8

    .line 1205
    iget v13, v15, Landroid/graphics/PointF;->x:F

    .line 1206
    .line 1207
    const/16 v16, 0x0

    .line 1208
    .line 1209
    cmpg-float v13, v13, v16

    .line 1210
    .line 1211
    if-gez v13, :cond_52

    .line 1212
    .line 1213
    neg-int v8, v8

    .line 1214
    goto :goto_20

    .line 1215
    :cond_51
    move/from16 v17, v8

    .line 1216
    .line 1217
    move-object/from16 v20, v13

    .line 1218
    .line 1219
    const/16 v16, 0x0

    .line 1220
    .line 1221
    const/4 v8, 0x0

    .line 1222
    :cond_52
    :goto_20
    invoke-virtual {v7}, Lm3/k0;->e()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v13

    .line 1226
    if-eqz v13, :cond_53

    .line 1227
    .line 1228
    invoke-virtual {v3, v7}, Lm3/x;->i(Lm3/k0;)Lm3/y;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v13

    .line 1232
    move/from16 v21, v8

    .line 1233
    .line 1234
    const/4 v8, 0x0

    .line 1235
    invoke-virtual {v3, v7, v13, v8, v10}, Lm3/x;->f(Lm3/k0;Lm3/y;II)I

    .line 1236
    .line 1237
    .line 1238
    move-result v3

    .line 1239
    iget v8, v15, Landroid/graphics/PointF;->y:F

    .line 1240
    .line 1241
    cmpg-float v8, v8, v16

    .line 1242
    .line 1243
    if-gez v8, :cond_54

    .line 1244
    .line 1245
    neg-int v3, v3

    .line 1246
    goto :goto_21

    .line 1247
    :cond_53
    move/from16 v21, v8

    .line 1248
    .line 1249
    const/4 v3, 0x0

    .line 1250
    :cond_54
    :goto_21
    invoke-virtual {v7}, Lm3/k0;->e()Z

    .line 1251
    .line 1252
    .line 1253
    move-result v8

    .line 1254
    if-eqz v8, :cond_55

    .line 1255
    .line 1256
    move v8, v3

    .line 1257
    goto :goto_22

    .line 1258
    :cond_55
    move/from16 v8, v21

    .line 1259
    .line 1260
    :goto_22
    if-nez v8, :cond_56

    .line 1261
    .line 1262
    goto :goto_26

    .line 1263
    :cond_56
    add-int v3, v8, v14

    .line 1264
    .line 1265
    if-gez v3, :cond_57

    .line 1266
    .line 1267
    const/4 v3, 0x0

    .line 1268
    :cond_57
    if-lt v3, v9, :cond_58

    .line 1269
    .line 1270
    move/from16 v8, v17

    .line 1271
    .line 1272
    goto :goto_23

    .line 1273
    :cond_58
    move v8, v3

    .line 1274
    :goto_23
    move/from16 v22, v1

    .line 1275
    .line 1276
    move/from16 v24, v4

    .line 1277
    .line 1278
    move-object/from16 v21, v11

    .line 1279
    .line 1280
    goto/16 :goto_2e

    .line 1281
    .line 1282
    :goto_24
    invoke-virtual {v7}, Lm3/k0;->z()I

    .line 1283
    .line 1284
    .line 1285
    move-result v8

    .line 1286
    if-nez v8, :cond_59

    .line 1287
    .line 1288
    goto :goto_26

    .line 1289
    :cond_59
    invoke-virtual {v7}, Lm3/k0;->e()Z

    .line 1290
    .line 1291
    .line 1292
    move-result v9

    .line 1293
    if-eqz v9, :cond_5a

    .line 1294
    .line 1295
    invoke-virtual {v3, v7}, Lm3/x;->i(Lm3/k0;)Lm3/y;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v9

    .line 1299
    goto :goto_25

    .line 1300
    :cond_5a
    invoke-virtual {v7}, Lm3/k0;->d()Z

    .line 1301
    .line 1302
    .line 1303
    move-result v9

    .line 1304
    if-eqz v9, :cond_5b

    .line 1305
    .line 1306
    invoke-virtual {v3, v7}, Lm3/x;->h(Lm3/k0;)Lm3/y;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v9

    .line 1310
    goto :goto_25

    .line 1311
    :cond_5b
    const/4 v9, 0x0

    .line 1312
    :goto_25
    if-nez v9, :cond_5c

    .line 1313
    .line 1314
    :goto_26
    move/from16 v22, v1

    .line 1315
    .line 1316
    move/from16 v24, v4

    .line 1317
    .line 1318
    move-object/from16 v21, v11

    .line 1319
    .line 1320
    goto/16 :goto_2f

    .line 1321
    .line 1322
    :cond_5c
    invoke-virtual {v7}, Lm3/k0;->v()I

    .line 1323
    .line 1324
    .line 1325
    move-result v13

    .line 1326
    const/high16 v15, -0x80000000

    .line 1327
    .line 1328
    const v21, 0x7fffffff

    .line 1329
    .line 1330
    .line 1331
    move/from16 v22, v1

    .line 1332
    .line 1333
    move v6, v15

    .line 1334
    move/from16 v1, v21

    .line 1335
    .line 1336
    const/4 v15, 0x0

    .line 1337
    const/16 v17, 0x0

    .line 1338
    .line 1339
    move-object/from16 v21, v11

    .line 1340
    .line 1341
    const/4 v11, 0x0

    .line 1342
    :goto_27
    if-ge v11, v13, :cond_60

    .line 1343
    .line 1344
    move/from16 v23, v13

    .line 1345
    .line 1346
    invoke-virtual {v7, v11}, Lm3/k0;->u(I)Landroid/view/View;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v13

    .line 1350
    if-nez v13, :cond_5d

    .line 1351
    .line 1352
    move/from16 v24, v4

    .line 1353
    .line 1354
    goto :goto_28

    .line 1355
    :cond_5d
    move/from16 v24, v4

    .line 1356
    .line 1357
    invoke-virtual {v3, v13, v9}, Lm3/x;->e(Landroid/view/View;Lm3/y;)I

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    if-gtz v4, :cond_5e

    .line 1362
    .line 1363
    if-le v4, v6, :cond_5e

    .line 1364
    .line 1365
    move v6, v4

    .line 1366
    move-object v15, v13

    .line 1367
    :cond_5e
    if-ltz v4, :cond_5f

    .line 1368
    .line 1369
    if-ge v4, v1, :cond_5f

    .line 1370
    .line 1371
    move v1, v4

    .line 1372
    move-object/from16 v17, v13

    .line 1373
    .line 1374
    :cond_5f
    :goto_28
    add-int/lit8 v11, v11, 0x1

    .line 1375
    .line 1376
    move/from16 v13, v23

    .line 1377
    .line 1378
    move/from16 v4, v24

    .line 1379
    .line 1380
    goto :goto_27

    .line 1381
    :cond_60
    move/from16 v24, v4

    .line 1382
    .line 1383
    invoke-virtual {v7}, Lm3/k0;->d()Z

    .line 1384
    .line 1385
    .line 1386
    move-result v1

    .line 1387
    if-eqz v1, :cond_61

    .line 1388
    .line 1389
    if-lez v0, :cond_62

    .line 1390
    .line 1391
    goto :goto_29

    .line 1392
    :cond_61
    if-lez v10, :cond_62

    .line 1393
    .line 1394
    :goto_29
    const/4 v1, 0x1

    .line 1395
    goto :goto_2a

    .line 1396
    :cond_62
    const/4 v1, 0x0

    .line 1397
    :goto_2a
    if-eqz v1, :cond_64

    .line 1398
    .line 1399
    if-eqz v17, :cond_64

    .line 1400
    .line 1401
    invoke-static/range {v17 .. v17}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1402
    .line 1403
    .line 1404
    move-result v1

    .line 1405
    :cond_63
    :goto_2b
    move v8, v1

    .line 1406
    goto :goto_2e

    .line 1407
    :cond_64
    if-nez v1, :cond_65

    .line 1408
    .line 1409
    if-eqz v15, :cond_65

    .line 1410
    .line 1411
    invoke-static {v15}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1412
    .line 1413
    .line 1414
    move-result v1

    .line 1415
    goto :goto_2b

    .line 1416
    :cond_65
    if-eqz v1, :cond_66

    .line 1417
    .line 1418
    move-object/from16 v17, v15

    .line 1419
    .line 1420
    :cond_66
    if-nez v17, :cond_67

    .line 1421
    .line 1422
    goto :goto_2f

    .line 1423
    :cond_67
    invoke-static/range {v17 .. v17}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1424
    .line 1425
    .line 1426
    move-result v3

    .line 1427
    invoke-virtual {v7}, Lm3/k0;->z()I

    .line 1428
    .line 1429
    .line 1430
    move-result v4

    .line 1431
    if-eqz v14, :cond_69

    .line 1432
    .line 1433
    move-object v6, v7

    .line 1434
    check-cast v6, Lm3/v0;

    .line 1435
    .line 1436
    const/4 v9, 0x1

    .line 1437
    sub-int/2addr v4, v9

    .line 1438
    invoke-interface {v6, v4}, Lm3/v0;->a(I)Landroid/graphics/PointF;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    if-eqz v4, :cond_69

    .line 1443
    .line 1444
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 1445
    .line 1446
    const/4 v9, 0x0

    .line 1447
    cmpg-float v6, v6, v9

    .line 1448
    .line 1449
    if-ltz v6, :cond_68

    .line 1450
    .line 1451
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 1452
    .line 1453
    cmpg-float v4, v4, v9

    .line 1454
    .line 1455
    if-gez v4, :cond_69

    .line 1456
    .line 1457
    :cond_68
    const/4 v4, 0x1

    .line 1458
    goto :goto_2c

    .line 1459
    :cond_69
    const/4 v4, 0x0

    .line 1460
    :goto_2c
    if-ne v4, v1, :cond_6a

    .line 1461
    .line 1462
    const/4 v1, -0x1

    .line 1463
    goto :goto_2d

    .line 1464
    :cond_6a
    const/4 v1, 0x1

    .line 1465
    :goto_2d
    add-int/2addr v1, v3

    .line 1466
    if-ltz v1, :cond_6b

    .line 1467
    .line 1468
    if-lt v1, v8, :cond_63

    .line 1469
    .line 1470
    goto :goto_2f

    .line 1471
    :goto_2e
    const/4 v1, -0x1

    .line 1472
    goto :goto_30

    .line 1473
    :cond_6b
    :goto_2f
    const/4 v1, -0x1

    .line 1474
    const/4 v8, -0x1

    .line 1475
    :goto_30
    if-ne v8, v1, :cond_6c

    .line 1476
    .line 1477
    :goto_31
    const/4 v1, 0x0

    .line 1478
    goto :goto_32

    .line 1479
    :cond_6c
    iput v8, v2, Lm3/w;->a:I

    .line 1480
    .line 1481
    invoke-virtual {v7, v2}, Lm3/k0;->x0(Lm3/w;)V

    .line 1482
    .line 1483
    .line 1484
    const/4 v1, 0x1

    .line 1485
    :goto_32
    if-eqz v1, :cond_6d

    .line 1486
    .line 1487
    const/4 v8, 0x1

    .line 1488
    goto :goto_34

    .line 1489
    :cond_6d
    :goto_33
    const/4 v8, 0x0

    .line 1490
    :goto_34
    if-eqz v8, :cond_6f

    .line 1491
    .line 1492
    goto :goto_36

    .line 1493
    :cond_6e
    move/from16 v22, v1

    .line 1494
    .line 1495
    move/from16 v24, v4

    .line 1496
    .line 1497
    move-object/from16 v21, v11

    .line 1498
    .line 1499
    move-object/from16 v20, v13

    .line 1500
    .line 1501
    :cond_6f
    if-eqz v12, :cond_72

    .line 1502
    .line 1503
    if-eqz v5, :cond_70

    .line 1504
    .line 1505
    or-int/lit8 v4, v24, 0x2

    .line 1506
    .line 1507
    goto :goto_35

    .line 1508
    :cond_70
    move/from16 v4, v24

    .line 1509
    .line 1510
    :goto_35
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    const/4 v2, 0x1

    .line 1515
    invoke-virtual {v1, v4, v2}, Lg0/u;->g(II)Z

    .line 1516
    .line 1517
    .line 1518
    move/from16 v1, v22

    .line 1519
    .line 1520
    neg-int v2, v1

    .line 1521
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 1522
    .line 1523
    .line 1524
    move-result v0

    .line 1525
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 1526
    .line 1527
    .line 1528
    move-result v0

    .line 1529
    invoke-static {v10, v1}, Ljava/lang/Math;->min(II)I

    .line 1530
    .line 1531
    .line 1532
    move-result v1

    .line 1533
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 1534
    .line 1535
    .line 1536
    move-result v1

    .line 1537
    move-object/from16 v2, v21

    .line 1538
    .line 1539
    invoke-virtual {v2, v0, v1}, Lm3/z0;->a(II)V

    .line 1540
    .line 1541
    .line 1542
    :goto_36
    const/4 v0, 0x1

    .line 1543
    goto :goto_37

    .line 1544
    :cond_71
    move-object/from16 v20, v13

    .line 1545
    .line 1546
    :cond_72
    const/4 v0, 0x0

    .line 1547
    :goto_37
    if-nez v0, :cond_73

    .line 1548
    .line 1549
    const/4 v1, 0x0

    .line 1550
    move-object/from16 v0, p0

    .line 1551
    .line 1552
    :goto_38
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 1553
    .line 1554
    .line 1555
    goto :goto_39

    .line 1556
    :cond_73
    move-object/from16 v0, p0

    .line 1557
    .line 1558
    :goto_39
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->b0()V

    .line 1559
    .line 1560
    .line 1561
    const/4 v8, 0x1

    .line 1562
    goto :goto_3b

    .line 1563
    :cond_74
    move-object v0, v6

    .line 1564
    move v1, v8

    .line 1565
    move-object/from16 v20, v13

    .line 1566
    .line 1567
    invoke-virtual {v7, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 1568
    .line 1569
    .line 1570
    move-result v2

    .line 1571
    iput v2, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 1572
    .line 1573
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 1574
    .line 1575
    .line 1576
    move-result v1

    .line 1577
    add-float/2addr v1, v5

    .line 1578
    float-to-int v1, v1

    .line 1579
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 1580
    .line 1581
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:I

    .line 1582
    .line 1583
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 1584
    .line 1585
    .line 1586
    move-result v1

    .line 1587
    add-float/2addr v1, v5

    .line 1588
    float-to-int v1, v1

    .line 1589
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->m0:I

    .line 1590
    .line 1591
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 1592
    .line 1593
    if-eqz v11, :cond_75

    .line 1594
    .line 1595
    or-int/lit8 v10, v10, 0x2

    .line 1596
    .line 1597
    :cond_75
    invoke-direct/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    const/4 v2, 0x0

    .line 1602
    invoke-virtual {v1, v10, v2}, Lg0/u;->g(II)Z

    .line 1603
    .line 1604
    .line 1605
    :goto_3a
    const/4 v8, 0x0

    .line 1606
    :goto_3b
    if-nez v8, :cond_76

    .line 1607
    .line 1608
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroid/view/VelocityTracker;

    .line 1609
    .line 1610
    move-object/from16 v2, v20

    .line 1611
    .line 1612
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1613
    .line 1614
    .line 1615
    goto :goto_3c

    .line 1616
    :cond_76
    move-object/from16 v2, v20

    .line 1617
    .line 1618
    :goto_3c
    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    .line 1619
    .line 1620
    .line 1621
    const/4 v1, 0x1

    .line 1622
    return v1

    .line 1623
    :cond_77
    :goto_3d
    move-object v0, v6

    .line 1624
    move v1, v8

    .line 1625
    return v1

    .line 1626
    nop

    .line 1627
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 2
    .line 3
    const-string v1, "RV FullInvalidate"

    .line 4
    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm3/b;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 23
    .line 24
    iget v2, v0, Lm3/b;->f:I

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    and-int/2addr v3, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x1

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    move v3, v5

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    move v3, v4

    .line 35
    :goto_0
    if-eqz v3, :cond_a

    .line 36
    .line 37
    const/16 v3, 0xb

    .line 38
    .line 39
    and-int/2addr v2, v3

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    move v2, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move v2, v4

    .line 45
    :goto_1
    if-nez v2, :cond_a

    .line 46
    .line 47
    sget v0, Lc0/n;->a:I

    .line 48
    .line 49
    const-string v0, "RV PartialInvalidate"

    .line 50
    .line 51
    invoke-static {v0}, Lc0/m;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 61
    .line 62
    invoke-virtual {v0}, Lm3/b;->j()V

    .line 63
    .line 64
    .line 65
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 66
    .line 67
    if-nez v0, :cond_9

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 70
    .line 71
    invoke-virtual {v0}, Lm3/c;->e()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    move v1, v4

    .line 76
    :goto_2
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 79
    .line 80
    invoke-virtual {v2, v1}, Lm3/c;->d(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    invoke-virtual {v2}, Lm3/a1;->p()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    iget v2, v2, Lm3/a1;->j:I

    .line 98
    .line 99
    and-int/lit8 v2, v2, 0x2

    .line 100
    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    move v2, v5

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    move v2, v4

    .line 106
    :goto_3
    if-eqz v2, :cond_6

    .line 107
    .line 108
    move v4, v5

    .line 109
    goto :goto_5

    .line 110
    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    .line 114
    .line 115
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->r()V

    .line 116
    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 120
    .line 121
    invoke-virtual {v0}, Lm3/b;->b()V

    .line 122
    .line 123
    .line 124
    :cond_9
    :goto_6
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lc0/m;->b()V

    .line 131
    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_a
    invoke-virtual {v0}, Lm3/b;->g()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_b

    .line 139
    .line 140
    sget v0, Lc0/n;->a:I

    .line 141
    .line 142
    invoke-static {v1}, Lc0/m;->a(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->r()V

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lc0/m;->b()V

    .line 149
    .line 150
    .line 151
    :cond_b
    :goto_7
    return-void

    .line 152
    :cond_c
    :goto_8
    sget v0, Lc0/n;->a:I

    .line 153
    .line 154
    invoke-static {v1}, Lc0/m;->a(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->r()V

    .line 158
    .line 159
    .line 160
    invoke-static {}, Lc0/m;->b()V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final q(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    sget-object v0, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-static {p0}, Lg0/h0;->e(Landroid/view/View;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p1, v1, v0}, Lm3/k0;->g(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    invoke-static {p0}, Lg0/h0;->d(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2, v1, v0}, Lm3/k0;->g(III)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final r()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 4
    .line 5
    const-string v2, "RecyclerView"

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "No adapter attached; skipping layout"

    .line 10
    .line 11
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "No layout manager attached; skipping layout"

    .line 20
    .line 21
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    iput-boolean v3, v1, Lm3/w0;->i:Z

    .line 29
    .line 30
    iget-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->M0:Z

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->N0:I

    .line 36
    .line 37
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-ne v4, v6, :cond_2

    .line 42
    .line 43
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->O0:I

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eq v4, v6, :cond_3

    .line 50
    .line 51
    :cond_2
    move v4, v5

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move v4, v3

    .line 54
    :goto_0
    iput v3, v0, Landroidx/recyclerview/widget/RecyclerView;->N0:I

    .line 55
    .line 56
    iput v3, v0, Landroidx/recyclerview/widget/RecyclerView;->O0:I

    .line 57
    .line 58
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->M0:Z

    .line 59
    .line 60
    iget v6, v1, Lm3/w0;->d:I

    .line 61
    .line 62
    if-ne v6, v5, :cond_4

    .line 63
    .line 64
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->s()V

    .line 65
    .line 66
    .line 67
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 68
    .line 69
    invoke-virtual {v4, v0}, Lm3/k0;->o0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 77
    .line 78
    iget-object v7, v6, Lm3/b;->c:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-nez v7, :cond_5

    .line 85
    .line 86
    iget-object v6, v6, Lm3/b;->b:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_5

    .line 93
    .line 94
    move v6, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    move v6, v3

    .line 97
    :goto_1
    if-nez v6, :cond_7

    .line 98
    .line 99
    if-nez v4, :cond_7

    .line 100
    .line 101
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 102
    .line 103
    iget v4, v4, Lm3/k0;->n:I

    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-ne v4, v6, :cond_7

    .line 110
    .line 111
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 112
    .line 113
    iget v4, v4, Lm3/k0;->o:I

    .line 114
    .line 115
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eq v4, v6, :cond_6

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 123
    .line 124
    invoke-virtual {v4, v0}, Lm3/k0;->o0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_7
    :goto_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 129
    .line 130
    invoke-virtual {v4, v0}, Lm3/k0;->o0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->t()V

    .line 134
    .line 135
    .line 136
    :goto_3
    const/4 v4, 0x4

    .line 137
    invoke-virtual {v1, v4}, Lm3/w0;->a(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 144
    .line 145
    .line 146
    iput v5, v1, Lm3/w0;->d:I

    .line 147
    .line 148
    iget-boolean v6, v1, Lm3/w0;->j:Z

    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 152
    .line 153
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->x:Lm3/m1;

    .line 154
    .line 155
    if-eqz v6, :cond_21

    .line 156
    .line 157
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 158
    .line 159
    invoke-virtual {v6}, Lm3/c;->e()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    sub-int/2addr v6, v5

    .line 164
    :goto_4
    if-ltz v6, :cond_16

    .line 165
    .line 166
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 167
    .line 168
    invoke-virtual {v10, v6}, Lm3/c;->d(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-virtual {v10}, Lm3/a1;->p()Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    if-eqz v11, :cond_8

    .line 181
    .line 182
    goto/16 :goto_8

    .line 183
    .line 184
    :cond_8
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->J(Lm3/a1;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v11

    .line 188
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    new-instance v13, Lz1/h;

    .line 194
    .line 195
    invoke-direct {v13}, Lz1/h;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v13, v10}, Lz1/h;->b(Lm3/a1;)V

    .line 199
    .line 200
    .line 201
    iget-object v14, v9, Lm3/m1;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v14, Ln/i;

    .line 204
    .line 205
    invoke-virtual {v14, v7, v11, v12}, Ln/i;->e(Ljava/lang/Long;J)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v14

    .line 209
    check-cast v14, Lm3/a1;

    .line 210
    .line 211
    if-eqz v14, :cond_14

    .line 212
    .line 213
    invoke-virtual {v14}, Lm3/a1;->p()Z

    .line 214
    .line 215
    .line 216
    move-result v15

    .line 217
    if-nez v15, :cond_14

    .line 218
    .line 219
    iget-object v15, v9, Lm3/m1;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v15, Ln/k;

    .line 222
    .line 223
    invoke-virtual {v15, v14, v7}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    check-cast v15, Lm3/l1;

    .line 228
    .line 229
    if-eqz v15, :cond_9

    .line 230
    .line 231
    iget v15, v15, Lm3/l1;->a:I

    .line 232
    .line 233
    and-int/2addr v15, v5

    .line 234
    if-eqz v15, :cond_9

    .line 235
    .line 236
    move v3, v5

    .line 237
    :cond_9
    iget-object v15, v9, Lm3/m1;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v15, Ln/k;

    .line 240
    .line 241
    invoke-virtual {v15, v10, v7}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v15

    .line 245
    check-cast v15, Lm3/l1;

    .line 246
    .line 247
    if-eqz v15, :cond_a

    .line 248
    .line 249
    iget v15, v15, Lm3/l1;->a:I

    .line 250
    .line 251
    and-int/2addr v15, v5

    .line 252
    if-eqz v15, :cond_a

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_a
    const/4 v5, 0x0

    .line 256
    :goto_5
    if-eqz v3, :cond_b

    .line 257
    .line 258
    if-ne v14, v10, :cond_b

    .line 259
    .line 260
    invoke-virtual {v9, v10, v13}, Lm3/m1;->b(Lm3/a1;Lz1/h;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_8

    .line 264
    .line 265
    :cond_b
    invoke-virtual {v9, v14, v4}, Lm3/m1;->k(Lm3/a1;I)Lz1/h;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    invoke-virtual {v9, v10, v13}, Lm3/m1;->b(Lm3/a1;Lz1/h;)V

    .line 270
    .line 271
    .line 272
    const/16 v13, 0x8

    .line 273
    .line 274
    invoke-virtual {v9, v10, v13}, Lm3/m1;->k(Lm3/a1;I)Lz1/h;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    if-nez v15, :cond_10

    .line 279
    .line 280
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 281
    .line 282
    invoke-virtual {v3}, Lm3/c;->e()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    const/4 v5, 0x0

    .line 287
    :goto_6
    if-ge v5, v3, :cond_f

    .line 288
    .line 289
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 290
    .line 291
    invoke-virtual {v13, v5}, Lm3/c;->d(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    if-ne v13, v10, :cond_c

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_c
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->J(Lm3/a1;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v15

    .line 306
    cmp-long v15, v15, v11

    .line 307
    .line 308
    if-nez v15, :cond_e

    .line 309
    .line 310
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 311
    .line 312
    const-string v2, " \n View Holder 2:"

    .line 313
    .line 314
    if-eqz v1, :cond_d

    .line 315
    .line 316
    iget-boolean v1, v1, Lm3/d0;->b:Z

    .line 317
    .line 318
    if-eqz v1, :cond_d

    .line 319
    .line 320
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 321
    .line 322
    new-instance v3, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const-string v4, "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"

    .line 325
    .line 326
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-static {v0, v3}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v1

    .line 346
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    new-instance v3, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    const-string v4, "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"

    .line 351
    .line 352
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v3}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v1

    .line 372
    :cond_e
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 373
    .line 374
    goto :goto_6

    .line 375
    :cond_f
    new-instance v3, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v5, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "

    .line 378
    .line 379
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string v5, " cannot be found but it is necessary for "

    .line 386
    .line 387
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->B()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_10
    const/4 v11, 0x0

    .line 409
    invoke-virtual {v14, v11}, Lm3/a1;->o(Z)V

    .line 410
    .line 411
    .line 412
    if-eqz v3, :cond_11

    .line 413
    .line 414
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->h(Lm3/a1;)V

    .line 415
    .line 416
    .line 417
    :cond_11
    if-eq v14, v10, :cond_13

    .line 418
    .line 419
    if-eqz v5, :cond_12

    .line 420
    .line 421
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->h(Lm3/a1;)V

    .line 422
    .line 423
    .line 424
    :cond_12
    iput-object v10, v14, Lm3/a1;->h:Lm3/a1;

    .line 425
    .line 426
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->h(Lm3/a1;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v8, v14}, La3/h;->m(Lm3/a1;)V

    .line 430
    .line 431
    .line 432
    const/4 v3, 0x0

    .line 433
    invoke-virtual {v10, v3}, Lm3/a1;->o(Z)V

    .line 434
    .line 435
    .line 436
    iput-object v14, v10, Lm3/a1;->i:Lm3/a1;

    .line 437
    .line 438
    :cond_13
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 439
    .line 440
    invoke-virtual {v3, v14, v10, v15, v13}, Lm3/h0;->a(Lm3/a1;Lm3/a1;Lz1/h;Lz1/h;)Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_15

    .line 445
    .line 446
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView;->U()V

    .line 447
    .line 448
    .line 449
    goto :goto_8

    .line 450
    :cond_14
    invoke-virtual {v9, v10, v13}, Lm3/m1;->b(Lm3/a1;Lz1/h;)V

    .line 451
    .line 452
    .line 453
    :cond_15
    :goto_8
    add-int/lit8 v6, v6, -0x1

    .line 454
    .line 455
    const/4 v3, 0x0

    .line 456
    const/4 v5, 0x1

    .line 457
    goto/16 :goto_4

    .line 458
    .line 459
    :cond_16
    iget-object v2, v9, Lm3/m1;->b:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v2, Ln/k;

    .line 462
    .line 463
    iget v2, v2, Ln/k;->c:I

    .line 464
    .line 465
    :goto_9
    add-int/lit8 v2, v2, -0x1

    .line 466
    .line 467
    if-ltz v2, :cond_21

    .line 468
    .line 469
    iget-object v3, v9, Lm3/m1;->b:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v3, Ln/k;

    .line 472
    .line 473
    invoke-virtual {v3, v2}, Ln/k;->h(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    move-object v11, v3

    .line 478
    check-cast v11, Lm3/a1;

    .line 479
    .line 480
    iget-object v3, v9, Lm3/m1;->b:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v3, Ln/k;

    .line 483
    .line 484
    invoke-virtual {v3, v2}, Ln/k;->j(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    check-cast v3, Lm3/l1;

    .line 489
    .line 490
    iget v4, v3, Lm3/l1;->a:I

    .line 491
    .line 492
    and-int/lit8 v5, v4, 0x3

    .line 493
    .line 494
    const/4 v6, 0x3

    .line 495
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->P0:Lm3/c0;

    .line 496
    .line 497
    if-ne v5, v6, :cond_17

    .line 498
    .line 499
    iget-object v4, v10, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 500
    .line 501
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 502
    .line 503
    iget-object v6, v11, Lm3/a1;->a:Landroid/view/View;

    .line 504
    .line 505
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 506
    .line 507
    invoke-virtual {v5, v6, v4}, Lm3/k0;->h0(Landroid/view/View;La3/h;)V

    .line 508
    .line 509
    .line 510
    goto/16 :goto_c

    .line 511
    .line 512
    :cond_17
    and-int/lit8 v5, v4, 0x1

    .line 513
    .line 514
    if-eqz v5, :cond_19

    .line 515
    .line 516
    iget-object v4, v3, Lm3/l1;->b:Lz1/h;

    .line 517
    .line 518
    if-nez v4, :cond_18

    .line 519
    .line 520
    iget-object v4, v10, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 521
    .line 522
    iget-object v5, v4, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 523
    .line 524
    iget-object v6, v11, Lm3/a1;->a:Landroid/view/View;

    .line 525
    .line 526
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 527
    .line 528
    invoke-virtual {v5, v6, v4}, Lm3/k0;->h0(Landroid/view/View;La3/h;)V

    .line 529
    .line 530
    .line 531
    goto/16 :goto_c

    .line 532
    .line 533
    :cond_18
    iget-object v5, v3, Lm3/l1;->c:Lz1/h;

    .line 534
    .line 535
    invoke-virtual {v10, v11, v4, v5}, Lm3/c0;->h(Lm3/a1;Lz1/h;Lz1/h;)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_c

    .line 539
    .line 540
    :cond_19
    and-int/lit8 v5, v4, 0xe

    .line 541
    .line 542
    const/16 v6, 0xe

    .line 543
    .line 544
    if-ne v5, v6, :cond_1a

    .line 545
    .line 546
    iget-object v4, v3, Lm3/l1;->b:Lz1/h;

    .line 547
    .line 548
    iget-object v5, v3, Lm3/l1;->c:Lz1/h;

    .line 549
    .line 550
    invoke-virtual {v10, v11, v4, v5}, Lm3/c0;->g(Lm3/a1;Lz1/h;Lz1/h;)V

    .line 551
    .line 552
    .line 553
    goto :goto_c

    .line 554
    :cond_1a
    and-int/lit8 v5, v4, 0xc

    .line 555
    .line 556
    const/16 v6, 0xc

    .line 557
    .line 558
    if-ne v5, v6, :cond_1e

    .line 559
    .line 560
    iget-object v4, v3, Lm3/l1;->b:Lz1/h;

    .line 561
    .line 562
    iget-object v5, v3, Lm3/l1;->c:Lz1/h;

    .line 563
    .line 564
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    const/4 v6, 0x0

    .line 568
    invoke-virtual {v11, v6}, Lm3/a1;->o(Z)V

    .line 569
    .line 570
    .line 571
    iget-object v6, v10, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 572
    .line 573
    iget-boolean v10, v6, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 574
    .line 575
    if-eqz v10, :cond_1b

    .line 576
    .line 577
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 578
    .line 579
    invoke-virtual {v10, v11, v11, v4, v5}, Lm3/h0;->a(Lm3/a1;Lm3/a1;Lz1/h;Lz1/h;)Z

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eqz v4, :cond_20

    .line 584
    .line 585
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->U()V

    .line 586
    .line 587
    .line 588
    goto :goto_c

    .line 589
    :cond_1b
    iget-object v10, v6, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 590
    .line 591
    check-cast v10, Lm3/j;

    .line 592
    .line 593
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget v12, v4, Lz1/h;->a:I

    .line 597
    .line 598
    iget v14, v5, Lz1/h;->a:I

    .line 599
    .line 600
    if-ne v12, v14, :cond_1d

    .line 601
    .line 602
    iget v13, v4, Lz1/h;->b:I

    .line 603
    .line 604
    iget v15, v5, Lz1/h;->b:I

    .line 605
    .line 606
    if-eq v13, v15, :cond_1c

    .line 607
    .line 608
    goto :goto_a

    .line 609
    :cond_1c
    invoke-virtual {v10, v11}, Lm3/h0;->c(Lm3/a1;)V

    .line 610
    .line 611
    .line 612
    const/4 v4, 0x0

    .line 613
    goto :goto_b

    .line 614
    :cond_1d
    :goto_a
    iget v13, v4, Lz1/h;->b:I

    .line 615
    .line 616
    iget v15, v5, Lz1/h;->b:I

    .line 617
    .line 618
    invoke-virtual/range {v10 .. v15}, Lm3/j;->g(Lm3/a1;IIII)Z

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    :goto_b
    if-eqz v4, :cond_20

    .line 623
    .line 624
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->U()V

    .line 625
    .line 626
    .line 627
    goto :goto_c

    .line 628
    :cond_1e
    and-int/lit8 v5, v4, 0x4

    .line 629
    .line 630
    if-eqz v5, :cond_1f

    .line 631
    .line 632
    iget-object v4, v3, Lm3/l1;->b:Lz1/h;

    .line 633
    .line 634
    invoke-virtual {v10, v11, v4, v7}, Lm3/c0;->h(Lm3/a1;Lz1/h;Lz1/h;)V

    .line 635
    .line 636
    .line 637
    goto :goto_c

    .line 638
    :cond_1f
    and-int/lit8 v4, v4, 0x8

    .line 639
    .line 640
    if-eqz v4, :cond_20

    .line 641
    .line 642
    iget-object v4, v3, Lm3/l1;->b:Lz1/h;

    .line 643
    .line 644
    iget-object v5, v3, Lm3/l1;->c:Lz1/h;

    .line 645
    .line 646
    invoke-virtual {v10, v11, v4, v5}, Lm3/c0;->g(Lm3/a1;Lz1/h;Lz1/h;)V

    .line 647
    .line 648
    .line 649
    :cond_20
    :goto_c
    const/4 v4, 0x0

    .line 650
    iput v4, v3, Lm3/l1;->a:I

    .line 651
    .line 652
    iput-object v7, v3, Lm3/l1;->b:Lz1/h;

    .line 653
    .line 654
    iput-object v7, v3, Lm3/l1;->c:Lz1/h;

    .line 655
    .line 656
    sget-object v4, Lm3/l1;->d:Lp/f;

    .line 657
    .line 658
    invoke-virtual {v4, v3}, Lp/f;->b(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    goto/16 :goto_9

    .line 662
    .line 663
    :cond_21
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 664
    .line 665
    invoke-virtual {v2, v8}, Lm3/k0;->g0(La3/h;)V

    .line 666
    .line 667
    .line 668
    iget v2, v1, Lm3/w0;->e:I

    .line 669
    .line 670
    iput v2, v1, Lm3/w0;->b:I

    .line 671
    .line 672
    const/4 v2, 0x0

    .line 673
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 674
    .line 675
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->U:Z

    .line 676
    .line 677
    iput-boolean v2, v1, Lm3/w0;->j:Z

    .line 678
    .line 679
    iput-boolean v2, v1, Lm3/w0;->k:Z

    .line 680
    .line 681
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 682
    .line 683
    iput-boolean v2, v3, Lm3/k0;->f:Z

    .line 684
    .line 685
    iget-object v3, v8, La3/h;->d:Ljava/lang/Cloneable;

    .line 686
    .line 687
    check-cast v3, Ljava/util/ArrayList;

    .line 688
    .line 689
    if-eqz v3, :cond_22

    .line 690
    .line 691
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 692
    .line 693
    .line 694
    :cond_22
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 695
    .line 696
    iget-boolean v4, v3, Lm3/k0;->k:Z

    .line 697
    .line 698
    if-eqz v4, :cond_23

    .line 699
    .line 700
    iput v2, v3, Lm3/k0;->j:I

    .line 701
    .line 702
    iput-boolean v2, v3, Lm3/k0;->k:Z

    .line 703
    .line 704
    invoke-virtual {v8}, La3/h;->n()V

    .line 705
    .line 706
    .line 707
    :cond_23
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 708
    .line 709
    invoke-virtual {v3, v1}, Lm3/k0;->b0(Lm3/w0;)V

    .line 710
    .line 711
    .line 712
    const/4 v3, 0x1

    .line 713
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v9}, Lm3/m1;->d()V

    .line 720
    .line 721
    .line 722
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->F0:[I

    .line 723
    .line 724
    aget v5, v4, v2

    .line 725
    .line 726
    aget v6, v4, v3

    .line 727
    .line 728
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->F([I)V

    .line 729
    .line 730
    .line 731
    aget v8, v4, v2

    .line 732
    .line 733
    if-ne v8, v5, :cond_25

    .line 734
    .line 735
    aget v4, v4, v3

    .line 736
    .line 737
    if-eq v4, v6, :cond_24

    .line 738
    .line 739
    goto :goto_d

    .line 740
    :cond_24
    move v3, v2

    .line 741
    :cond_25
    :goto_d
    if-eqz v3, :cond_26

    .line 742
    .line 743
    invoke-virtual {v0, v2, v2}, Landroidx/recyclerview/widget/RecyclerView;->w(II)V

    .line 744
    .line 745
    .line 746
    :cond_26
    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->t0:Z

    .line 747
    .line 748
    const-wide/16 v4, -0x1

    .line 749
    .line 750
    if-eqz v3, :cond_38

    .line 751
    .line 752
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 753
    .line 754
    if-eqz v3, :cond_38

    .line 755
    .line 756
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->hasFocus()Z

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-eqz v3, :cond_38

    .line 761
    .line 762
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    const/high16 v6, 0x60000

    .line 767
    .line 768
    if-eq v3, v6, :cond_38

    .line 769
    .line 770
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 771
    .line 772
    .line 773
    move-result v3

    .line 774
    const/high16 v6, 0x20000

    .line 775
    .line 776
    if-ne v3, v6, :cond_27

    .line 777
    .line 778
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    .line 779
    .line 780
    .line 781
    move-result v3

    .line 782
    if-eqz v3, :cond_27

    .line 783
    .line 784
    goto/16 :goto_15

    .line 785
    .line 786
    :cond_27
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isFocused()Z

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    if-nez v3, :cond_28

    .line 791
    .line 792
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 797
    .line 798
    invoke-virtual {v6, v3}, Lm3/c;->j(Landroid/view/View;)Z

    .line 799
    .line 800
    .line 801
    move-result v3

    .line 802
    if-nez v3, :cond_28

    .line 803
    .line 804
    goto/16 :goto_15

    .line 805
    .line 806
    :cond_28
    iget-wide v8, v1, Lm3/w0;->m:J

    .line 807
    .line 808
    cmp-long v3, v8, v4

    .line 809
    .line 810
    if-eqz v3, :cond_2c

    .line 811
    .line 812
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 813
    .line 814
    iget-boolean v3, v3, Lm3/d0;->b:Z

    .line 815
    .line 816
    if-eqz v3, :cond_2c

    .line 817
    .line 818
    if-nez v3, :cond_29

    .line 819
    .line 820
    move-object v10, v7

    .line 821
    goto :goto_f

    .line 822
    :cond_29
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 823
    .line 824
    invoke-virtual {v3}, Lm3/c;->h()I

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    move v6, v2

    .line 829
    move-object v10, v7

    .line 830
    :goto_e
    if-ge v6, v3, :cond_2b

    .line 831
    .line 832
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 833
    .line 834
    invoke-virtual {v11, v6}, Lm3/c;->g(I)Landroid/view/View;

    .line 835
    .line 836
    .line 837
    move-result-object v11

    .line 838
    invoke-static {v11}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 839
    .line 840
    .line 841
    move-result-object v11

    .line 842
    if-eqz v11, :cond_2a

    .line 843
    .line 844
    invoke-virtual {v11}, Lm3/a1;->j()Z

    .line 845
    .line 846
    .line 847
    move-result v12

    .line 848
    if-nez v12, :cond_2a

    .line 849
    .line 850
    iget-wide v12, v11, Lm3/a1;->e:J

    .line 851
    .line 852
    cmp-long v12, v12, v8

    .line 853
    .line 854
    if-nez v12, :cond_2a

    .line 855
    .line 856
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 857
    .line 858
    iget-object v12, v11, Lm3/a1;->a:Landroid/view/View;

    .line 859
    .line 860
    invoke-virtual {v10, v12}, Lm3/c;->j(Landroid/view/View;)Z

    .line 861
    .line 862
    .line 863
    move-result v10

    .line 864
    if-eqz v10, :cond_2d

    .line 865
    .line 866
    move-object v10, v11

    .line 867
    :cond_2a
    add-int/lit8 v6, v6, 0x1

    .line 868
    .line 869
    goto :goto_e

    .line 870
    :cond_2b
    :goto_f
    move-object v11, v10

    .line 871
    goto :goto_10

    .line 872
    :cond_2c
    move-object v11, v7

    .line 873
    :cond_2d
    :goto_10
    if-eqz v11, :cond_2f

    .line 874
    .line 875
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 876
    .line 877
    iget-object v6, v11, Lm3/a1;->a:Landroid/view/View;

    .line 878
    .line 879
    invoke-virtual {v3, v6}, Lm3/c;->j(Landroid/view/View;)Z

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    if-nez v3, :cond_2f

    .line 884
    .line 885
    invoke-virtual {v6}, Landroid/view/View;->hasFocusable()Z

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-nez v3, :cond_2e

    .line 890
    .line 891
    goto :goto_11

    .line 892
    :cond_2e
    move-object v7, v6

    .line 893
    goto :goto_14

    .line 894
    :cond_2f
    :goto_11
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 895
    .line 896
    invoke-virtual {v3}, Lm3/c;->e()I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    if-lez v3, :cond_36

    .line 901
    .line 902
    iget v3, v1, Lm3/w0;->l:I

    .line 903
    .line 904
    const/4 v6, -0x1

    .line 905
    if-eq v3, v6, :cond_30

    .line 906
    .line 907
    move v2, v3

    .line 908
    :cond_30
    invoke-virtual {v1}, Lm3/w0;->b()I

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    move v6, v2

    .line 913
    :goto_12
    if-ge v6, v3, :cond_33

    .line 914
    .line 915
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lm3/a1;

    .line 916
    .line 917
    .line 918
    move-result-object v8

    .line 919
    if-nez v8, :cond_31

    .line 920
    .line 921
    goto :goto_13

    .line 922
    :cond_31
    iget-object v8, v8, Lm3/a1;->a:Landroid/view/View;

    .line 923
    .line 924
    invoke-virtual {v8}, Landroid/view/View;->hasFocusable()Z

    .line 925
    .line 926
    .line 927
    move-result v9

    .line 928
    if-eqz v9, :cond_32

    .line 929
    .line 930
    move-object v7, v8

    .line 931
    goto :goto_14

    .line 932
    :cond_32
    add-int/lit8 v6, v6, 0x1

    .line 933
    .line 934
    goto :goto_12

    .line 935
    :cond_33
    :goto_13
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 936
    .line 937
    .line 938
    move-result v2

    .line 939
    :cond_34
    add-int/lit8 v2, v2, -0x1

    .line 940
    .line 941
    if-ltz v2, :cond_36

    .line 942
    .line 943
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->H(I)Lm3/a1;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    if-nez v3, :cond_35

    .line 948
    .line 949
    goto :goto_14

    .line 950
    :cond_35
    iget-object v3, v3, Lm3/a1;->a:Landroid/view/View;

    .line 951
    .line 952
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 953
    .line 954
    .line 955
    move-result v6

    .line 956
    if-eqz v6, :cond_34

    .line 957
    .line 958
    move-object v7, v3

    .line 959
    :cond_36
    :goto_14
    if-eqz v7, :cond_38

    .line 960
    .line 961
    iget v2, v1, Lm3/w0;->n:I

    .line 962
    .line 963
    int-to-long v8, v2

    .line 964
    cmp-long v3, v8, v4

    .line 965
    .line 966
    if-eqz v3, :cond_37

    .line 967
    .line 968
    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    if-eqz v2, :cond_37

    .line 973
    .line 974
    invoke-virtual {v2}, Landroid/view/View;->isFocusable()Z

    .line 975
    .line 976
    .line 977
    move-result v3

    .line 978
    if-eqz v3, :cond_37

    .line 979
    .line 980
    move-object v7, v2

    .line 981
    :cond_37
    invoke-virtual {v7}, Landroid/view/View;->requestFocus()Z

    .line 982
    .line 983
    .line 984
    :cond_38
    :goto_15
    iput-wide v4, v1, Lm3/w0;->m:J

    .line 985
    .line 986
    const/4 v2, -0x1

    .line 987
    iput v2, v1, Lm3/w0;->l:I

    .line 988
    .line 989
    iput v2, v1, Lm3/w0;->n:I

    .line 990
    .line 991
    return-void
.end method

.method public final removeDetachedView(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Lm3/a1;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v0, Lm3/a1;->j:I

    .line 14
    .line 15
    and-int/lit16 v1, v1, -0x101

    .line 16
    .line 17
    iput v1, v0, Lm3/a1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Lm3/a1;->p()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Called removeDetachedView with a view which is not flagged as tmp detached."

    .line 32
    .line 33
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p2}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 55
    .line 56
    .line 57
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v1, "No ViewHolder found for child: "

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v0}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p2
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    iget-object v0, v0, Lm3/k0;->e:Lm3/w;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, v0, Lm3/w;->e:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v1, v2

    .line 26
    :cond_2
    :goto_1
    if-nez v1, :cond_3

    .line 27
    .line 28
    if-eqz p2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->a0(Landroid/view/View;Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Lm3/k0;->j0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lm3/n0;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 15
    .line 16
    :goto_0
    return-void
.end method

.method public final s()V
    .locals 13

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lm3/w0;->a(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->C(Lm3/w0;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput-boolean v2, v0, Lm3/w0;->i:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Lm3/m1;

    .line 17
    .line 18
    invoke-virtual {v3}, Lm3/m1;->d()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 25
    .line 26
    .line 27
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Z

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v4, v5

    .line 48
    :goto_0
    if-nez v4, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    :goto_1
    move-object v4, v5

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->K(Landroid/view/View;)Lm3/a1;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :goto_2
    const-wide/16 v6, -0x1

    .line 64
    .line 65
    const/4 v8, -0x1

    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    iput-wide v6, v0, Lm3/w0;->m:J

    .line 69
    .line 70
    iput v8, v0, Lm3/w0;->l:I

    .line 71
    .line 72
    iput v8, v0, Lm3/w0;->n:I

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_3
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 76
    .line 77
    iget-boolean v9, v9, Lm3/d0;->b:Z

    .line 78
    .line 79
    if-eqz v9, :cond_4

    .line 80
    .line 81
    iget-wide v6, v4, Lm3/a1;->e:J

    .line 82
    .line 83
    :cond_4
    iput-wide v6, v0, Lm3/w0;->m:J

    .line 84
    .line 85
    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Z

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    invoke-virtual {v4}, Lm3/a1;->j()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    iget v6, v4, Lm3/a1;->d:I

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_6
    iget-object v6, v4, Lm3/a1;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 100
    .line 101
    if-nez v6, :cond_7

    .line 102
    .line 103
    :goto_3
    move v6, v8

    .line 104
    goto :goto_4

    .line 105
    :cond_7
    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/RecyclerView;->I(Lm3/a1;)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    :goto_4
    iput v6, v0, Lm3/w0;->l:I

    .line 110
    .line 111
    iget-object v4, v4, Lm3/a1;->a:Landroid/view/View;

    .line 112
    .line 113
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    :cond_8
    :goto_5
    invoke-virtual {v4}, Landroid/view/View;->isFocused()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-nez v7, :cond_9

    .line 122
    .line 123
    instance-of v7, v4, Landroid/view/ViewGroup;

    .line 124
    .line 125
    if-eqz v7, :cond_9

    .line 126
    .line 127
    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-eqz v7, :cond_9

    .line 132
    .line 133
    check-cast v4, Landroid/view/ViewGroup;

    .line 134
    .line 135
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eq v7, v8, :cond_8

    .line 144
    .line 145
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    goto :goto_5

    .line 150
    :cond_9
    iput v6, v0, Lm3/w0;->n:I

    .line 151
    .line 152
    :goto_6
    iget-boolean v4, v0, Lm3/w0;->j:Z

    .line 153
    .line 154
    if-eqz v4, :cond_a

    .line 155
    .line 156
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Z

    .line 157
    .line 158
    if-eqz v4, :cond_a

    .line 159
    .line 160
    move v4, v1

    .line 161
    goto :goto_7

    .line 162
    :cond_a
    move v4, v2

    .line 163
    :goto_7
    iput-boolean v4, v0, Lm3/w0;->h:Z

    .line 164
    .line 165
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Z

    .line 166
    .line 167
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->A0:Z

    .line 168
    .line 169
    iget-boolean v4, v0, Lm3/w0;->k:Z

    .line 170
    .line 171
    iput-boolean v4, v0, Lm3/w0;->g:Z

    .line 172
    .line 173
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 174
    .line 175
    invoke-virtual {v4}, Lm3/d0;->a()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    iput v4, v0, Lm3/w0;->e:I

    .line 180
    .line 181
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->F0:[I

    .line 182
    .line 183
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->F([I)V

    .line 184
    .line 185
    .line 186
    iget-boolean v4, v0, Lm3/w0;->j:Z

    .line 187
    .line 188
    const/4 v6, 0x2

    .line 189
    if-eqz v4, :cond_e

    .line 190
    .line 191
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 192
    .line 193
    invoke-virtual {v4}, Lm3/c;->e()I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    move v7, v2

    .line 198
    :goto_8
    if-ge v7, v4, :cond_e

    .line 199
    .line 200
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 201
    .line 202
    invoke-virtual {v9, v7}, Lm3/c;->d(I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-virtual {v9}, Lm3/a1;->p()Z

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    if-nez v10, :cond_d

    .line 215
    .line 216
    invoke-virtual {v9}, Lm3/a1;->h()Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    if-eqz v10, :cond_b

    .line 221
    .line 222
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 223
    .line 224
    iget-boolean v10, v10, Lm3/d0;->b:Z

    .line 225
    .line 226
    if-nez v10, :cond_b

    .line 227
    .line 228
    goto :goto_a

    .line 229
    :cond_b
    iget-object v10, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 230
    .line 231
    invoke-static {v9}, Lm3/h0;->b(Lm3/a1;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9}, Lm3/a1;->e()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    new-instance v10, Lz1/h;

    .line 241
    .line 242
    invoke-direct {v10}, Lz1/h;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10, v9}, Lz1/h;->b(Lm3/a1;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v9, v10}, Lm3/m1;->c(Lm3/a1;Lz1/h;)V

    .line 249
    .line 250
    .line 251
    iget-boolean v10, v0, Lm3/w0;->h:Z

    .line 252
    .line 253
    if-eqz v10, :cond_d

    .line 254
    .line 255
    iget v10, v9, Lm3/a1;->j:I

    .line 256
    .line 257
    and-int/2addr v10, v6

    .line 258
    if-eqz v10, :cond_c

    .line 259
    .line 260
    move v10, v1

    .line 261
    goto :goto_9

    .line 262
    :cond_c
    move v10, v2

    .line 263
    :goto_9
    if-eqz v10, :cond_d

    .line 264
    .line 265
    invoke-virtual {v9}, Lm3/a1;->j()Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-nez v10, :cond_d

    .line 270
    .line 271
    invoke-virtual {v9}, Lm3/a1;->p()Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-nez v10, :cond_d

    .line 276
    .line 277
    invoke-virtual {v9}, Lm3/a1;->h()Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    if-nez v10, :cond_d

    .line 282
    .line 283
    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/RecyclerView;->J(Lm3/a1;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v10

    .line 287
    iget-object v12, v3, Lm3/m1;->c:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v12, Ln/i;

    .line 290
    .line 291
    invoke-virtual {v12, v9, v10, v11}, Ln/i;->f(Ljava/lang/Object;J)V

    .line 292
    .line 293
    .line 294
    :cond_d
    :goto_a
    add-int/lit8 v7, v7, 0x1

    .line 295
    .line 296
    goto :goto_8

    .line 297
    :cond_e
    iget-boolean v4, v0, Lm3/w0;->k:Z

    .line 298
    .line 299
    if-eqz v4, :cond_1a

    .line 300
    .line 301
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 302
    .line 303
    invoke-virtual {v4}, Lm3/c;->h()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    move v7, v2

    .line 308
    :goto_b
    if-ge v7, v4, :cond_12

    .line 309
    .line 310
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 311
    .line 312
    invoke-virtual {v9, v7}, Lm3/c;->g(I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    sget-boolean v10, Landroidx/recyclerview/widget/RecyclerView;->Q0:Z

    .line 321
    .line 322
    if-eqz v10, :cond_10

    .line 323
    .line 324
    iget v10, v9, Lm3/a1;->c:I

    .line 325
    .line 326
    if-ne v10, v8, :cond_10

    .line 327
    .line 328
    invoke-virtual {v9}, Lm3/a1;->j()Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-eqz v10, :cond_f

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 336
    .line 337
    new-instance v1, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    const-string v2, "view holder cannot have position -1 unless it is removed"

    .line 340
    .line 341
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-static {p0, v1}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v0

    .line 352
    :cond_10
    :goto_c
    invoke-virtual {v9}, Lm3/a1;->p()Z

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    if-nez v10, :cond_11

    .line 357
    .line 358
    iget v10, v9, Lm3/a1;->d:I

    .line 359
    .line 360
    if-ne v10, v8, :cond_11

    .line 361
    .line 362
    iget v10, v9, Lm3/a1;->c:I

    .line 363
    .line 364
    iput v10, v9, Lm3/a1;->d:I

    .line 365
    .line 366
    :cond_11
    add-int/lit8 v7, v7, 0x1

    .line 367
    .line 368
    goto :goto_b

    .line 369
    :cond_12
    iget-boolean v4, v0, Lm3/w0;->f:Z

    .line 370
    .line 371
    iput-boolean v2, v0, Lm3/w0;->f:Z

    .line 372
    .line 373
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 374
    .line 375
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 376
    .line 377
    invoke-virtual {v7, v8, v0}, Lm3/k0;->a0(La3/h;Lm3/w0;)V

    .line 378
    .line 379
    .line 380
    iput-boolean v4, v0, Lm3/w0;->f:Z

    .line 381
    .line 382
    move v4, v2

    .line 383
    :goto_d
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 384
    .line 385
    invoke-virtual {v7}, Lm3/c;->e()I

    .line 386
    .line 387
    .line 388
    move-result v7

    .line 389
    if-ge v4, v7, :cond_19

    .line 390
    .line 391
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 392
    .line 393
    invoke-virtual {v7, v4}, Lm3/c;->d(I)Landroid/view/View;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v7}, Lm3/a1;->p()Z

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    if-eqz v8, :cond_13

    .line 406
    .line 407
    goto :goto_10

    .line 408
    :cond_13
    iget-object v8, v3, Lm3/m1;->b:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v8, Ln/k;

    .line 411
    .line 412
    invoke-virtual {v8, v7, v5}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    check-cast v8, Lm3/l1;

    .line 417
    .line 418
    if-eqz v8, :cond_14

    .line 419
    .line 420
    iget v8, v8, Lm3/l1;->a:I

    .line 421
    .line 422
    and-int/lit8 v8, v8, 0x4

    .line 423
    .line 424
    if-eqz v8, :cond_14

    .line 425
    .line 426
    move v8, v1

    .line 427
    goto :goto_e

    .line 428
    :cond_14
    move v8, v2

    .line 429
    :goto_e
    if-nez v8, :cond_18

    .line 430
    .line 431
    invoke-static {v7}, Lm3/h0;->b(Lm3/a1;)V

    .line 432
    .line 433
    .line 434
    iget v8, v7, Lm3/a1;->j:I

    .line 435
    .line 436
    and-int/lit16 v8, v8, 0x2000

    .line 437
    .line 438
    if-eqz v8, :cond_15

    .line 439
    .line 440
    move v8, v1

    .line 441
    goto :goto_f

    .line 442
    :cond_15
    move v8, v2

    .line 443
    :goto_f
    iget-object v9, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 444
    .line 445
    invoke-virtual {v7}, Lm3/a1;->e()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    new-instance v9, Lz1/h;

    .line 452
    .line 453
    invoke-direct {v9}, Lz1/h;-><init>()V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v9, v7}, Lz1/h;->b(Lm3/a1;)V

    .line 457
    .line 458
    .line 459
    if-eqz v8, :cond_16

    .line 460
    .line 461
    invoke-virtual {p0, v7, v9}, Landroidx/recyclerview/widget/RecyclerView;->X(Lm3/a1;Lz1/h;)V

    .line 462
    .line 463
    .line 464
    goto :goto_10

    .line 465
    :cond_16
    iget-object v8, v3, Lm3/m1;->b:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v8, Ln/k;

    .line 468
    .line 469
    invoke-virtual {v8, v7, v5}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v8

    .line 473
    check-cast v8, Lm3/l1;

    .line 474
    .line 475
    if-nez v8, :cond_17

    .line 476
    .line 477
    invoke-static {}, Lm3/l1;->a()Lm3/l1;

    .line 478
    .line 479
    .line 480
    move-result-object v8

    .line 481
    iget-object v10, v3, Lm3/m1;->b:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v10, Ln/k;

    .line 484
    .line 485
    invoke-virtual {v10, v7, v8}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    :cond_17
    iget v7, v8, Lm3/l1;->a:I

    .line 489
    .line 490
    or-int/2addr v7, v6

    .line 491
    iput v7, v8, Lm3/l1;->a:I

    .line 492
    .line 493
    iput-object v9, v8, Lm3/l1;->b:Lz1/h;

    .line 494
    .line 495
    :cond_18
    :goto_10
    add-int/lit8 v4, v4, 0x1

    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 499
    .line 500
    .line 501
    goto :goto_11

    .line 502
    :cond_1a
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 503
    .line 504
    .line 505
    :goto_11
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 509
    .line 510
    .line 511
    iput v6, v0, Lm3/w0;->d:I

    .line 512
    .line 513
    return-void
.end method

.method public final scrollBy(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v0}, Lm3/k0;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 23
    .line 24
    invoke-virtual {v1}, Lm3/k0;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    :cond_2
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    move p1, v2

    .line 37
    :goto_0
    if-eqz v1, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    move p2, v2

    .line 41
    :goto_1
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, p1, p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->c0(IILandroid/view/MotionEvent;I)Z

    .line 43
    .line 44
    .line 45
    :cond_5
    return-void
.end method

.method public final scrollTo(II)V
    .locals 0

    .line 1
    const-string p1, "RecyclerView"

    .line 2
    .line 3
    const-string p2, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lh0/b;->a(Landroid/view/accessibility/AccessibilityEvent;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v1, v0

    .line 20
    :goto_1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    :cond_2
    if-eqz v1, :cond_3

    .line 27
    .line 28
    return-void

    .line 29
    :cond_3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public setAccessibilityDelegateCompat(Lm3/c1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E0:Lm3/c1;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lg0/y0;->l(Landroid/view/View;Lg0/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdapter(Lm3/d0;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b:Lm3/s0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lm3/d0;->a:Lm3/e0;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Lm3/h0;->e()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 29
    .line 30
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Lm3/k0;->f0(La3/h;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Lm3/k0;->g0(La3/h;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v1, v3, La3/h;->c:Ljava/lang/Cloneable;

    .line 43
    .line 44
    check-cast v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, La3/h;->g()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 53
    .line 54
    iget-object v4, v1, Lm3/b;->b:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Lm3/b;->l(Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v1, Lm3/b;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Lm3/b;->l(Ljava/util/ArrayList;)V

    .line 62
    .line 63
    .line 64
    iput v0, v1, Lm3/b;->f:I

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 67
    .line 68
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p1, Lm3/d0;->a:Lm3/e0;

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1}, Lm3/k0;->O()V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 85
    .line 86
    iget-object v2, v3, La3/h;->c:Ljava/lang/Cloneable;

    .line 87
    .line 88
    check-cast v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, La3/h;->g()V

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-virtual {v3, v1, v2}, La3/h;->f(Lm3/d0;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, La3/h;->c()Lm3/q0;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    iget v1, v4, Lm3/q0;->b:I

    .line 107
    .line 108
    add-int/lit8 v1, v1, -0x1

    .line 109
    .line 110
    iput v1, v4, Lm3/q0;->b:I

    .line 111
    .line 112
    :cond_5
    iget v1, v4, Lm3/q0;->b:I

    .line 113
    .line 114
    if-nez v1, :cond_7

    .line 115
    .line 116
    move v1, v0

    .line 117
    :goto_0
    iget-object v5, v4, Lm3/q0;->a:Landroid/util/SparseArray;

    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-ge v1, v6, :cond_7

    .line 124
    .line 125
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    check-cast v5, Lm3/p0;

    .line 130
    .line 131
    iget-object v6, v5, Lm3/p0;->a:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_6

    .line 142
    .line 143
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    check-cast v7, Lm3/a1;

    .line 148
    .line 149
    iget-object v7, v7, Lm3/a1;->a:Landroid/view/View;

    .line 150
    .line 151
    invoke-static {v7}, Lz7/c;->c(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    iget-object v5, v5, Lm3/p0;->a:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v1, v1, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_7
    if-eqz p1, :cond_8

    .line 164
    .line 165
    iget p1, v4, Lm3/q0;->b:I

    .line 166
    .line 167
    add-int/2addr p1, v2

    .line 168
    iput p1, v4, Lm3/q0;->b:I

    .line 169
    .line 170
    :cond_8
    invoke-virtual {v3}, La3/h;->e()V

    .line 171
    .line 172
    .line 173
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 174
    .line 175
    iput-boolean v2, p1, Lm3/w0;->f:Z

    .line 176
    .line 177
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->W(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public setChildDrawingOrderCallback(Lm3/f0;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(Lm3/g0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemAnimator(Lm3/h0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lm3/h0;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Lm3/h0;->a:Lm3/c0;

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C0:Lm3/c0;

    .line 18
    .line 19
    iput-object v0, p1, Lm3/h0;->a:Lm3/c0;

    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 2
    .line 3
    iput p1, v0, La3/h;->a:I

    .line 4
    .line 5
    invoke-virtual {v0}, La3/h;->n()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setLayoutManager(Lm3/k0;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 11
    .line 12
    iget-object v2, v1, Lm3/z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Lm3/k0;->e:Lm3/w;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Lm3/w;->i()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Lm3/h0;->e()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Lm3/k0;->f0(La3/h;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lm3/k0;->g0(La3/h;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v2, La3/h;->c:Ljava/lang/Cloneable;

    .line 57
    .line 58
    check-cast v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, La3/h;->g()V

    .line 64
    .line 65
    .line 66
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 71
    .line 72
    iput-boolean v0, v1, Lm3/k0;->g:Z

    .line 73
    .line 74
    invoke-virtual {v1, p0}, Lm3/k0;->P(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-virtual {v1, v3}, Lm3/k0;->s0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 81
    .line 82
    .line 83
    iput-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget-object v1, v2, La3/h;->c:Ljava/lang/Cloneable;

    .line 87
    .line 88
    check-cast v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, La3/h;->g()V

    .line 94
    .line 95
    .line 96
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->f:Lm3/c;

    .line 97
    .line 98
    iget-object v3, v1, Lm3/c;->b:Lk2/c;

    .line 99
    .line 100
    invoke-virtual {v3}, Lk2/c;->g()V

    .line 101
    .line 102
    .line 103
    iget-object v3, v1, Lm3/c;->c:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    :goto_1
    add-int/lit8 v4, v4, -0x1

    .line 110
    .line 111
    iget-object v5, v1, Lm3/c;->a:Lm3/c0;

    .line 112
    .line 113
    if-ltz v4, :cond_7

    .line 114
    .line 115
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Landroid/view/View;

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    iget v7, v6, Lm3/a1;->p:I

    .line 131
    .line 132
    iget-object v5, v5, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->N()Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_5

    .line 139
    .line 140
    iput v7, v6, Lm3/a1;->q:I

    .line 141
    .line 142
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->K0:Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    sget-object v5, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 149
    .line 150
    iget-object v5, v6, Lm3/a1;->a:Landroid/view/View;

    .line 151
    .line 152
    invoke-static {v5, v7}, Lg0/h0;->s(Landroid/view/View;I)V

    .line 153
    .line 154
    .line 155
    :goto_2
    iput v0, v6, Lm3/a1;->p:I

    .line 156
    .line 157
    :cond_6
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_7
    invoke-virtual {v5}, Lm3/c0;->c()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    :goto_3
    iget-object v3, v5, Lm3/c0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 166
    .line 167
    if-ge v0, v1, :cond_8

    .line 168
    .line 169
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->L(Landroid/view/View;)Lm3/a1;

    .line 177
    .line 178
    .line 179
    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 180
    .line 181
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 182
    .line 183
    .line 184
    add-int/lit8 v0, v0, 0x1

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 188
    .line 189
    .line 190
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 191
    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    iget-object v0, p1, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 195
    .line 196
    if-nez v0, :cond_9

    .line 197
    .line 198
    invoke-virtual {p1, p0}, Lm3/k0;->s0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 199
    .line 200
    .line 201
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 202
    .line 203
    if-eqz p1, :cond_a

    .line 204
    .line 205
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 206
    .line 207
    const/4 v0, 0x1

    .line 208
    iput-boolean v0, p1, Lm3/k0;->g:Z

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 212
    .line 213
    new-instance v1, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v2, "LayoutManager "

    .line 216
    .line 217
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v2, " is already attached to a RecyclerView:"

    .line 224
    .line 225
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    iget-object p1, p1, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 229
    .line 230
    invoke-static {p1, v1}, La3/g;->m(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw v0

    .line 238
    :cond_a
    :goto_4
    invoke-virtual {v2}, La3/h;->n()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, v0, Lg0/u;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v1, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    iget-object v1, v0, Lg0/u;->c:Landroid/view/View;

    .line 12
    .line 13
    invoke-static {v1}, Lg0/n0;->z(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, v0, Lg0/u;->d:Z

    .line 17
    .line 18
    return-void
.end method

.method public setOnFlingListener(Lm3/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->o0:Lm3/m0;

    .line 2
    .line 3
    return-void
.end method

.method public setOnScrollListener(Lm3/o0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Lm3/o0;

    .line 2
    .line 3
    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRecycledViewPool(Lm3/q0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 2
    .line 3
    iget-object v1, v0, La3/h;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, La3/h;->f(Lm3/d0;Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La3/h;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lm3/q0;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget v2, v1, Lm3/q0;->b:I

    .line 20
    .line 21
    add-int/lit8 v2, v2, -0x1

    .line 22
    .line 23
    iput v2, v1, Lm3/q0;->b:I

    .line 24
    .line 25
    :cond_0
    iput-object p1, v0, La3/h;->g:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, v0, La3/h;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lm3/d0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, La3/h;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lm3/q0;

    .line 42
    .line 43
    iget v1, p1, Lm3/q0;->b:I

    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    iput v1, p1, Lm3/q0;->b:I

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, La3/h;->e()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setRecyclerListener(Lm3/r0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public setScrollState(I)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->R0:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string v0, "setting scroll state to "

    .line 11
    .line 12
    const-string v1, " from "

    .line 13
    .line 14
    invoke-static {v0, p1, v1}, La3/g;->u(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/Exception;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "RecyclerView"

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :cond_1
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-eq p1, v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 43
    .line 44
    iget-object v1, v0, Lm3/z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, Lm3/k0;->e:Lm3/w;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0}, Lm3/w;->i()V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lm3/k0;->e0(I)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Lm3/o0;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {v0, p0, p1}, Lm3/o0;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 88
    .line 89
    if-ltz v0, :cond_5

    .line 90
    .line 91
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Lm3/o0;

    .line 98
    .line 99
    invoke-virtual {v1, p0, p1}, Lm3/o0;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "setScrollingTouchSlop(): bad argument constant "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "; using default value"

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "RecyclerView"

    .line 34
    .line 35
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->n0:I

    .line 51
    .line 52
    :goto_1
    return-void
.end method

.method public setViewCacheExtension(Lm3/y0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 2
    .line 3
    iput-object p1, v0, La3/h;->h:Ljava/lang/Object;

    .line 4
    .line 5
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Lg0/u;->g(II)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lg0/u;->h(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final suppressLayout(Z)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    const-string v0, "Do not suppressLayout in layout or scroll"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->k(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 14
    .line 15
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Z

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    move-wide v1, v3

    .line 42
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 51
    .line 52
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Lm3/z0;

    .line 58
    .line 59
    iget-object v0, p1, Lm3/z0;->x:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lm3/z0;->c:Landroid/widget/OverScroller;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Lm3/k0;->e:Lm3/w;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Lm3/w;->i()V

    .line 78
    .line 79
    .line 80
    :cond_2
    :goto_0
    return-void
.end method

.method public final t()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->h0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->R()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Lm3/w0;

    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-virtual {v0, v1}, Lm3/w0;->a(I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lm3/b;

    .line 14
    .line 15
    invoke-virtual {v1}, Lm3/b;->c()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 19
    .line 20
    invoke-virtual {v1}, Lm3/d0;->a()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, Lm3/w0;->e:I

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput v1, v0, Lm3/w0;->c:I

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lm3/t0;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Lm3/d0;

    .line 35
    .line 36
    iget v4, v2, Lm3/d0;->c:I

    .line 37
    .line 38
    invoke-static {v4}, Lp/j;->b(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eq v4, v3, :cond_0

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    if-eq v4, v2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2}, Lm3/d0;->a()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-lez v2, :cond_1

    .line 53
    .line 54
    :goto_0
    move v2, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v2, v1

    .line 57
    :goto_1
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lm3/t0;

    .line 60
    .line 61
    iget-object v2, v2, Lm3/t0;->c:Landroid/os/Parcelable;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 66
    .line 67
    invoke-virtual {v4, v2}, Lm3/k0;->c0(Landroid/os/Parcelable;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    const/4 v2, 0x0

    .line 71
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lm3/t0;

    .line 72
    .line 73
    :cond_3
    iput-boolean v1, v0, Lm3/w0;->g:Z

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Lm3/k0;

    .line 76
    .line 77
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->c:La3/h;

    .line 78
    .line 79
    invoke-virtual {v2, v4, v0}, Lm3/k0;->a0(La3/h;Lm3/w0;)V

    .line 80
    .line 81
    .line 82
    iput-boolean v1, v0, Lm3/w0;->f:Z

    .line 83
    .line 84
    iget-boolean v2, v0, Lm3/w0;->j:Z

    .line 85
    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:Lm3/h0;

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    move v2, v3

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    move v2, v1

    .line 95
    :goto_2
    iput-boolean v2, v0, Lm3/w0;->j:Z

    .line 96
    .line 97
    const/4 v2, 0x4

    .line 98
    iput v2, v0, Lm3/w0;->d:I

    .line 99
    .line 100
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->S(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->i0(Z)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final u(III[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lg0/u;->c(III[I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final v(IIII[II[I)V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lg0/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    move v6, p6

    .line 11
    move-object v7, p7

    .line 12
    invoke-virtual/range {v0 .. v7}, Lg0/u;->e(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final w(II)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int v2, v0, p1

    .line 16
    .line 17
    sub-int v3, v1, p2

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->onScrollChanged(IIII)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Lm3/o0;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1, p2}, Lm3/o0;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    if-ltz v0, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lm3/o0;

    .line 48
    .line 49
    invoke-virtual {v1, p0, p1, p2}, Lm3/o0;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 54
    .line 55
    add-int/lit8 p1, p1, -0x1

    .line 56
    .line 57
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:I

    .line 58
    .line 59
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 7
    .line 8
    check-cast v0, Lm3/x0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
.end method

.method public final y()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 7
    .line 8
    check-cast v0, Lm3/x0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
.end method

.method public final z()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Lm3/g0;

    .line 7
    .line 8
    check-cast v0, Lm3/x0;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/widget/EdgeEffect;

    .line 23
    .line 24
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->y:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr v1, v2

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v2, v3

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 69
    .line 70
    .line 71
    :goto_0
    return-void
.end method
