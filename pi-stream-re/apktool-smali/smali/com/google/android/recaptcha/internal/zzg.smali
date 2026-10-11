.class public final Lcom/google/android/recaptcha/internal/zzg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/google/android/recaptcha/internal/zzg;-><init>(Ljava/util/List;ILi7/e;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILi7/e;)V
    .locals 0

    .line 2
    sget-object p1, Lx6/o;->a:Lx6/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/ArrayList;

    .line 3
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzg;->zza:Ljava/util/List;

    .line 4
    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;JLz6/e;)Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/recaptcha/internal/zzc;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, v6

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-wide v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzc;-><init>(Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;JLz6/e;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v6, p4}, Lr6/h0;->E(Lh7/p;Lz6/e;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final zzb(JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lcom/google/android/recaptcha/internal/zzd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/google/android/recaptcha/internal/zzd;

    .line 7
    .line 8
    iget v1, v0, Lcom/google/android/recaptcha/internal/zzd;->zzc:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/google/android/recaptcha/internal/zzd;->zzc:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/google/android/recaptcha/internal/zzd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/google/android/recaptcha/internal/zzd;-><init>(Lcom/google/android/recaptcha/internal/zzg;Lz6/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/google/android/recaptcha/internal/zzd;->zza:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La7/a;->a:La7/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzd;->zzc:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p4}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p4}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p4, Lcom/google/android/recaptcha/internal/zzf;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    move-object v4, p4

    .line 55
    move-object v5, p0

    .line 56
    move-wide v6, p1

    .line 57
    move-object v8, p3

    .line 58
    invoke-direct/range {v4 .. v9}, Lcom/google/android/recaptcha/internal/zzf;-><init>(Lcom/google/android/recaptcha/internal/zzg;JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)V

    .line 59
    .line 60
    .line 61
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzd;->zzc:I

    .line 62
    .line 63
    invoke-static {p4, v0}, Lr6/h0;->E(Lh7/p;Lz6/e;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    if-ne p4, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p4, Lw6/d;

    .line 71
    .line 72
    iget-object p1, p4, Lw6/d;->a:Ljava/lang/Object;

    .line 73
    .line 74
    return-object p1
.end method

.method public final zzc()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzg;->zza:Ljava/util/List;

    return-object v0
.end method

.method public final zzd(Lcom/google/android/recaptcha/internal/zza;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzg;->zza:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
