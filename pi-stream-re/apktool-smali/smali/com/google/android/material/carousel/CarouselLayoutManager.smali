.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super Lm3/k0;
.source "SourceFile"


# instance fields
.field public p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm3/k0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ly5/a;

    .line 5
    .line 6
    invoke-direct {v0}, Ly5/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static A0(FLjava/util/List;Z)Lz3/e;
    .locals 13

    .line 1
    const/4 v0, -0x1

    .line 2
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    .line 4
    .line 5
    const v2, -0x800001

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    move v6, v0

    .line 10
    move v7, v6

    .line 11
    move v8, v7

    .line 12
    move v9, v8

    .line 13
    move v4, v2

    .line 14
    move v5, v3

    .line 15
    move v2, v1

    .line 16
    move v3, v2

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    if-ge v5, v10, :cond_4

    .line 22
    .line 23
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v10

    .line 27
    check-cast v10, Ly5/b;

    .line 28
    .line 29
    const/4 v11, 0x0

    .line 30
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sub-float v10, v11, p0

    .line 34
    .line 35
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 36
    .line 37
    .line 38
    move-result v10

    .line 39
    cmpg-float v12, v11, p0

    .line 40
    .line 41
    if-gtz v12, :cond_0

    .line 42
    .line 43
    cmpg-float v12, v10, v1

    .line 44
    .line 45
    if-gtz v12, :cond_0

    .line 46
    .line 47
    move v6, v5

    .line 48
    move v1, v10

    .line 49
    :cond_0
    cmpl-float v12, v11, p0

    .line 50
    .line 51
    if-lez v12, :cond_1

    .line 52
    .line 53
    cmpg-float v12, v10, v2

    .line 54
    .line 55
    if-gtz v12, :cond_1

    .line 56
    .line 57
    move v8, v5

    .line 58
    move v2, v10

    .line 59
    :cond_1
    cmpg-float v10, v11, v3

    .line 60
    .line 61
    if-gtz v10, :cond_2

    .line 62
    .line 63
    move v7, v5

    .line 64
    move v3, v11

    .line 65
    :cond_2
    cmpl-float v10, v11, v4

    .line 66
    .line 67
    if-lez v10, :cond_3

    .line 68
    .line 69
    move v9, v5

    .line 70
    move v4, v11

    .line 71
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    if-ne v6, v0, :cond_5

    .line 75
    .line 76
    move v6, v7

    .line 77
    :cond_5
    if-ne v8, v0, :cond_6

    .line 78
    .line 79
    move v8, v9

    .line 80
    :cond_6
    new-instance p0, Lz3/e;

    .line 81
    .line 82
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Ly5/b;

    .line 87
    .line 88
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ly5/b;

    .line 93
    .line 94
    invoke-direct {p0, p2, p1}, Lz3/e;-><init>(Ly5/b;Ly5/b;)V

    .line 95
    .line 96
    .line 97
    return-object p0
.end method

.method public static z0(FLz3/e;)F
    .locals 4

    .line 1
    iget-object v0, p1, Lz3/e;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly5/b;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lz3/e;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ly5/b;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v3, v0, p0}, Lt5/a;->a(FFFFF)F

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method


# virtual methods
.method public final B0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm3/k0;->A()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    return v1
.end method

.method public final C0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->B0()Z

    .line 3
    .line 4
    .line 5
    throw v0
.end method

.method public final R(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lm3/k0;->R(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lm3/k0;->F(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/lit8 v0, v0, -0x1

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lm3/k0;->F(Landroid/view/View;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final a0(La3/h;Lm3/w0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lm3/w0;->b()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-gtz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lm3/k0;->f0(La3/h;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->B0()Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, La3/h;->d(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string p2, "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public final b0(Lm3/w0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final j(Lm3/w0;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    throw p1
.end method

.method public final j0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public final k(Lm3/w0;)I
    .locals 0

    .line 1
    iget p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    .line 2
    .line 3
    return p1
.end method

.method public final l(Lm3/w0;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    rsub-int/lit8 p1, p1, 0x0

    return p1
.end method

.method public final l0(ILa3/h;Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    .line 11
    .line 12
    add-int p3, p2, p1

    .line 13
    .line 14
    if-ltz p3, :cond_1

    .line 15
    .line 16
    if-lez p3, :cond_2

    .line 17
    .line 18
    :cond_1
    rsub-int/lit8 p1, p2, 0x0

    .line 19
    .line 20
    :cond_2
    add-int/2addr p2, p1

    .line 21
    iput p2, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->p:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->C0()V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 28
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public final m0(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final r()Lm3/l0;
    .locals 2

    .line 1
    new-instance v0, Lm3/l0;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Lm3/l0;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final w0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2

    .line 1
    new-instance v0, Lm3/a0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-direct {v0, v1, p1, p0}, Lm3/a0;-><init>(ILandroid/content/Context;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput p2, v0, Lm3/w;->a:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lm3/k0;->x0(Lm3/w;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final y(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lm3/k0;->y(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    throw p1
.end method
