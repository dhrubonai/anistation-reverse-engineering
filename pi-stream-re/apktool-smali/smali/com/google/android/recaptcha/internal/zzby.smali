.class final Lcom/google/android/recaptcha/internal/zzby;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field final synthetic zza:Ljava/lang/Exception;

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zzcj;

.field final synthetic zzc:Lcom/google/android/recaptcha/internal/zzca;

.field private synthetic zzd:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcj;Lcom/google/android/recaptcha/internal/zzca;Lz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    invoke-direct {p0, p4}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzby;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzby;-><init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcj;Lcom/google/android/recaptcha/internal/zzca;Lz6/e;)V

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzby;->zzd:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzby;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzby;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzby;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzd:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lp7/y;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    .line 11
    .line 12
    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzae;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Lcom/google/android/recaptcha/internal/zzae;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzae;->zza()Lcom/google/android/recaptcha/internal/zzpg;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzpg;->zzd(I)Lcom/google/android/recaptcha/internal/zzpg;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzph;->zzf()Lcom/google/android/recaptcha/internal/zzpg;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzpg;->zzd(I)Lcom/google/android/recaptcha/internal/zzpg;

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzpg;->zzp(I)Lcom/google/android/recaptcha/internal/zzpg;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzpg;->zze(I)Lcom/google/android/recaptcha/internal/zzpg;

    .line 50
    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lcom/google/android/recaptcha/internal/zzph;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzph;->zzk()I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzph;->zzj()I

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget-object v2, Li7/l;->a:Li7/m;

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v2, Li7/d;

    .line 77
    .line 78
    invoke-direct {v2, v1}, Li7/d;-><init>(Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    const-string v1, "jClass"

    .line 82
    .line 83
    iget-object v2, v2, Li7/d;->a:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-static {v2, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/4 v3, 0x1

    .line 93
    const/4 v4, 0x0

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    goto/16 :goto_1

    .line 97
    .line 98
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->isLocalClass()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v2}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const/16 v6, 0x24

    .line 113
    .line 114
    if-eqz v5, :cond_2

    .line 115
    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v1, v2}, Lo7/j;->E1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_3

    .line 144
    .line 145
    new-instance v5, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v1, v2}, Lo7/j;->E1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    const/4 v2, 0x6

    .line 169
    invoke-static {v1, v6, v4, v4, v2}, Lo7/j;->p1(Ljava/lang/CharSequence;CIZI)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    const/4 v5, -0x1

    .line 174
    if-ne v2, v5, :cond_4

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    add-int/2addr v2, v3

    .line 178
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    invoke-virtual {v1, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v2, "substring(...)"

    .line 187
    .line 188
    invoke-static {v1, v2}, Lr6/h0;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    sget-object v5, Li7/d;->c:Ljava/util/LinkedHashMap;

    .line 197
    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_7

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Ljava/lang/String;

    .line 219
    .line 220
    if-eqz v1, :cond_7

    .line 221
    .line 222
    const-string v2, "Array"

    .line 223
    .line 224
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v5, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    check-cast v1, Ljava/lang/String;

    .line 237
    .line 238
    :cond_7
    :goto_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 244
    .line 245
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzcj;->zzb()Lcom/google/android/recaptcha/internal/zzz;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zzcj;->zza:Lcom/google/android/recaptcha/internal/zzz;

    .line 250
    .line 251
    if-nez v1, :cond_8

    .line 252
    .line 253
    const/4 v1, 0x0

    .line 254
    :cond_8
    invoke-static {v2, v1}, Lcom/google/android/recaptcha/internal/zzbp;->zza(Lcom/google/android/recaptcha/internal/zzz;Lcom/google/android/recaptcha/internal/zzz;)Lcom/google/android/recaptcha/internal/zzno;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    .line 259
    .line 260
    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzcj;->zzd()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-nez v5, :cond_9

    .line 269
    .line 270
    const-string v2, "recaptcha.m.Main.rge"

    .line 271
    .line 272
    :cond_9
    invoke-interface {p1}, Lp7/y;->b()Lz6/i;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    sget-object v5, Landroidx/lifecycle/q0;->x:Landroidx/lifecycle/q0;

    .line 277
    .line 278
    invoke-interface {p1, v5}, Lz6/i;->r(Lz6/h;)Lz6/g;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p1, Lp7/a1;

    .line 283
    .line 284
    if-eqz p1, :cond_a

    .line 285
    .line 286
    invoke-interface {p1}, Lp7/a1;->a()Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    :cond_a
    if-eqz v3, :cond_b

    .line 291
    .line 292
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    .line 293
    .line 294
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzh()Lcom/google/android/recaptcha/internal/zzfy;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    array-length v5, v0

    .line 303
    invoke-virtual {v3, v0, v4, v5}, Lcom/google/android/recaptcha/internal/zzfy;->zzi([BII)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzh()Lcom/google/android/recaptcha/internal/zzfy;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    array-length v5, v1

    .line 316
    invoke-virtual {v3, v1, v4, v5}, Lcom/google/android/recaptcha/internal/zzfy;->zzi([BII)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {p1, v2, v0}, Lcom/google/android/recaptcha/internal/zzca;->zze(Lcom/google/android/recaptcha/internal/zzca;Ljava/lang/String;[Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    :cond_b
    sget-object p1, Lw6/f;->a:Lw6/f;

    .line 328
    .line 329
    return-object p1
.end method
