.class public final Lcom/google/android/recaptcha/internal/zzbm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zzbh;


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzbi;

.field private static zzb:Ljava/util/Timer;


# instance fields
.field private final zzc:Lcom/google/android/recaptcha/internal/zzbn;

.field private final zzd:Lp7/y;

.field private final zze:Lcom/google/android/recaptcha/internal/zzaz;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/recaptcha/internal/zzbi;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/recaptcha/internal/zzbi;-><init>(Li7/e;)V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzbm;->zza:Lcom/google/android/recaptcha/internal/zzbi;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzbn;Lp7/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzbm;->zzc:Lcom/google/android/recaptcha/internal/zzbn;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzbm;->zzd:Lp7/y;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    :try_start_0
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzaz;->zzc()Lcom/google/android/recaptcha/internal/zzaz;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    new-instance p3, Lcom/google/android/recaptcha/internal/zzaz;

    .line 16
    .line 17
    invoke-direct {p3, p1, p2}, Lcom/google/android/recaptcha/internal/zzaz;-><init>(Landroid/content/Context;Li7/e;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {p3}, Lcom/google/android/recaptcha/internal/zzaz;->zze(Lcom/google/android/recaptcha/internal/zzaz;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    move-object p2, p3

    .line 24
    :catch_0
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzbm;->zze:Lcom/google/android/recaptcha/internal/zzaz;

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzbm;->zzh()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic zzb(Lcom/google/android/recaptcha/internal/zzbm;)Lcom/google/android/recaptcha/internal/zzaz;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzbm;->zze:Lcom/google/android/recaptcha/internal/zzaz;

    return-object p0
.end method

.method public static final synthetic zzc()Ljava/util/Timer;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzbm;->zzb:Ljava/util/Timer;

    return-object v0
.end method

.method public static final synthetic zzd(Lcom/google/android/recaptcha/internal/zzbm;)Lp7/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzbm;->zzd:Lp7/y;

    return-object p0
.end method

.method public static final synthetic zze(Lcom/google/android/recaptcha/internal/zzbm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzbm;->zzg()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic zzf(Ljava/util/Timer;)V
    .locals 0

    const/4 p0, 0x0

    sput-object p0, Lcom/google/android/recaptcha/internal/zzbm;->zzb:Ljava/util/Timer;

    return-void
.end method

.method private final zzg()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbm;->zze:Lcom/google/android/recaptcha/internal/zzaz;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzaz;->zzd()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "<this>"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    instance-of v1, v0, Ljava/util/RandomAccess;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    div-int/lit8 v3, v1, 0x14

    .line 24
    .line 25
    rem-int/lit8 v4, v1, 0x14

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    move v4, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v4, v2

    .line 33
    :goto_0
    add-int/2addr v3, v4

    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    move v3, v5

    .line 40
    :goto_1
    if-ltz v3, :cond_1

    .line 41
    .line 42
    if-ge v3, v1, :cond_1

    .line 43
    .line 44
    move v6, v2

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    move v6, v5

    .line 47
    :goto_2
    if-eqz v6, :cond_6

    .line 48
    .line 49
    sub-int v6, v1, v3

    .line 50
    .line 51
    const/16 v7, 0x14

    .line 52
    .line 53
    if-le v7, v6, :cond_2

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_2
    move v6, v7

    .line 57
    :goto_3
    new-instance v7, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    move v8, v5

    .line 63
    :goto_4
    if-ge v8, v6, :cond_3

    .line 64
    .line 65
    add-int v9, v8, v3

    .line 66
    .line 67
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    add-int/lit8 v8, v8, 0x1

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x14

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    new-instance v4, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const/4 v9, 0x0

    .line 93
    const-string v0, "iterator"

    .line 94
    .line 95
    invoke-static {v8, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    sget-object v0, Lx6/n;->a:Lx6/n;

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    new-instance v0, Lx6/t;

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/16 v7, 0x14

    .line 111
    .line 112
    const/4 v10, 0x1

    .line 113
    move-object v5, v0

    .line 114
    move v6, v7

    .line 115
    invoke-direct/range {v5 .. v11}, Lx6/t;-><init>(IILjava/util/Iterator;ZZLz6/e;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ln7/d;

    .line 119
    .line 120
    invoke-direct {v1}, Ln7/d;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v1, v0}, Lcom/bumptech/glide/d;->o(Ljava/lang/Object;Lz6/e;Lh7/p;)Lz6/e;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, v1, Ln7/d;->d:Lz6/e;

    .line 128
    .line 129
    move-object v0, v1

    .line 130
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_d

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    check-cast v1, Ljava/util/List;

    .line 161
    .line 162
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzni;->zzi()Lcom/google/android/recaptcha/internal/zznh;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    new-instance v4, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    :cond_8
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_c

    .line 180
    .line 181
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, Lcom/google/android/recaptcha/internal/zzba;

    .line 186
    .line 187
    :try_start_0
    invoke-virtual {v5}, Lcom/google/android/recaptcha/internal/zzba;->zzc()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzg()Lcom/google/android/recaptcha/internal/zzfy;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-virtual {v7, v6}, Lcom/google/android/recaptcha/internal/zzfy;->zzj(Ljava/lang/CharSequence;)[B

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-static {v6}, Lcom/google/android/recaptcha/internal/zzpd;->zzk([B)Lcom/google/android/recaptcha/internal/zzpd;

    .line 200
    .line 201
    .line 202
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    invoke-virtual {v6}, Lcom/google/android/recaptcha/internal/zzpd;->zzJ()I

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    add-int/lit8 v8, v7, -0x1

    .line 208
    .line 209
    if-eqz v7, :cond_b

    .line 210
    .line 211
    if-eqz v8, :cond_a

    .line 212
    .line 213
    if-eq v8, v2, :cond_9

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_9
    invoke-virtual {v6}, Lcom/google/android/recaptcha/internal/zzpd;->zzg()Lcom/google/android/recaptcha/internal/zznu;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-virtual {v3, v6}, Lcom/google/android/recaptcha/internal/zznh;->zzq(Lcom/google/android/recaptcha/internal/zznu;)Lcom/google/android/recaptcha/internal/zznh;

    .line 221
    .line 222
    .line 223
    goto :goto_8

    .line 224
    :cond_a
    invoke-virtual {v6}, Lcom/google/android/recaptcha/internal/zzpd;->zzf()Lcom/google/android/recaptcha/internal/zznf;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-virtual {v3, v6}, Lcom/google/android/recaptcha/internal/zznh;->zzp(Lcom/google/android/recaptcha/internal/zznf;)Lcom/google/android/recaptcha/internal/zznh;

    .line 229
    .line 230
    .line 231
    :goto_8
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_b
    const/4 v0, 0x0

    .line 236
    throw v0

    .line 237
    :catch_0
    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzbm;->zze:Lcom/google/android/recaptcha/internal/zzaz;

    .line 238
    .line 239
    if-eqz v6, :cond_8

    .line 240
    .line 241
    invoke-virtual {v6, v5}, Lcom/google/android/recaptcha/internal/zzaz;->zzf(Lcom/google/android/recaptcha/internal/zzba;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_c
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zznh;->zzd()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zznh;->zze()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    add-int/2addr v5, v1

    .line 254
    if-eqz v5, :cond_7

    .line 255
    .line 256
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Lcom/google/android/recaptcha/internal/zzni;

    .line 261
    .line 262
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzbm;->zzc:Lcom/google/android/recaptcha/internal/zzbn;

    .line 267
    .line 268
    invoke-interface {v3, v1}, Lcom/google/android/recaptcha/internal/zzbn;->zza([B)Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_7

    .line 273
    .line 274
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzbm;->zze:Lcom/google/android/recaptcha/internal/zzaz;

    .line 275
    .line 276
    if-eqz v1, :cond_7

    .line 277
    .line 278
    invoke-virtual {v1, v4}, Lcom/google/android/recaptcha/internal/zzaz;->zza(Ljava/util/List;)I

    .line 279
    .line 280
    .line 281
    goto/16 :goto_6

    .line 282
    .line 283
    :cond_d
    return-void
.end method

.method private final zzh()V
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzbm;->zzb:Ljava/util/Timer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ljava/util/Timer;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v1, Lcom/google/android/recaptcha/internal/zzbm;->zzb:Ljava/util/Timer;

    .line 11
    .line 12
    new-instance v2, Lcom/google/android/recaptcha/internal/zzbj;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/google/android/recaptcha/internal/zzbj;-><init>(Lcom/google/android/recaptcha/internal/zzbm;)V

    .line 15
    .line 16
    .line 17
    const-wide/32 v5, 0x1d4c0

    .line 18
    .line 19
    .line 20
    move-wide v3, v5

    .line 21
    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/recaptcha/internal/zzpd;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzbl;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/recaptcha/internal/zzbl;-><init>(Lcom/google/android/recaptcha/internal/zzbm;Lcom/google/android/recaptcha/internal/zzpd;Lz6/e;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzbm;->zzd:Lp7/y;

    .line 8
    .line 9
    invoke-static {p1, v0}, Lr6/h0;->k0(Lp7/y;Lh7/p;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzbm;->zzh()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
