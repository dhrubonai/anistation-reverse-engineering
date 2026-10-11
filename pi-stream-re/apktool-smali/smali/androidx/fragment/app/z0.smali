.class public final Landroidx/fragment/app/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/h0;

.field public final b:Li/g;

.field public final c:Landroidx/fragment/app/y;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/h0;Li/g;Landroidx/fragment/app/y;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/z0;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/fragment/app/z0;->e:I

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/h0;Li/g;Landroidx/fragment/app/y;Landroidx/fragment/app/y0;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Landroidx/fragment/app/z0;->d:Z

    const/4 v1, -0x1

    .line 36
    iput v1, p0, Landroidx/fragment/app/z0;->e:I

    .line 37
    iput-object p1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 38
    iput-object p2, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 39
    iput-object p3, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    const/4 p1, 0x0

    .line 40
    iput-object p1, p3, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 41
    iput-object p1, p3, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 42
    iput v0, p3, Landroidx/fragment/app/y;->H:I

    .line 43
    iput-boolean v0, p3, Landroidx/fragment/app/y;->E:Z

    .line 44
    iput-boolean v0, p3, Landroidx/fragment/app/y;->B:Z

    .line 45
    iget-object p2, p3, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 46
    iput-object p1, p3, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 47
    iget-object p1, p4, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 48
    iput-object p1, p3, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/h0;Li/g;Ljava/lang/ClassLoader;Landroidx/fragment/app/m0;Landroidx/fragment/app/y0;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Landroidx/fragment/app/z0;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/fragment/app/z0;->e:I

    .line 10
    iput-object p1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 11
    iput-object p2, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 12
    iget-object p1, p5, Landroidx/fragment/app/y0;->a:Ljava/lang/String;

    .line 13
    invoke-virtual {p4, p1}, Landroidx/fragment/app/m0;->a(Ljava/lang/String;)Landroidx/fragment/app/y;

    move-result-object p1

    .line 14
    iget-object p2, p5, Landroidx/fragment/app/y0;->A:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 16
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/y;->S(Landroid/os/Bundle;)V

    .line 17
    iget-object p2, p5, Landroidx/fragment/app/y0;->b:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 18
    iget-boolean p2, p5, Landroidx/fragment/app/y0;->c:Z

    iput-boolean p2, p1, Landroidx/fragment/app/y;->D:Z

    const/4 p2, 0x1

    .line 19
    iput-boolean p2, p1, Landroidx/fragment/app/y;->F:Z

    .line 20
    iget p2, p5, Landroidx/fragment/app/y0;->d:I

    iput p2, p1, Landroidx/fragment/app/y;->M:I

    .line 21
    iget p2, p5, Landroidx/fragment/app/y0;->e:I

    iput p2, p1, Landroidx/fragment/app/y;->N:I

    .line 22
    iget-object p2, p5, Landroidx/fragment/app/y0;->f:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/y;->O:Ljava/lang/String;

    .line 23
    iget-boolean p2, p5, Landroidx/fragment/app/y0;->x:Z

    iput-boolean p2, p1, Landroidx/fragment/app/y;->R:Z

    .line 24
    iget-boolean p2, p5, Landroidx/fragment/app/y0;->y:Z

    iput-boolean p2, p1, Landroidx/fragment/app/y;->C:Z

    .line 25
    iget-boolean p2, p5, Landroidx/fragment/app/y0;->z:Z

    iput-boolean p2, p1, Landroidx/fragment/app/y;->Q:Z

    .line 26
    iget-boolean p2, p5, Landroidx/fragment/app/y0;->B:Z

    iput-boolean p2, p1, Landroidx/fragment/app/y;->P:Z

    .line 27
    invoke-static {}, Landroidx/lifecycle/o;->values()[Landroidx/lifecycle/o;

    move-result-object p2

    iget p3, p5, Landroidx/fragment/app/y0;->C:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/y;->c0:Landroidx/lifecycle/o;

    .line 28
    iget-object p2, p5, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 29
    iput-object p2, p1, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    goto :goto_0

    .line 30
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 31
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    const/4 p2, 0x2

    .line 32
    invoke-static {p2}, Landroidx/fragment/app/s0;->H(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 33
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Instantiated fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object v1, v3, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/s0;->M()V

    .line 34
    .line 35
    .line 36
    iput v0, v3, Landroidx/fragment/app/y;->a:I

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, v3, Landroidx/fragment/app/y;->T:Z

    .line 40
    .line 41
    invoke-virtual {v3}, Landroidx/fragment/app/y;->t()V

    .line 42
    .line 43
    .line 44
    iget-boolean v4, v3, Landroidx/fragment/app/y;->T:Z

    .line 45
    .line 46
    const-string v5, "Fragment "

    .line 47
    .line 48
    if-eqz v4, :cond_6

    .line 49
    .line 50
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v4, "moveto RESTORE_VIEW_STATE: "

    .line 59
    .line 60
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object v0, v3, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v4, v3, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 79
    .line 80
    iget-object v6, v3, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0, v6}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, v3, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 88
    .line 89
    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    iget-object v0, v3, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 94
    .line 95
    iget-object v6, v3, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 96
    .line 97
    iget-object v0, v0, Landroidx/fragment/app/j1;->e:Ln3/f;

    .line 98
    .line 99
    invoke-virtual {v0, v6}, Ln3/f;->b(Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, v3, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 103
    .line 104
    :cond_3
    iput-boolean v1, v3, Landroidx/fragment/app/y;->T:Z

    .line 105
    .line 106
    invoke-virtual {v3, v4}, Landroidx/fragment/app/y;->J(Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v0, v3, Landroidx/fragment/app/y;->T:Z

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    iget-object v0, v3, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 114
    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    iget-object v0, v3, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 118
    .line 119
    sget-object v4, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 120
    .line 121
    invoke-virtual {v0, v4}, Landroidx/fragment/app/j1;->a(Landroidx/lifecycle/n;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    new-instance v0, Landroidx/fragment/app/o1;

    .line 126
    .line 127
    const-string v1, " did not call through to super.onViewStateRestored()"

    .line 128
    .line 129
    invoke-static {v5, v3, v1}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_5
    :goto_0
    iput-object v2, v3, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 138
    .line 139
    iget-object v0, v3, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 140
    .line 141
    iput-boolean v1, v0, Landroidx/fragment/app/s0;->E:Z

    .line 142
    .line 143
    iput-boolean v1, v0, Landroidx/fragment/app/s0;->F:Z

    .line 144
    .line 145
    iget-object v2, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 146
    .line 147
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->f:Z

    .line 148
    .line 149
    const/4 v2, 0x4

    .line 150
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->t(I)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroidx/fragment/app/h0;->a(Z)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    new-instance v0, Landroidx/fragment/app/o1;

    .line 160
    .line 161
    const-string v1, " did not call through to super.onActivityCreated()"

    .line 162
    .line 163
    invoke-static {v5, v3, v1}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v4, v0, Li/g;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    add-int/lit8 v5, v4, -0x1

    .line 23
    .line 24
    :goto_0
    if-ltz v5, :cond_2

    .line 25
    .line 26
    iget-object v6, v0, Li/g;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Landroidx/fragment/app/y;

    .line 35
    .line 36
    iget-object v7, v6, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 37
    .line 38
    if-ne v7, v2, :cond_1

    .line 39
    .line 40
    iget-object v6, v6, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/lit8 v3, v0, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    iget-object v5, v0, Li/g;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ge v4, v5, :cond_3

    .line 65
    .line 66
    iget-object v5, v0, Li/g;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v5, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Landroidx/fragment/app/y;

    .line 75
    .line 76
    iget-object v6, v5, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 77
    .line 78
    if-ne v6, v2, :cond_2

    .line 79
    .line 80
    iget-object v5, v5, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 81
    .line 82
    if-eqz v5, :cond_2

    .line 83
    .line 84
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    :cond_3
    :goto_1
    iget-object v0, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 89
    .line 90
    iget-object v1, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 91
    .line 92
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 30
    .line 31
    const-string v2, " that does not belong to this FragmentManager!"

    .line 32
    .line 33
    const-string v3, " declared target fragment "

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    iget-object v5, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 37
    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v5, Li/g;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroidx/fragment/app/z0;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v2, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v2, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v4, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 63
    .line 64
    move-object v4, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 80
    .line 81
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v4, v5, Li/g;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v4, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v4, v0

    .line 108
    check-cast v4, Landroidx/fragment/app/z0;

    .line 109
    .line 110
    if-eqz v4, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    new-instance v4, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget-object v1, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v4, v1, v2}, La3/g;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_4
    :goto_0
    if-eqz v4, :cond_5

    .line 137
    .line 138
    invoke-virtual {v4}, Landroidx/fragment/app/z0;->k()V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 142
    .line 143
    iget-object v2, v0, Landroidx/fragment/app/s0;->t:Landroidx/fragment/app/a0;

    .line 144
    .line 145
    iput-object v2, v1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 146
    .line 147
    iget-object v0, v0, Landroidx/fragment/app/s0;->v:Landroidx/fragment/app/y;

    .line 148
    .line 149
    iput-object v0, v1, Landroidx/fragment/app/y;->L:Landroidx/fragment/app/y;

    .line 150
    .line 151
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 152
    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-virtual {v0, v2}, Landroidx/fragment/app/h0;->g(Z)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v1, Landroidx/fragment/app/y;->j0:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Landroidx/fragment/app/x;

    .line 174
    .line 175
    invoke-virtual {v5}, Landroidx/fragment/app/x;->a()V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 180
    .line 181
    .line 182
    iget-object v3, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 183
    .line 184
    iget-object v4, v1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroidx/fragment/app/y;->f()Lcom/bumptech/glide/c;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v3, v4, v5, v1}, Landroidx/fragment/app/s0;->b(Landroidx/fragment/app/a0;Lcom/bumptech/glide/c;Landroidx/fragment/app/y;)V

    .line 191
    .line 192
    .line 193
    iput v2, v1, Landroidx/fragment/app/y;->a:I

    .line 194
    .line 195
    iput-boolean v2, v1, Landroidx/fragment/app/y;->T:Z

    .line 196
    .line 197
    iget-object v3, v1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 198
    .line 199
    iget-object v3, v3, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 200
    .line 201
    invoke-virtual {v1, v3}, Landroidx/fragment/app/y;->w(Landroid/content/Context;)V

    .line 202
    .line 203
    .line 204
    iget-boolean v3, v1, Landroidx/fragment/app/y;->T:Z

    .line 205
    .line 206
    if-eqz v3, :cond_8

    .line 207
    .line 208
    iget-object v3, v1, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 209
    .line 210
    iget-object v3, v3, Landroidx/fragment/app/s0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_7

    .line 221
    .line 222
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Landroidx/fragment/app/x0;

    .line 227
    .line 228
    invoke-interface {v4, v1}, Landroidx/fragment/app/x0;->a(Landroidx/fragment/app/y;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_7
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 233
    .line 234
    iput-boolean v2, v1, Landroidx/fragment/app/s0;->E:Z

    .line 235
    .line 236
    iput-boolean v2, v1, Landroidx/fragment/app/s0;->F:Z

    .line 237
    .line 238
    iget-object v3, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 239
    .line 240
    iput-boolean v2, v3, Landroidx/fragment/app/w0;->f:Z

    .line 241
    .line 242
    invoke-virtual {v1, v2}, Landroidx/fragment/app/s0;->t(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v2}, Landroidx/fragment/app/h0;->b(Z)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_8
    new-instance v0, Landroidx/fragment/app/o1;

    .line 250
    .line 251
    const-string v2, " did not call through to super.onAttach()"

    .line 252
    .line 253
    invoke-static {v6, v1, v2}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0
.end method

.method public final d()I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/fragment/app/y;->a:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/z0;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/fragment/app/y;->c0:Landroidx/lifecycle/o;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, -0x1

    .line 23
    const/4 v8, 0x5

    .line 24
    const/4 v9, 0x4

    .line 25
    if-eq v2, v3, :cond_3

    .line 26
    .line 27
    if-eq v2, v4, :cond_2

    .line 28
    .line 29
    if-eq v2, v5, :cond_1

    .line 30
    .line 31
    if-eq v2, v9, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/y;->D:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Landroidx/fragment/app/y;->E:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, Landroidx/fragment/app/z0;->e:I

    .line 61
    .line 62
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, Landroidx/fragment/app/z0;->e:I

    .line 82
    .line 83
    if-ge v2, v9, :cond_6

    .line 84
    .line 85
    iget v2, v0, Landroidx/fragment/app/y;->a:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/y;->B:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_d

    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/fragment/app/y;->m()Landroidx/fragment/app/s0;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v0}, Landroidx/fragment/app/n1;->d(Landroidx/fragment/app/y;)Landroidx/fragment/app/m1;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_9

    .line 128
    .line 129
    iget v6, v10, Landroidx/fragment/app/m1;->b:I

    .line 130
    .line 131
    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/n1;->c:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_b

    .line 142
    .line 143
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    check-cast v10, Landroidx/fragment/app/m1;

    .line 148
    .line 149
    iget-object v11, v10, Landroidx/fragment/app/m1;->c:Landroidx/fragment/app/y;

    .line 150
    .line 151
    invoke-virtual {v11, v0}, Landroidx/fragment/app/y;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    if-eqz v11, :cond_a

    .line 156
    .line 157
    iget-boolean v11, v10, Landroidx/fragment/app/m1;->f:Z

    .line 158
    .line 159
    if-nez v11, :cond_a

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    const/4 v10, 0x0

    .line 163
    :goto_2
    if-eqz v10, :cond_d

    .line 164
    .line 165
    if-eqz v6, :cond_c

    .line 166
    .line 167
    if-ne v6, v3, :cond_d

    .line 168
    .line 169
    :cond_c
    iget v6, v10, Landroidx/fragment/app/m1;->b:I

    .line 170
    .line 171
    :cond_d
    if-ne v6, v4, :cond_e

    .line 172
    .line 173
    const/4 v2, 0x6

    .line 174
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    goto :goto_3

    .line 179
    :cond_e
    if-ne v6, v5, :cond_f

    .line 180
    .line 181
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    goto :goto_3

    .line 186
    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/y;->C:Z

    .line 187
    .line 188
    if-eqz v2, :cond_11

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/fragment/app/y;->s()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_10

    .line 195
    .line 196
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    goto :goto_3

    .line 201
    :cond_10
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    :cond_11
    :goto_3
    iget-boolean v2, v0, Landroidx/fragment/app/y;->W:Z

    .line 206
    .line 207
    if-eqz v2, :cond_12

    .line 208
    .line 209
    iget v2, v0, Landroidx/fragment/app/y;->a:I

    .line 210
    .line 211
    if-ge v2, v8, :cond_12

    .line 212
    .line 213
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    :cond_12
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-eqz v2, :cond_13

    .line 222
    .line 223
    new-instance v2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v3, "computeExpectedState() of "

    .line 226
    .line 227
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v3, " for "

    .line 234
    .line 235
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    const-string v2, "FragmentManager"

    .line 246
    .line 247
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    :cond_13
    return v1
.end method

.method public final e()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, Landroidx/fragment/app/y;->a0:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Landroidx/fragment/app/h0;->h(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v1, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 41
    .line 42
    iget-object v5, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 43
    .line 44
    invoke-virtual {v5}, Landroidx/fragment/app/s0;->M()V

    .line 45
    .line 46
    .line 47
    iput v2, v1, Landroidx/fragment/app/y;->a:I

    .line 48
    .line 49
    iput-boolean v3, v1, Landroidx/fragment/app/y;->T:Z

    .line 50
    .line 51
    iget-object v5, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 52
    .line 53
    new-instance v6, Landroidx/fragment/app/t;

    .line 54
    .line 55
    invoke-direct {v6, v1}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/y;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v6}, Landroidx/lifecycle/w;->a(Landroidx/lifecycle/t;)V

    .line 59
    .line 60
    .line 61
    iget-object v5, v1, Landroidx/fragment/app/y;->h0:Ln3/f;

    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ln3/f;->b(Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v4}, Landroidx/fragment/app/y;->x(Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v2, v1, Landroidx/fragment/app/y;->a0:Z

    .line 70
    .line 71
    iget-boolean v2, v1, Landroidx/fragment/app/y;->T:Z

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    iget-object v1, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 76
    .line 77
    sget-object v2, Landroidx/lifecycle/n;->ON_CREATE:Landroidx/lifecycle/n;

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, Landroidx/fragment/app/h0;->c(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    new-instance v0, Landroidx/fragment/app/o1;

    .line 87
    .line 88
    const-string v2, "Fragment "

    .line 89
    .line 90
    const-string v3, " did not call through to super.onCreate()"

    .line 91
    .line 92
    invoke-static {v2, v1, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Landroidx/fragment/app/y;->Q(Landroid/os/Bundle;)V

    .line 103
    .line 104
    .line 105
    iput v2, v1, Landroidx/fragment/app/y;->a:I

    .line 106
    .line 107
    :goto_0
    return-void
.end method

.method public final f()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/y;->D:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, Landroidx/fragment/app/s0;->H(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "FragmentManager"

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "moveto CREATE_VIEW: "

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->C(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v3, v0, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    iget v3, v0, Landroidx/fragment/app/y;->N:I

    .line 47
    .line 48
    if-eqz v3, :cond_6

    .line 49
    .line 50
    const/4 v4, -0x1

    .line 51
    if-eq v3, v4, :cond_5

    .line 52
    .line 53
    iget-object v4, v0, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 54
    .line 55
    iget-object v4, v4, Landroidx/fragment/app/s0;->u:Lcom/bumptech/glide/c;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, Lcom/bumptech/glide/c;->P(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Landroid/view/ViewGroup;

    .line 62
    .line 63
    if-nez v3, :cond_4

    .line 64
    .line 65
    iget-boolean v4, v0, Landroidx/fragment/app/y;->F:Z

    .line 66
    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_3
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/y;->O()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget v2, v0, Landroidx/fragment/app/y;->N:I

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 86
    :catch_0
    const-string v1, "unknown"

    .line 87
    .line 88
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v4, "No view found for id 0x"

    .line 93
    .line 94
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget v4, v0, Landroidx/fragment/app/y;->N:I

    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v4, " ("

    .line 107
    .line 108
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ") for fragment "

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v2

    .line 130
    :cond_4
    instance-of v4, v3, Landroidx/fragment/app/FragmentContainerView;

    .line 131
    .line 132
    if-nez v4, :cond_7

    .line 133
    .line 134
    sget-object v4, Lv0/c;->a:Lv0/b;

    .line 135
    .line 136
    new-instance v4, Lv0/d;

    .line 137
    .line 138
    const/4 v5, 0x1

    .line 139
    invoke-direct {v4, v0, v3, v5}, Lv0/d;-><init>(Landroidx/fragment/app/y;Landroid/view/ViewGroup;I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v4}, Lv0/c;->c(Lv0/e;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lv0/c;->a(Landroidx/fragment/app/y;)Lv0/b;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    iget-object v6, v5, Lv0/b;->a:Ljava/util/Set;

    .line 150
    .line 151
    sget-object v7, Lv0/a;->e:Lv0/a;

    .line 152
    .line 153
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_7

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    const-class v7, Lv0/d;

    .line 164
    .line 165
    invoke-static {v5, v6, v7}, Lv0/c;->e(Lv0/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_7

    .line 170
    .line 171
    invoke-static {v5, v4}, Lv0/c;->b(Lv0/b;Lv0/e;)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    const-string v2, "Cannot create fragment "

    .line 178
    .line 179
    const-string v3, " for a container view with no id"

    .line 180
    .line 181
    invoke-static {v2, v0, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v1

    .line 189
    :cond_6
    const/4 v3, 0x0

    .line 190
    :cond_7
    :goto_1
    iput-object v3, v0, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 191
    .line 192
    iget-object v4, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 193
    .line 194
    invoke-virtual {v0, v1, v3, v4}, Landroidx/fragment/app/y;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 195
    .line 196
    .line 197
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 198
    .line 199
    const/4 v4, 0x2

    .line 200
    if-eqz v1, :cond_c

    .line 201
    .line 202
    const/4 v5, 0x0

    .line 203
    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 204
    .line 205
    .line 206
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 207
    .line 208
    const v6, 0x7f0a00ec

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    if-eqz v3, :cond_8

    .line 215
    .line 216
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->b()V

    .line 217
    .line 218
    .line 219
    :cond_8
    iget-boolean v1, v0, Landroidx/fragment/app/y;->P:Z

    .line 220
    .line 221
    if-eqz v1, :cond_9

    .line 222
    .line 223
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 224
    .line 225
    const/16 v3, 0x8

    .line 226
    .line 227
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    :cond_9
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 231
    .line 232
    sget-object v3, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 233
    .line 234
    invoke-static {v1}, Lg0/k0;->b(Landroid/view/View;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_a

    .line 239
    .line 240
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 241
    .line 242
    invoke-static {v1}, Lg0/l0;->c(Landroid/view/View;)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 247
    .line 248
    new-instance v3, Landroidx/fragment/app/f0;

    .line 249
    .line 250
    invoke-direct {v3, p0, v1}, Landroidx/fragment/app/f0;-><init>(Landroidx/fragment/app/z0;Landroid/view/View;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 254
    .line 255
    .line 256
    :goto_2
    invoke-virtual {v0}, Landroidx/fragment/app/y;->I()V

    .line 257
    .line 258
    .line 259
    iget-object v1, v0, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 260
    .line 261
    invoke-virtual {v1, v4}, Landroidx/fragment/app/s0;->t(I)V

    .line 262
    .line 263
    .line 264
    iget-object v1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 265
    .line 266
    invoke-virtual {v1, v5}, Landroidx/fragment/app/h0;->m(Z)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 270
    .line 271
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    iget-object v3, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 276
    .line 277
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-virtual {v0}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    iput v3, v5, Landroidx/fragment/app/v;->l:F

    .line 286
    .line 287
    iget-object v3, v0, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 288
    .line 289
    if-eqz v3, :cond_c

    .line 290
    .line 291
    if-nez v1, :cond_c

    .line 292
    .line 293
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 294
    .line 295
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-eqz v1, :cond_b

    .line 300
    .line 301
    invoke-virtual {v0}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    iput-object v1, v3, Landroidx/fragment/app/v;->m:Landroid/view/View;

    .line 306
    .line 307
    invoke-static {v4}, Landroidx/fragment/app/s0;->H(I)Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_b

    .line 312
    .line 313
    new-instance v3, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v5, "requestFocus: Saved focused view "

    .line 316
    .line 317
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v1, " for Fragment "

    .line 324
    .line 325
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    :cond_b
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 339
    .line 340
    const/4 v2, 0x0

    .line 341
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 342
    .line 343
    .line 344
    :cond_c
    iput v4, v0, Landroidx/fragment/app/y;->a:I

    .line 345
    .line 346
    return-void
.end method

.method public final g()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, Landroidx/fragment/app/y;->C:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Landroidx/fragment/app/y;->s()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v3

    .line 44
    :goto_0
    const/4 v4, 0x0

    .line 45
    iget-object v5, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v6, v1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v5, v6, v4}, Li/g;->R(Ljava/lang/String;Landroidx/fragment/app/y0;)Landroidx/fragment/app/y0;

    .line 52
    .line 53
    .line 54
    :cond_2
    if-nez v0, :cond_6

    .line 55
    .line 56
    iget-object v6, v5, Li/g;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Landroidx/fragment/app/w0;

    .line 59
    .line 60
    iget-object v7, v6, Landroidx/fragment/app/w0;->a:Ljava/util/HashMap;

    .line 61
    .line 62
    iget-object v8, v1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget-boolean v7, v6, Landroidx/fragment/app/w0;->d:Z

    .line 72
    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    iget-boolean v6, v6, Landroidx/fragment/app/w0;->e:Z

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    move v6, v2

    .line 79
    :goto_2
    if-eqz v6, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    move v6, v3

    .line 83
    goto :goto_4

    .line 84
    :cond_6
    :goto_3
    move v6, v2

    .line 85
    :goto_4
    if-eqz v6, :cond_f

    .line 86
    .line 87
    iget-object v6, v1, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 88
    .line 89
    instance-of v7, v6, Landroidx/lifecycle/c1;

    .line 90
    .line 91
    if-eqz v7, :cond_7

    .line 92
    .line 93
    iget-object v2, v5, Li/g;->e:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Landroidx/fragment/app/w0;

    .line 96
    .line 97
    iget-boolean v2, v2, Landroidx/fragment/app/w0;->e:Z

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    iget-object v6, v6, Landroidx/fragment/app/a0;->D:Landroid/content/Context;

    .line 101
    .line 102
    instance-of v7, v6, Landroid/app/Activity;

    .line 103
    .line 104
    if-eqz v7, :cond_8

    .line 105
    .line 106
    check-cast v6, Landroid/app/Activity;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    xor-int/2addr v2, v6

    .line 113
    :cond_8
    :goto_5
    if-eqz v0, :cond_9

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_9
    if-eqz v2, :cond_a

    .line 117
    .line 118
    :goto_6
    iget-object v0, v5, Li/g;->e:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Landroidx/fragment/app/w0;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroidx/fragment/app/w0;->b(Landroidx/fragment/app/y;)V

    .line 123
    .line 124
    .line 125
    :cond_a
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->k()V

    .line 128
    .line 129
    .line 130
    iget-object v0, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 131
    .line 132
    sget-object v2, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 135
    .line 136
    .line 137
    iput v3, v1, Landroidx/fragment/app/y;->a:I

    .line 138
    .line 139
    iput-boolean v3, v1, Landroidx/fragment/app/y;->T:Z

    .line 140
    .line 141
    iput-boolean v3, v1, Landroidx/fragment/app/y;->a0:Z

    .line 142
    .line 143
    invoke-virtual {v1}, Landroidx/fragment/app/y;->z()V

    .line 144
    .line 145
    .line 146
    iget-boolean v0, v1, Landroidx/fragment/app/y;->T:Z

    .line 147
    .line 148
    if-eqz v0, :cond_e

    .line 149
    .line 150
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 151
    .line 152
    invoke-virtual {v0, v3}, Landroidx/fragment/app/h0;->d(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Li/g;->v()Ljava/util/ArrayList;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    :cond_b
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_c

    .line 168
    .line 169
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    check-cast v2, Landroidx/fragment/app/z0;

    .line 174
    .line 175
    if-eqz v2, :cond_b

    .line 176
    .line 177
    iget-object v3, v1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v2, v2, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 180
    .line 181
    iget-object v6, v2, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_b

    .line 188
    .line 189
    iput-object v1, v2, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 190
    .line 191
    iput-object v4, v2, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_c
    iget-object v0, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 195
    .line 196
    if-eqz v0, :cond_d

    .line 197
    .line 198
    invoke-virtual {v5, v0}, Li/g;->s(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iput-object v0, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 203
    .line 204
    :cond_d
    invoke-virtual {v5, p0}, Li/g;->H(Landroidx/fragment/app/z0;)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_e
    new-instance v0, Landroidx/fragment/app/o1;

    .line 209
    .line 210
    const-string v2, "Fragment "

    .line 211
    .line 212
    const-string v3, " did not call through to super.onDestroy()"

    .line 213
    .line 214
    invoke-static {v2, v1, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0

    .line 222
    :cond_f
    iget-object v0, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 223
    .line 224
    if-eqz v0, :cond_10

    .line 225
    .line 226
    invoke-virtual {v5, v0}, Li/g;->s(Ljava/lang/String;)Landroidx/fragment/app/y;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_10

    .line 231
    .line 232
    iget-boolean v2, v0, Landroidx/fragment/app/y;->R:Z

    .line 233
    .line 234
    if-eqz v2, :cond_10

    .line 235
    .line 236
    iput-object v0, v1, Landroidx/fragment/app/y;->x:Landroidx/fragment/app/y;

    .line 237
    .line 238
    :cond_10
    iput v3, v1, Landroidx/fragment/app/y;->a:I

    .line 239
    .line 240
    :goto_8
    return-void
.end method

.method public final h()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->t(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object v0, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/fragment/app/j1;->b()V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 57
    .line 58
    iget-object v0, v0, Landroidx/lifecycle/w;->c:Landroidx/lifecycle/o;

    .line 59
    .line 60
    sget-object v4, Landroidx/lifecycle/o;->c:Landroidx/lifecycle/o;

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ltz v0, :cond_2

    .line 67
    .line 68
    move v0, v2

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v0, v3

    .line 71
    :goto_0
    if-eqz v0, :cond_3

    .line 72
    .line 73
    iget-object v0, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 74
    .line 75
    sget-object v4, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Landroidx/fragment/app/j1;->a(Landroidx/lifecycle/n;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iput v2, v1, Landroidx/fragment/app/y;->a:I

    .line 81
    .line 82
    iput-boolean v3, v1, Landroidx/fragment/app/y;->T:Z

    .line 83
    .line 84
    invoke-virtual {v1}, Landroidx/fragment/app/y;->A()V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, v1, Landroidx/fragment/app/y;->T:Z

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-static {v1}, Lz0/a;->a(Landroidx/lifecycle/u;)Lz0/d;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iget-object v0, v0, Lz0/d;->b:Lz0/c;

    .line 96
    .line 97
    iget-object v0, v0, Lz0/c;->a:Ln/l;

    .line 98
    .line 99
    iget v2, v0, Ln/l;->c:I

    .line 100
    .line 101
    move v4, v3

    .line 102
    :goto_1
    if-ge v4, v2, :cond_4

    .line 103
    .line 104
    iget-object v5, v0, Ln/l;->b:[Ljava/lang/Object;

    .line 105
    .line 106
    aget-object v5, v5, v4

    .line 107
    .line 108
    check-cast v5, Lz0/b;

    .line 109
    .line 110
    invoke-virtual {v5}, Lz0/b;->k()V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    iput-boolean v3, v1, Landroidx/fragment/app/y;->G:Z

    .line 117
    .line 118
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 119
    .line 120
    invoke-virtual {v0, v3}, Landroidx/fragment/app/h0;->n(Z)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    iput-object v0, v1, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 125
    .line 126
    iput-object v0, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 127
    .line 128
    iput-object v0, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 129
    .line 130
    iget-object v2, v1, Landroidx/fragment/app/y;->f0:Landroidx/lifecycle/c0;

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Landroidx/lifecycle/c0;->j(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iput-boolean v3, v1, Landroidx/fragment/app/y;->E:Z

    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    new-instance v0, Landroidx/fragment/app/o1;

    .line 139
    .line 140
    const-string v2, "Fragment "

    .line 141
    .line 142
    const-string v3, " did not call through to super.onDestroyView()"

    .line 143
    .line 144
    invoke-static {v2, v1, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0
.end method

.method public final i()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom ATTACHED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, -0x1

    .line 30
    iput v1, v3, Landroidx/fragment/app/y;->a:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, Landroidx/fragment/app/y;->T:Z

    .line 34
    .line 35
    invoke-virtual {v3}, Landroidx/fragment/app/y;->B()V

    .line 36
    .line 37
    .line 38
    iget-boolean v5, v3, Landroidx/fragment/app/y;->T:Z

    .line 39
    .line 40
    if-eqz v5, :cond_8

    .line 41
    .line 42
    iget-object v5, v3, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 43
    .line 44
    iget-boolean v6, v5, Landroidx/fragment/app/s0;->G:Z

    .line 45
    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, Landroidx/fragment/app/s0;->k()V

    .line 49
    .line 50
    .line 51
    new-instance v5, Landroidx/fragment/app/t0;

    .line 52
    .line 53
    invoke-direct {v5}, Landroidx/fragment/app/t0;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v5, v3, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 57
    .line 58
    :cond_1
    iget-object v5, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Landroidx/fragment/app/h0;->e(Z)V

    .line 61
    .line 62
    .line 63
    iput v1, v3, Landroidx/fragment/app/y;->a:I

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-object v1, v3, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 67
    .line 68
    iput-object v1, v3, Landroidx/fragment/app/y;->L:Landroidx/fragment/app/y;

    .line 69
    .line 70
    iput-object v1, v3, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 71
    .line 72
    iget-boolean v1, v3, Landroidx/fragment/app/y;->C:Z

    .line 73
    .line 74
    const/4 v5, 0x1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3}, Landroidx/fragment/app/y;->s()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_2

    .line 82
    .line 83
    move v4, v5

    .line 84
    :cond_2
    if-nez v4, :cond_5

    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 87
    .line 88
    iget-object v1, v1, Li/g;->e:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroidx/fragment/app/w0;

    .line 91
    .line 92
    iget-object v4, v1, Landroidx/fragment/app/w0;->a:Ljava/util/HashMap;

    .line 93
    .line 94
    iget-object v6, v3, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    iget-boolean v4, v1, Landroidx/fragment/app/w0;->d:Z

    .line 104
    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    iget-boolean v5, v1, Landroidx/fragment/app/w0;->e:Z

    .line 108
    .line 109
    :cond_4
    :goto_0
    if-eqz v5, :cond_7

    .line 110
    .line 111
    :cond_5
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v1, "initState called for fragment: "

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    :cond_6
    invoke-virtual {v3}, Landroidx/fragment/app/y;->p()V

    .line 135
    .line 136
    .line 137
    :cond_7
    return-void

    .line 138
    :cond_8
    new-instance v0, Landroidx/fragment/app/o1;

    .line 139
    .line 140
    const-string v1, "Fragment "

    .line 141
    .line 142
    const-string v2, " did not call through to super.onDetach()"

    .line 143
    .line 144
    invoke-static {v1, v3, v2}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/y;->D:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/fragment/app/y;->E:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, Landroidx/fragment/app/y;->G:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Landroidx/fragment/app/s0;->H(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroidx/fragment/app/y;->C(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    iget-object v3, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/y;->L(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 62
    .line 63
    const v3, 0x7f0a00ec

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v1, v0, Landroidx/fragment/app/y;->P:Z

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 74
    .line 75
    const/16 v3, 0x8

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/y;->I()V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 84
    .line 85
    const/4 v3, 0x2

    .line 86
    invoke-virtual {v1, v3}, Landroidx/fragment/app/s0;->t(I)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroidx/fragment/app/h0;->m(Z)V

    .line 92
    .line 93
    .line 94
    iput v3, v0, Landroidx/fragment/app/y;->a:I

    .line 95
    .line 96
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/fragment/app/z0;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "FragmentManager"

    .line 7
    .line 8
    iget-object v4, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    :try_start_0
    iput-boolean v1, p0, Landroidx/fragment/app/z0;->d:Z

    .line 39
    .line 40
    move v6, v5

    .line 41
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->d()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget v8, v4, Landroidx/fragment/app/y;->a:I

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-eq v7, v8, :cond_9

    .line 49
    .line 50
    if-le v7, v8, :cond_4

    .line 51
    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    packed-switch v8, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->n()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :pswitch_1
    const/4 v6, 0x6

    .line 65
    iput v6, v4, Landroidx/fragment/app/y;->a:I

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->q()V

    .line 70
    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :pswitch_3
    iget-object v6, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 75
    .line 76
    if-eqz v6, :cond_3

    .line 77
    .line 78
    iget-object v6, v4, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v6, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4}, Landroidx/fragment/app/y;->m()Landroidx/fragment/app/s0;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v6, v7}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    iget-object v7, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 95
    .line 96
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-static {v7}, La3/g;->c(I)I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-eqz v8, :cond_2

    .line 112
    .line 113
    new-instance v8, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v9, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 116
    .line 117
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-virtual {v6, v7, v2, p0}, Landroidx/fragment/app/n1;->a(IILandroidx/fragment/app/z0;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    const/4 v6, 0x4

    .line 134
    iput v6, v4, Landroidx/fragment/app/y;->a:I

    .line 135
    .line 136
    goto/16 :goto_1

    .line 137
    .line 138
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->a()V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_1

    .line 142
    .line 143
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->j()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->f()V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->e()V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_1

    .line 155
    .line 156
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->c()V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_1

    .line 160
    .line 161
    :cond_4
    add-int/lit8 v8, v8, -0x1

    .line 162
    .line 163
    packed-switch v8, :pswitch_data_1

    .line 164
    .line 165
    .line 166
    goto/16 :goto_1

    .line 167
    .line 168
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->l()V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :pswitch_9
    const/4 v6, 0x5

    .line 174
    iput v6, v4, Landroidx/fragment/app/y;->a:I

    .line 175
    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->r()V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_b
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_5

    .line 187
    .line 188
    new-instance v6, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v7, "movefrom ACTIVITY_CREATED: "

    .line 194
    .line 195
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 209
    .line 210
    if-eqz v6, :cond_6

    .line 211
    .line 212
    iget-object v6, v4, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 213
    .line 214
    if-nez v6, :cond_6

    .line 215
    .line 216
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->p()V

    .line 217
    .line 218
    .line 219
    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 220
    .line 221
    if-eqz v6, :cond_8

    .line 222
    .line 223
    iget-object v6, v4, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 224
    .line 225
    if-eqz v6, :cond_8

    .line 226
    .line 227
    invoke-virtual {v4}, Landroidx/fragment/app/y;->m()Landroidx/fragment/app/s0;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v7}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-static {v6, v7}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-eqz v7, :cond_7

    .line 247
    .line 248
    new-instance v7, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 251
    .line 252
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    invoke-static {v3, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    :cond_7
    invoke-virtual {v6, v1, v9, p0}, Landroidx/fragment/app/n1;->a(IILandroidx/fragment/app/z0;)V

    .line 266
    .line 267
    .line 268
    :cond_8
    iput v9, v4, Landroidx/fragment/app/y;->a:I

    .line 269
    .line 270
    goto :goto_1

    .line 271
    :pswitch_c
    iput-boolean v5, v4, Landroidx/fragment/app/y;->E:Z

    .line 272
    .line 273
    iput v2, v4, Landroidx/fragment/app/y;->a:I

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->h()V

    .line 277
    .line 278
    .line 279
    iput v1, v4, Landroidx/fragment/app/y;->a:I

    .line 280
    .line 281
    goto :goto_1

    .line 282
    :pswitch_e
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->g()V

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->i()V

    .line 287
    .line 288
    .line 289
    :goto_1
    move v6, v1

    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_9
    if-nez v6, :cond_c

    .line 293
    .line 294
    const/4 v6, -0x1

    .line 295
    if-ne v8, v6, :cond_c

    .line 296
    .line 297
    iget-boolean v6, v4, Landroidx/fragment/app/y;->C:Z

    .line 298
    .line 299
    if-eqz v6, :cond_c

    .line 300
    .line 301
    invoke-virtual {v4}, Landroidx/fragment/app/y;->s()Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-nez v6, :cond_c

    .line 306
    .line 307
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    if-eqz v6, :cond_a

    .line 312
    .line 313
    new-instance v6, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const-string v7, "Cleaning up state of never attached fragment: "

    .line 319
    .line 320
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    :cond_a
    iget-object v6, v0, Li/g;->e:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v6, Landroidx/fragment/app/w0;

    .line 336
    .line 337
    invoke-virtual {v6, v4}, Landroidx/fragment/app/w0;->b(Landroidx/fragment/app/y;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, p0}, Li/g;->H(Landroidx/fragment/app/z0;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v9}, Landroidx/fragment/app/s0;->H(I)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_b

    .line 348
    .line 349
    new-instance v0, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 352
    .line 353
    .line 354
    const-string v6, "initState called for fragment: "

    .line 355
    .line 356
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    :cond_b
    invoke-virtual {v4}, Landroidx/fragment/app/y;->p()V

    .line 370
    .line 371
    .line 372
    :cond_c
    iget-boolean v0, v4, Landroidx/fragment/app/y;->Z:Z

    .line 373
    .line 374
    if-eqz v0, :cond_12

    .line 375
    .line 376
    iget-object v0, v4, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 377
    .line 378
    if-eqz v0, :cond_10

    .line 379
    .line 380
    iget-object v0, v4, Landroidx/fragment/app/y;->U:Landroid/view/ViewGroup;

    .line 381
    .line 382
    if-eqz v0, :cond_10

    .line 383
    .line 384
    invoke-virtual {v4}, Landroidx/fragment/app/y;->m()Landroidx/fragment/app/s0;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    invoke-virtual {v6}, Landroidx/fragment/app/s0;->F()Landroidx/fragment/app/j0;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-static {v0, v6}, Landroidx/fragment/app/n1;->f(Landroid/view/ViewGroup;Landroidx/fragment/app/j0;)Landroidx/fragment/app/n1;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iget-boolean v6, v4, Landroidx/fragment/app/y;->P:Z

    .line 397
    .line 398
    if-eqz v6, :cond_e

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_d

    .line 408
    .line 409
    new-instance v2, Ljava/lang/StringBuilder;

    .line 410
    .line 411
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 412
    .line 413
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 424
    .line 425
    .line 426
    :cond_d
    invoke-virtual {v0, v9, v1, p0}, Landroidx/fragment/app/n1;->a(IILandroidx/fragment/app/z0;)V

    .line 427
    .line 428
    .line 429
    goto :goto_2

    .line 430
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {v2}, Landroidx/fragment/app/s0;->H(I)Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-eqz v6, :cond_f

    .line 438
    .line 439
    new-instance v6, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 442
    .line 443
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-static {v3, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    .line 455
    .line 456
    :cond_f
    invoke-virtual {v0, v2, v1, p0}, Landroidx/fragment/app/n1;->a(IILandroidx/fragment/app/z0;)V

    .line 457
    .line 458
    .line 459
    :cond_10
    :goto_2
    iget-object v0, v4, Landroidx/fragment/app/y;->I:Landroidx/fragment/app/s0;

    .line 460
    .line 461
    if-eqz v0, :cond_11

    .line 462
    .line 463
    iget-boolean v2, v4, Landroidx/fragment/app/y;->B:Z

    .line 464
    .line 465
    if-eqz v2, :cond_11

    .line 466
    .line 467
    invoke-static {v4}, Landroidx/fragment/app/s0;->I(Landroidx/fragment/app/y;)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_11

    .line 472
    .line 473
    iput-boolean v1, v0, Landroidx/fragment/app/s0;->D:Z

    .line 474
    .line 475
    :cond_11
    iput-boolean v5, v4, Landroidx/fragment/app/y;->Z:Z

    .line 476
    .line 477
    iget-object v0, v4, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 478
    .line 479
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 480
    .line 481
    .line 482
    :cond_12
    iput-boolean v5, p0, Landroidx/fragment/app/z0;->d:Z

    .line 483
    .line 484
    return-void

    .line 485
    :catchall_0
    move-exception v0

    .line 486
    iput-boolean v5, p0, Landroidx/fragment/app/z0;->d:Z

    .line 487
    .line 488
    throw v0

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->t(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 40
    .line 41
    sget-object v2, Landroidx/lifecycle/n;->ON_PAUSE:Landroidx/lifecycle/n;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Landroidx/fragment/app/j1;->a(Landroidx/lifecycle/n;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/n;->ON_PAUSE:Landroidx/lifecycle/n;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, v1, Landroidx/fragment/app/y;->a:I

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, v1, Landroidx/fragment/app/y;->T:Z

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, Landroidx/fragment/app/h0;->f(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "android:view_state"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, v0, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "android:view_registry_state"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "android:target_state"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "android:target_req_state"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, Landroidx/fragment/app/y;->z:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 55
    .line 56
    const-string v1, "android:user_visible_hint"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput-boolean p1, v0, Landroidx/fragment/app/y;->X:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, Landroidx/fragment/app/y;->W:Z

    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method public final n()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "moveto RESUMED: "

    .line 15
    .line 16
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/y;->Y:Landroidx/fragment/app/v;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/v;->m:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    iget-object v6, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 43
    .line 44
    if-ne v0, v6, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    :goto_1
    if-eqz v6, :cond_4

    .line 52
    .line 53
    iget-object v7, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 54
    .line 55
    if-ne v6, v7, :cond_3

    .line 56
    .line 57
    :goto_2
    move v6, v5

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move v6, v4

    .line 65
    :goto_3
    if-eqz v6, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    const/4 v7, 0x2

    .line 72
    invoke-static {v7}, Landroidx/fragment/app/s0;->H(I)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    new-instance v7, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v8, "requestFocus: Restoring focused view "

    .line 81
    .line 82
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, " "

    .line 89
    .line 90
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    if-eqz v6, :cond_5

    .line 94
    .line 95
    const-string v0, "succeeded"

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    const-string v0, "failed"

    .line 99
    .line 100
    :goto_4
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, " on Fragment "

    .line 104
    .line 105
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, " resulting in focused view "

    .line 112
    .line 113
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-object v0, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {v2}, Landroidx/fragment/app/y;->h()Landroidx/fragment/app/v;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v3, v0, Landroidx/fragment/app/v;->m:Landroid/view/View;

    .line 137
    .line 138
    iget-object v0, v2, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->M()V

    .line 141
    .line 142
    .line 143
    iget-object v0, v2, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 144
    .line 145
    invoke-virtual {v0, v5}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 146
    .line 147
    .line 148
    const/4 v0, 0x7

    .line 149
    iput v0, v2, Landroidx/fragment/app/y;->a:I

    .line 150
    .line 151
    iput-boolean v4, v2, Landroidx/fragment/app/y;->T:Z

    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/fragment/app/y;->E()V

    .line 154
    .line 155
    .line 156
    iget-boolean v1, v2, Landroidx/fragment/app/y;->T:Z

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    iget-object v1, v2, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 161
    .line 162
    sget-object v5, Landroidx/lifecycle/n;->ON_RESUME:Landroidx/lifecycle/n;

    .line 163
    .line 164
    invoke-virtual {v1, v5}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v2, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 168
    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    iget-object v1, v2, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 172
    .line 173
    iget-object v1, v1, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 174
    .line 175
    invoke-virtual {v1, v5}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    iget-object v1, v2, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 179
    .line 180
    iput-boolean v4, v1, Landroidx/fragment/app/s0;->E:Z

    .line 181
    .line 182
    iput-boolean v4, v1, Landroidx/fragment/app/s0;->F:Z

    .line 183
    .line 184
    iget-object v5, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 185
    .line 186
    iput-boolean v4, v5, Landroidx/fragment/app/w0;->f:Z

    .line 187
    .line 188
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 192
    .line 193
    invoke-virtual {v0, v4}, Landroidx/fragment/app/h0;->i(Z)V

    .line 194
    .line 195
    .line 196
    iput-object v3, v2, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 197
    .line 198
    iput-object v3, v2, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 199
    .line 200
    iput-object v3, v2, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 201
    .line 202
    return-void

    .line 203
    :cond_8
    new-instance v0, Landroidx/fragment/app/o1;

    .line 204
    .line 205
    const-string v1, "Fragment "

    .line 206
    .line 207
    const-string v3, " did not call through to super.onResume()"

    .line 208
    .line 209
    invoke-static {v1, v2, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v0
.end method

.method public final o()V
    .locals 5

    .line 1
    new-instance v0, Landroidx/fragment/app/y0;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/y0;-><init>(Landroidx/fragment/app/y;)V

    .line 6
    .line 7
    .line 8
    iget v2, v1, Landroidx/fragment/app/y;->a:I

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-le v2, v3, :cond_9

    .line 12
    .line 13
    iget-object v2, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 14
    .line 15
    if-nez v2, :cond_9

    .line 16
    .line 17
    new-instance v2, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroidx/fragment/app/y;->F(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, v1, Landroidx/fragment/app/y;->h0:Ln3/f;

    .line 26
    .line 27
    invoke-virtual {v3, v2}, Ln3/f;->c(Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroidx/fragment/app/s0;->T()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "android:support:fragments"

    .line 37
    .line 38
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v3, v4}, Landroidx/fragment/app/h0;->j(Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    :cond_0
    iget-object v3, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/z0;->p()V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    new-instance v2, Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 70
    .line 71
    .line 72
    :cond_2
    const-string v3, "android:view_state"

    .line 73
    .line 74
    iget-object v4, v1, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 75
    .line 76
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v3, v1, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    if-nez v2, :cond_4

    .line 84
    .line 85
    new-instance v2, Landroid/os/Bundle;

    .line 86
    .line 87
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 88
    .line 89
    .line 90
    :cond_4
    const-string v3, "android:view_registry_state"

    .line 91
    .line 92
    iget-object v4, v1, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 93
    .line 94
    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    :cond_5
    iget-boolean v3, v1, Landroidx/fragment/app/y;->X:Z

    .line 98
    .line 99
    if-nez v3, :cond_7

    .line 100
    .line 101
    if-nez v2, :cond_6

    .line 102
    .line 103
    new-instance v2, Landroid/os/Bundle;

    .line 104
    .line 105
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 106
    .line 107
    .line 108
    :cond_6
    const-string v3, "android:user_visible_hint"

    .line 109
    .line 110
    iget-boolean v4, v1, Landroidx/fragment/app/y;->X:Z

    .line 111
    .line 112
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    :cond_7
    iput-object v2, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 116
    .line 117
    iget-object v3, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v3, :cond_a

    .line 120
    .line 121
    if-nez v2, :cond_8

    .line 122
    .line 123
    new-instance v2, Landroid/os/Bundle;

    .line 124
    .line 125
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object v2, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 129
    .line 130
    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 131
    .line 132
    const-string v3, "android:target_state"

    .line 133
    .line 134
    iget-object v4, v1, Landroidx/fragment/app/y;->y:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget v2, v1, Landroidx/fragment/app/y;->z:I

    .line 140
    .line 141
    if-eqz v2, :cond_a

    .line 142
    .line 143
    iget-object v3, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 144
    .line 145
    const-string v4, "android:target_req_state"

    .line 146
    .line 147
    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_9
    iget-object v2, v1, Landroidx/fragment/app/y;->b:Landroid/os/Bundle;

    .line 152
    .line 153
    iput-object v2, v0, Landroidx/fragment/app/y0;->D:Landroid/os/Bundle;

    .line 154
    .line 155
    :cond_a
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/z0;->b:Li/g;

    .line 156
    .line 157
    iget-object v1, v1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v2, v1, v0}, Li/g;->R(Ljava/lang/String;Landroidx/fragment/app/y0;)Landroidx/fragment/app/y0;

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x2

    .line 9
    invoke-static {v1}, Landroidx/fragment/app/s0;->H(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "Saving view state for fragment "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " with view "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "FragmentManager"

    .line 40
    .line 41
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-lez v2, :cond_2

    .line 59
    .line 60
    iput-object v1, v0, Landroidx/fragment/app/y;->c:Landroid/util/SparseArray;

    .line 61
    .line 62
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 68
    .line 69
    iget-object v2, v2, Landroidx/fragment/app/j1;->e:Ln3/f;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, Ln3/f;->c(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    iput-object v1, v0, Landroidx/fragment/app/y;->d:Landroid/os/Bundle;

    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/s0;->M()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->x(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Landroidx/fragment/app/y;->a:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-boolean v2, v1, Landroidx/fragment/app/y;->T:Z

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/fragment/app/y;->G()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, v1, Landroidx/fragment/app/y;->T:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v3, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 54
    .line 55
    sget-object v4, Landroidx/lifecycle/n;->ON_START:Landroidx/lifecycle/n;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    iget-object v3, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 65
    .line 66
    iget-object v3, v3, Landroidx/fragment/app/j1;->d:Landroidx/lifecycle/w;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 72
    .line 73
    iput-boolean v2, v1, Landroidx/fragment/app/s0;->E:Z

    .line 74
    .line 75
    iput-boolean v2, v1, Landroidx/fragment/app/s0;->F:Z

    .line 76
    .line 77
    iget-object v3, v1, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 78
    .line 79
    iput-boolean v2, v3, Landroidx/fragment/app/w0;->f:Z

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Landroidx/fragment/app/s0;->t(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroidx/fragment/app/h0;->k(Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    new-instance v0, Landroidx/fragment/app/o1;

    .line 91
    .line 92
    const-string v2, "Fragment "

    .line 93
    .line 94
    const-string v3, " did not call through to super.onStart()"

    .line 95
    .line 96
    invoke-static {v2, v1, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0
.end method

.method public final r()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z0;->c:Landroidx/fragment/app/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/y;->K:Landroidx/fragment/app/t0;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Landroidx/fragment/app/s0;->F:Z

    .line 33
    .line 34
    iget-object v3, v0, Landroidx/fragment/app/s0;->L:Landroidx/fragment/app/w0;

    .line 35
    .line 36
    iput-boolean v2, v3, Landroidx/fragment/app/w0;->f:Z

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-virtual {v0, v2}, Landroidx/fragment/app/s0;->t(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Landroidx/fragment/app/y;->V:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, Landroidx/fragment/app/y;->e0:Landroidx/fragment/app/j1;

    .line 47
    .line 48
    sget-object v3, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Landroidx/fragment/app/j1;->a(Landroidx/lifecycle/n;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/y;->d0:Landroidx/lifecycle/w;

    .line 54
    .line 55
    sget-object v3, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroidx/lifecycle/w;->e(Landroidx/lifecycle/n;)V

    .line 58
    .line 59
    .line 60
    iput v2, v1, Landroidx/fragment/app/y;->a:I

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-boolean v0, v1, Landroidx/fragment/app/y;->T:Z

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/fragment/app/y;->H()V

    .line 66
    .line 67
    .line 68
    iget-boolean v2, v1, Landroidx/fragment/app/y;->T:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, Landroidx/fragment/app/z0;->a:Landroidx/fragment/app/h0;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, Landroidx/fragment/app/h0;->l(Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    new-instance v0, Landroidx/fragment/app/o1;

    .line 79
    .line 80
    const-string v2, "Fragment "

    .line 81
    .line 82
    const-string v3, " did not call through to super.onStop()"

    .line 83
    .line 84
    invoke-static {v2, v1, v3}, La3/g;->r(Ljava/lang/String;Landroidx/fragment/app/y;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Landroidx/fragment/app/o1;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0
.end method
