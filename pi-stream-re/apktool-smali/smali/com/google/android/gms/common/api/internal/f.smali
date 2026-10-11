.class public final Lcom/google/android/gms/common/api/internal/f;
.super Lcom/google/android/gms/internal/base/zaq;
.source "SourceFile"


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/t;Lcom/google/android/gms/common/api/s;)V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zad:I

    .line 2
    .line 3
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/util/Pair;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x2d

    .line 12
    .line 13
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const-string v1, "Don\'t know how to handle message: "

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    new-instance v0, Ljava/lang/Exception;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "BasePendingResult"

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 42
    .line 43
    sget-object v0, Lcom/google/android/gms/common/api/Status;->z:Lcom/google/android/gms/common/api/Status;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->forceFailureUnlessReady(Lcom/google/android/gms/common/api/Status;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Landroid/util/Pair;

    .line 52
    .line 53
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/google/android/gms/common/api/t;

    .line 56
    .line 57
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lcom/google/android/gms/common/api/s;

    .line 60
    .line 61
    :try_start_0
    check-cast v0, Lcom/google/android/gms/common/api/internal/w0;

    .line 62
    .line 63
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/w0;->b:Ljava/lang/Object;

    .line 64
    .line 65
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    :try_start_1
    invoke-interface {p1}, Lcom/google/android/gms/common/api/s;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/Status;->d()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/w0;->c:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lcom/google/android/gms/common/api/o;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/common/api/s;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/internal/w0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    monitor-exit v1

    .line 93
    return-void

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    :catch_0
    move-exception v0

    .line 98
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zal(Lcom/google/android/gms/common/api/s;)V

    .line 99
    .line 100
    .line 101
    throw v0
.end method
