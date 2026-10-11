.class public final Lcom/google/android/recaptcha/internal/zzeo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzen;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzeo;->zzb:Landroid/content/Context;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array v0, p1, [Lw6/b;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Lw6/b;

    .line 15
    .line 16
    const-string v4, "activity"

    .line 17
    .line 18
    invoke-direct {v3, v2, v4}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v3, v0, v2

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, Lw6/b;

    .line 30
    .line 31
    const-string v5, "phone"

    .line 32
    .line 33
    invoke-direct {v4, v3, v5}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    aput-object v4, v0, v3

    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v3, Lw6/b;

    .line 44
    .line 45
    const-string v4, "input_method"

    .line 46
    .line 47
    invoke-direct {v3, p1, v4}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    aput-object v3, v0, v1

    .line 51
    .line 52
    const/4 p1, 0x5

    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Lw6/b;

    .line 58
    .line 59
    const-string v3, "audio"

    .line 60
    .line 61
    invoke-direct {v1, p1, v3}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    invoke-static {v0}, Lo7/f;->g1([Lw6/b;)Ljava/util/Map;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzeo;->zzc:Ljava/util/Map;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final synthetic cs([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/recaptcha/internal/zzel;->zza(Lcom/google/android/recaptcha/internal/zzen;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final varargs zza([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object p1, p1, v0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    instance-of v1, p1, Ljava/lang/Integer;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    move-object p1, v2

    .line 11
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzeo;->zzc:Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzeo;->zzb:Landroid/content/Context;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzae;

    .line 42
    .line 43
    invoke-direct {p1, v0, v0, v2}, Lcom/google/android/recaptcha/internal/zzae;-><init>(IILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :cond_2
    new-instance p1, Lcom/google/android/recaptcha/internal/zzae;

    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    invoke-direct {p1, v0, v1, v2}, Lcom/google/android/recaptcha/internal/zzae;-><init>(IILjava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
