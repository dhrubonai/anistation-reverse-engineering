.class public final Lcom/bumptech/glide/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Li4/j;


# static fields
.field public static final B:Ll4/f;


# instance fields
.field public A:Ll4/f;

.field public final a:Lcom/bumptech/glide/b;

.field public final b:Landroid/content/Context;

.field public final c:Li4/h;

.field public final d:Li4/v;

.field public final e:Li4/o;

.field public final f:Li4/w;

.field public final x:Lg/f;

.field public final y:Li4/b;

.field public final z:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll4/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ll4/f;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Landroid/graphics/Bitmap;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ll4/a;->c(Ljava/lang/Class;)Ll4/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ll4/f;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iput-boolean v1, v0, Ll4/a;->K:Z

    .line 16
    .line 17
    sput-object v0, Lcom/bumptech/glide/o;->B:Ll4/f;

    .line 18
    .line 19
    new-instance v0, Ll4/f;

    .line 20
    .line 21
    invoke-direct {v0}, Ll4/f;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v2, Lg4/c;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ll4/a;->c(Ljava/lang/Class;)Ll4/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ll4/f;

    .line 31
    .line 32
    iput-boolean v1, v0, Ll4/a;->K:Z

    .line 33
    .line 34
    sget-object v0, Lx3/o;->b:Lx3/n;

    .line 35
    .line 36
    new-instance v1, Ll4/f;

    .line 37
    .line 38
    invoke-direct {v1}, Ll4/f;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ll4/a;->d(Lx3/n;)Ll4/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ll4/f;

    .line 46
    .line 47
    invoke-virtual {v0}, Ll4/a;->k()Ll4/a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ll4/f;

    .line 52
    .line 53
    invoke-virtual {v0}, Ll4/a;->o()Ll4/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ll4/f;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Li4/h;Li4/o;Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Li4/v;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Li4/v;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lcom/bumptech/glide/b;->f:Lf9/x;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Li4/w;

    .line 14
    .line 15
    invoke-direct {v3}, Li4/w;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 19
    .line 20
    new-instance v3, Lg/f;

    .line 21
    .line 22
    const/4 v4, 0x7

    .line 23
    invoke-direct {v3, p0, v4}, Lg/f;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    iput-object v3, p0, Lcom/bumptech/glide/o;->x:Lg/f;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/bumptech/glide/o;->a:Lcom/bumptech/glide/b;

    .line 29
    .line 30
    iput-object p2, p0, Lcom/bumptech/glide/o;->c:Li4/h;

    .line 31
    .line 32
    iput-object p3, p0, Lcom/bumptech/glide/o;->e:Li4/o;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 35
    .line 36
    iput-object p4, p0, Lcom/bumptech/glide/o;->b:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    new-instance p4, Lcom/bumptech/glide/n;

    .line 43
    .line 44
    invoke-direct {p4, p0, v0}, Lcom/bumptech/glide/n;-><init>(Lcom/bumptech/glide/o;Li4/v;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 51
    .line 52
    invoke-static {p3, v0}, Lx/j;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x1

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    move v0, v1

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v0, v2

    .line 62
    :goto_0
    const-string v4, "ConnectivityMonitor"

    .line 63
    .line 64
    const/4 v5, 0x3

    .line 65
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_2

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    const-string v5, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const-string v5, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    .line 77
    .line 78
    :goto_1
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    :cond_2
    if-eqz v0, :cond_3

    .line 82
    .line 83
    new-instance v0, Li4/c;

    .line 84
    .line 85
    invoke-direct {v0, p3, p4}, Li4/c;-><init>(Landroid/content/Context;Lcom/bumptech/glide/n;)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    new-instance v0, Li4/m;

    .line 90
    .line 91
    invoke-direct {v0}, Li4/m;-><init>()V

    .line 92
    .line 93
    .line 94
    :goto_2
    iput-object v0, p0, Lcom/bumptech/glide/o;->y:Li4/b;

    .line 95
    .line 96
    iget-object p3, p1, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 97
    .line 98
    monitor-enter p3

    .line 99
    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    if-nez p4, :cond_6

    .line 106
    .line 107
    iget-object p4, p1, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    sget-object p3, Lp4/m;->a:[C

    .line 114
    .line 115
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    if-ne p3, p4, :cond_4

    .line 124
    .line 125
    move v2, v1

    .line 126
    :cond_4
    xor-int/lit8 p3, v2, 0x1

    .line 127
    .line 128
    if-eqz p3, :cond_5

    .line 129
    .line 130
    invoke-static {}, Lp4/m;->e()Landroid/os/Handler;

    .line 131
    .line 132
    .line 133
    move-result-object p3

    .line 134
    invoke-virtual {p3, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-interface {p2, p0}, Li4/h;->c(Li4/j;)V

    .line 139
    .line 140
    .line 141
    :goto_3
    invoke-interface {p2, v0}, Li4/h;->c(Li4/j;)V

    .line 142
    .line 143
    .line 144
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 145
    .line 146
    iget-object p3, p1, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/f;

    .line 147
    .line 148
    iget-object p3, p3, Lcom/bumptech/glide/f;->e:Ljava/util/List;

    .line 149
    .line 150
    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 151
    .line 152
    .line 153
    iput-object p2, p0, Lcom/bumptech/glide/o;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 154
    .line 155
    iget-object p1, p1, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/f;

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/bumptech/glide/f;->a()Ll4/f;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o;->q(Ll4/f;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_6
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 166
    .line 167
    const-string p2, "Cannot register already registered manager"

    .line 168
    .line 169
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :catchall_0
    move-exception p1

    .line 174
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    throw p1
.end method


# virtual methods
.method public final declared-synchronized c()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 3
    .line 4
    invoke-virtual {v0}, Li4/w;->c()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/o;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    monitor-exit p0

    .line 14
    throw v0
.end method

.method public final declared-synchronized j()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/o;->p()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 6
    .line 7
    invoke-virtual {v0}, Li4/w;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    monitor-exit p0

    .line 14
    throw v0
.end method

.method public final declared-synchronized k()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 3
    .line 4
    invoke-virtual {v0}, Li4/w;->k()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/bumptech/glide/o;->m()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 11
    .line 12
    iget-object v1, v0, Li4/v;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/Set;

    .line 15
    .line 16
    invoke-static {v1}, Lp4/m;->d(Ljava/util/Set;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ll4/c;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Li4/v;->b(Ll4/c;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, v0, Li4/v;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/bumptech/glide/o;->c:Li4/h;

    .line 48
    .line 49
    invoke-interface {v0, p0}, Li4/h;->e(Li4/j;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/bumptech/glide/o;->c:Li4/h;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/bumptech/glide/o;->y:Li4/b;

    .line 55
    .line 56
    invoke-interface {v0, v1}, Li4/h;->e(Li4/j;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/bumptech/glide/o;->x:Lg/f;

    .line 60
    .line 61
    invoke-static {}, Lp4/m;->e()Landroid/os/Handler;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/bumptech/glide/o;->a:Lcom/bumptech/glide/b;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Lcom/bumptech/glide/b;->c(Lcom/bumptech/glide/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    monitor-exit p0

    .line 77
    throw v0
.end method

.method public final l(Lm4/i;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o;->r(Lm4/i;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-interface {p1}, Lm4/i;->f()Ll4/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/bumptech/glide/o;->a:Lcom/bumptech/glide/b;

    .line 15
    .line 16
    iget-object v2, v0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/b;->x:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lcom/bumptech/glide/o;

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lcom/bumptech/glide/o;->r(Lm4/i;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    const/4 v0, 0x1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const/4 v0, 0x0

    .line 48
    :goto_0
    if-nez v0, :cond_3

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-interface {p1, v0}, Lm4/i;->a(Ll4/c;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, Ll4/c;->clear()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p1

    .line 63
    :cond_3
    :goto_1
    return-void
.end method

.method public final declared-synchronized m()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 3
    .line 4
    iget-object v0, v0, Li4/w;->a:Ljava/util/Set;

    .line 5
    .line 6
    invoke-static {v0}, Lp4/m;->d(Ljava/util/Set;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lm4/i;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lcom/bumptech/glide/o;->l(Lm4/i;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 31
    .line 32
    iget-object v0, v0, Li4/w;->a:Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    monitor-exit p0

    .line 41
    throw v0
.end method

.method public final n(Ljava/lang/String;)Lcom/bumptech/glide/l;
    .locals 4

    .line 1
    new-instance v0, Lcom/bumptech/glide/l;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/bumptech/glide/o;->a:Lcom/bumptech/glide/b;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/bumptech/glide/o;->b:Landroid/content/Context;

    .line 6
    .line 7
    const-class v3, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-direct {v0, v1, p0, v3, v2}, Lcom/bumptech/glide/l;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/o;Ljava/lang/Class;Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/l;->A(Ljava/lang/Object;)Lcom/bumptech/glide/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final declared-synchronized o()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    iput-boolean v1, v0, Li4/v;->b:Z

    .line 6
    .line 7
    iget-object v1, v0, Li4/v;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/Set;

    .line 10
    .line 11
    invoke-static {v1}, Lp4/m;->d(Ljava/util/Set;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ll4/c;

    .line 30
    .line 31
    invoke-interface {v2}, Ll4/c;->isRunning()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v2}, Ll4/c;->pause()V

    .line 38
    .line 39
    .line 40
    iget-object v3, v0, Li4/v;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/Set;

    .line 43
    .line 44
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    monitor-exit p0

    .line 52
    throw v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized p()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 3
    .line 4
    invoke-virtual {v0}, Li4/v;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    monitor-exit p0

    .line 11
    throw v0
.end method

.method public final declared-synchronized q(Ll4/f;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ll4/a;->b()Ll4/a;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Ll4/f;

    .line 7
    .line 8
    iget-boolean v0, p1, Ll4/a;->K:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p1, Ll4/a;->M:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "You cannot auto lock an already locked options object, try clone() first"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p1, Ll4/a;->M:Z

    .line 27
    .line 28
    iput-boolean v0, p1, Ll4/a;->K:Z

    .line 29
    .line 30
    iput-object p1, p0, Lcom/bumptech/glide/o;->A:Ll4/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit p0

    .line 36
    throw p1
.end method

.method public final declared-synchronized r(Lm4/i;)Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-interface {p1}, Lm4/i;->f()Ll4/c;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Li4/v;->b(Ll4/c;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/bumptech/glide/o;->f:Li4/w;

    .line 20
    .line 21
    iget-object v0, v0, Li4/w;->a:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-interface {p1, v0}, Lm4/i;->a(Ll4/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :cond_1
    monitor-exit p0

    .line 33
    const/4 p1, 0x0

    .line 34
    return p1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "{tracker="

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/bumptech/glide/o;->d:Li4/v;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, ", treeNode="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/bumptech/glide/o;->e:Li4/o;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, "}"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object v0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    monitor-exit p0

    .line 47
    throw v0
.end method
