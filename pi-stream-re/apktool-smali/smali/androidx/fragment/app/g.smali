.class public final Landroidx/fragment/app/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/c;
.implements Ldagger/hilt/android/internal/builders/ViewWithFragmentComponentBuilder;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Landroidx/fragment/app/j;Landroidx/fragment/app/l;Landroidx/fragment/app/m1;)V
    .locals 0

    .line 8
    iput-object p4, p0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lx7/g;Lx7/c;Lx7/a;Lx7/d;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    .line 7
    iput-object p4, p0, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lc1/c0;)Lo1/i;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lh1/g;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v2, Lh1/o;

    .line 13
    .line 14
    invoke-direct {v2}, Lh1/o;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v3, v1, Landroidx/fragment/app/g;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/lang/String;

    .line 20
    .line 21
    iput-object v3, v2, Lh1/o;->b:Ljava/lang/String;

    .line 22
    .line 23
    :goto_0
    new-instance v6, Lo1/d0;

    .line 24
    .line 25
    iget-object v3, v0, Lc1/c0;->b:Landroid/net/Uri;

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_1
    iget-boolean v4, v0, Lc1/c0;->f:Z

    .line 36
    .line 37
    invoke-direct {v6, v3, v4, v2}, Lo1/d0;-><init>(Ljava/lang/String;ZLh1/g;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v0, Lc1/c0;->c:Lr6/r0;

    .line 41
    .line 42
    invoke-virtual {v2}, Lr6/r0;->c()Lr6/t0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lr6/t0;->l()Lr6/d2;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/util/Map$Entry;

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v5, v6, Lo1/d0;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, Ljava/util/Map;

    .line 83
    .line 84
    monitor-enter v5

    .line 85
    :try_start_0
    iget-object v7, v6, Lo1/d0;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v7, Ljava/util/Map;

    .line 88
    .line 89
    invoke-interface {v7, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    monitor-exit v5

    .line 93
    goto :goto_2

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    throw v0

    .line 97
    :cond_2
    new-instance v7, Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 100
    .line 101
    .line 102
    sget-object v2, Lc1/j;->a:Ljava/util/UUID;

    .line 103
    .line 104
    new-instance v11, Landroidx/lifecycle/q0;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-direct {v11, v2}, Landroidx/lifecycle/q0;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iget-object v4, v0, Lc1/c0;->a:Ljava/util/UUID;

    .line 111
    .line 112
    sget-object v5, Lo1/c0;->d:Lk1/i;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-boolean v8, v0, Lc1/c0;->d:Z

    .line 118
    .line 119
    iget-boolean v10, v0, Lc1/c0;->e:Z

    .line 120
    .line 121
    iget-object v3, v0, Lc1/c0;->g:Lr6/o0;

    .line 122
    .line 123
    invoke-static {v3}, Lcom/bumptech/glide/d;->e0(Ljava/util/Collection;)[I

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    array-length v9, v3

    .line 128
    move v12, v2

    .line 129
    :goto_3
    if-ge v12, v9, :cond_5

    .line 130
    .line 131
    aget v13, v3, v12

    .line 132
    .line 133
    const/4 v15, 0x2

    .line 134
    const/4 v14, 0x1

    .line 135
    if-eq v13, v15, :cond_4

    .line 136
    .line 137
    if-ne v13, v14, :cond_3

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_3
    move v14, v2

    .line 141
    :cond_4
    :goto_4
    invoke-static {v14}, Lw7/b;->g(Z)V

    .line 142
    .line 143
    .line 144
    add-int/lit8 v12, v12, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    invoke-virtual {v3}, [I->clone()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    move-object v9, v3

    .line 152
    check-cast v9, [I

    .line 153
    .line 154
    new-instance v14, Lo1/i;

    .line 155
    .line 156
    const-wide/32 v12, 0x493e0

    .line 157
    .line 158
    .line 159
    move-object v3, v14

    .line 160
    invoke-direct/range {v3 .. v13}, Lo1/i;-><init>(Ljava/util/UUID;Lk1/i;Lo1/d0;Ljava/util/HashMap;Z[IZLandroidx/lifecycle/q0;J)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v0, Lc1/c0;->h:[B

    .line 164
    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    array-length v3, v0

    .line 168
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    goto :goto_5

    .line 173
    :cond_6
    const/4 v0, 0x0

    .line 174
    :goto_5
    iget-object v3, v14, Lo1/i;->C:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {v3}, Lw7/b;->u(Z)V

    .line 181
    .line 182
    .line 183
    iput v2, v14, Lo1/i;->L:I

    .line 184
    .line 185
    iput-object v0, v14, Lo1/i;->M:[B

    .line 186
    .line 187
    return-object v14
.end method

.method public final b(Lc1/k0;)Lo1/q;
    .locals 2

    .line 1
    iget-object v0, p1, Lc1/k0;->b:Lc1/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lc1/k0;->b:Lc1/f0;

    .line 7
    .line 8
    iget-object p1, p1, Lc1/f0;->c:Lc1/c0;

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    sget v0, Lf1/b0;->a:I

    .line 13
    .line 14
    const/16 v1, 0x12

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lc1/c0;

    .line 25
    .line 26
    invoke-static {p1, v1}, Lf1/b0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iput-object p1, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroidx/fragment/app/g;->a(Lc1/c0;)Lo1/i;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lo1/q;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-object p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lo1/q;->m:Landroidx/lifecycle/q0;

    .line 53
    .line 54
    return-object p1
.end method

.method public final build()Ldagger/hilt/android/components/ViewWithFragmentComponent;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    const-class v1, Landroid/view/View;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lr6/h0;->m(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lx7/e;

    .line 11
    .line 12
    invoke-direct {v0}, Lx7/e;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/g;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/fragment/app/j;

    .line 22
    .line 23
    invoke-virtual {v0}, Lf/d0;->b()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x2

    .line 27
    invoke-static {v0}, Landroidx/fragment/app/s0;->H(I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v1, "Animation from operation "

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/g;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/fragment/app/m1;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, " has been cancelled."

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "FragmentManager"

    .line 57
    .line 58
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final view(Landroid/view/View;)Ldagger/hilt/android/internal/builders/ViewWithFragmentComponentBuilder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/g;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-object p0
.end method
