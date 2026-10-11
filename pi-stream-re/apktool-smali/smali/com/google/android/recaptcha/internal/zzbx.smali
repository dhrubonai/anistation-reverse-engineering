.class final Lcom/google/android/recaptcha/internal/zzbx;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzcj;

.field final synthetic zzc:Ljava/util/List;

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzca;

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzcj;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzca;Lz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzc:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzd:Lcom/google/android/recaptcha/internal/zzca;

    invoke-direct {p0, p4}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzbx;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzc:Ljava/util/List;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzd:Lcom/google/android/recaptcha/internal/zzca;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzbx;-><init>(Lcom/google/android/recaptcha/internal/zzcj;Ljava/util/List;Lcom/google/android/recaptcha/internal/zzca;Lz6/e;)V

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzbx;->zze:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp7/y;

    .line 2
    .line 3
    check-cast p2, Lz6/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzbx;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzbx;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzbx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, La7/a;->a:La7/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzbx;->zza:I

    .line 4
    .line 5
    sget-object v2, Lw6/f;->a:Lw6/f;

    .line 6
    .line 7
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_2

    .line 13
    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzbx;->zze:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lp7/y;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfh;->zzb()Lcom/google/android/recaptcha/internal/zzfh;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-ltz v4, :cond_3

    .line 28
    .line 29
    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzc:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-ge v3, v4, :cond_3

    .line 40
    .line 41
    invoke-interface {p1}, Lp7/y;->b()Lz6/i;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    sget-object v4, Landroidx/lifecycle/q0;->x:Landroidx/lifecycle/q0;

    .line 46
    .line 47
    invoke-interface {v3, v4}, Lz6/i;->r(Lz6/h;)Lz6/g;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lp7/a1;

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    invoke-interface {v3}, Lp7/a1;->a()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v3, v4

    .line 62
    :goto_1
    if-eqz v3, :cond_3

    .line 63
    .line 64
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzc:Ljava/util/List;

    .line 65
    .line 66
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 67
    .line 68
    invoke-virtual {v5}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    check-cast v3, Lcom/google/android/recaptcha/internal/zzpr;

    .line 77
    .line 78
    :try_start_0
    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzd:Lcom/google/android/recaptcha/internal/zzca;

    .line 79
    .line 80
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 81
    .line 82
    invoke-static {v5, v3, v6}, Lcom/google/android/recaptcha/internal/zzca;->zzf(Lcom/google/android/recaptcha/internal/zzca;Lcom/google/android/recaptcha/internal/zzpr;Lcom/google/android/recaptcha/internal/zzcj;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move-exception p1

    .line 87
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzd:Lcom/google/android/recaptcha/internal/zzca;

    .line 88
    .line 89
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzbx;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 90
    .line 91
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzbx;->zza:I

    .line 92
    .line 93
    invoke-static {v1, p1, v3, p0}, Lcom/google/android/recaptcha/internal/zzca;->zzd(Lcom/google/android/recaptcha/internal/zzca;Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcj;Lz6/e;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-ne p1, v0, :cond_2

    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_2
    :goto_2
    return-object v2

    .line 101
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzfh;->zzf()Lcom/google/android/recaptcha/internal/zzfh;

    .line 102
    .line 103
    .line 104
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzfh;->zza(Ljava/util/concurrent/TimeUnit;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    new-instance p1, Ljava/lang/Long;

    .line 111
    .line 112
    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 113
    .line 114
    .line 115
    return-object v2
.end method
