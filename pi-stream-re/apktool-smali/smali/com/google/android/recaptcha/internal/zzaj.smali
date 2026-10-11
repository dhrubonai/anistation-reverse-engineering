.class final Lcom/google/android/recaptcha/internal/zzaj;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:I

.field final synthetic zzc:Landroid/app/Application;

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzab;

.field final synthetic zze:Ljava/lang/String;

.field final synthetic zzf:Lcom/google/android/recaptcha/internal/zzbq;

.field final synthetic zzg:Lcom/google/android/recaptcha/internal/zzbd;

.field final synthetic zzh:Lcom/google/android/recaptcha/internal/zzbg;

.field final synthetic zzi:J

.field final synthetic zzj:Lcom/google/android/recaptcha/internal/zzt;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/google/android/recaptcha/internal/zzab;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzt;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbg;JLz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzd:Lcom/google/android/recaptcha/internal/zzab;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzaj;->zze:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzf:Lcom/google/android/recaptcha/internal/zzbq;

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzg:Lcom/google/android/recaptcha/internal/zzbd;

    iput-object p6, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    iput-object p8, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzh:Lcom/google/android/recaptcha/internal/zzbg;

    iput-wide p9, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzi:J

    invoke-direct {p0, p11}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 12

    .line 1
    iget-object v8, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzh:Lcom/google/android/recaptcha/internal/zzbg;

    iget-wide v9, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzi:J

    new-instance p1, Lcom/google/android/recaptcha/internal/zzaj;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzd:Lcom/google/android/recaptcha/internal/zzab;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzaj;->zze:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzf:Lcom/google/android/recaptcha/internal/zzbq;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzg:Lcom/google/android/recaptcha/internal/zzbd;

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    const/4 v7, 0x0

    move-object v0, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lcom/google/android/recaptcha/internal/zzaj;-><init>(Landroid/app/Application;Lcom/google/android/recaptcha/internal/zzab;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzt;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbg;JLz6/e;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzaj;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzaj;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzaj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La7/a;->a:La7/a;

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzb:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    if-eq v2, v5, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzaj;->zza:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lcom/google/android/recaptcha/internal/zzoe;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v6, p1

    .line 24
    .line 25
    check-cast v6, Lw6/d;

    .line 26
    .line 27
    iget-object v6, v6, Lw6/d;->a:Ljava/lang/Object;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v1, v0, Lcom/google/android/recaptcha/internal/zzaj;->zza:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Throwable;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v2, Lcom/google/android/recaptcha/internal/zzam;->zza:Lcom/google/android/recaptcha/internal/zzam;

    .line 49
    .line 50
    iget-object v7, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    .line 51
    .line 52
    iget-object v11, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzd:Lcom/google/android/recaptcha/internal/zzab;

    .line 53
    .line 54
    iget-object v8, v0, Lcom/google/android/recaptcha/internal/zzaj;->zze:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v10, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzf:Lcom/google/android/recaptcha/internal/zzbq;

    .line 57
    .line 58
    iget-object v9, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzg:Lcom/google/android/recaptcha/internal/zzbd;

    .line 59
    .line 60
    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    .line 61
    .line 62
    iput v5, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzb:I

    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzt;->zza()Lp7/y;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Lp7/y;->b()Lz6/i;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v13, Lcom/google/android/recaptcha/internal/zzal;

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    move-object v6, v13

    .line 76
    invoke-direct/range {v6 .. v12}, Lcom/google/android/recaptcha/internal/zzal;-><init>(Landroid/app/Application;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzab;Lz6/e;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v13, v0}, Lr6/h0;->f1(Lz6/i;Lh7/p;Lz6/e;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eq v2, v1, :cond_7

    .line 84
    .line 85
    :goto_0
    iget-object v6, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    .line 86
    .line 87
    check-cast v2, Lcom/google/android/recaptcha/internal/zzoe;

    .line 88
    .line 89
    new-instance v15, Lcom/google/android/recaptcha/internal/zzez;

    .line 90
    .line 91
    new-instance v8, Landroid/webkit/WebView;

    .line 92
    .line 93
    invoke-direct {v8, v6}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    iget-object v9, v0, Lcom/google/android/recaptcha/internal/zzaj;->zze:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v10, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    .line 99
    .line 100
    iget-object v11, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzd:Lcom/google/android/recaptcha/internal/zzab;

    .line 101
    .line 102
    iget-object v12, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzg:Lcom/google/android/recaptcha/internal/zzbd;

    .line 103
    .line 104
    iget-object v13, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    .line 105
    .line 106
    iget-object v14, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzh:Lcom/google/android/recaptcha/internal/zzbg;

    .line 107
    .line 108
    iget-object v6, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzf:Lcom/google/android/recaptcha/internal/zzbq;

    .line 109
    .line 110
    move-object v7, v15

    .line 111
    move-object v5, v15

    .line 112
    move-object v15, v6

    .line 113
    invoke-direct/range {v7 .. v15}, Lcom/google/android/recaptcha/internal/zzez;-><init>(Landroid/webkit/WebView;Ljava/lang/String;Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzab;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzt;Lcom/google/android/recaptcha/internal/zzbg;Lcom/google/android/recaptcha/internal/zzbq;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzam;->zze()Lcom/google/android/recaptcha/internal/zzg;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {v6, v5}, Lcom/google/android/recaptcha/internal/zzg;->zzd(Lcom/google/android/recaptcha/internal/zza;)V

    .line 121
    .line 122
    .line 123
    iget-wide v5, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzi:J

    .line 124
    .line 125
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzam;->zze()Lcom/google/android/recaptcha/internal/zzg;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    iput-object v2, v0, Lcom/google/android/recaptcha/internal/zzaj;->zza:Ljava/lang/Object;

    .line 130
    .line 131
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzb:I

    .line 132
    .line 133
    invoke-virtual {v7, v5, v6, v2, v0}, Lcom/google/android/recaptcha/internal/zzg;->zzb(JLcom/google/android/recaptcha/internal/zzoe;Lz6/e;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    if-eq v6, v1, :cond_7

    .line 138
    .line 139
    :goto_1
    move-object/from16 v22, v2

    .line 140
    .line 141
    iget-object v2, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    .line 142
    .line 143
    invoke-static {v6}, Lw6/d;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    if-nez v5, :cond_3

    .line 148
    .line 149
    iget-object v1, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzc:Landroid/app/Application;

    .line 150
    .line 151
    new-instance v2, Lcom/google/android/recaptcha/internal/zzaw;

    .line 152
    .line 153
    sget-object v3, Lcom/google/android/recaptcha/internal/zzam;->zza:Lcom/google/android/recaptcha/internal/zzam;

    .line 154
    .line 155
    iget-object v3, v0, Lcom/google/android/recaptcha/internal/zzaj;->zze:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v4, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzj:Lcom/google/android/recaptcha/internal/zzt;

    .line 158
    .line 159
    iget-object v5, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzd:Lcom/google/android/recaptcha/internal/zzab;

    .line 160
    .line 161
    iget-object v6, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzg:Lcom/google/android/recaptcha/internal/zzbd;

    .line 162
    .line 163
    iget-object v7, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzh:Lcom/google/android/recaptcha/internal/zzbg;

    .line 164
    .line 165
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzam;->zze()Lcom/google/android/recaptcha/internal/zzg;

    .line 166
    .line 167
    .line 168
    move-result-object v18

    .line 169
    new-instance v8, Lcom/google/android/recaptcha/internal/zzq;

    .line 170
    .line 171
    invoke-direct {v8, v1}, Lcom/google/android/recaptcha/internal/zzq;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    new-instance v26, Lcom/google/android/recaptcha/internal/zzbs;

    .line 175
    .line 176
    invoke-direct/range {v26 .. v26}, Lcom/google/android/recaptcha/internal/zzbs;-><init>()V

    .line 177
    .line 178
    .line 179
    move-object/from16 v16, v2

    .line 180
    .line 181
    move-object/from16 v17, v1

    .line 182
    .line 183
    move-object/from16 v19, v3

    .line 184
    .line 185
    move-object/from16 v20, v4

    .line 186
    .line 187
    move-object/from16 v21, v5

    .line 188
    .line 189
    move-object/from16 v23, v6

    .line 190
    .line 191
    move-object/from16 v24, v7

    .line 192
    .line 193
    move-object/from16 v25, v8

    .line 194
    .line 195
    invoke-direct/range {v16 .. v26}, Lcom/google/android/recaptcha/internal/zzaw;-><init>(Landroid/app/Application;Lcom/google/android/recaptcha/internal/zzg;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzt;Lcom/google/android/recaptcha/internal/zzab;Lcom/google/android/recaptcha/internal/zzoe;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzbg;Lcom/google/android/recaptcha/internal/zzq;Lcom/google/android/recaptcha/internal/zzbs;)V

    .line 196
    .line 197
    .line 198
    return-object v2

    .line 199
    :cond_3
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzt;->zzc()Lp7/y;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-interface {v6}, Lp7/y;->b()Lz6/i;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    sget-object v7, Landroidx/lifecycle/q0;->x:Landroidx/lifecycle/q0;

    .line 208
    .line 209
    invoke-interface {v6, v7}, Lz6/i;->r(Lz6/h;)Lz6/g;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    check-cast v6, Lp7/a1;

    .line 214
    .line 215
    if-eqz v6, :cond_4

    .line 216
    .line 217
    check-cast v6, Lp7/k1;

    .line 218
    .line 219
    new-instance v8, Lp7/j1;

    .line 220
    .line 221
    invoke-direct {v8, v4, v6}, Lp7/j1;-><init>(Lz6/e;Lp7/k1;)V

    .line 222
    .line 223
    .line 224
    new-instance v6, Ln7/d;

    .line 225
    .line 226
    invoke-direct {v6}, Ln7/d;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-static {v6, v6, v8}, Lcom/bumptech/glide/d;->o(Ljava/lang/Object;Lz6/e;Lh7/p;)Lz6/e;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    iput-object v8, v6, Ln7/d;->d:Lz6/e;

    .line 234
    .line 235
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_4

    .line 240
    .line 241
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    check-cast v8, Lp7/a1;

    .line 246
    .line 247
    check-cast v8, Lp7/k1;

    .line 248
    .line 249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v9, Lp7/b1;

    .line 253
    .line 254
    invoke-virtual {v8}, Lp7/k1;->m()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    invoke-direct {v9, v10, v4, v8}, Lp7/b1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lp7/a1;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v8, v9}, Lp7/k1;->k(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzt;->zzc()Lp7/y;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {v2}, Lp7/y;->b()Lz6/i;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-interface {v2, v7}, Lz6/i;->r(Lz6/h;)Lz6/g;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    check-cast v6, Lp7/a1;

    .line 278
    .line 279
    if-eqz v6, :cond_6

    .line 280
    .line 281
    check-cast v6, Lp7/k1;

    .line 282
    .line 283
    new-instance v2, Lp7/j1;

    .line 284
    .line 285
    invoke-direct {v2, v4, v6}, Lp7/j1;-><init>(Lz6/e;Lp7/k1;)V

    .line 286
    .line 287
    .line 288
    new-instance v6, Lg0/d1;

    .line 289
    .line 290
    invoke-direct {v6, v2, v3}, Lg0/d1;-><init>(Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v6}, Ln7/e;->k0(Ln7/c;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    iput-object v5, v0, Lcom/google/android/recaptcha/internal/zzaj;->zza:Ljava/lang/Object;

    .line 298
    .line 299
    const/4 v3, 0x3

    .line 300
    iput v3, v0, Lcom/google/android/recaptcha/internal/zzaj;->zzb:I

    .line 301
    .line 302
    invoke-static {v2, v0}, Lcom/bumptech/glide/c;->K(Ljava/util/List;Lz6/e;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    if-ne v2, v1, :cond_5

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_5
    move-object v1, v5

    .line 310
    :goto_3
    sget-object v2, Lcom/google/android/recaptcha/internal/zzam;->zza:Lcom/google/android/recaptcha/internal/zzam;

    .line 311
    .line 312
    new-instance v2, Lcom/google/android/recaptcha/internal/zzg;

    .line 313
    .line 314
    const/4 v3, 0x1

    .line 315
    invoke-direct {v2, v4, v3, v4}, Lcom/google/android/recaptcha/internal/zzg;-><init>(Ljava/util/List;ILi7/e;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzam;->zzf(Lcom/google/android/recaptcha/internal/zzg;)V

    .line 319
    .line 320
    .line 321
    throw v1

    .line 322
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    new-instance v3, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v4, "Current context doesn\'t contain Job in it: "

    .line 327
    .line 328
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v1

    .line 346
    :cond_7
    :goto_4
    return-object v1
.end method
