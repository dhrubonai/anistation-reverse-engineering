.class final Lcom/google/android/recaptcha/internal/zzc;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzg;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:J

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;JLz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzc;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzc;->zzc:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzc;->zzd:J

    invoke-direct {p0, p5}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/recaptcha/internal/zzc;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzc;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzc;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzc;->zzd:J

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzc;-><init>(Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;JLz6/e;)V

    iput-object p1, v6, Lcom/google/android/recaptcha/internal/zzc;->zze:Ljava/lang/Object;

    return-object v6
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzc;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzc;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La7/a;->a:La7/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzc;->zza:I

    .line 4
    .line 5
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzc;->zze:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lp7/y;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzc;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzg;->zzc()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    move-object v6, v4

    .line 42
    check-cast v6, Lcom/google/android/recaptcha/internal/zza;

    .line 43
    .line 44
    iget-object v7, p0, Lcom/google/android/recaptcha/internal/zzc;->zzc:Ljava/lang/String;

    .line 45
    .line 46
    iget-wide v8, p0, Lcom/google/android/recaptcha/internal/zzc;->zzd:J

    .line 47
    .line 48
    new-instance v4, Lcom/google/android/recaptcha/internal/zzb;

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    move-object v5, v4

    .line 52
    invoke-direct/range {v5 .. v10}, Lcom/google/android/recaptcha/internal/zzb;-><init>(Lcom/google/android/recaptcha/internal/zza;Ljava/lang/String;JLz6/e;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v4}, Lr6/h0;->h(Lp7/y;Lh7/p;)Lp7/e0;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 p1, 0x0

    .line 64
    new-array p1, p1, [Lp7/d0;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, [Lp7/d0;

    .line 71
    .line 72
    array-length v1, p1

    .line 73
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, [Lp7/d0;

    .line 78
    .line 79
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzc;->zza:I

    .line 80
    .line 81
    invoke-static {p1, p0}, Lcom/bumptech/glide/c;->d([Lp7/d0;Lz6/e;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v0, :cond_2

    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzc;->zzc:Ljava/lang/String;

    .line 89
    .line 90
    check-cast p1, Ljava/util/List;

    .line 91
    .line 92
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzog;->zzf()Lcom/google/android/recaptcha/internal/zzof;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzof;->zzd(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzof;

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lw6/d;

    .line 114
    .line 115
    iget-object v0, v0, Lw6/d;->a:Ljava/lang/Object;

    .line 116
    .line 117
    instance-of v3, v0, Lw6/c;

    .line 118
    .line 119
    xor-int/2addr v3, v2

    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    check-cast v0, Lcom/google/android/recaptcha/internal/zzog;

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzin;->zzg(Lcom/google/android/recaptcha/internal/zzit;)Lcom/google/android/recaptcha/internal/zzin;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lcom/google/android/recaptcha/internal/zzog;

    .line 133
    .line 134
    return-object p1
.end method
