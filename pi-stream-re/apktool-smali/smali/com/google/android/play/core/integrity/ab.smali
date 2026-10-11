.class final Lcom/google/android/play/core/integrity/ab;
.super Lp6/w;
.source "SourceFile"


# instance fields
.field final synthetic a:[B

.field final synthetic b:Ljava/lang/Long;

.field final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

.field final synthetic e:Lcom/google/android/play/core/integrity/ad;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ad;Lcom/google/android/gms/tasks/TaskCompletionSource;[BLjava/lang/Long;Landroid/os/Parcelable;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/play/core/integrity/IntegrityTokenRequest;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/play/core/integrity/ab;->e:Lcom/google/android/play/core/integrity/ad;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/play/core/integrity/ab;->a:[B

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/play/core/integrity/ab;->b:Ljava/lang/Long;

    .line 6
    .line 7
    iput-object p6, p0, Lcom/google/android/play/core/integrity/ab;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    iput-object p7, p0, Lcom/google/android/play/core/integrity/ab;->d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lp6/w;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lp6/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 6
    .line 7
    const/16 v1, -0x9

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0, v0}, Lp6/w;->a(Ljava/lang/Exception;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-super {p0, p1}, Lp6/w;->a(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/google/android/play/core/integrity/ab;->e:Lcom/google/android/play/core/integrity/ad;

    .line 4
    .line 5
    iget-object v3, v2, Lcom/google/android/play/core/integrity/ad;->a:Lp6/c;

    .line 6
    .line 7
    iget-object v3, v3, Lp6/c;->n:Landroid/os/IInterface;

    .line 8
    .line 9
    check-cast v3, Lp6/s;

    .line 10
    .line 11
    iget-object v4, p0, Lcom/google/android/play/core/integrity/ab;->a:[B

    .line 12
    .line 13
    iget-object v5, p0, Lcom/google/android/play/core/integrity/ab;->b:Ljava/lang/Long;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-static {v2, v4, v5, v6}, Lcom/google/android/play/core/integrity/ad;->a(Lcom/google/android/play/core/integrity/ad;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v4, Lcom/google/android/play/core/integrity/ac;

    .line 21
    .line 22
    iget-object v5, p0, Lcom/google/android/play/core/integrity/ab;->e:Lcom/google/android/play/core/integrity/ad;

    .line 23
    .line 24
    iget-object v7, p0, Lcom/google/android/play/core/integrity/ab;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 25
    .line 26
    invoke-direct {v4, v5, v7}, Lcom/google/android/play/core/integrity/ac;-><init>(Lcom/google/android/play/core/integrity/ad;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 27
    .line 28
    .line 29
    check-cast v3, Lp6/q;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v7, v3, Lp6/a;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v5, v7}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget v7, Lp6/j;->a:I

    .line 44
    .line 45
    invoke-virtual {v5, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    :try_start_1
    iget-object v2, v3, Lp6/a;->a:Landroid/os/IBinder;

    .line 55
    .line 56
    const/4 v3, 0x2

    .line 57
    invoke-interface {v2, v3, v5, v6, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v2

    .line 65
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 66
    .line 67
    .line 68
    throw v2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 69
    :catch_0
    move-exception v2

    .line 70
    iget-object v3, p0, Lcom/google/android/play/core/integrity/ab;->e:Lcom/google/android/play/core/integrity/ad;

    .line 71
    .line 72
    invoke-static {v3}, Lcom/google/android/play/core/integrity/ad;->c(Lcom/google/android/play/core/integrity/ad;)Lp6/v;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-array v1, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v4, p0, Lcom/google/android/play/core/integrity/ab;->d:Lcom/google/android/play/core/integrity/IntegrityTokenRequest;

    .line 79
    .line 80
    aput-object v4, v1, v0

    .line 81
    .line 82
    const-string v0, "requestIntegrityToken(%s)"

    .line 83
    .line 84
    invoke-virtual {v3, v0, v2, v1}, Lp6/v;->a(Ljava/lang/String;Landroid/os/RemoteException;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/google/android/play/core/integrity/ab;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 88
    .line 89
    new-instance v1, Lcom/google/android/play/core/integrity/IntegrityServiceException;

    .line 90
    .line 91
    const/16 v3, -0x64

    .line 92
    .line 93
    invoke-direct {v1, v3, v2}, Lcom/google/android/play/core/integrity/IntegrityServiceException;-><init>(ILjava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method
