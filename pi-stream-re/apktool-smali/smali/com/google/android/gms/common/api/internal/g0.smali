.class public final Lcom/google/android/gms/common/api/internal/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/m;
.implements Lcom/google/android/gms/common/api/n;


# instance fields
.field public final a:Ljava/util/LinkedList;

.field public final b:Lcom/google/android/gms/common/api/g;

.field public final c:Lcom/google/android/gms/common/api/internal/a;

.field public final d:Lcom/google/android/gms/common/api/internal/z;

.field public final e:Ljava/util/HashSet;

.field public final f:Ljava/util/HashMap;

.field public final g:I

.field public final h:Lcom/google/android/gms/common/api/internal/r0;

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public k:Lb5/a;

.field public l:I

.field public final synthetic m:Lcom/google/android/gms/common/api/internal/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/h;Lcom/google/android/gms/common/api/l;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->e:Ljava/util/HashSet;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput v1, p0, Lcom/google/android/gms/common/api/internal/g0;->l:I

    .line 39
    .line 40
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p2, v1, p0}, Lcom/google/android/gms/common/api/l;->zab(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/g0;)Lcom/google/android/gms/common/api/g;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/l;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 57
    .line 58
    new-instance v2, Lcom/google/android/gms/common/api/internal/z;

    .line 59
    .line 60
    invoke-direct {v2}, Lcom/google/android/gms/common/api/internal/z;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 64
    .line 65
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/l;->zaa()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iput v2, p0, Lcom/google/android/gms/common/api/internal/g0;->g:I

    .line 70
    .line 71
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 80
    .line 81
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/api/l;->zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/r0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->h:Lcom/google/android/gms/common/api/internal/r0;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->h:Lcom/google/android/gms/common/api/internal/r0;

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->i(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/common/api/internal/e0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, p1, v2}, Lcom/google/android/gms/common/api/internal/e0;-><init>(Ljava/lang/Object;II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 6
    .line 7
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->h()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/common/api/internal/q0;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/common/api/internal/q0;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c(Lb5/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final d(Lb5/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->e:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lb5/a;->e:Lb5/a;

    .line 21
    .line 22
    invoke-static {p1, v0}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 29
    .line 30
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->getEndpointPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    throw p1

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final e(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/common/api/internal/g0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v2, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_1
    if-eq v2, v0, :cond_6

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/google/android/gms/common/api/internal/b1;

    .line 38
    .line 39
    if-eqz p3, :cond_3

    .line 40
    .line 41
    iget v2, v1, Lcom/google/android/gms/common/api/internal/b1;->a:I

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    :cond_3
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/b1;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_4
    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/api/internal/b1;->b(Ljava/lang/RuntimeException;)V

    .line 53
    .line 54
    .line 55
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_5
    return-void

    .line 60
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    const-string p2, "Status XOR exception should be null"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method public final g()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcom/google/android/gms/common/api/internal/b1;

    .line 20
    .line 21
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 22
    .line 23
    invoke-interface {v5}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/common/api/internal/g0;->k(Lcom/google/android/gms/common/api/internal/b1;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 10
    .line 11
    sget-object v2, Lb5/a;->e:Lb5/a;

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/g0;->d(Lb5/a;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 21
    .line 22
    const/16 v3, 0xb

    .line 23
    .line 24
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 30
    .line 31
    const/16 v2, 0x9

    .line 32
    .line 33
    invoke-virtual {v0, v2, v4}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->g()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->j()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, La3/g;->z(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    throw v1
.end method

.method public final i(I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 13
    .line 14
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 15
    .line 16
    invoke-interface {v3}, Lcom/google/android/gms/common/api/g;->getLastDisconnectMessage()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v5, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v6, "The connection to Google Play services was lost"

    .line 28
    .line 29
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    if-ne p1, v2, :cond_0

    .line 33
    .line 34
    const-string p1, " due to service disconnection."

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v6, 0x3

    .line 41
    if-ne p1, v6, :cond_1

    .line 42
    .line 43
    const-string p1, " due to dead object exception."

    .line 44
    .line 45
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 49
    .line 50
    const-string p1, " Last reason for disconnect: "

    .line 51
    .line 52
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_2
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 59
    .line 60
    const/16 v3, 0x14

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-direct {p1, v3, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p1, v2}, Lcom/google/android/gms/common/api/internal/z;->a(Lcom/google/android/gms/common/api/Status;Z)V

    .line 70
    .line 71
    .line 72
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 73
    .line 74
    const/16 v2, 0x9

    .line 75
    .line 76
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 77
    .line 78
    invoke-static {p1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    const-wide/16 v4, 0x1388

    .line 83
    .line 84
    invoke-virtual {p1, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 85
    .line 86
    .line 87
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 88
    .line 89
    const/16 v2, 0xb

    .line 90
    .line 91
    invoke-static {p1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-wide/32 v3, 0x1d4c0

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 99
    .line 100
    .line 101
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/h;->x:Lz3/e;

    .line 102
    .line 103
    iget-object p1, p1, Lz3/e;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Landroid/util/SparseIntArray;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_3

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1}, La3/g;->z(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    throw v1
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 13
    .line 14
    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-wide v3, v0, Lcom/google/android/gms/common/api/internal/h;->a:J

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final k(Lcom/google/android/gms/common/api/internal/b1;)Z
    .locals 14

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/common/api/internal/m0;

    .line 2
    .line 3
    const-string v1, "DeadObjectException thrown while running ApiCallRunner."

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 15
    .line 16
    invoke-virtual {p1, v4, v3}, Lcom/google/android/gms/common/api/internal/b1;->d(Lcom/google/android/gms/common/api/internal/z;Z)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/b1;->c(Lcom/google/android/gms/common/api/internal/g0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/g0;->a(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    return v2

    .line 30
    :cond_0
    move-object v0, p1

    .line 31
    check-cast v0, Lcom/google/android/gms/common/api/internal/m0;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/m0;->g(Lcom/google/android/gms/common/api/internal/g0;)[Lb5/c;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    array-length v6, v3

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_1
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 46
    .line 47
    invoke-interface {v6}, Lcom/google/android/gms/common/api/g;->getAvailableFeatures()[Lb5/c;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    new-array v6, v4, [Lb5/c;

    .line 54
    .line 55
    :cond_2
    array-length v7, v6

    .line 56
    new-instance v8, Ln/e;

    .line 57
    .line 58
    invoke-direct {v8, v7}, Ln/e;-><init>(I)V

    .line 59
    .line 60
    .line 61
    move v9, v4

    .line 62
    :goto_1
    if-ge v9, v7, :cond_3

    .line 63
    .line 64
    aget-object v10, v6, v9

    .line 65
    .line 66
    iget-object v11, v10, Lb5/c;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v10}, Lb5/c;->d()J

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v8, v11, v10}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    add-int/lit8 v9, v9, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    array-length v6, v3

    .line 83
    move v7, v4

    .line 84
    :goto_2
    if-ge v7, v6, :cond_5

    .line 85
    .line 86
    aget-object v9, v3, v7

    .line 87
    .line 88
    iget-object v10, v9, Lb5/c;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v8, v10, v5}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    check-cast v10, Ljava/lang/Long;

    .line 95
    .line 96
    if-eqz v10, :cond_6

    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v10

    .line 102
    invoke-virtual {v9}, Lb5/c;->d()J

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    cmp-long v10, v10, v12

    .line 107
    .line 108
    if-gez v10, :cond_4

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    :goto_3
    move-object v9, v5

    .line 115
    :cond_6
    :goto_4
    if-nez v9, :cond_7

    .line 116
    .line 117
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 118
    .line 119
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 124
    .line 125
    invoke-virtual {p1, v4, v3}, Lcom/google/android/gms/common/api/internal/b1;->d(Lcom/google/android/gms/common/api/internal/z;Z)V

    .line 126
    .line 127
    .line 128
    :try_start_1
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/b1;->c(Lcom/google/android/gms/common/api/internal/g0;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :catch_1
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/g0;->a(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_5
    return v2

    .line 139
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object v1, v9, Lb5/c;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v9}, Lb5/c;->d()J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    new-instance v10, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    add-int/lit8 v3, v3, 0x4d

    .line 170
    .line 171
    add-int/2addr v3, v8

    .line 172
    invoke-direct {v10, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p1, " could not execute call because it requires feature ("

    .line 179
    .line 180
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p1, ", "

    .line 187
    .line 188
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p1, ")."

    .line 195
    .line 196
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string p1, "GoogleApiManager"

    .line 200
    .line 201
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 209
    .line 210
    iget-boolean p1, p1, Lcom/google/android/gms/common/api/internal/h;->F:Z

    .line 211
    .line 212
    if-eqz p1, :cond_a

    .line 213
    .line 214
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/m0;->f(Lcom/google/android/gms/common/api/internal/g0;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-eqz p1, :cond_a

    .line 219
    .line 220
    new-instance p1, Lcom/google/android/gms/common/api/internal/h0;

    .line 221
    .line 222
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 223
    .line 224
    invoke-direct {p1, v0, v9}, Lcom/google/android/gms/common/api/internal/h0;-><init>(Lcom/google/android/gms/common/api/internal/a;Lb5/c;)V

    .line 225
    .line 226
    .line 227
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    const-wide/16 v1, 0x1388

    .line 234
    .line 235
    const/16 v3, 0xf

    .line 236
    .line 237
    if-ltz v0, :cond_8

    .line 238
    .line 239
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Lcom/google/android/gms/common/api/internal/h0;

    .line 246
    .line 247
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 248
    .line 249
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 250
    .line 251
    invoke-virtual {v0, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 255
    .line 256
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 257
    .line 258
    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->j:Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 277
    .line 278
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 279
    .line 280
    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 285
    .line 286
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 293
    .line 294
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 295
    .line 296
    const/16 v1, 0x10

    .line 297
    .line 298
    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    const-wide/32 v1, 0x1d4c0

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 311
    .line 312
    .line 313
    new-instance p1, Lb5/a;

    .line 314
    .line 315
    const/4 v0, 0x2

    .line 316
    invoke-direct {p1, v0, v5}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->l(Lb5/a;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_9

    .line 324
    .line 325
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 326
    .line 327
    iget v1, p0, Lcom/google/android/gms/common/api/internal/g0;->g:I

    .line 328
    .line 329
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/h;->d(Lb5/a;I)Z

    .line 330
    .line 331
    .line 332
    :cond_9
    :goto_6
    return v4

    .line 333
    :cond_a
    new-instance p1, Lcom/google/android/gms/common/api/w;

    .line 334
    .line 335
    invoke-direct {p1, v9}, Lcom/google/android/gms/common/api/w;-><init>(Lb5/c;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/b1;->b(Ljava/lang/RuntimeException;)V

    .line 339
    .line 340
    .line 341
    return v2
.end method

.method public final l(Lb5/a;)Z
    .locals 6

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->C:Ln/f;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ln/f;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 24
    .line 25
    iget v2, p0, Lcom/google/android/gms/common/api/internal/g0;->g:I

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v4, Lcom/google/android/gms/common/api/internal/c1;

    .line 31
    .line 32
    invoke-direct {v4, p1, v2}, Lcom/google/android/gms/common/api/internal/c1;-><init>(Lb5/a;I)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    invoke-virtual {p1, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v5, 0x1

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move v3, v5

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    :goto_0
    if-eqz v3, :cond_2

    .line 54
    .line 55
    iget-object p1, v1, Lcom/google/android/gms/common/api/internal/a0;->c:Lcom/google/android/gms/internal/base/zaq;

    .line 56
    .line 57
    new-instance v2, Lcom/google/android/gms/common/api/internal/t0;

    .line 58
    .line 59
    invoke-direct {v2, v5, v1, v4}, Lcom/google/android/gms/common/api/internal/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    monitor-exit v0

    .line 66
    return v5

    .line 67
    :cond_3
    monitor-exit v0

    .line 68
    return v3

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    throw p1
.end method

.method public final m(Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_4

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 26
    .line 27
    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/z;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/z;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/util/Map;

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v2

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    move v1, v4

    .line 52
    :goto_1
    if-eqz v1, :cond_3

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->j()V

    .line 57
    .line 58
    .line 59
    :cond_2
    return v2

    .line 60
    :cond_3
    const-string p1, "Timing out service connection."

    .line 61
    .line 62
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return v4

    .line 66
    :cond_4
    return v2
.end method

.method public final n()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_6

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->isConnecting()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_0
    const/16 v2, 0xa

    .line 25
    .line 26
    :try_start_0
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/h;->x:Lz3/e;

    .line 27
    .line 28
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/h;->e:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v3, v4, v1}, Lz3/e;->M(Landroid/content/Context;Lcom/google/android/gms/common/api/g;)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-instance v0, Lb5/a;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v0, v3, v4}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 40
    .line 41
    .line 42
    const-string v3, "GoogleApiManager"

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0}, Lb5/a;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    add-int/lit8 v6, v6, 0x23

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    add-int/2addr v6, v7

    .line 67
    new-instance v7, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 70
    .line 71
    .line 72
    const-string v6, "The service for "

    .line 73
    .line 74
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, " is not available: "

    .line 81
    .line 82
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0, v4}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    new-instance v3, Lcom/google/android/gms/common/api/internal/i0;

    .line 100
    .line 101
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 102
    .line 103
    invoke-direct {v3, v0, v1, v4}, Lcom/google/android/gms/common/api/internal/i0;-><init>(Lcom/google/android/gms/common/api/internal/h;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/internal/a;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->h:Lcom/google/android/gms/common/api/internal/r0;

    .line 113
    .line 114
    invoke-static {v0}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 118
    .line 119
    if-eqz v4, :cond_2

    .line 120
    .line 121
    invoke-interface {v4}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 122
    .line 123
    .line 124
    :cond_2
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    iget-object v7, v0, Lcom/google/android/gms/common/api/internal/r0;->e:Lcom/google/android/gms/common/internal/h;

    .line 133
    .line 134
    iput-object v4, v7, Lcom/google/android/gms/common/internal/h;->h:Ljava/lang/Integer;

    .line 135
    .line 136
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/r0;->c:Ls4/g;

    .line 137
    .line 138
    iget-object v5, v0, Lcom/google/android/gms/common/api/internal/r0;->a:Landroid/content/Context;

    .line 139
    .line 140
    iget-object v11, v0, Lcom/google/android/gms/common/api/internal/r0;->b:Landroid/os/Handler;

    .line 141
    .line 142
    invoke-virtual {v11}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    iget-object v8, v7, Lcom/google/android/gms/common/internal/h;->g:Lq5/a;

    .line 147
    .line 148
    move-object v9, v0

    .line 149
    move-object v10, v0

    .line 150
    invoke-virtual/range {v4 .. v10}, Ls4/g;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/h;Ljava/lang/Object;Lcom/google/android/gms/common/api/m;Lcom/google/android/gms/common/api/n;)Lcom/google/android/gms/common/api/g;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    iput-object v4, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 155
    .line 156
    iput-object v3, v0, Lcom/google/android/gms/common/api/internal/r0;->g:Lcom/google/android/gms/common/api/internal/i0;

    .line 157
    .line 158
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/r0;->d:Ljava/util/Set;

    .line 159
    .line 160
    if-eqz v4, :cond_4

    .line 161
    .line 162
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_3

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 170
    .line 171
    invoke-interface {v0}, Lq5/c;->b()V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_4
    :goto_0
    new-instance v4, Lcom/google/android/gms/common/api/internal/q0;

    .line 176
    .line 177
    const/4 v5, 0x0

    .line 178
    invoke-direct {v4, v0, v5}, Lcom/google/android/gms/common/api/internal/q0;-><init>(Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 182
    .line 183
    .line 184
    :cond_5
    :goto_1
    :try_start_1
    invoke-interface {v1, v3}, Lcom/google/android/gms/common/api/g;->connect(Lcom/google/android/gms/common/internal/d;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :catch_0
    move-exception v0

    .line 189
    new-instance v1, Lb5/a;

    .line 190
    .line 191
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :catch_1
    move-exception v0

    .line 199
    new-instance v1, Lb5/a;

    .line 200
    .line 201
    invoke-direct {v1, v2}, Lb5/a;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    :goto_2
    return-void
.end method

.method public final o(Lcom/google/android/gms/common/api/internal/b1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->k(Lcom/google/android/gms/common/api/internal/b1;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->j()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    iget v0, p1, Lb5/a;->b:I

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p1, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v0, 0x0

    .line 50
    :goto_0
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/g0;->p(Lb5/a;Ljava/lang/RuntimeException;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g0;->n()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final p(Lb5/a;Ljava/lang/RuntimeException;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->h:Lcom/google/android/gms/common/api/internal/r0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/r0;->f:Lq5/c;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 22
    .line 23
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->x:Lz3/e;

    .line 32
    .line 33
    iget-object v1, v1, Lz3/e;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Landroid/util/SparseIntArray;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->d(Lb5/a;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 44
    .line 45
    instance-of v1, v1, Ld5/c;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget v1, p1, Lb5/a;->b:I

    .line 51
    .line 52
    const/16 v3, 0x18

    .line 53
    .line 54
    if-eq v1, v3, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 57
    .line 58
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/h;->b:Z

    .line 59
    .line 60
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 61
    .line 62
    const/16 v3, 0x13

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-wide/32 v4, 0x493e0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    iget v1, p1, Lb5/a;->b:I

    .line 75
    .line 76
    const/4 v3, 0x4

    .line 77
    if-ne v1, v3, :cond_2

    .line 78
    .line 79
    sget-object p1, Lcom/google/android/gms/common/api/internal/h;->H:Lcom/google/android/gms/common/api/Status;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->k:Lb5/a;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    if-eqz p2, :cond_4

    .line 97
    .line 98
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 99
    .line 100
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 101
    .line 102
    invoke-static {p1}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-virtual {p0, v0, p2, p1}, Lcom/google/android/gms/common/api/internal/g0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 111
    .line 112
    iget-boolean p2, p2, Lcom/google/android/gms/common/api/internal/h;->F:Z

    .line 113
    .line 114
    if-eqz p2, :cond_a

    .line 115
    .line 116
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 117
    .line 118
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/h;->e(Lcom/google/android/gms/common/api/internal/a;Lb5/a;)Lcom/google/android/gms/common/api/Status;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p0, p2, v0, v2}, Lcom/google/android/gms/common/api/internal/g0;->f(Lcom/google/android/gms/common/api/Status;Ljava/lang/RuntimeException;Z)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->a:Ljava/util/LinkedList;

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_5

    .line 132
    .line 133
    return-void

    .line 134
    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->l(Lb5/a;)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_6

    .line 139
    .line 140
    return-void

    .line 141
    :cond_6
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 142
    .line 143
    iget v0, p0, Lcom/google/android/gms/common/api/internal/g0;->g:I

    .line 144
    .line 145
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/api/internal/h;->d(Lb5/a;I)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-nez p2, :cond_9

    .line 150
    .line 151
    iget p2, p1, Lb5/a;->b:I

    .line 152
    .line 153
    const/16 v0, 0x12

    .line 154
    .line 155
    if-ne p2, v0, :cond_7

    .line 156
    .line 157
    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 158
    .line 159
    :cond_7
    iget-boolean p2, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Z

    .line 160
    .line 161
    if-eqz p2, :cond_8

    .line 162
    .line 163
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 164
    .line 165
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 166
    .line 167
    const/16 p2, 0x9

    .line 168
    .line 169
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 170
    .line 171
    invoke-static {p1, p2, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    const-wide/16 v0, 0x1388

    .line 181
    .line 182
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_8
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 187
    .line 188
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/h;->e(Lcom/google/android/gms/common/api/internal/a;Lb5/a;)Lcom/google/android/gms/common/api/Status;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 193
    .line 194
    .line 195
    :cond_9
    return-void

    .line 196
    :cond_a
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/g0;->c:Lcom/google/android/gms/common/api/internal/a;

    .line 197
    .line 198
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/h;->e(Lcom/google/android/gms/common/api/internal/a;Lb5/a;)Lcom/google/android/gms/common/api/Status;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->m:Lcom/google/android/gms/common/api/internal/h;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 4
    .line 5
    invoke-static {v0}, Lw7/b;->l(Lcom/google/android/gms/internal/base/zaq;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/common/api/internal/h;->G:Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/g0;->e(Lcom/google/android/gms/common/api/Status;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g0;->d:Lcom/google/android/gms/common/api/internal/z;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/z;->a(Lcom/google/android/gms/common/api/Status;Z)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->f:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-array v1, v2, [Lcom/google/android/gms/common/api/internal/m;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, [Lcom/google/android/gms/common/api/internal/m;

    .line 35
    .line 36
    array-length v1, v0

    .line 37
    :goto_0
    if-ge v2, v1, :cond_0

    .line 38
    .line 39
    aget-object v3, v0, v2

    .line 40
    .line 41
    new-instance v3, Lcom/google/android/gms/common/api/internal/z0;

    .line 42
    .line 43
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 44
    .line 45
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/internal/z0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3}, Lcom/google/android/gms/common/api/internal/g0;->o(Lcom/google/android/gms/common/api/internal/b1;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v0, Lb5/a;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    invoke-direct {v0, v1}, Lb5/a;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/g0;->d(Lb5/a;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g0;->b:Lcom/google/android/gms/common/api/g;

    .line 67
    .line 68
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    new-instance v1, Lcom/google/android/gms/common/api/internal/f0;

    .line 75
    .line 76
    invoke-direct {v1, p0}, Lcom/google/android/gms/common/api/internal/f0;-><init>(Lcom/google/android/gms/common/api/internal/g0;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->onUserSignOut(Lcom/google/android/gms/common/internal/e;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void
.end method
