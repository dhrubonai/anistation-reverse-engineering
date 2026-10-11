.class public final Lcom/google/android/gms/internal/auth-api-phone/zzr;
.super Lcom/google/android/gms/common/api/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/l;"
    }
.end annotation


# static fields
.field private static final zza:Lcom/google/android/gms/common/api/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/h;"
        }
    .end annotation
.end field

.field private static final zzb:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a;"
        }
    .end annotation
.end field

.field private static final zzc:Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/i;"
        }
    .end annotation
.end field


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
    sput-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zza:Lcom/google/android/gms/common/api/h;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzn;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api-phone/zzn;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzb:Lcom/google/android/gms/common/api/a;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/i;

    .line 16
    .line 17
    const-string v3, "SmsCodeAutofill.API"

    .line 18
    .line 19
    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/i;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/h;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lcom/google/android/gms/common/api/i;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lcom/google/android/gms/common/api/i;

    .line 1
    sget-object v1, Lcom/google/android/gms/common/api/e;->i:Lcom/google/android/gms/common/api/d;

    sget-object v2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/app/Activity;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/auth-api-phone/zzr;->zzc:Lcom/google/android/gms/common/api/i;

    .line 2
    sget-object v1, Lcom/google/android/gms/common/api/e;->i:Lcom/google/android/gms/common/api/d;

    sget-object v2, Lcom/google/android/gms/common/api/k;->c:Lcom/google/android/gms/common/api/k;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/google/android/gms/common/api/l;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/k;)V

    return-void
.end method


# virtual methods
.method public final checkPermissionState()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

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
    const/4 v2, 0x0

    .line 10
    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lb5/c;

    .line 11
    .line 12
    aput-object v3, v1, v2

    .line 13
    .line 14
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzk;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzk;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 22
    .line 23
    const/16 v1, 0x61c

    .line 24
    .line 25
    iput v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public final hasOngoingSmsRequest(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lw7/b;->s(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    xor-int/2addr v0, v1

    .line 10
    const-string v2, "The package name cannot be empty."

    .line 11
    .line 12
    invoke-static {v2, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/common/api/internal/v;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/google/android/gms/common/api/internal/v;-><init>()V

    .line 18
    .line 19
    .line 20
    new-array v1, v1, [Lb5/c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lb5/c;

    .line 24
    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzm;

    .line 30
    .line 31
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth-api-phone/zzm;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 35
    .line 36
    const/16 p1, 0x61d

    .line 37
    .line 38
    iput p1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/l;->doRead(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1
.end method

.method public final startSmsCodeRetriever()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

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
    const/4 v2, 0x0

    .line 10
    sget-object v3, Lcom/google/android/gms/internal/auth-api-phone/zzac;->zza:Lb5/c;

    .line 11
    .line 12
    aput-object v3, v1, v2

    .line 13
    .line 14
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/gms/internal/auth-api-phone/zzl;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth-api-phone/zzl;-><init>(Lcom/google/android/gms/internal/auth-api-phone/zzr;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 22
    .line 23
    const/16 v1, 0x61b

    .line 24
    .line 25
    iput v1, v0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/v;->a()Lcom/google/android/gms/common/api/internal/s0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/w;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
