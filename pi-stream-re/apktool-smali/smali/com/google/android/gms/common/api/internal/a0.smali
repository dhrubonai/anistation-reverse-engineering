.class public final Lcom/google/android/gms/common/api/internal/a0;
.super Lcom/google/android/gms/common/api/internal/LifecycleCallback;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public volatile a:Z

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final c:Lcom/google/android/gms/internal/base/zaq;

.field public final d:Lb5/d;

.field public final e:Ln/f;

.field public final f:Lcom/google/android/gms/common/api/internal/h;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/l;Lcom/google/android/gms/common/api/internal/h;)V
    .locals 2

    .line 1
    sget-object v0, Lb5/d;->d:Lb5/d;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;-><init>(Lcom/google/android/gms/common/api/internal/l;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    new-instance p1, Lcom/google/android/gms/internal/base/zaq;

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/base/zaq;-><init>(Landroid/os/Looper;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->c:Lcom/google/android/gms/internal/base/zaq;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 26
    .line 27
    new-instance p1, Ln/f;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {p1, v0}, Ln/f;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->e:Ln/f;

    .line 34
    .line 35
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/l;

    .line 38
    .line 39
    const-string p2, "ConnectionlessLifecycleHelper"

    .line 40
    .line 41
    invoke-interface {p1, p2, p0}, Lcom/google/android/gms/common/api/internal/l;->a(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    new-instance p1, Lb5/a;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/google/android/gms/common/api/internal/c1;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const/4 v2, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v2, v2, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 27
    .line 28
    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/common/api/internal/h;->h(Lb5/a;I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/google/android/gms/common/api/internal/c1;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eq p1, v5, :cond_3

    .line 15
    .line 16
    const/4 p2, 0x2

    .line 17
    if-eq p1, p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->d:Lb5/d;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Lb5/d;->b(Landroid/content/Context;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v3, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object p2, v1, Lcom/google/android/gms/common/api/internal/c1;->b:Lb5/a;

    .line 49
    .line 50
    iget p2, p2, Lb5/a;->b:I

    .line 51
    .line 52
    const/16 p3, 0x12

    .line 53
    .line 54
    if-ne p2, p3, :cond_7

    .line 55
    .line 56
    if-ne p1, p3, :cond_7

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 p1, -0x1

    .line 60
    if-ne p2, p1, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, v3, Lcom/google/android/gms/common/api/internal/h;->E:Lcom/google/android/gms/internal/base/zaq;

    .line 66
    .line 67
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    if-nez p2, :cond_7

    .line 76
    .line 77
    if-nez v1, :cond_5

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    const/16 p1, 0xd

    .line 81
    .line 82
    if-eqz p3, :cond_6

    .line 83
    .line 84
    const-string p2, "<<ResolutionFailureErrorDetail>>"

    .line 85
    .line 86
    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    :cond_6
    new-instance p2, Lb5/a;

    .line 91
    .line 92
    iget-object p3, v1, Lcom/google/android/gms/common/api/internal/c1;->b:Lb5/a;

    .line 93
    .line 94
    invoke-virtual {p3}, Lb5/a;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-direct {p2, v5, p1, v4, p3}, Lb5/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget p1, v1, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 105
    .line 106
    invoke-virtual {v3, p2, p1}, Lcom/google/android/gms/common/api/internal/h;->h(Lb5/a;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_7
    :goto_0
    if-eqz v1, :cond_8

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, v1, Lcom/google/android/gms/common/api/internal/c1;->b:Lb5/a;

    .line 116
    .line 117
    iget p2, v1, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 118
    .line 119
    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/common/api/internal/h;->h(Lb5/a;I)V

    .line 120
    .line 121
    .line 122
    :cond_8
    :goto_1
    return-void
.end method

.method public final bridge synthetic onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->a(Landroid/content/DialogInterface;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const-string v1, "resolving_error"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lb5/a;

    .line 18
    .line 19
    const-string v2, "failed_status"

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const-string v3, "failed_resolution"

    .line 26
    .line 27
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Landroid/app/PendingIntent;

    .line 32
    .line 33
    invoke-direct {v1, v2, v3}, Lb5/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 34
    .line 35
    .line 36
    const-string v2, "failed_client_id"

    .line 37
    .line 38
    const/4 v3, -0x1

    .line 39
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    new-instance v2, Lcom/google/android/gms/common/api/internal/c1;

    .line 44
    .line 45
    invoke-direct {v2, v1, p1}, Lcom/google/android/gms/common/api/internal/c1;-><init>(Lb5/a;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v2, 0x0

    .line 50
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->e:Ln/f;

    .line 5
    .line 6
    invoke-virtual {v0}, Ln/f;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/h;->b(Lcom/google/android/gms/common/api/internal/a0;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/google/android/gms/common/api/internal/c1;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "resolving_error"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    const-string v1, "failed_client_id"

    .line 22
    .line 23
    iget v2, v0, Lcom/google/android/gms/common/api/internal/c1;->a:I

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/c1;->b:Lb5/a;

    .line 29
    .line 30
    iget v1, v0, Lb5/a;->b:I

    .line 31
    .line 32
    const-string v2, "failed_status"

    .line 33
    .line 34
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Lb5/a;->c:Landroid/app/PendingIntent;

    .line 38
    .line 39
    const-string v1, "failed_resolution"

    .line 40
    .line 41
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->onStart()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/a0;->a:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->e:Ln/f;

    .line 8
    .line 9
    invoke-virtual {v0}, Ln/f;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/h;->b(Lcom/google/android/gms/common/api/internal/a0;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/a0;->a:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->f:Lcom/google/android/gms/common/api/internal/h;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/google/android/gms/common/api/internal/h;->I:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v1

    .line 12
    :try_start_0
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 13
    .line 14
    if-ne v2, p0, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v0, Lcom/google/android/gms/common/api/internal/h;->B:Lcom/google/android/gms/common/api/internal/a0;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/h;->C:Ln/f;

    .line 20
    .line 21
    invoke-virtual {v0}, Ln/f;->clear()V

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v1

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v0
.end method
