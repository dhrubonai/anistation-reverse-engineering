.class final Lcom/google/android/play/core/integrity/as;
.super Lcom/google/android/play/core/integrity/aw;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:J

.field final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field final synthetic e:Lcom/google/android/play/core/integrity/ax;


# direct methods
.method public constructor <init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/String;JJLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/play/core/integrity/as;->e:Lcom/google/android/play/core/integrity/ax;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/play/core/integrity/as;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/google/android/play/core/integrity/as;->b:J

    .line 6
    .line 7
    iput-wide p6, p0, Lcom/google/android/play/core/integrity/as;->c:J

    .line 8
    .line 9
    iput-object p8, p0, Lcom/google/android/play/core/integrity/as;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/integrity/aw;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/as;->e:Lcom/google/android/play/core/integrity/ax;

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
    iget-object v3, p0, Lcom/google/android/play/core/integrity/as;->e:Lcom/google/android/play/core/integrity/ax;

    .line 23
    .line 24
    iget-object v4, v3, Lcom/google/android/play/core/integrity/ax;->a:Lp6/c;

    .line 25
    .line 26
    iget-object v4, v4, Lp6/c;->n:Landroid/os/IInterface;

    .line 27
    .line 28
    move-object v9, v4

    .line 29
    check-cast v9, Lp6/n;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/google/android/play/core/integrity/as;->a:Ljava/lang/String;

    .line 32
    .line 33
    iget-wide v5, p0, Lcom/google/android/play/core/integrity/as;->b:J

    .line 34
    .line 35
    iget-wide v7, p0, Lcom/google/android/play/core/integrity/as;->c:J

    .line 36
    .line 37
    invoke-static/range {v3 .. v8}, Lcom/google/android/play/core/integrity/ax;->a(Lcom/google/android/play/core/integrity/ax;Ljava/lang/String;JJ)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, Lcom/google/android/play/core/integrity/au;

    .line 42
    .line 43
    iget-object v5, p0, Lcom/google/android/play/core/integrity/as;->e:Lcom/google/android/play/core/integrity/ax;

    .line 44
    .line 45
    iget-object v6, p0, Lcom/google/android/play/core/integrity/as;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 46
    .line 47
    invoke-direct {v4, v5, v6}, Lcom/google/android/play/core/integrity/au;-><init>(Lcom/google/android/play/core/integrity/ax;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 48
    .line 49
    .line 50
    check-cast v9, Lp6/l;

    .line 51
    .line 52
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    iget-object v6, v9, Lp6/a;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    sget v6, Lp6/j;->a:I

    .line 65
    .line 66
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v5, v2}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    :try_start_1
    iget-object v3, v9, Lp6/a;->a:Landroid/os/IBinder;

    .line 76
    .line 77
    const/4 v4, 0x3

    .line 78
    invoke-interface {v3, v4, v5, v1, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    .line 81
    :try_start_2
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception v1

    .line 86
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 87
    .line 88
    .line 89
    throw v1
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 90
    :catch_0
    move-exception v1

    .line 91
    iget-object v3, p0, Lcom/google/android/play/core/integrity/as;->e:Lcom/google/android/play/core/integrity/ax;

    .line 92
    .line 93
    invoke-static {v3}, Lcom/google/android/play/core/integrity/ax;->f(Lcom/google/android/play/core/integrity/ax;)Lp6/v;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/4 v4, 0x2

    .line 98
    new-array v4, v4, [Ljava/lang/Object;

    .line 99
    .line 100
    iget-object v5, p0, Lcom/google/android/play/core/integrity/as;->a:Ljava/lang/String;

    .line 101
    .line 102
    aput-object v5, v4, v2

    .line 103
    .line 104
    iget-wide v5, p0, Lcom/google/android/play/core/integrity/as;->b:J

    .line 105
    .line 106
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    aput-object v2, v4, v0

    .line 111
    .line 112
    const-string v0, "requestExpressIntegrityToken(%s, %s)"

    .line 113
    .line 114
    invoke-virtual {v3, v0, v1, v4}, Lp6/v;->a(Ljava/lang/String;Landroid/os/RemoteException;[Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/google/android/play/core/integrity/as;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 118
    .line 119
    new-instance v2, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    .line 120
    .line 121
    const/16 v3, -0x64

    .line 122
    .line 123
    invoke-direct {v2, v3, v1}, Lcom/google/android/play/core/integrity/StandardIntegrityException;-><init>(ILjava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 127
    .line 128
    .line 129
    return-void
.end method
