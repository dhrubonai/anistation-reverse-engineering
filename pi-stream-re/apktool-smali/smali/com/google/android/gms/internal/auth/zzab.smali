.class final Lcom/google/android/gms/internal/auth/zzab;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/zzg;


# static fields
.field private static final zza:Lcom/google/android/gms/common/api/h;

.field private static final zzb:Lcom/google/android/gms/common/api/a;

.field private static final zzc:Lcom/google/android/gms/common/api/i;

.field private static final zzd:Le5/a;


# instance fields
.field private final zze:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/h;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/auth/zzab;->zza:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth/zzv;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth/zzv;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth/zzab;->zzb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "GoogleAuthService.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth/zzab;->zzc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    const-string v0, "GoogleAuthServiceClient"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Le5/a;

    .line 31
    .line 32
    const-string v2, "Auth"

    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Le5/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lcom/google/android/gms/internal/auth/zzab;->zzd:Le5/a;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/zzab;->zzc:Lcom/google/android/gms/common/api/i;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/common/api/e;->i:Lcom/google/android/gms/common/api/d;

    .line 4
    .line 5
    sget-object v2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    .line 6
    .line 7
    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/zzab;->zze:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method

.method public static zzf(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/Status;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p1, Lcom/google/android/gms/common/api/j;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Lcom/google/android/gms/internal/auth/zzab;->zzd:Le5/a;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    new-array p1, p1, [Ljava/lang/Object;

    .line 27
    .line 28
    const-string p2, "The task is already complete."

    .line 29
    .line 30
    invoke-virtual {p0, p2, p1}, Le5/a;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/auth/zzbw;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lb5/c;

    .line 8
    .line 9
    sget-object v2, Lz7/c;->j:Lb5/c;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/auth/zzt;

    .line 17
    .line 18
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzt;-><init>(Lcom/google/android/gms/internal/auth/zzab;Lcom/google/android/gms/internal/auth/zzbw;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 22
    .line 23
    const/16 p1, 0x5e9

    .line 24
    .line 25
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final zzb(Lr4/b;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lb5/c;

    .line 10
    .line 11
    sget-object v2, Lz7/c;->i:Lb5/c;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/auth/zzu;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzu;-><init>(Lcom/google/android/gms/internal/auth/zzab;Lr4/b;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 p1, 0x5eb

    .line 26
    .line 27
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string v0, "request cannot be null."

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final zzc(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "Scope cannot be null!"

    .line 4
    .line 5
    invoke-static {v0, p2}, Lw7/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Lb5/c;

    .line 15
    .line 16
    sget-object v2, Lz7/c;->j:Lb5/c;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Lcom/google/android/gms/internal/auth/zzs;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/auth/zzs;-><init>(Lcom/google/android/gms/internal/auth/zzab;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 29
    .line 30
    const/16 p1, 0x5e8

    .line 31
    .line 32
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string p2, "Account name cannot be null!"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public final zzd(Landroid/accounts/Account;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lb5/c;

    .line 10
    .line 11
    sget-object v2, Lz7/c;->i:Lb5/c;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/auth/zzr;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzr;-><init>(Lcom/google/android/gms/internal/auth/zzab;Landroid/accounts/Account;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 p1, 0x5ed

    .line 26
    .line 27
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string v0, "account cannot be null."

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public final zze(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lb5/c;

    .line 10
    .line 11
    sget-object v2, Lz7/c;->i:Lb5/c;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/auth/zzq;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzq;-><init>(Lcom/google/android/gms/internal/auth/zzab;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 p1, 0x5ea

    .line 26
    .line 27
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 39
    .line 40
    const-string v0, "Client package name cannot be null!"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
