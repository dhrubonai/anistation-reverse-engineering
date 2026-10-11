.class public abstract Lcom/google/android/material/timepicker/f;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final H:Lcom/google/android/material/timepicker/e;

.field public I:I

.field public J:Lj6/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    const v0, 0x7f0402dd

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const v2, 0x7f0d0044

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lj6/g;

    .line 18
    .line 19
    invoke-direct {v1}, Lj6/g;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lcom/google/android/material/timepicker/f;->J:Lj6/g;

    .line 23
    .line 24
    new-instance v2, Lj6/h;

    .line 25
    .line 26
    const/high16 v3, 0x3f000000    # 0.5f

    .line 27
    .line 28
    invoke-direct {v2, v3}, Lj6/h;-><init>(F)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v1, Lj6/g;->a:Lj6/f;

    .line 32
    .line 33
    iget-object v3, v3, Lj6/f;->a:Lj6/k;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v4, Lj6/j;

    .line 39
    .line 40
    invoke-direct {v4, v3}, Lj6/j;-><init>(Lj6/k;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v4, Lj6/j;->e:Lj6/c;

    .line 44
    .line 45
    iput-object v2, v4, Lj6/j;->f:Lj6/c;

    .line 46
    .line 47
    iput-object v2, v4, Lj6/j;->g:Lj6/c;

    .line 48
    .line 49
    iput-object v2, v4, Lj6/j;->h:Lj6/c;

    .line 50
    .line 51
    new-instance v2, Lj6/k;

    .line 52
    .line 53
    invoke-direct {v2, v4}, Lj6/k;-><init>(Lj6/j;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Lj6/g;->setShapeAppearanceModel(Lj6/k;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/google/android/material/timepicker/f;->J:Lj6/g;

    .line 60
    .line 61
    const/4 v2, -0x1

    .line 62
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/google/android/material/timepicker/f;->J:Lj6/g;

    .line 70
    .line 71
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    invoke-static {p0, v1}, Lg0/h0;->q(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    sget-object v1, Ls5/a;->s:[I

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    iput p2, p0, Lcom/google/android/material/timepicker/f;->I:I

    .line 88
    .line 89
    new-instance p2, Lcom/google/android/material/timepicker/e;

    .line 90
    .line 91
    invoke-direct {p2, p0}, Lcom/google/android/material/timepicker/e;-><init>(Lcom/google/android/material/timepicker/f;)V

    .line 92
    .line 93
    .line 94
    iput-object p2, p0, Lcom/google/android/material/timepicker/f;->H:Lcom/google/android/material/timepicker/e;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 97
    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    const/4 p3, -0x1

    .line 9
    if-ne p2, p3, :cond_0

    .line 10
    .line 11
    sget-object p2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-static {}, Lg0/i0;->a()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p2, p0, Lcom/google/android/material/timepicker/f;->H:Lcom/google/android/material/timepicker/e;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public abstract f()V
.end method

.method public final onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/f;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/timepicker/f;->H:Lcom/google/android/material/timepicker/e;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/f;->J:Lj6/g;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lj6/g;->j(Landroid/content/res/ColorStateList;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
