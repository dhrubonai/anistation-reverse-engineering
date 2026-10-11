.class public final Landroidx/appcompat/widget/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 8
    const-class v0, Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 10
    iput-object v1, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 11
    iput-object v1, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 12
    invoke-static {}, Landroidx/appcompat/widget/o3;->o()V

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    const-string v3, "doBeforeTextChanged"

    new-array v4, v1, [Ljava/lang/Class;

    .line 13
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 14
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v3, "doAfterTextChanged"

    new-array v4, v1, [Ljava/lang/Class;

    .line 15
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    iput-object v3, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 16
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    const-string v3, "ensureImeVisible"

    new-array v4, v2, [Ljava/lang/Class;

    .line 17
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v5, v4, v1

    .line 18
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lmsr/pistream/app/ui/player/PlayerActivity;Landroid/os/Handler;Ln8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    return-void
.end method

.method public static m(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/appcompat/widget/o3;
    .locals 2

    .line 1
    new-instance v0, Landroidx/appcompat/widget/o3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, Landroidx/appcompat/widget/o3;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static o()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedClassVersionError;

    .line 9
    .line 10
    const-string v1, "This function can only be used for API Level < 29."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedClassVersionError;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method


# virtual methods
.method public a(IZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/content/res/TypedArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {v2, v1}, Lx/j;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    check-cast v0, Landroid/content/res/TypedArray;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public c(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public d(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public e(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Landroid/content/res/TypedArray;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {p1, v1}, Lw7/b;->G(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    check-cast v0, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public f(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Landroidx/appcompat/widget/x;->a()Landroidx/appcompat/widget/x;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Landroidx/appcompat/widget/x;->a:Landroidx/appcompat/widget/y2;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Landroidx/appcompat/widget/y2;->g(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public g(IILandroidx/appcompat/widget/y0;)Landroid/graphics/Typeface;
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/util/TypedValue;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/util/TypedValue;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Landroid/util/TypedValue;

    .line 36
    .line 37
    sget-object v0, Ly/p;->a:Ljava/lang/ThreadLocal;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    move v5, p2

    .line 49
    move-object v6, p3

    .line 50
    invoke-static/range {v2 .. v8}, Ly/p;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILz7/c;ZZ)Landroid/graphics/Typeface;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_0
    return-object p1
.end method

.method public h(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public i(II)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public j(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public k(I)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public l(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public n(Ljava/lang/String;ZLn8/h;)Landroid/widget/LinearLayout;
    .locals 7

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/content/Context;

    .line 22
    .line 23
    const/16 v3, 0x12

    .line 24
    .line 25
    const/4 v4, -0x1

    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-static {v2, p1, v3, v4, v5}, Lw8/i;->l(Landroid/content/Context;Ljava/lang/String;III)Landroid/widget/TextView;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 32
    .line 33
    const/4 v3, -0x2

    .line 34
    const/high16 v6, 0x3f800000    # 1.0f

    .line 35
    .line 36
    invoke-direct {v2, v1, v3, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Landroid/widget/Switch;

    .line 43
    .line 44
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Landroid/content/Context;

    .line 47
    .line 48
    invoke-direct {p1, v2}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 55
    .line 56
    invoke-direct {p2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lw8/i;->d(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    new-instance p2, Ln8/i;

    .line 69
    .line 70
    invoke-direct {p2, p1, v5}, Ln8/i;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    new-instance p2, Ln8/k;

    .line 77
    .line 78
    invoke-direct {p2, p3}, Ln8/k;-><init>(Ln8/h;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    .line 86
    iget-object p2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p2, Landroid/content/Context;

    .line 89
    .line 90
    const/16 p3, 0x42

    .line 91
    .line 92
    invoke-static {p2, p3}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-direct {p1, v4, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 97
    .line 98
    .line 99
    iget-object p2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Landroid/content/Context;

    .line 102
    .line 103
    const/16 p3, 0x8

    .line 104
    .line 105
    invoke-static {p2, p3}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v2, Landroid/content/Context;

    .line 112
    .line 113
    invoke-static {v2, p3}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    invoke-virtual {p1, v1, p2, v1, p3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public p()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Landroid/widget/PopupWindow;Landroid/widget/LinearLayout;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "showPopup children="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "PlayerUI"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ln8/a;

    .line 37
    .line 38
    invoke-virtual {v2}, Ln8/a;->a()V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Landroid/content/Context;

    .line 44
    .line 45
    check-cast v2, Landroid/app/Activity;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const/4 v3, 0x5

    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {p1, v2, v3, v4, v4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Ln8/l;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Ln8/l;-><init>(Landroidx/appcompat/widget/o3;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 66
    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object p1, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ln8/a;

    .line 73
    .line 74
    iget v2, p1, Ln8/a;->a:I

    .line 75
    .line 76
    iget-object p1, p1, Ln8/a;->b:Lmsr/pistream/app/ui/player/PlayerActivity;

    .line 77
    .line 78
    packed-switch v2, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_0
    iget-object p1, p1, Lmsr/pistream/app/ui/player/PlayerActivity;->A:Lz3/e;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :goto_0
    iget-object p1, p1, Lmsr/pistream/app/ui/player/PlayerActivity;->A:Lz3/e;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    :goto_1
    const/16 p1, 0x1706

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 96
    .line 97
    .line 98
    :cond_1
    if-eqz v0, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const/high16 v2, 0x3f800000    # 1.0f

    .line 105
    .line 106
    invoke-virtual {p1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-wide/16 v2, 0x78

    .line 111
    .line 112
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 117
    .line 118
    .line 119
    instance-of p1, v0, Landroid/widget/FrameLayout;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    check-cast v0, Landroid/widget/FrameLayout;

    .line 124
    .line 125
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-lez p1, :cond_2

    .line 130
    .line 131
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    const-wide/16 v0, 0xd2

    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 150
    .line 151
    .line 152
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/o3;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Landroid/os/Handler;

    .line 155
    .line 156
    iget-object v0, p0, Landroidx/appcompat/widget/o3;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ln8/a;

    .line 159
    .line 160
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    new-instance v1, Ln8/m;

    .line 164
    .line 165
    const/4 v2, 0x2

    .line 166
    invoke-direct {v1, v0, v2}, Ln8/m;-><init>(Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    const-wide/16 v2, 0x50

    .line 170
    .line 171
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 172
    .line 173
    .line 174
    new-instance p1, Ln8/m;

    .line 175
    .line 176
    invoke-direct {p1, p2, v4}, Ln8/m;-><init>(Ljava/lang/Object;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public r(Landroid/widget/PopupWindow;I)Landroid/widget/LinearLayout;
    .locals 10

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/high16 v1, 0x66000000

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Ln8/i;

    .line 23
    .line 24
    invoke-direct {v2, p1, v1}, Ln8/i;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, Landroid/widget/ScrollView;

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Landroid/content/Context;

    .line 35
    .line 36
    invoke-direct {v2, v3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Landroid/content/Context;

    .line 51
    .line 52
    const/16 v4, 0x14

    .line 53
    .line 54
    invoke-static {v3, v4}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v2, v1, v1, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 59
    .line 60
    .line 61
    sget v3, Lw8/i;->c:I

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 64
    .line 65
    .line 66
    new-instance v3, Landroid/widget/LinearLayout;

    .line 67
    .line 68
    iget-object v5, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, Landroid/content/Context;

    .line 71
    .line 72
    invoke-direct {v3, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 77
    .line 78
    .line 79
    iget-object v6, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Landroid/content/Context;

    .line 82
    .line 83
    const/16 v7, 0x1c

    .line 84
    .line 85
    invoke-static {v6, v7}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    iget-object v8, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v8, Landroid/content/Context;

    .line 92
    .line 93
    const/16 v9, 0x22

    .line 94
    .line 95
    invoke-static {v8, v9}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    iget-object v9, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v9, Landroid/content/Context;

    .line 102
    .line 103
    invoke-static {v9, v7}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    iget-object v9, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v9, Landroid/content/Context;

    .line 110
    .line 111
    invoke-static {v9, v4}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v3, v6, v8, v7, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 116
    .line 117
    .line 118
    new-instance v4, Ln8/j;

    .line 119
    .line 120
    invoke-direct {v4, v1}, Ln8/j;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 127
    .line 128
    const/4 v6, -0x1

    .line 129
    const/4 v7, -0x2

    .line 130
    invoke-direct {v4, v6, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 134
    .line 135
    .line 136
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 137
    .line 138
    iget-object v7, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v7, Landroid/content/Context;

    .line 141
    .line 142
    invoke-static {v7, p2}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    const/4 v8, 0x5

    .line 147
    invoke-direct {v4, v7, v6, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 151
    .line 152
    .line 153
    iget-object v4, p0, Landroidx/appcompat/widget/o3;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v4, Landroid/content/Context;

    .line 156
    .line 157
    invoke-static {v4, p2}, Lw8/i;->e(Landroid/content/Context;I)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    int-to-float p2, p2

    .line 162
    invoke-virtual {v2, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 181
    .line 182
    .line 183
    const/4 p2, 0x2

    .line 184
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 185
    .line 186
    .line 187
    const/16 p2, 0x30

    .line 188
    .line 189
    invoke-virtual {p1, p2}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 190
    .line 191
    .line 192
    return-object v3
.end method
