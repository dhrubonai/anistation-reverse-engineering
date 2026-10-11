.class final Lcom/google/android/play/core/integrity/ar;
.super Lcom/google/android/play/core/integrity/aw;
.source "SourceFile"


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic c:Lcom/google/android/play/core/integrity/ax;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;JLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/play/core/integrity/ar;->c:Lcom/google/android/play/core/integrity/ax;

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/google/android/play/core/integrity/ar;->a:J

    .line 4
    .line 5
    iput-object p5, p0, Lcom/google/android/play/core/integrity/ar;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/integrity/aw;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ar;->c:Lcom/google/android/play/core/integrity/ax;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/play/core/integrity/ax;->g(Lcom/google/android/play/core/integrity/ax;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    .line 11
    .line 12
    const/4 v2, -0x2

    .line 13
    invoke-direct {v0, v2, v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, v0}, Lcom/google/android/play/core/integrity/aw;->a(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    :try_start_0
    iget-object v3, p0, Lcom/google/android/play/core/integrity/ar;->c:Lcom/google/android/play/core/integrity/ax;

    .line 23
    .line 24
    iget-object v4, v3, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    .line 25
    .line 26
    iget-object v4, v4, Lp6/c;->n:Landroid/os/IInterface;

    .line 27
    .line 28
    check-cast v4, Lp6/n;

    .line 29
    .line 30
    iget-wide v5, p0, Lcom/google/android/play/core/integrity/ar;->a:J

    .line 31
    .line 32
    invoke-static {v3, v5, v6}, Lcom/google/android/play/core/integrity/ax;->b(Lcom/google/android/play/core/integrity/ax;J)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    new-instance v5, Lcom/google/android/play/core/integrity/av;

    .line 37
    .line 38
    iget-object v6, p0, Lcom/google/android/play/core/integrity/ar;->c:Lcom/google/android/play/core/integrity/ax;

    .line 39
    .line 40
    iget-object v7, p0, Lcom/google/android/play/core/integrity/ar;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 41
    .line 42
    invoke-direct {v5, v6, v7}, Lcom/google/android/play/core/integrity/av;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Lp6/l;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    iget-object v7, v4, Lp6/a;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget v7, Lp6/j;->a:I

    .line 60
    .line 61
    invoke-virtual {v6, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v6, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v5}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    .line 70
    :try_start_1
    iget-object v3, v4, Lp6/a;->a:Landroid/os/IBinder;

    .line 71
    .line 72
    const/4 v4, 0x2

    .line 73
    invoke-interface {v3, v4, v6, v1, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    :try_start_2
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_0
    move-exception v1

    .line 81
    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    .line 82
    .line 83
    .line 84
    throw v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    :catch_0
    move-exception v1

    .line 86
    iget-object v3, p0, Lcom/google/android/play/core/integrity/ar;->c:Lcom/google/android/play/core/integrity/ax;

    .line 87
    .line 88
    invoke-static {v3}, Lcom/google/android/play/core/integrity/ax;->f(Lcom/google/android/play/core/integrity/ax;)Lp6/v;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    new-array v0, v0, [Ljava/lang/Object;

    .line 93
    .line 94
    iget-wide v4, p0, Lcom/google/android/play/core/integrity/ar;->a:J

    .line 95
    .line 96
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    aput-object v4, v0, v2

    .line 101
    .line 102
    const-string v2, "warmUpIntegrityToken(%s)"

    .line 103
    .line 104
    invoke-virtual {v3, v2, v1, v0}, Lp6/v;->a(Ljava/lang/String;Landroid/os/RemoteException;[Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ar;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 108
    .line 109
    new-instance v2, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    .line 110
    .line 111
    const/16 v3, -0x64

    .line 112
    .line 113
    invoke-direct {v2, v3, v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 117
    .line 118
    .line 119
    return-void
.end method
