.class final Lcom/google/android/recaptcha/internal/zzf;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzg;

.field final synthetic zzc:J

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzoe;

.field private synthetic zze:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzg;JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzf;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzf;->zzc:J

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzf;->zzd:Lcom/google/android/recaptcha/internal/zzoe;

    invoke-direct {p0, p5}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 7

    .line 1
    new-instance v6, Lcom/google/android/recaptcha/internal/zzf;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzf;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzf;->zzc:J

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzf;->zzd:Lcom/google/android/recaptcha/internal/zzoe;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzf;-><init>(Lcom/google/android/recaptcha/internal/zzg;JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)V

    iput-object p1, v6, Lcom/google/android/recaptcha/internal/zzf;->zze:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzf;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzf;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La7/a;->a:La7/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzf;->zza:I

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzf;->zze:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Li7/k;

    .line 10
    .line 11
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzf;->zze:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lp7/y;

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzf;->zzb:Lcom/google/android/recaptcha/internal/zzg;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzg;->zzc()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v5, v3

    .line 48
    check-cast v5, Lcom/google/android/recaptcha/internal/zza;

    .line 49
    .line 50
    iget-wide v6, p0, Lcom/google/android/recaptcha/internal/zzf;->zzc:J

    .line 51
    .line 52
    iget-object v8, p0, Lcom/google/android/recaptcha/internal/zzf;->zzd:Lcom/google/android/recaptcha/internal/zzoe;

    .line 53
    .line 54
    new-instance v3, Lcom/google/android/recaptcha/internal/zze;

    .line 55
    .line 56
    const/4 v9, 0x0

    .line 57
    move-object v4, v3

    .line 58
    invoke-direct/range {v4 .. v9}, Lcom/google/android/recaptcha/internal/zze;-><init>(Lcom/google/android/recaptcha/internal/zza;JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v3}, Lr6/h0;->h(Lp7/y;Lh7/p;)Lp7/e0;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, Li7/k;

    .line 70
    .line 71
    invoke-direct {p1}, Li7/k;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    new-array v2, v2, [Lp7/d0;

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, [Lp7/d0;

    .line 82
    .line 83
    array-length v2, v1

    .line 84
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, [Lp7/d0;

    .line 89
    .line 90
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzf;->zze:Ljava/lang/Object;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    iput v2, p0, Lcom/google/android/recaptcha/internal/zzf;->zza:I

    .line 94
    .line 95
    invoke-static {v1, p0}, Lcom/bumptech/glide/c;->d([Lp7/d0;Lz6/e;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-eq v1, v0, :cond_7

    .line 100
    .line 101
    move-object v0, p1

    .line 102
    move-object p1, v1

    .line 103
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Lw6/d;

    .line 120
    .line 121
    iget-object v1, v1, Lw6/d;->a:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v1}, Lw6/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    if-eqz v1, :cond_2

    .line 128
    .line 129
    iget-object v2, v0, Li7/k;->a:Ljava/lang/Object;

    .line 130
    .line 131
    const/4 v3, 0x0

    .line 132
    if-nez v2, :cond_3

    .line 133
    .line 134
    instance-of v2, v1, Lcom/google/android/recaptcha/internal/zzp;

    .line 135
    .line 136
    if-eqz v2, :cond_4

    .line 137
    .line 138
    move-object v3, v1

    .line 139
    check-cast v3, Lcom/google/android/recaptcha/internal/zzp;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    new-instance v1, Lcom/google/android/recaptcha/internal/zzp;

    .line 143
    .line 144
    sget-object v2, Lcom/google/android/recaptcha/internal/zzn;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    .line 145
    .line 146
    sget-object v4, Lcom/google/android/recaptcha/internal/zzl;->zzal:Lcom/google/android/recaptcha/internal/zzl;

    .line 147
    .line 148
    invoke-direct {v1, v2, v4, v3}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    move-object v3, v1

    .line 152
    :cond_4
    :goto_3
    iput-object v3, v0, Li7/k;->a:Ljava/lang/Object;

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    iget-object p1, v0, Li7/k;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Lcom/google/android/recaptcha/internal/zzp;

    .line 158
    .line 159
    if-eqz p1, :cond_6

    .line 160
    .line 161
    invoke-static {p1}, Lr6/h0;->F(Ljava/lang/Throwable;)Lw6/c;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    goto :goto_4

    .line 166
    :cond_6
    sget-object p1, Lw6/f;->a:Lw6/f;

    .line 167
    .line 168
    :goto_4
    new-instance v0, Lw6/d;

    .line 169
    .line 170
    invoke-direct {v0, p1}, Lw6/d;-><init>(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    return-object v0
.end method
