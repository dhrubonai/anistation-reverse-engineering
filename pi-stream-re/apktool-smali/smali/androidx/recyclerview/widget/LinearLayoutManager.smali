.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Lm3/k0;
.source "SourceFile"

# interfaces
.implements Lm3/v0;


# instance fields
.field public final A:Lh3/x;

.field public final B:Lm3/t;

.field public final C:I

.field public final D:[I

.field public p:I

.field public q:Lm3/u;

.field public r:Lm3/y;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public final w:Z

.field public x:I

.field public y:I

.field public z:Lm3/v;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lm3/k0;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 4
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 5
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 10
    new-instance v2, Lh3/x;

    invoke-direct {v2}, Lh3/x;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lh3/x;

    .line 11
    new-instance v2, Lm3/t;

    invoke-direct {v2}, Lm3/t;-><init>()V

    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lm3/t;

    const/4 v2, 0x2

    .line 12
    iput v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    new-array v2, v2, [I

    .line 13
    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 14
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(I)V

    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 16
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-nez p1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 18
    invoke-virtual {p0}, Lm3/k0;->k0()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Lm3/k0;-><init>()V

    const/4 v0, 0x1

    .line 20
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 22
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 23
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 24
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    const/4 v0, -0x1

    .line 25
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    const/high16 v0, -0x80000000

    .line 26
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 28
    new-instance v1, Lh3/x;

    invoke-direct {v1}, Lh3/x;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lh3/x;

    .line 29
    new-instance v1, Lm3/t;

    invoke-direct {v1}, Lm3/t;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lm3/t;

    const/4 v1, 0x2

    .line 30
    iput v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    new-array v1, v1, [I

    .line 31
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 32
    invoke-static {p1, p2, p3, p4}, Lm3/k0;->G(Landroid/content/Context;Landroid/util/AttributeSet;II)Lm3/j0;

    move-result-object p1

    .line 33
    iget p2, p1, Lm3/j0;->a:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Z0(I)V

    .line 34
    iget-boolean p2, p1, Lm3/j0;->c:Z

    .line 35
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 36
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 38
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 39
    :goto_0
    iget-boolean p1, p1, Lm3/j0;->d:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->a1(Z)V

    return-void
.end method


# virtual methods
.method public A0(Lm3/w0;Lm3/u;Ln/g;)V
    .locals 1

    .line 1
    iget v0, p2, Lm3/u;->d:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lm3/w0;->b()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iget p2, p2, Lm3/u;->g:I

    .line 13
    .line 14
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p3, v0, p1}, Ln/g;->b(II)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final B0(Lm3/w0;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    move-object v4, p0

    .line 30
    invoke-static/range {v0 .. v5}, Lp7/a0;->f(Lm3/w0;Lm3/z;Landroid/view/View;Landroid/view/View;Lm3/k0;Z)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final C0(Lm3/w0;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 29
    .line 30
    move-object v0, p1

    .line 31
    move-object v4, p0

    .line 32
    invoke-static/range {v0 .. v6}, Lp7/a0;->g(Lm3/w0;Lm3/z;Landroid/view/View;Landroid/view/View;Lm3/k0;ZZ)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public final D0(Lm3/w0;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 13
    .line 14
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 15
    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->I0(Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->H0(Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->w:Z

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    move-object v4, p0

    .line 30
    invoke-static/range {v0 .. v5}, Lp7/a0;->h(Lm3/w0;Lm3/z;Landroid/view/View;Landroid/view/View;Lm3/k0;Z)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final E0(I)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p1, v1, :cond_b

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq p1, v2, :cond_8

    .line 7
    .line 8
    const/16 v2, 0x11

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    if-eq p1, v2, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x21

    .line 15
    .line 16
    if-eq p1, v2, :cond_4

    .line 17
    .line 18
    const/16 v0, 0x42

    .line 19
    .line 20
    if-eq p1, v0, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x82

    .line 23
    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 28
    .line 29
    if-ne p1, v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v1, v3

    .line 33
    :goto_0
    return v1

    .line 34
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 35
    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move v1, v3

    .line 40
    :goto_1
    return v1

    .line 41
    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 42
    .line 43
    if-ne p1, v1, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    move v0, v3

    .line 47
    :goto_2
    return v0

    .line 48
    :cond_6
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 49
    .line 50
    if-nez p1, :cond_7

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_7
    move v0, v3

    .line 54
    :goto_3
    return v0

    .line 55
    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 56
    .line 57
    if-ne p1, v1, :cond_9

    .line 58
    .line 59
    return v1

    .line 60
    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_a

    .line 65
    .line 66
    return v0

    .line 67
    :cond_a
    return v1

    .line 68
    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 69
    .line 70
    if-ne p1, v1, :cond_c

    .line 71
    .line 72
    return v0

    .line 73
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_d

    .line 78
    .line 79
    return v1

    .line 80
    :cond_d
    return v0
.end method

.method public final F0()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm3/u;

    .line 6
    .line 7
    invoke-direct {v0}, Lm3/u;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final G0(La3/h;Lm3/u;Lm3/w0;Z)I
    .locals 7

    .line 1
    iget v0, p2, Lm3/u;->c:I

    .line 2
    .line 3
    iget v1, p2, Lm3/u;->g:I

    .line 4
    .line 5
    const/high16 v2, -0x80000000

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    iput v1, p2, Lm3/u;->g:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0(La3/h;Lm3/u;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v1, p2, Lm3/u;->c:I

    .line 18
    .line 19
    iget v3, p2, Lm3/u;->h:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    :cond_2
    iget-boolean v3, p2, Lm3/u;->l:Z

    .line 23
    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    if-lez v1, :cond_a

    .line 27
    .line 28
    :cond_3
    iget v3, p2, Lm3/u;->d:I

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    if-ltz v3, :cond_4

    .line 32
    .line 33
    invoke-virtual {p3}, Lm3/w0;->b()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-ge v3, v5, :cond_4

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_4
    move v3, v4

    .line 42
    :goto_0
    if-eqz v3, :cond_a

    .line 43
    .line 44
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->B:Lm3/t;

    .line 45
    .line 46
    iput v4, v3, Lm3/t;->a:I

    .line 47
    .line 48
    iput-boolean v4, v3, Lm3/t;->b:Z

    .line 49
    .line 50
    iput-boolean v4, v3, Lm3/t;->c:Z

    .line 51
    .line 52
    iput-boolean v4, v3, Lm3/t;->d:Z

    .line 53
    .line 54
    invoke-virtual {p0, p1, p3, p2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->T0(La3/h;Lm3/w0;Lm3/u;Lm3/t;)V

    .line 55
    .line 56
    .line 57
    iget-boolean v4, v3, Lm3/t;->b:Z

    .line 58
    .line 59
    if-eqz v4, :cond_5

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    iget v4, p2, Lm3/u;->b:I

    .line 63
    .line 64
    iget v5, v3, Lm3/t;->a:I

    .line 65
    .line 66
    iget v6, p2, Lm3/u;->f:I

    .line 67
    .line 68
    mul-int/2addr v6, v5

    .line 69
    add-int/2addr v6, v4

    .line 70
    iput v6, p2, Lm3/u;->b:I

    .line 71
    .line 72
    iget-boolean v4, v3, Lm3/t;->c:Z

    .line 73
    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    iget-object v4, p2, Lm3/u;->k:Ljava/util/List;

    .line 77
    .line 78
    if-nez v4, :cond_6

    .line 79
    .line 80
    iget-boolean v4, p3, Lm3/w0;->g:Z

    .line 81
    .line 82
    if-nez v4, :cond_7

    .line 83
    .line 84
    :cond_6
    iget v4, p2, Lm3/u;->c:I

    .line 85
    .line 86
    sub-int/2addr v4, v5

    .line 87
    iput v4, p2, Lm3/u;->c:I

    .line 88
    .line 89
    sub-int/2addr v1, v5

    .line 90
    :cond_7
    iget v4, p2, Lm3/u;->g:I

    .line 91
    .line 92
    if-eq v4, v2, :cond_9

    .line 93
    .line 94
    add-int/2addr v4, v5

    .line 95
    iput v4, p2, Lm3/u;->g:I

    .line 96
    .line 97
    iget v5, p2, Lm3/u;->c:I

    .line 98
    .line 99
    if-gez v5, :cond_8

    .line 100
    .line 101
    add-int/2addr v4, v5

    .line 102
    iput v4, p2, Lm3/u;->g:I

    .line 103
    .line 104
    :cond_8
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->V0(La3/h;Lm3/u;)V

    .line 105
    .line 106
    .line 107
    :cond_9
    if-eqz p4, :cond_2

    .line 108
    .line 109
    iget-boolean v3, v3, Lm3/t;->d:Z

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    :cond_a
    :goto_1
    iget p1, p2, Lm3/u;->c:I

    .line 114
    .line 115
    sub-int/2addr v0, p1

    .line 116
    return v0
.end method

.method public final H0(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, -0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final I0(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    add-int/2addr v0, v1

    .line 11
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final J()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final J0()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v0}, Lm3/k0;->F(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    return v0
.end method

.method public final K0()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {p0, v0, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->M0(IIZ)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Lm3/k0;->F(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    return v1
.end method

.method public final L0(II)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 2
    .line 3
    .line 4
    if-le p2, p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-ge p2, p1, :cond_1

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lm3/y;->d(Landroid/view/View;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 31
    .line 32
    invoke-virtual {v1}, Lm3/y;->h()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-ge v0, v1, :cond_3

    .line 37
    .line 38
    const/16 v0, 0x4104

    .line 39
    .line 40
    const/16 v1, 0x4004

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/16 v0, 0x1041

    .line 44
    .line 45
    const/16 v1, 0x1001

    .line 46
    .line 47
    :goto_1
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 48
    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    iget-object v2, p0, Lm3/k0;->c:Lm3/m1;

    .line 52
    .line 53
    invoke-virtual {v2, p1, p2, v0, v1}, Lm3/m1;->f(IIII)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    iget-object v2, p0, Lm3/k0;->d:Lm3/m1;

    .line 59
    .line 60
    invoke-virtual {v2, p1, p2, v0, v1}, Lm3/m1;->f(IIII)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_2
    return-object p1
.end method

.method public final M0(IIZ)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x140

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/16 p3, 0x6003

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p3, v0

    .line 12
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lm3/k0;->c:Lm3/m1;

    .line 17
    .line 18
    invoke-virtual {v1, p1, p2, p3, v0}, Lm3/m1;->f(IIII)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iget-object v1, p0, Lm3/k0;->d:Lm3/m1;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2, p3, v0}, Lm3/m1;->f(IIII)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_1
    return-object p1
.end method

.method public N0(La3/h;Lm3/w0;ZZ)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int/2addr v1, v3

    .line 19
    const/4 v4, -0x1

    .line 20
    move v5, v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v1

    .line 23
    move v1, v2

    .line 24
    move v5, v3

    .line 25
    :goto_0
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget-object v7, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 30
    .line 31
    invoke-virtual {v7}, Lm3/y;->h()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 36
    .line 37
    invoke-virtual {v8}, Lm3/y;->f()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    const/4 v9, 0x0

    .line 42
    move-object v10, v9

    .line 43
    move-object v11, v10

    .line 44
    :goto_1
    if-eq v1, v4, :cond_a

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    invoke-static {v12}, Lm3/k0;->F(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    iget-object v14, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 55
    .line 56
    invoke-virtual {v14, v12}, Lm3/y;->d(Landroid/view/View;)I

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    iget-object v15, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 61
    .line 62
    invoke-virtual {v15, v12}, Lm3/y;->b(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    if-ltz v13, :cond_9

    .line 67
    .line 68
    if-ge v13, v6, :cond_9

    .line 69
    .line 70
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    check-cast v13, Lm3/l0;

    .line 75
    .line 76
    invoke-virtual {v13}, Lm3/l0;->c()Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-eqz v13, :cond_1

    .line 81
    .line 82
    if-nez v11, :cond_9

    .line 83
    .line 84
    move-object v11, v12

    .line 85
    goto :goto_7

    .line 86
    :cond_1
    if-gt v15, v7, :cond_2

    .line 87
    .line 88
    if-ge v14, v7, :cond_2

    .line 89
    .line 90
    move v13, v3

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move v13, v2

    .line 93
    :goto_2
    if-lt v14, v8, :cond_3

    .line 94
    .line 95
    if-le v15, v8, :cond_3

    .line 96
    .line 97
    move v14, v3

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move v14, v2

    .line 100
    :goto_3
    if-nez v13, :cond_5

    .line 101
    .line 102
    if-eqz v14, :cond_4

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    return-object v12

    .line 106
    :cond_5
    :goto_4
    if-eqz p3, :cond_7

    .line 107
    .line 108
    if-eqz v14, :cond_6

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_6
    if-nez v9, :cond_9

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_7
    if-eqz v13, :cond_8

    .line 115
    .line 116
    :goto_5
    move-object v10, v12

    .line 117
    goto :goto_7

    .line 118
    :cond_8
    if-nez v9, :cond_9

    .line 119
    .line 120
    :goto_6
    move-object v9, v12

    .line 121
    :cond_9
    :goto_7
    add-int/2addr v1, v5

    .line 122
    goto :goto_1

    .line 123
    :cond_a
    if-eqz v9, :cond_b

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_b
    if-eqz v10, :cond_c

    .line 127
    .line 128
    move-object v9, v10

    .line 129
    goto :goto_8

    .line 130
    :cond_c
    move-object v9, v11

    .line 131
    :goto_8
    return-object v9
.end method

.method public final O0(ILa3/h;Lm3/w0;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm3/y;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr v0, p1

    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    neg-int v0, v0

    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILa3/h;Lm3/w0;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 20
    .line 21
    invoke-virtual {p3}, Lm3/y;->f()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p3, p1

    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Lm3/y;->l(I)V

    .line 31
    .line 32
    .line 33
    add-int/2addr p3, p2

    .line 34
    return p3

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final P(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final P0(ILa3/h;Lm3/w0;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm3/y;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v0, p1, v0

    .line 8
    .line 9
    if-lez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILa3/h;Lm3/w0;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    neg-int p2, p2

    .line 16
    add-int/2addr p1, p2

    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 20
    .line 21
    invoke-virtual {p3}, Lm3/y;->h()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    sub-int/2addr p1, p3

    .line 26
    if-lez p1, :cond_0

    .line 27
    .line 28
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 29
    .line 30
    neg-int p4, p1

    .line 31
    invoke-virtual {p3, p4}, Lm3/y;->l(I)V

    .line 32
    .line 33
    .line 34
    sub-int/2addr p2, p1

    .line 35
    :cond_0
    return p2

    .line 36
    :cond_1
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public Q(Landroid/view/View;ILa3/h;Lm3/w0;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->E0(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 p2, -0x80000000

    .line 17
    .line 18
    if-ne p1, p2, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 25
    .line 26
    invoke-virtual {v1}, Lm3/y;->i()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-float v1, v1

    .line 31
    const v2, 0x3eaaaaab

    .line 32
    .line 33
    .line 34
    mul-float/2addr v1, v2

    .line 35
    float-to-int v1, v1

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {p0, p1, v1, v2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLm3/w0;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 41
    .line 42
    iput p2, v1, Lm3/u;->g:I

    .line 43
    .line 44
    iput-boolean v2, v1, Lm3/u;->a:Z

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-virtual {p0, p3, v1, p4, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 48
    .line 49
    .line 50
    const/4 p2, -0x1

    .line 51
    if-ne p1, p2, :cond_3

    .line 52
    .line 53
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 54
    .line 55
    if-eqz p3, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    add-int/2addr p3, p2

    .line 62
    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 77
    .line 78
    if-eqz p3, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-virtual {p0, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    add-int/2addr p3, p2

    .line 94
    invoke-virtual {p0, p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0(II)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    :goto_0
    if-ne p1, p2, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-eqz p2, :cond_7

    .line 114
    .line 115
    if-nez p3, :cond_6

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_6
    return-object p1

    .line 119
    :cond_7
    return-object p3
.end method

.method public final Q0()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
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
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->J0()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->K0()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final R0()Landroid/view/View;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final S0()Z
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

.method public T0(La3/h;Lm3/w0;Lm3/u;Lm3/t;)V
    .locals 11

    .line 1
    invoke-virtual {p3, p1}, Lm3/u;->b(La3/h;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput-boolean p2, p4, Lm3/t;->b:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lm3/l0;

    .line 16
    .line 17
    iget-object v1, p3, Lm3/u;->k:Ljava/util/List;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, -0x1

    .line 21
    if-nez v1, :cond_3

    .line 22
    .line 23
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 24
    .line 25
    iget v4, p3, Lm3/u;->f:I

    .line 26
    .line 27
    if-ne v4, v3, :cond_1

    .line 28
    .line 29
    move v4, p2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_0
    if-ne v1, v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, p1, v3, v2}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-virtual {p0, p1, v2, v2}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 43
    .line 44
    iget v4, p3, Lm3/u;->f:I

    .line 45
    .line 46
    if-ne v4, v3, :cond_4

    .line 47
    .line 48
    move v4, p2

    .line 49
    goto :goto_1

    .line 50
    :cond_4
    move v4, v2

    .line 51
    :goto_1
    if-ne v1, v4, :cond_5

    .line 52
    .line 53
    invoke-virtual {p0, p1, v3, p2}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    invoke-virtual {p0, p1, v2, p2}, Lm3/k0;->b(Landroid/view/View;IZ)V

    .line 58
    .line 59
    .line 60
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lm3/l0;

    .line 65
    .line 66
    iget-object v4, p0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    invoke-virtual {v4, p1}, Landroidx/recyclerview/widget/RecyclerView;->M(Landroid/view/View;)Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 73
    .line 74
    iget v6, v4, Landroid/graphics/Rect;->right:I

    .line 75
    .line 76
    add-int/2addr v5, v6

    .line 77
    add-int/2addr v5, v2

    .line 78
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 79
    .line 80
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 81
    .line 82
    add-int/2addr v6, v4

    .line 83
    add-int/2addr v6, v2

    .line 84
    iget v2, p0, Lm3/k0;->n:I

    .line 85
    .line 86
    iget v4, p0, Lm3/k0;->l:I

    .line 87
    .line 88
    invoke-virtual {p0}, Lm3/k0;->C()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    invoke-virtual {p0}, Lm3/k0;->D()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    add-int/2addr v8, v7

    .line 97
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 98
    .line 99
    add-int/2addr v8, v7

    .line 100
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 101
    .line 102
    add-int/2addr v8, v7

    .line 103
    add-int/2addr v8, v5

    .line 104
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->d()Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-static {v7, v2, v4, v8, v5}, Lm3/k0;->w(ZIIII)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget v4, p0, Lm3/k0;->o:I

    .line 115
    .line 116
    iget v5, p0, Lm3/k0;->m:I

    .line 117
    .line 118
    invoke-virtual {p0}, Lm3/k0;->E()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-virtual {p0}, Lm3/k0;->B()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    add-int/2addr v8, v7

    .line 127
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 128
    .line 129
    add-int/2addr v8, v7

    .line 130
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 131
    .line 132
    add-int/2addr v8, v7

    .line 133
    add-int/2addr v8, v6

    .line 134
    iget v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->e()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    invoke-static {v7, v4, v5, v8, v6}, Lm3/k0;->w(ZIIII)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    invoke-virtual {p0, p1, v2, v4, v1}, Lm3/k0;->t0(Landroid/view/View;IILm3/l0;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    invoke-virtual {p1, v2, v4}, Landroid/view/View;->measure(II)V

    .line 151
    .line 152
    .line 153
    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 154
    .line 155
    invoke-virtual {v1, p1}, Lm3/y;->c(Landroid/view/View;)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    iput v1, p4, Lm3/t;->a:I

    .line 160
    .line 161
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 162
    .line 163
    if-ne v1, p2, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    iget v1, p0, Lm3/k0;->n:I

    .line 172
    .line 173
    invoke-virtual {p0}, Lm3/k0;->D()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    sub-int/2addr v1, v2

    .line 178
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 179
    .line 180
    invoke-virtual {v2, p1}, Lm3/y;->m(Landroid/view/View;)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    sub-int v2, v1, v2

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_7
    invoke-virtual {p0}, Lm3/k0;->C()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 192
    .line 193
    invoke-virtual {v1, p1}, Lm3/y;->m(Landroid/view/View;)I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    add-int/2addr v1, v2

    .line 198
    :goto_3
    iget v4, p3, Lm3/u;->f:I

    .line 199
    .line 200
    if-ne v4, v3, :cond_8

    .line 201
    .line 202
    iget p3, p3, Lm3/u;->b:I

    .line 203
    .line 204
    iget v3, p4, Lm3/t;->a:I

    .line 205
    .line 206
    sub-int v3, p3, v3

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_8
    iget v3, p3, Lm3/u;->b:I

    .line 210
    .line 211
    iget p3, p4, Lm3/t;->a:I

    .line 212
    .line 213
    add-int/2addr p3, v3

    .line 214
    goto :goto_4

    .line 215
    :cond_9
    invoke-virtual {p0}, Lm3/k0;->E()I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 220
    .line 221
    invoke-virtual {v2, p1}, Lm3/y;->m(Landroid/view/View;)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    add-int/2addr v2, v1

    .line 226
    iget v4, p3, Lm3/u;->f:I

    .line 227
    .line 228
    if-ne v4, v3, :cond_a

    .line 229
    .line 230
    iget p3, p3, Lm3/u;->b:I

    .line 231
    .line 232
    iget v3, p4, Lm3/t;->a:I

    .line 233
    .line 234
    sub-int v3, p3, v3

    .line 235
    .line 236
    move v9, v1

    .line 237
    move v1, p3

    .line 238
    move p3, v2

    .line 239
    move v2, v3

    .line 240
    move v3, v9

    .line 241
    goto :goto_4

    .line 242
    :cond_a
    iget p3, p3, Lm3/u;->b:I

    .line 243
    .line 244
    iget v3, p4, Lm3/t;->a:I

    .line 245
    .line 246
    add-int/2addr v3, p3

    .line 247
    move v9, v2

    .line 248
    move v2, p3

    .line 249
    move p3, v9

    .line 250
    move v10, v3

    .line 251
    move v3, v1

    .line 252
    move v1, v10

    .line 253
    :goto_4
    invoke-static {p1, v2, v3, v1, p3}, Lm3/k0;->L(Landroid/view/View;IIII)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lm3/l0;->c()Z

    .line 257
    .line 258
    .line 259
    move-result p3

    .line 260
    if-nez p3, :cond_b

    .line 261
    .line 262
    invoke-virtual {v0}, Lm3/l0;->b()Z

    .line 263
    .line 264
    .line 265
    move-result p3

    .line 266
    if-eqz p3, :cond_c

    .line 267
    .line 268
    :cond_b
    iput-boolean p2, p4, Lm3/t;->c:Z

    .line 269
    .line 270
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    iput-boolean p1, p4, Lm3/t;->d:Z

    .line 275
    .line 276
    return-void
.end method

.method public U0(La3/h;Lm3/w0;Lh3/x;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final V0(La3/h;Lm3/u;)V
    .locals 5

    .line 1
    iget-boolean v0, p2, Lm3/u;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_e

    .line 4
    .line 5
    iget-boolean v0, p2, Lm3/u;->l:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    iget v0, p2, Lm3/u;->g:I

    .line 12
    .line 13
    iget v1, p2, Lm3/u;->i:I

    .line 14
    .line 15
    iget p2, p2, Lm3/u;->f:I

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-ne p2, v2, :cond_7

    .line 20
    .line 21
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_1
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 30
    .line 31
    invoke-virtual {v4}, Lm3/y;->e()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int/2addr v4, v0

    .line 36
    add-int/2addr v4, v1

    .line 37
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    move v0, v3

    .line 42
    :goto_0
    if-ge v0, p2, :cond_e

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Lm3/y;->d(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-lt v2, v4, :cond_3

    .line 55
    .line 56
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lm3/y;->k(Landroid/view/View;)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-ge v1, v4, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v3, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(La3/h;II)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :cond_4
    add-int/2addr p2, v2

    .line 74
    move v0, p2

    .line 75
    :goto_2
    if-ltz v0, :cond_e

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 82
    .line 83
    invoke-virtual {v2, v1}, Lm3/y;->d(Landroid/view/View;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-lt v2, v4, :cond_6

    .line 88
    .line 89
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 90
    .line 91
    invoke-virtual {v2, v1}, Lm3/y;->k(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ge v1, v4, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    add-int/lit8 v0, v0, -0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    :goto_3
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(La3/h;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_7
    if-gez v0, :cond_8

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_8
    sub-int/2addr v0, v1

    .line 109
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 114
    .line 115
    if-eqz v1, :cond_b

    .line 116
    .line 117
    add-int/2addr p2, v2

    .line 118
    move v1, p2

    .line 119
    :goto_4
    if-ltz v1, :cond_e

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 126
    .line 127
    invoke-virtual {v3, v2}, Lm3/y;->b(Landroid/view/View;)I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-gt v3, v0, :cond_a

    .line 132
    .line 133
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 134
    .line 135
    invoke-virtual {v3, v2}, Lm3/y;->j(Landroid/view/View;)I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-le v2, v0, :cond_9

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    add-int/lit8 v1, v1, -0x1

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_a
    :goto_5
    invoke-virtual {p0, p1, p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(La3/h;II)V

    .line 146
    .line 147
    .line 148
    goto :goto_8

    .line 149
    :cond_b
    move v1, v3

    .line 150
    :goto_6
    if-ge v1, p2, :cond_e

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 157
    .line 158
    invoke-virtual {v4, v2}, Lm3/y;->b(Landroid/view/View;)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-gt v4, v0, :cond_d

    .line 163
    .line 164
    iget-object v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 165
    .line 166
    invoke-virtual {v4, v2}, Lm3/y;->j(Landroid/view/View;)I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-le v2, v0, :cond_c

    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_d
    :goto_7
    invoke-virtual {p0, p1, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->W0(La3/h;II)V

    .line 177
    .line 178
    .line 179
    :cond_e
    :goto_8
    return-void
.end method

.method public final W0(La3/h;II)V
    .locals 1

    .line 1
    if-ne p2, p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-le p3, p2, :cond_1

    .line 5
    .line 6
    :goto_0
    add-int/lit8 p3, p3, -0x1

    .line 7
    .line 8
    if-lt p3, p2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, p3}, Lm3/k0;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p3}, Lm3/k0;->i0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, La3/h;->i(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    :goto_1
    if-le p2, p3, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Lm3/k0;->u(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, p2}, Lm3/k0;->i0(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, La3/h;->i(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 p2, p2, -0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    return-void
.end method

.method public final X0()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 14
    .line 15
    xor-int/2addr v0, v1

    .line 16
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->t:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 22
    .line 23
    :goto_1
    return-void
.end method

.method public final Y0(ILa3/h;Lm3/w0;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    iput-boolean v2, v0, Lm3/u;->a:Z

    .line 18
    .line 19
    if-lez p1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, -0x1

    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p0, v0, v3, v2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLm3/w0;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 32
    .line 33
    iget v4, v2, Lm3/u;->g:I

    .line 34
    .line 35
    invoke-virtual {p0, p2, v2, p3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    add-int/2addr p2, v4

    .line 40
    if-gez p2, :cond_2

    .line 41
    .line 42
    return v1

    .line 43
    :cond_2
    if-le v3, p2, :cond_3

    .line 44
    .line 45
    mul-int p1, v0, p2

    .line 46
    .line 47
    :cond_3
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 48
    .line 49
    neg-int p3, p1

    .line 50
    invoke-virtual {p2, p3}, Lm3/y;->l(I)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 54
    .line 55
    iput p1, p2, Lm3/u;->j:I

    .line 56
    .line 57
    return p1

    .line 58
    :cond_4
    :goto_1
    return v1
.end method

.method public final Z0(I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string v1, "invalid orientation:"

    .line 10
    .line 11
    invoke-static {v1, p1}, La3/g;->n(Ljava/lang/String;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_2

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 28
    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    :cond_2
    invoke-static {p0, p1}, Lm3/z;->a(Lm3/k0;I)Lm3/y;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lh3/x;

    .line 38
    .line 39
    iput-object v0, v1, Lh3/x;->f:Ljava/lang/Object;

    .line 40
    .line 41
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 44
    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lm3/k0;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-ge p1, v1, :cond_1

    .line 20
    .line 21
    move v0, v2

    .line 22
    :cond_1
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/4 v2, -0x1

    .line 27
    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-nez p1, :cond_3

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    int-to-float v1, v2

    .line 35
    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_3
    new-instance p1, Landroid/graphics/PointF;

    .line 40
    .line 41
    int-to-float v1, v2

    .line 42
    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 43
    .line 44
    .line 45
    return-object p1
.end method

.method public a0(La3/h;Lm3/w0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 13
    .line 14
    if-eq v3, v4, :cond_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p1}, Lm3/k0;->f0(La3/h;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    iget v3, v3, Lm3/v;->a:I

    .line 33
    .line 34
    if-ltz v3, :cond_2

    .line 35
    .line 36
    move v7, v5

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move v7, v6

    .line 39
    :goto_0
    if-eqz v7, :cond_3

    .line 40
    .line 41
    iput v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 42
    .line 43
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 44
    .line 45
    .line 46
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 47
    .line 48
    iput-boolean v6, v3, Lm3/u;->a:Z

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 51
    .line 52
    .line 53
    iget-object v3, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    if-nez v3, :cond_5

    .line 56
    .line 57
    :cond_4
    :goto_1
    const/4 v3, 0x0

    .line 58
    goto :goto_2

    .line 59
    :cond_5
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    iget-object v8, v0, Lm3/k0;->a:Lm3/c;

    .line 66
    .line 67
    invoke-virtual {v8, v3}, Lm3/c;->j(Landroid/view/View;)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_6

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    :goto_2
    iget-object v8, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lh3/x;

    .line 75
    .line 76
    iget-boolean v9, v8, Lh3/x;->e:Z

    .line 77
    .line 78
    const/high16 v10, -0x80000000

    .line 79
    .line 80
    if-eqz v9, :cond_9

    .line 81
    .line 82
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 83
    .line 84
    if-ne v9, v4, :cond_9

    .line 85
    .line 86
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 87
    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    if-eqz v3, :cond_2c

    .line 92
    .line 93
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 94
    .line 95
    invoke-virtual {v9, v3}, Lm3/y;->d(Landroid/view/View;)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 100
    .line 101
    invoke-virtual {v11}, Lm3/y;->f()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-ge v9, v11, :cond_8

    .line 106
    .line 107
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 108
    .line 109
    invoke-virtual {v9, v3}, Lm3/y;->b(Landroid/view/View;)I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 114
    .line 115
    invoke-virtual {v11}, Lm3/y;->h()I

    .line 116
    .line 117
    .line 118
    move-result v11

    .line 119
    if-gt v9, v11, :cond_2c

    .line 120
    .line 121
    :cond_8
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    invoke-virtual {v8, v3, v9}, Lh3/x;->d(Landroid/view/View;I)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_17

    .line 129
    .line 130
    :cond_9
    :goto_3
    invoke-virtual {v8}, Lh3/x;->f()V

    .line 131
    .line 132
    .line 133
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 134
    .line 135
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 136
    .line 137
    xor-int/2addr v3, v9

    .line 138
    iput-boolean v3, v8, Lh3/x;->d:Z

    .line 139
    .line 140
    iget-boolean v3, v2, Lm3/w0;->g:Z

    .line 141
    .line 142
    if-nez v3, :cond_1b

    .line 143
    .line 144
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 145
    .line 146
    if-ne v3, v4, :cond_a

    .line 147
    .line 148
    goto/16 :goto_b

    .line 149
    .line 150
    :cond_a
    if-ltz v3, :cond_1a

    .line 151
    .line 152
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-lt v3, v9, :cond_b

    .line 157
    .line 158
    goto/16 :goto_a

    .line 159
    .line 160
    :cond_b
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 161
    .line 162
    iput v3, v8, Lh3/x;->b:I

    .line 163
    .line 164
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 165
    .line 166
    if-eqz v9, :cond_e

    .line 167
    .line 168
    iget v11, v9, Lm3/v;->a:I

    .line 169
    .line 170
    if-ltz v11, :cond_c

    .line 171
    .line 172
    move v11, v5

    .line 173
    goto :goto_4

    .line 174
    :cond_c
    move v11, v6

    .line 175
    :goto_4
    if-eqz v11, :cond_e

    .line 176
    .line 177
    iget-boolean v3, v9, Lm3/v;->c:Z

    .line 178
    .line 179
    iput-boolean v3, v8, Lh3/x;->d:Z

    .line 180
    .line 181
    if-eqz v3, :cond_d

    .line 182
    .line 183
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 184
    .line 185
    invoke-virtual {v3}, Lm3/y;->f()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 190
    .line 191
    iget v9, v9, Lm3/v;->b:I

    .line 192
    .line 193
    sub-int/2addr v3, v9

    .line 194
    iput v3, v8, Lh3/x;->c:I

    .line 195
    .line 196
    goto/16 :goto_9

    .line 197
    .line 198
    :cond_d
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 199
    .line 200
    invoke-virtual {v3}, Lm3/y;->h()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 205
    .line 206
    iget v9, v9, Lm3/v;->b:I

    .line 207
    .line 208
    add-int/2addr v3, v9

    .line 209
    iput v3, v8, Lh3/x;->c:I

    .line 210
    .line 211
    goto/16 :goto_9

    .line 212
    .line 213
    :cond_e
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 214
    .line 215
    if-ne v9, v10, :cond_18

    .line 216
    .line 217
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    if-eqz v3, :cond_14

    .line 222
    .line 223
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 224
    .line 225
    invoke-virtual {v9, v3}, Lm3/y;->c(Landroid/view/View;)I

    .line 226
    .line 227
    .line 228
    move-result v9

    .line 229
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 230
    .line 231
    invoke-virtual {v11}, Lm3/y;->i()I

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    if-le v9, v11, :cond_f

    .line 236
    .line 237
    invoke-virtual {v8}, Lh3/x;->b()V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :cond_f
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 243
    .line 244
    invoke-virtual {v9, v3}, Lm3/y;->d(Landroid/view/View;)I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 249
    .line 250
    invoke-virtual {v11}, Lm3/y;->h()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    sub-int/2addr v9, v11

    .line 255
    if-gez v9, :cond_10

    .line 256
    .line 257
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 258
    .line 259
    invoke-virtual {v3}, Lm3/y;->h()I

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    iput v3, v8, Lh3/x;->c:I

    .line 264
    .line 265
    iput-boolean v6, v8, Lh3/x;->d:Z

    .line 266
    .line 267
    goto/16 :goto_9

    .line 268
    .line 269
    :cond_10
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 270
    .line 271
    invoke-virtual {v9}, Lm3/y;->f()I

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 276
    .line 277
    invoke-virtual {v11, v3}, Lm3/y;->b(Landroid/view/View;)I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    sub-int/2addr v9, v11

    .line 282
    if-gez v9, :cond_11

    .line 283
    .line 284
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 285
    .line 286
    invoke-virtual {v3}, Lm3/y;->f()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    iput v3, v8, Lh3/x;->c:I

    .line 291
    .line 292
    iput-boolean v5, v8, Lh3/x;->d:Z

    .line 293
    .line 294
    goto/16 :goto_9

    .line 295
    .line 296
    :cond_11
    iget-boolean v9, v8, Lh3/x;->d:Z

    .line 297
    .line 298
    if-eqz v9, :cond_13

    .line 299
    .line 300
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 301
    .line 302
    invoke-virtual {v9, v3}, Lm3/y;->b(Landroid/view/View;)I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 307
    .line 308
    iget v11, v9, Lm3/z;->b:I

    .line 309
    .line 310
    if-ne v10, v11, :cond_12

    .line 311
    .line 312
    move v11, v6

    .line 313
    goto :goto_5

    .line 314
    :cond_12
    invoke-virtual {v9}, Lm3/y;->i()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    iget v9, v9, Lm3/z;->b:I

    .line 319
    .line 320
    sub-int/2addr v11, v9

    .line 321
    :goto_5
    add-int/2addr v11, v3

    .line 322
    goto :goto_6

    .line 323
    :cond_13
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 324
    .line 325
    invoke-virtual {v9, v3}, Lm3/y;->d(Landroid/view/View;)I

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    :goto_6
    iput v11, v8, Lh3/x;->c:I

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-lez v3, :cond_17

    .line 337
    .line 338
    invoke-virtual {v0, v6}, Lm3/k0;->u(I)Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 347
    .line 348
    if-ge v9, v3, :cond_15

    .line 349
    .line 350
    move v3, v5

    .line 351
    goto :goto_7

    .line 352
    :cond_15
    move v3, v6

    .line 353
    :goto_7
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 354
    .line 355
    if-ne v3, v9, :cond_16

    .line 356
    .line 357
    move v3, v5

    .line 358
    goto :goto_8

    .line 359
    :cond_16
    move v3, v6

    .line 360
    :goto_8
    iput-boolean v3, v8, Lh3/x;->d:Z

    .line 361
    .line 362
    :cond_17
    invoke-virtual {v8}, Lh3/x;->b()V

    .line 363
    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_18
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 367
    .line 368
    iput-boolean v3, v8, Lh3/x;->d:Z

    .line 369
    .line 370
    if-eqz v3, :cond_19

    .line 371
    .line 372
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 373
    .line 374
    invoke-virtual {v3}, Lm3/y;->f()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 379
    .line 380
    sub-int/2addr v3, v9

    .line 381
    iput v3, v8, Lh3/x;->c:I

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_19
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 385
    .line 386
    invoke-virtual {v3}, Lm3/y;->h()I

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    iget v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 391
    .line 392
    add-int/2addr v3, v9

    .line 393
    iput v3, v8, Lh3/x;->c:I

    .line 394
    .line 395
    :goto_9
    move v3, v5

    .line 396
    goto :goto_c

    .line 397
    :cond_1a
    :goto_a
    iput v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 398
    .line 399
    iput v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 400
    .line 401
    :cond_1b
    :goto_b
    move v3, v6

    .line 402
    :goto_c
    if-eqz v3, :cond_1c

    .line 403
    .line 404
    goto/16 :goto_16

    .line 405
    .line 406
    :cond_1c
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-nez v3, :cond_1d

    .line 411
    .line 412
    goto/16 :goto_13

    .line 413
    .line 414
    :cond_1d
    iget-object v3, v0, Lm3/k0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 415
    .line 416
    if-nez v3, :cond_1f

    .line 417
    .line 418
    :cond_1e
    :goto_d
    const/4 v3, 0x0

    .line 419
    goto :goto_e

    .line 420
    :cond_1f
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    if-eqz v3, :cond_1e

    .line 425
    .line 426
    iget-object v9, v0, Lm3/k0;->a:Lm3/c;

    .line 427
    .line 428
    invoke-virtual {v9, v3}, Lm3/c;->j(Landroid/view/View;)Z

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-eqz v9, :cond_20

    .line 433
    .line 434
    goto :goto_d

    .line 435
    :cond_20
    :goto_e
    if-eqz v3, :cond_22

    .line 436
    .line 437
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    check-cast v9, Lm3/l0;

    .line 442
    .line 443
    invoke-virtual {v9}, Lm3/l0;->c()Z

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    if-nez v11, :cond_21

    .line 448
    .line 449
    invoke-virtual {v9}, Lm3/l0;->a()I

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    if-ltz v11, :cond_21

    .line 454
    .line 455
    invoke-virtual {v9}, Lm3/l0;->a()I

    .line 456
    .line 457
    .line 458
    move-result v9

    .line 459
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    if-ge v9, v11, :cond_21

    .line 464
    .line 465
    move v9, v5

    .line 466
    goto :goto_f

    .line 467
    :cond_21
    move v9, v6

    .line 468
    :goto_f
    if-eqz v9, :cond_22

    .line 469
    .line 470
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    invoke-virtual {v8, v3, v9}, Lh3/x;->d(Landroid/view/View;I)V

    .line 475
    .line 476
    .line 477
    goto :goto_12

    .line 478
    :cond_22
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 479
    .line 480
    iget-boolean v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 481
    .line 482
    if-eq v3, v9, :cond_23

    .line 483
    .line 484
    goto :goto_13

    .line 485
    :cond_23
    iget-boolean v3, v8, Lh3/x;->d:Z

    .line 486
    .line 487
    invoke-virtual {v0, v1, v2, v3, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(La3/h;Lm3/w0;ZZ)Landroid/view/View;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    if-eqz v3, :cond_29

    .line 492
    .line 493
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    invoke-virtual {v8, v3, v9}, Lh3/x;->c(Landroid/view/View;I)V

    .line 498
    .line 499
    .line 500
    iget-boolean v9, v2, Lm3/w0;->g:Z

    .line 501
    .line 502
    if-nez v9, :cond_28

    .line 503
    .line 504
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->y0()Z

    .line 505
    .line 506
    .line 507
    move-result v9

    .line 508
    if-eqz v9, :cond_28

    .line 509
    .line 510
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 511
    .line 512
    invoke-virtual {v9, v3}, Lm3/y;->d(Landroid/view/View;)I

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 517
    .line 518
    invoke-virtual {v11, v3}, Lm3/y;->b(Landroid/view/View;)I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 523
    .line 524
    invoke-virtual {v11}, Lm3/y;->h()I

    .line 525
    .line 526
    .line 527
    move-result v11

    .line 528
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 529
    .line 530
    invoke-virtual {v12}, Lm3/y;->f()I

    .line 531
    .line 532
    .line 533
    move-result v12

    .line 534
    if-gt v3, v11, :cond_24

    .line 535
    .line 536
    if-ge v9, v11, :cond_24

    .line 537
    .line 538
    move v13, v5

    .line 539
    goto :goto_10

    .line 540
    :cond_24
    move v13, v6

    .line 541
    :goto_10
    if-lt v9, v12, :cond_25

    .line 542
    .line 543
    if-le v3, v12, :cond_25

    .line 544
    .line 545
    move v3, v5

    .line 546
    goto :goto_11

    .line 547
    :cond_25
    move v3, v6

    .line 548
    :goto_11
    if-nez v13, :cond_26

    .line 549
    .line 550
    if-eqz v3, :cond_28

    .line 551
    .line 552
    :cond_26
    iget-boolean v3, v8, Lh3/x;->d:Z

    .line 553
    .line 554
    if-eqz v3, :cond_27

    .line 555
    .line 556
    move v11, v12

    .line 557
    :cond_27
    iput v11, v8, Lh3/x;->c:I

    .line 558
    .line 559
    :cond_28
    :goto_12
    move v3, v5

    .line 560
    goto :goto_14

    .line 561
    :cond_29
    :goto_13
    move v3, v6

    .line 562
    :goto_14
    if-eqz v3, :cond_2a

    .line 563
    .line 564
    goto :goto_16

    .line 565
    :cond_2a
    invoke-virtual {v8}, Lh3/x;->b()V

    .line 566
    .line 567
    .line 568
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 569
    .line 570
    if-eqz v3, :cond_2b

    .line 571
    .line 572
    invoke-virtual/range {p2 .. p2}, Lm3/w0;->b()I

    .line 573
    .line 574
    .line 575
    move-result v3

    .line 576
    add-int/2addr v3, v4

    .line 577
    goto :goto_15

    .line 578
    :cond_2b
    move v3, v6

    .line 579
    :goto_15
    iput v3, v8, Lh3/x;->b:I

    .line 580
    .line 581
    :goto_16
    iput-boolean v5, v8, Lh3/x;->e:Z

    .line 582
    .line 583
    :cond_2c
    :goto_17
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 584
    .line 585
    iget v9, v3, Lm3/u;->j:I

    .line 586
    .line 587
    if-ltz v9, :cond_2d

    .line 588
    .line 589
    move v9, v5

    .line 590
    goto :goto_18

    .line 591
    :cond_2d
    move v9, v4

    .line 592
    :goto_18
    iput v9, v3, Lm3/u;->f:I

    .line 593
    .line 594
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 595
    .line 596
    aput v6, v3, v6

    .line 597
    .line 598
    aput v6, v3, v5

    .line 599
    .line 600
    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->z0(Lm3/w0;[I)V

    .line 601
    .line 602
    .line 603
    aget v9, v3, v6

    .line 604
    .line 605
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    .line 606
    .line 607
    .line 608
    move-result v9

    .line 609
    iget-object v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 610
    .line 611
    invoke-virtual {v11}, Lm3/y;->h()I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    add-int/2addr v11, v9

    .line 616
    aget v3, v3, v5

    .line 617
    .line 618
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 623
    .line 624
    iget v12, v9, Lm3/y;->d:I

    .line 625
    .line 626
    iget-object v9, v9, Lm3/z;->a:Lm3/k0;

    .line 627
    .line 628
    packed-switch v12, :pswitch_data_0

    .line 629
    .line 630
    .line 631
    goto :goto_19

    .line 632
    :pswitch_0
    invoke-virtual {v9}, Lm3/k0;->D()I

    .line 633
    .line 634
    .line 635
    move-result v9

    .line 636
    goto :goto_1a

    .line 637
    :goto_19
    invoke-virtual {v9}, Lm3/k0;->B()I

    .line 638
    .line 639
    .line 640
    move-result v9

    .line 641
    :goto_1a
    add-int/2addr v9, v3

    .line 642
    iget-boolean v3, v2, Lm3/w0;->g:Z

    .line 643
    .line 644
    if-eqz v3, :cond_30

    .line 645
    .line 646
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 647
    .line 648
    if-eq v3, v4, :cond_30

    .line 649
    .line 650
    iget v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 651
    .line 652
    if-eq v12, v10, :cond_30

    .line 653
    .line 654
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->q(I)Landroid/view/View;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    if-eqz v3, :cond_30

    .line 659
    .line 660
    iget-boolean v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 661
    .line 662
    if-eqz v10, :cond_2e

    .line 663
    .line 664
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 665
    .line 666
    invoke-virtual {v10}, Lm3/y;->f()I

    .line 667
    .line 668
    .line 669
    move-result v10

    .line 670
    iget-object v12, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 671
    .line 672
    invoke-virtual {v12, v3}, Lm3/y;->b(Landroid/view/View;)I

    .line 673
    .line 674
    .line 675
    move-result v3

    .line 676
    sub-int/2addr v10, v3

    .line 677
    iget v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 678
    .line 679
    goto :goto_1b

    .line 680
    :cond_2e
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 681
    .line 682
    invoke-virtual {v10, v3}, Lm3/y;->d(Landroid/view/View;)I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 687
    .line 688
    invoke-virtual {v10}, Lm3/y;->h()I

    .line 689
    .line 690
    .line 691
    move-result v10

    .line 692
    sub-int/2addr v3, v10

    .line 693
    iget v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 694
    .line 695
    :goto_1b
    sub-int/2addr v10, v3

    .line 696
    if-lez v10, :cond_2f

    .line 697
    .line 698
    add-int/2addr v11, v10

    .line 699
    goto :goto_1c

    .line 700
    :cond_2f
    sub-int/2addr v9, v10

    .line 701
    :cond_30
    :goto_1c
    iget-boolean v3, v8, Lh3/x;->d:Z

    .line 702
    .line 703
    if-eqz v3, :cond_31

    .line 704
    .line 705
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 706
    .line 707
    if-eqz v3, :cond_32

    .line 708
    .line 709
    goto :goto_1d

    .line 710
    :cond_31
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 711
    .line 712
    if-eqz v3, :cond_33

    .line 713
    .line 714
    :cond_32
    move v3, v4

    .line 715
    goto :goto_1e

    .line 716
    :cond_33
    :goto_1d
    move v3, v5

    .line 717
    :goto_1e
    invoke-virtual {v0, v1, v2, v8, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->U0(La3/h;Lm3/w0;Lh3/x;I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {p0 .. p1}, Lm3/k0;->p(La3/h;)V

    .line 721
    .line 722
    .line 723
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 724
    .line 725
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 726
    .line 727
    invoke-virtual {v10}, Lm3/y;->g()I

    .line 728
    .line 729
    .line 730
    move-result v10

    .line 731
    if-nez v10, :cond_34

    .line 732
    .line 733
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 734
    .line 735
    invoke-virtual {v10}, Lm3/y;->e()I

    .line 736
    .line 737
    .line 738
    move-result v10

    .line 739
    if-nez v10, :cond_34

    .line 740
    .line 741
    move v10, v5

    .line 742
    goto :goto_1f

    .line 743
    :cond_34
    move v10, v6

    .line 744
    :goto_1f
    iput-boolean v10, v3, Lm3/u;->l:Z

    .line 745
    .line 746
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 747
    .line 748
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 752
    .line 753
    iput v6, v3, Lm3/u;->i:I

    .line 754
    .line 755
    iget-boolean v3, v8, Lh3/x;->d:Z

    .line 756
    .line 757
    if-eqz v3, :cond_36

    .line 758
    .line 759
    iget v3, v8, Lh3/x;->b:I

    .line 760
    .line 761
    iget v10, v8, Lh3/x;->c:I

    .line 762
    .line 763
    invoke-virtual {v0, v3, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 764
    .line 765
    .line 766
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 767
    .line 768
    iput v11, v3, Lm3/u;->h:I

    .line 769
    .line 770
    invoke-virtual {v0, v1, v3, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 771
    .line 772
    .line 773
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 774
    .line 775
    iget v10, v3, Lm3/u;->b:I

    .line 776
    .line 777
    iget v11, v3, Lm3/u;->d:I

    .line 778
    .line 779
    iget v3, v3, Lm3/u;->c:I

    .line 780
    .line 781
    if-lez v3, :cond_35

    .line 782
    .line 783
    add-int/2addr v9, v3

    .line 784
    :cond_35
    iget v3, v8, Lh3/x;->b:I

    .line 785
    .line 786
    iget v12, v8, Lh3/x;->c:I

    .line 787
    .line 788
    invoke-virtual {v0, v3, v12}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 789
    .line 790
    .line 791
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 792
    .line 793
    iput v9, v3, Lm3/u;->h:I

    .line 794
    .line 795
    iget v9, v3, Lm3/u;->d:I

    .line 796
    .line 797
    iget v12, v3, Lm3/u;->e:I

    .line 798
    .line 799
    add-int/2addr v9, v12

    .line 800
    iput v9, v3, Lm3/u;->d:I

    .line 801
    .line 802
    invoke-virtual {v0, v1, v3, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 803
    .line 804
    .line 805
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 806
    .line 807
    iget v9, v3, Lm3/u;->b:I

    .line 808
    .line 809
    iget v3, v3, Lm3/u;->c:I

    .line 810
    .line 811
    if-lez v3, :cond_39

    .line 812
    .line 813
    invoke-virtual {v0, v11, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 814
    .line 815
    .line 816
    iget-object v10, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 817
    .line 818
    iput v3, v10, Lm3/u;->h:I

    .line 819
    .line 820
    invoke-virtual {v0, v1, v10, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 821
    .line 822
    .line 823
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 824
    .line 825
    iget v10, v3, Lm3/u;->b:I

    .line 826
    .line 827
    goto :goto_20

    .line 828
    :cond_36
    iget v3, v8, Lh3/x;->b:I

    .line 829
    .line 830
    iget v10, v8, Lh3/x;->c:I

    .line 831
    .line 832
    invoke-virtual {v0, v3, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 833
    .line 834
    .line 835
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 836
    .line 837
    iput v9, v3, Lm3/u;->h:I

    .line 838
    .line 839
    invoke-virtual {v0, v1, v3, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 840
    .line 841
    .line 842
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 843
    .line 844
    iget v9, v3, Lm3/u;->b:I

    .line 845
    .line 846
    iget v10, v3, Lm3/u;->d:I

    .line 847
    .line 848
    iget v3, v3, Lm3/u;->c:I

    .line 849
    .line 850
    if-lez v3, :cond_37

    .line 851
    .line 852
    add-int/2addr v11, v3

    .line 853
    :cond_37
    iget v3, v8, Lh3/x;->b:I

    .line 854
    .line 855
    iget v12, v8, Lh3/x;->c:I

    .line 856
    .line 857
    invoke-virtual {v0, v3, v12}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 858
    .line 859
    .line 860
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 861
    .line 862
    iput v11, v3, Lm3/u;->h:I

    .line 863
    .line 864
    iget v11, v3, Lm3/u;->d:I

    .line 865
    .line 866
    iget v12, v3, Lm3/u;->e:I

    .line 867
    .line 868
    add-int/2addr v11, v12

    .line 869
    iput v11, v3, Lm3/u;->d:I

    .line 870
    .line 871
    invoke-virtual {v0, v1, v3, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 872
    .line 873
    .line 874
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 875
    .line 876
    iget v11, v3, Lm3/u;->b:I

    .line 877
    .line 878
    iget v3, v3, Lm3/u;->c:I

    .line 879
    .line 880
    if-lez v3, :cond_38

    .line 881
    .line 882
    invoke-virtual {v0, v10, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 883
    .line 884
    .line 885
    iget-object v9, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 886
    .line 887
    iput v3, v9, Lm3/u;->h:I

    .line 888
    .line 889
    invoke-virtual {v0, v1, v9, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 890
    .line 891
    .line 892
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 893
    .line 894
    iget v3, v3, Lm3/u;->b:I

    .line 895
    .line 896
    move v9, v3

    .line 897
    :cond_38
    move v10, v11

    .line 898
    :cond_39
    :goto_20
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 899
    .line 900
    .line 901
    move-result v3

    .line 902
    if-lez v3, :cond_3b

    .line 903
    .line 904
    iget-boolean v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 905
    .line 906
    iget-boolean v11, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 907
    .line 908
    xor-int/2addr v3, v11

    .line 909
    if-eqz v3, :cond_3a

    .line 910
    .line 911
    invoke-virtual {v0, v9, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(ILa3/h;Lm3/w0;Z)I

    .line 912
    .line 913
    .line 914
    move-result v3

    .line 915
    add-int/2addr v10, v3

    .line 916
    add-int/2addr v9, v3

    .line 917
    invoke-virtual {v0, v10, v1, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(ILa3/h;Lm3/w0;Z)I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    goto :goto_21

    .line 922
    :cond_3a
    invoke-virtual {v0, v10, v1, v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->P0(ILa3/h;Lm3/w0;Z)I

    .line 923
    .line 924
    .line 925
    move-result v3

    .line 926
    add-int/2addr v10, v3

    .line 927
    add-int/2addr v9, v3

    .line 928
    invoke-virtual {v0, v9, v1, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;->O0(ILa3/h;Lm3/w0;Z)I

    .line 929
    .line 930
    .line 931
    move-result v3

    .line 932
    :goto_21
    add-int/2addr v10, v3

    .line 933
    add-int/2addr v9, v3

    .line 934
    :cond_3b
    iget-boolean v3, v2, Lm3/w0;->k:Z

    .line 935
    .line 936
    if-eqz v3, :cond_44

    .line 937
    .line 938
    invoke-virtual/range {p0 .. p0}, Lm3/k0;->v()I

    .line 939
    .line 940
    .line 941
    move-result v3

    .line 942
    if-eqz v3, :cond_44

    .line 943
    .line 944
    iget-boolean v3, v2, Lm3/w0;->g:Z

    .line 945
    .line 946
    if-nez v3, :cond_44

    .line 947
    .line 948
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->y0()Z

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    if-nez v3, :cond_3c

    .line 953
    .line 954
    goto/16 :goto_28

    .line 955
    .line 956
    :cond_3c
    iget-object v3, v1, La3/h;->f:Ljava/lang/Object;

    .line 957
    .line 958
    check-cast v3, Ljava/util/List;

    .line 959
    .line 960
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 961
    .line 962
    .line 963
    move-result v11

    .line 964
    invoke-virtual {v0, v6}, Lm3/k0;->u(I)Landroid/view/View;

    .line 965
    .line 966
    .line 967
    move-result-object v12

    .line 968
    invoke-static {v12}, Lm3/k0;->F(Landroid/view/View;)I

    .line 969
    .line 970
    .line 971
    move-result v12

    .line 972
    move v13, v6

    .line 973
    move v14, v13

    .line 974
    move v15, v14

    .line 975
    :goto_22
    if-ge v13, v11, :cond_41

    .line 976
    .line 977
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v16

    .line 981
    move-object/from16 v5, v16

    .line 982
    .line 983
    check-cast v5, Lm3/a1;

    .line 984
    .line 985
    invoke-virtual {v5}, Lm3/a1;->j()Z

    .line 986
    .line 987
    .line 988
    move-result v16

    .line 989
    if-eqz v16, :cond_3d

    .line 990
    .line 991
    goto :goto_25

    .line 992
    :cond_3d
    invoke-virtual {v5}, Lm3/a1;->d()I

    .line 993
    .line 994
    .line 995
    move-result v7

    .line 996
    if-ge v7, v12, :cond_3e

    .line 997
    .line 998
    const/4 v7, 0x1

    .line 999
    goto :goto_23

    .line 1000
    :cond_3e
    move v7, v6

    .line 1001
    :goto_23
    iget-boolean v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 1002
    .line 1003
    if-eq v7, v6, :cond_3f

    .line 1004
    .line 1005
    move v6, v4

    .line 1006
    goto :goto_24

    .line 1007
    :cond_3f
    const/4 v6, 0x1

    .line 1008
    :goto_24
    iget-object v5, v5, Lm3/a1;->a:Landroid/view/View;

    .line 1009
    .line 1010
    if-ne v6, v4, :cond_40

    .line 1011
    .line 1012
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 1013
    .line 1014
    invoke-virtual {v6, v5}, Lm3/y;->c(Landroid/view/View;)I

    .line 1015
    .line 1016
    .line 1017
    move-result v5

    .line 1018
    add-int/2addr v14, v5

    .line 1019
    goto :goto_25

    .line 1020
    :cond_40
    iget-object v6, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 1021
    .line 1022
    invoke-virtual {v6, v5}, Lm3/y;->c(Landroid/view/View;)I

    .line 1023
    .line 1024
    .line 1025
    move-result v5

    .line 1026
    add-int/2addr v15, v5

    .line 1027
    :goto_25
    add-int/lit8 v13, v13, 0x1

    .line 1028
    .line 1029
    const/4 v5, 0x1

    .line 1030
    const/4 v6, 0x0

    .line 1031
    goto :goto_22

    .line 1032
    :cond_41
    iget-object v4, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1033
    .line 1034
    iput-object v3, v4, Lm3/u;->k:Ljava/util/List;

    .line 1035
    .line 1036
    if-lez v14, :cond_42

    .line 1037
    .line 1038
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1043
    .line 1044
    .line 1045
    move-result v3

    .line 1046
    invoke-virtual {v0, v3, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;->d1(II)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1050
    .line 1051
    iput v14, v3, Lm3/u;->h:I

    .line 1052
    .line 1053
    const/4 v4, 0x0

    .line 1054
    iput v4, v3, Lm3/u;->c:I

    .line 1055
    .line 1056
    const/4 v5, 0x0

    .line 1057
    invoke-virtual {v3, v5}, Lm3/u;->a(Landroid/view/View;)V

    .line 1058
    .line 1059
    .line 1060
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1061
    .line 1062
    invoke-virtual {v0, v1, v3, v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 1063
    .line 1064
    .line 1065
    goto :goto_26

    .line 1066
    :cond_42
    const/4 v4, 0x0

    .line 1067
    :goto_26
    if-lez v15, :cond_43

    .line 1068
    .line 1069
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v3

    .line 1073
    invoke-static {v3}, Lm3/k0;->F(Landroid/view/View;)I

    .line 1074
    .line 1075
    .line 1076
    move-result v3

    .line 1077
    invoke-virtual {v0, v3, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->c1(II)V

    .line 1078
    .line 1079
    .line 1080
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1081
    .line 1082
    iput v15, v3, Lm3/u;->h:I

    .line 1083
    .line 1084
    iput v4, v3, Lm3/u;->c:I

    .line 1085
    .line 1086
    const/4 v5, 0x0

    .line 1087
    invoke-virtual {v3, v5}, Lm3/u;->a(Landroid/view/View;)V

    .line 1088
    .line 1089
    .line 1090
    iget-object v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1091
    .line 1092
    invoke-virtual {v0, v1, v3, v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->G0(La3/h;Lm3/u;Lm3/w0;Z)I

    .line 1093
    .line 1094
    .line 1095
    goto :goto_27

    .line 1096
    :cond_43
    const/4 v5, 0x0

    .line 1097
    :goto_27
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 1098
    .line 1099
    iput-object v5, v1, Lm3/u;->k:Ljava/util/List;

    .line 1100
    .line 1101
    :cond_44
    :goto_28
    iget-boolean v1, v2, Lm3/w0;->g:Z

    .line 1102
    .line 1103
    if-nez v1, :cond_45

    .line 1104
    .line 1105
    iget-object v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 1106
    .line 1107
    invoke-virtual {v1}, Lm3/y;->i()I

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    iput v2, v1, Lm3/z;->b:I

    .line 1112
    .line 1113
    goto :goto_29

    .line 1114
    :cond_45
    invoke-virtual {v8}, Lh3/x;->f()V

    .line 1115
    .line 1116
    .line 1117
    :goto_29
    iget-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 1118
    .line 1119
    iput-boolean v1, v0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 1120
    .line 1121
    return-void

    .line 1122
    nop

    .line 1123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public a1(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->c(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public b0(Lm3/w0;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 6
    .line 7
    const/high16 p1, -0x80000000

    .line 8
    .line 9
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->A:Lh3/x;

    .line 12
    .line 13
    invoke-virtual {p1}, Lh3/x;->f()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b1(IIZLm3/w0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm3/y;->g()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 14
    .line 15
    invoke-virtual {v1}, Lm3/y;->e()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v3

    .line 24
    :goto_0
    iput-boolean v1, v0, Lm3/u;->l:Z

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 27
    .line 28
    iput p1, v0, Lm3/u;->f:I

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->D:[I

    .line 31
    .line 32
    aput v3, v0, v3

    .line 33
    .line 34
    aput v3, v0, v2

    .line 35
    .line 36
    invoke-virtual {p0, p4, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->z0(Lm3/w0;[I)V

    .line 37
    .line 38
    .line 39
    aget p4, v0, v3

    .line 40
    .line 41
    invoke-static {v3, p4}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p4

    .line 45
    aget v0, v0, v2

    .line 46
    .line 47
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-ne p1, v2, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    move v1, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v1, p4

    .line 61
    :goto_1
    iput v1, p1, Lm3/u;->h:I

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p4, v0

    .line 67
    :goto_2
    iput p4, p1, Lm3/u;->i:I

    .line 68
    .line 69
    const/4 p4, -0x1

    .line 70
    if-eqz v3, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 73
    .line 74
    iget v3, v0, Lm3/y;->d:I

    .line 75
    .line 76
    iget-object v0, v0, Lm3/z;->a:Lm3/k0;

    .line 77
    .line 78
    packed-switch v3, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :pswitch_0
    invoke-virtual {v0}, Lm3/k0;->D()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    goto :goto_4

    .line 87
    :goto_3
    invoke-virtual {v0}, Lm3/k0;->B()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    :goto_4
    add-int/2addr v0, v1

    .line 92
    iput v0, p1, Lm3/u;->h:I

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 99
    .line 100
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 101
    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    move v2, p4

    .line 105
    :cond_4
    iput v2, v0, Lm3/u;->e:I

    .line 106
    .line 107
    invoke-static {p1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 112
    .line 113
    iget v2, v1, Lm3/u;->e:I

    .line 114
    .line 115
    add-int/2addr p4, v2

    .line 116
    iput p4, v0, Lm3/u;->d:I

    .line 117
    .line 118
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 119
    .line 120
    invoke-virtual {p4, p1}, Lm3/y;->b(Landroid/view/View;)I

    .line 121
    .line 122
    .line 123
    move-result p4

    .line 124
    iput p4, v1, Lm3/u;->b:I

    .line 125
    .line 126
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 127
    .line 128
    invoke-virtual {p4, p1}, Lm3/y;->b(Landroid/view/View;)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 133
    .line 134
    invoke-virtual {p4}, Lm3/y;->f()I

    .line 135
    .line 136
    .line 137
    move-result p4

    .line 138
    sub-int/2addr p1, p4

    .line 139
    goto :goto_6

    .line 140
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 145
    .line 146
    iget v1, v0, Lm3/u;->h:I

    .line 147
    .line 148
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 149
    .line 150
    invoke-virtual {v3}, Lm3/y;->h()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    add-int/2addr v3, v1

    .line 155
    iput v3, v0, Lm3/u;->h:I

    .line 156
    .line 157
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 158
    .line 159
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 160
    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_6
    move v2, p4

    .line 165
    :goto_5
    iput v2, v0, Lm3/u;->e:I

    .line 166
    .line 167
    invoke-static {p1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result p4

    .line 171
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 172
    .line 173
    iget v2, v1, Lm3/u;->e:I

    .line 174
    .line 175
    add-int/2addr p4, v2

    .line 176
    iput p4, v0, Lm3/u;->d:I

    .line 177
    .line 178
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 179
    .line 180
    invoke-virtual {p4, p1}, Lm3/y;->d(Landroid/view/View;)I

    .line 181
    .line 182
    .line 183
    move-result p4

    .line 184
    iput p4, v1, Lm3/u;->b:I

    .line 185
    .line 186
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 187
    .line 188
    invoke-virtual {p4, p1}, Lm3/y;->d(Landroid/view/View;)I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    neg-int p1, p1

    .line 193
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 194
    .line 195
    invoke-virtual {p4}, Lm3/y;->h()I

    .line 196
    .line 197
    .line 198
    move-result p4

    .line 199
    add-int/2addr p1, p4

    .line 200
    :goto_6
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 201
    .line 202
    iput p2, p4, Lm3/u;->c:I

    .line 203
    .line 204
    if-eqz p3, :cond_7

    .line 205
    .line 206
    sub-int/2addr p2, p1

    .line 207
    iput p2, p4, Lm3/u;->c:I

    .line 208
    .line 209
    :cond_7
    iput p1, p4, Lm3/u;->g:I

    .line 210
    .line 211
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lm3/k0;->c(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final c0(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lm3/v;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lm3/v;

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 8
    .line 9
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iput v1, p1, Lm3/v;->a:I

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final c1(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm3/y;->f()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v1, p2

    .line 10
    iput v1, v0, Lm3/u;->c:I

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 13
    .line 14
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    iput v1, v0, Lm3/u;->e:I

    .line 23
    .line 24
    iput p1, v0, Lm3/u;->d:I

    .line 25
    .line 26
    iput v2, v0, Lm3/u;->f:I

    .line 27
    .line 28
    iput p2, v0, Lm3/u;->b:I

    .line 29
    .line 30
    const/high16 p1, -0x80000000

    .line 31
    .line 32
    iput p1, v0, Lm3/u;->g:I

    .line 33
    .line 34
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

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

.method public final d0()Landroid/os/Parcelable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lm3/v;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lm3/v;-><init>(Lm3/v;)V

    .line 8
    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    new-instance v0, Lm3/v;

    .line 12
    .line 13
    invoke-direct {v0}, Lm3/v;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-lez v1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 26
    .line 27
    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 28
    .line 29
    xor-int/2addr v1, v2

    .line 30
    iput-boolean v1, v0, Lm3/v;->c:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q0()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 39
    .line 40
    invoke-virtual {v2}, Lm3/y;->f()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Lm3/y;->b(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v2, v3

    .line 51
    iput v2, v0, Lm3/v;->b:I

    .line 52
    .line 53
    invoke-static {v1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput v1, v0, Lm3/v;->a:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R0()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v0, Lm3/v;->a:I

    .line 69
    .line 70
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 71
    .line 72
    invoke-virtual {v2, v1}, Lm3/y;->d(Landroid/view/View;)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 77
    .line 78
    invoke-virtual {v2}, Lm3/y;->h()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sub-int/2addr v1, v2

    .line 83
    iput v1, v0, Lm3/v;->b:I

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    const/4 v1, -0x1

    .line 87
    iput v1, v0, Lm3/v;->a:I

    .line 88
    .line 89
    :goto_0
    return-object v0
.end method

.method public final d1(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm3/y;->h()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v1, p2, v1

    .line 10
    .line 11
    iput v1, v0, Lm3/u;->c:I

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 14
    .line 15
    iput p1, v0, Lm3/u;->d:I

    .line 16
    .line 17
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    :goto_0
    iput p1, v0, Lm3/u;->e:I

    .line 26
    .line 27
    iput v1, v0, Lm3/u;->f:I

    .line 28
    .line 29
    iput p2, v0, Lm3/u;->b:I

    .line 30
    .line 31
    const/high16 p1, -0x80000000

    .line 32
    .line 33
    iput p1, v0, Lm3/u;->g:I

    .line 34
    .line 35
    return-void
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x0

    .line 8
    :goto_0
    return v1
.end method

.method public final h(IILm3/w0;Ln/g;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move p1, p2

    .line 7
    :goto_0
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->F0()V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    if-lez p1, :cond_2

    .line 21
    .line 22
    move v0, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const/4 v0, -0x1

    .line 25
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->b1(IIZLm3/w0;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 33
    .line 34
    invoke-virtual {p0, p3, p1, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;->A0(Lm3/w0;Lm3/u;Ln/g;)V

    .line 35
    .line 36
    .line 37
    :cond_3
    :goto_2
    return-void
.end method

.method public final i(ILn/g;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget v4, v0, Lm3/v;->a:I

    .line 9
    .line 10
    if-ltz v4, :cond_0

    .line 11
    .line 12
    move v5, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v5, v3

    .line 15
    :goto_0
    if-eqz v5, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Lm3/v;->c:Z

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->X0()V

    .line 21
    .line 22
    .line 23
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->u:Z

    .line 24
    .line 25
    iget v4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 26
    .line 27
    if-ne v4, v2, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, p1, -0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v4, v3

    .line 35
    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    .line 36
    .line 37
    move v1, v2

    .line 38
    :cond_4
    move v0, v3

    .line 39
    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->C:I

    .line 40
    .line 41
    if-ge v0, v2, :cond_5

    .line 42
    .line 43
    if-ltz v4, :cond_5

    .line 44
    .line 45
    if-ge v4, p1, :cond_5

    .line 46
    .line 47
    invoke-virtual {p2, v4, v3}, Ln/g;->b(II)V

    .line 48
    .line 49
    .line 50
    add-int/2addr v4, v1

    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_5
    return-void
.end method

.method public final j(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->B0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public k(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public l(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public l0(ILa3/h;Lm3/w0;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILa3/h;Lm3/w0;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final m(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->B0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final m0(I)V
    .locals 1

    .line 1
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->x:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->y:I

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lm3/v;->a:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lm3/k0;->k0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public n(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->C0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public n0(ILa3/h;Lm3/w0;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Y0(ILa3/h;Lm3/w0;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public o(Lm3/w0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->D0(Lm3/w0;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final q(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, Lm3/k0;->F(Landroid/view/View;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int v1, p1, v1

    .line 19
    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    if-ge v1, v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lm3/k0;->u(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lm3/k0;->F(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-ne v1, p1, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-super {p0, p1}, Lm3/k0;->q(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public r()Lm3/l0;
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

.method public final u0()Z
    .locals 6

    .line 1
    iget v0, p0, Lm3/k0;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x40000000    # 2.0f

    .line 5
    .line 6
    if-eq v0, v2, :cond_2

    .line 7
    .line 8
    iget v0, p0, Lm3/k0;->l:I

    .line 9
    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Lm3/k0;->v()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    const/4 v3, 0x1

    .line 18
    if-ge v2, v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lm3/k0;->u(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v5, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 29
    .line 30
    if-gez v5, :cond_0

    .line 31
    .line 32
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 33
    .line 34
    if-gez v4, :cond_0

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v0, v1

    .line 42
    :goto_1
    if-eqz v0, :cond_2

    .line 43
    .line 44
    move v1, v3

    .line 45
    :cond_2
    return v1
.end method

.method public w0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    new-instance v0, Lm3/w;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lm3/w;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p2, v0, Lm3/w;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lm3/k0;->x0(Lm3/w;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public y0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->z:Lm3/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->s:Z

    .line 6
    .line 7
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->v:Z

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    return v0
.end method

.method public z0(Lm3/w0;[I)V
    .locals 4

    .line 1
    iget p1, p1, Lm3/w0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, -0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq p1, v1, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v2

    .line 11
    :goto_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->r:Lm3/y;

    .line 14
    .line 15
    invoke-virtual {p1}, Lm3/y;->i()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move p1, v2

    .line 21
    :goto_1
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->q:Lm3/u;

    .line 22
    .line 23
    iget v3, v3, Lm3/u;->f:I

    .line 24
    .line 25
    if-ne v3, v1, :cond_2

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v1, p1

    .line 30
    move p1, v2

    .line 31
    :goto_2
    aput p1, p2, v2

    .line 32
    .line 33
    aput v1, p2, v0

    .line 34
    .line 35
    return-void
.end method
