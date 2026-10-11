.class public final Lcom/google/android/recaptcha/internal/zzbt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzbt;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzbt;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzbt;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzbt;->zza:Lcom/google/android/recaptcha/internal/zzbt;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final zza()Ljava/util/Map;
    .locals 16

    .line 1
    const/16 v0, 0x25

    .line 2
    .line 3
    new-array v1, v0, [Lw6/b;

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    sget-object v3, Lcom/google/android/recaptcha/internal/zzcv;->zza:Lcom/google/android/recaptcha/internal/zzcv;

    .line 12
    .line 13
    new-instance v4, Lw6/b;

    .line 14
    .line 15
    invoke-direct {v4, v2, v3}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aput-object v4, v1, v2

    .line 20
    .line 21
    const/16 v2, 0x22

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Lcom/google/android/recaptcha/internal/zzdn;->zza:Lcom/google/android/recaptcha/internal/zzdn;

    .line 28
    .line 29
    new-instance v5, Lw6/b;

    .line 30
    .line 31
    invoke-direct {v5, v3, v4}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    aput-object v5, v1, v3

    .line 36
    .line 37
    const/16 v4, 0x23

    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v6, Lcom/google/android/recaptcha/internal/zzdz;->zza:Lcom/google/android/recaptcha/internal/zzdz;

    .line 44
    .line 45
    new-instance v7, Lw6/b;

    .line 46
    .line 47
    invoke-direct {v7, v5, v6}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x2

    .line 51
    aput-object v7, v1, v5

    .line 52
    .line 53
    const/16 v6, 0x19

    .line 54
    .line 55
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    sget-object v8, Lcom/google/android/recaptcha/internal/zzde;->zza:Lcom/google/android/recaptcha/internal/zzde;

    .line 60
    .line 61
    new-instance v9, Lw6/b;

    .line 62
    .line 63
    invoke-direct {v9, v7, v8}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 v7, 0x3

    .line 67
    aput-object v9, v1, v7

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v8, Lcom/google/android/recaptcha/internal/zzdx;->zza:Lcom/google/android/recaptcha/internal/zzdx;

    .line 74
    .line 75
    new-instance v9, Lw6/b;

    .line 76
    .line 77
    invoke-direct {v9, v0, v8}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x4

    .line 81
    aput-object v9, v1, v0

    .line 82
    .line 83
    const/16 v8, 0x15

    .line 84
    .line 85
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    sget-object v10, Lcom/google/android/recaptcha/internal/zzcm;->zza:Lcom/google/android/recaptcha/internal/zzcm;

    .line 90
    .line 91
    new-instance v11, Lw6/b;

    .line 92
    .line 93
    invoke-direct {v11, v9, v10}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const/4 v9, 0x5

    .line 97
    aput-object v11, v1, v9

    .line 98
    .line 99
    const/16 v10, 0x16

    .line 100
    .line 101
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    sget-object v12, Lcom/google/android/recaptcha/internal/zzdw;->zza:Lcom/google/android/recaptcha/internal/zzdw;

    .line 106
    .line 107
    new-instance v13, Lw6/b;

    .line 108
    .line 109
    invoke-direct {v13, v11, v12}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 v11, 0x6

    .line 113
    aput-object v13, v1, v11

    .line 114
    .line 115
    const/16 v12, 0x17

    .line 116
    .line 117
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    sget-object v14, Lcom/google/android/recaptcha/internal/zzdo;->zza:Lcom/google/android/recaptcha/internal/zzdo;

    .line 122
    .line 123
    new-instance v15, Lw6/b;

    .line 124
    .line 125
    invoke-direct {v15, v13, v14}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/4 v13, 0x7

    .line 129
    aput-object v15, v1, v13

    .line 130
    .line 131
    const/16 v14, 0x18

    .line 132
    .line 133
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    sget-object v4, Lcom/google/android/recaptcha/internal/zzdb;->zza:Lcom/google/android/recaptcha/internal/zzdb;

    .line 138
    .line 139
    new-instance v2, Lw6/b;

    .line 140
    .line 141
    invoke-direct {v2, v15, v4}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    const/16 v4, 0x8

    .line 145
    .line 146
    aput-object v2, v1, v4

    .line 147
    .line 148
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    sget-object v3, Lcom/google/android/recaptcha/internal/zzdr;->zza:Lcom/google/android/recaptcha/internal/zzdr;

    .line 153
    .line 154
    new-instance v15, Lw6/b;

    .line 155
    .line 156
    invoke-direct {v15, v2, v3}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const/16 v2, 0x9

    .line 160
    .line 161
    aput-object v15, v1, v2

    .line 162
    .line 163
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    sget-object v5, Lcom/google/android/recaptcha/internal/zzcu;->zza:Lcom/google/android/recaptcha/internal/zzcu;

    .line 168
    .line 169
    new-instance v15, Lw6/b;

    .line 170
    .line 171
    invoke-direct {v15, v3, v5}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    const/16 v3, 0xa

    .line 175
    .line 176
    aput-object v15, v1, v3

    .line 177
    .line 178
    const/16 v5, 0x26

    .line 179
    .line 180
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    sget-object v15, Lcom/google/android/recaptcha/internal/zzdv;->zza:Lcom/google/android/recaptcha/internal/zzdv;

    .line 185
    .line 186
    new-instance v13, Lw6/b;

    .line 187
    .line 188
    invoke-direct {v13, v5, v15}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    const/16 v5, 0xb

    .line 192
    .line 193
    aput-object v13, v1, v5

    .line 194
    .line 195
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    sget-object v13, Lcom/google/android/recaptcha/internal/zzdf;->zza:Lcom/google/android/recaptcha/internal/zzdf;

    .line 200
    .line 201
    new-instance v15, Lw6/b;

    .line 202
    .line 203
    invoke-direct {v15, v7, v13}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    const/16 v7, 0xc

    .line 207
    .line 208
    aput-object v15, v1, v7

    .line 209
    .line 210
    const/16 v13, 0x29

    .line 211
    .line 212
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v13

    .line 216
    sget-object v15, Lcom/google/android/recaptcha/internal/zzcs;->zza:Lcom/google/android/recaptcha/internal/zzcs;

    .line 217
    .line 218
    new-instance v7, Lw6/b;

    .line 219
    .line 220
    invoke-direct {v7, v13, v15}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    const/16 v13, 0xd

    .line 224
    .line 225
    aput-object v7, v1, v13

    .line 226
    .line 227
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v7, Lcom/google/android/recaptcha/internal/zzdg;->zza:Lcom/google/android/recaptcha/internal/zzdg;

    .line 232
    .line 233
    new-instance v15, Lw6/b;

    .line 234
    .line 235
    invoke-direct {v15, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const/16 v0, 0xe

    .line 239
    .line 240
    aput-object v15, v1, v0

    .line 241
    .line 242
    const/16 v0, 0x11

    .line 243
    .line 244
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    sget-object v7, Lcom/google/android/recaptcha/internal/zzda;->zza:Lcom/google/android/recaptcha/internal/zzda;

    .line 249
    .line 250
    new-instance v15, Lw6/b;

    .line 251
    .line 252
    invoke-direct {v15, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    const/16 v0, 0xf

    .line 256
    .line 257
    aput-object v15, v1, v0

    .line 258
    .line 259
    const/16 v7, 0x20

    .line 260
    .line 261
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    sget-object v15, Lcom/google/android/recaptcha/internal/zzcn;->zza:Lcom/google/android/recaptcha/internal/zzcn;

    .line 266
    .line 267
    new-instance v0, Lw6/b;

    .line 268
    .line 269
    invoke-direct {v0, v7, v15}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    const/16 v7, 0x10

    .line 273
    .line 274
    aput-object v0, v1, v7

    .line 275
    .line 276
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    sget-object v7, Lcom/google/android/recaptcha/internal/zzdi;->zza:Lcom/google/android/recaptcha/internal/zzdi;

    .line 281
    .line 282
    new-instance v9, Lw6/b;

    .line 283
    .line 284
    invoke-direct {v9, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    const/16 v0, 0x11

    .line 288
    .line 289
    aput-object v9, v1, v0

    .line 290
    .line 291
    const/16 v0, 0x1f

    .line 292
    .line 293
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    sget-object v7, Lcom/google/android/recaptcha/internal/zzco;->zza:Lcom/google/android/recaptcha/internal/zzco;

    .line 298
    .line 299
    new-instance v9, Lw6/b;

    .line 300
    .line 301
    invoke-direct {v9, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    const/16 v0, 0x12

    .line 305
    .line 306
    aput-object v9, v1, v0

    .line 307
    .line 308
    const/16 v0, 0x24

    .line 309
    .line 310
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    sget-object v7, Lcom/google/android/recaptcha/internal/zzcp;->zza:Lcom/google/android/recaptcha/internal/zzcp;

    .line 315
    .line 316
    new-instance v9, Lw6/b;

    .line 317
    .line 318
    invoke-direct {v9, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    const/16 v0, 0x13

    .line 322
    .line 323
    aput-object v9, v1, v0

    .line 324
    .line 325
    const/16 v0, 0x10

    .line 326
    .line 327
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    sget-object v7, Lcom/google/android/recaptcha/internal/zzcw;->zza:Lcom/google/android/recaptcha/internal/zzcw;

    .line 332
    .line 333
    new-instance v9, Lw6/b;

    .line 334
    .line 335
    invoke-direct {v9, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    const/16 v0, 0x14

    .line 339
    .line 340
    aput-object v9, v1, v0

    .line 341
    .line 342
    const/16 v0, 0x1a

    .line 343
    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    sget-object v7, Lcom/google/android/recaptcha/internal/zzds;->zza:Lcom/google/android/recaptcha/internal/zzds;

    .line 349
    .line 350
    new-instance v9, Lw6/b;

    .line 351
    .line 352
    invoke-direct {v9, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    aput-object v9, v1, v8

    .line 356
    .line 357
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sget-object v7, Lcom/google/android/recaptcha/internal/zzdh;->zza:Lcom/google/android/recaptcha/internal/zzdh;

    .line 362
    .line 363
    new-instance v8, Lw6/b;

    .line 364
    .line 365
    invoke-direct {v8, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    aput-object v8, v1, v10

    .line 369
    .line 370
    const/16 v0, 0x1b

    .line 371
    .line 372
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    sget-object v7, Lcom/google/android/recaptcha/internal/zzdq;->zza:Lcom/google/android/recaptcha/internal/zzdq;

    .line 377
    .line 378
    new-instance v8, Lw6/b;

    .line 379
    .line 380
    invoke-direct {v8, v0, v7}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    aput-object v8, v1, v12

    .line 384
    .line 385
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    sget-object v4, Lcom/google/android/recaptcha/internal/zzdl;->zza:Lcom/google/android/recaptcha/internal/zzdl;

    .line 390
    .line 391
    new-instance v7, Lw6/b;

    .line 392
    .line 393
    invoke-direct {v7, v0, v4}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    aput-object v7, v1, v14

    .line 397
    .line 398
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdm;->zza:Lcom/google/android/recaptcha/internal/zzdm;

    .line 403
    .line 404
    new-instance v4, Lw6/b;

    .line 405
    .line 406
    invoke-direct {v4, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    aput-object v4, v1, v6

    .line 410
    .line 411
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdj;->zza:Lcom/google/android/recaptcha/internal/zzdj;

    .line 416
    .line 417
    new-instance v3, Lw6/b;

    .line 418
    .line 419
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    const/16 v0, 0x1a

    .line 423
    .line 424
    aput-object v3, v1, v0

    .line 425
    .line 426
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdk;->zza:Lcom/google/android/recaptcha/internal/zzdk;

    .line 431
    .line 432
    new-instance v3, Lw6/b;

    .line 433
    .line 434
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    const/16 v0, 0x1b

    .line 438
    .line 439
    aput-object v3, v1, v0

    .line 440
    .line 441
    const/16 v0, 0xc

    .line 442
    .line 443
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdt;->zza:Lcom/google/android/recaptcha/internal/zzdt;

    .line 448
    .line 449
    new-instance v3, Lw6/b;

    .line 450
    .line 451
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    const/16 v0, 0x1c

    .line 455
    .line 456
    aput-object v3, v1, v0

    .line 457
    .line 458
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdu;->zza:Lcom/google/android/recaptcha/internal/zzdu;

    .line 463
    .line 464
    new-instance v3, Lw6/b;

    .line 465
    .line 466
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    const/16 v0, 0x1d

    .line 470
    .line 471
    aput-object v3, v1, v0

    .line 472
    .line 473
    const/16 v0, 0x1e

    .line 474
    .line 475
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    sget-object v3, Lcom/google/android/recaptcha/internal/zzcq;->zza:Lcom/google/android/recaptcha/internal/zzcq;

    .line 480
    .line 481
    new-instance v4, Lw6/b;

    .line 482
    .line 483
    invoke-direct {v4, v2, v3}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    aput-object v4, v1, v0

    .line 487
    .line 488
    const/16 v0, 0xf

    .line 489
    .line 490
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcr;->zza:Lcom/google/android/recaptcha/internal/zzcr;

    .line 495
    .line 496
    new-instance v3, Lw6/b;

    .line 497
    .line 498
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    const/16 v0, 0x1f

    .line 502
    .line 503
    aput-object v3, v1, v0

    .line 504
    .line 505
    const/16 v0, 0x14

    .line 506
    .line 507
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sget-object v2, Lcom/google/android/recaptcha/internal/zzct;->zza:Lcom/google/android/recaptcha/internal/zzct;

    .line 512
    .line 513
    new-instance v3, Lw6/b;

    .line 514
    .line 515
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    const/16 v0, 0x20

    .line 519
    .line 520
    aput-object v3, v1, v0

    .line 521
    .line 522
    const/4 v0, 0x7

    .line 523
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdp;->zza:Lcom/google/android/recaptcha/internal/zzdp;

    .line 528
    .line 529
    new-instance v3, Lw6/b;

    .line 530
    .line 531
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    const/16 v0, 0x21

    .line 535
    .line 536
    aput-object v3, v1, v0

    .line 537
    .line 538
    const/16 v0, 0x12

    .line 539
    .line 540
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcy;->zza:Lcom/google/android/recaptcha/internal/zzcy;

    .line 545
    .line 546
    new-instance v3, Lw6/b;

    .line 547
    .line 548
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    const/16 v0, 0x22

    .line 552
    .line 553
    aput-object v3, v1, v0

    .line 554
    .line 555
    const/16 v0, 0x13

    .line 556
    .line 557
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    sget-object v2, Lcom/google/android/recaptcha/internal/zzcz;->zza:Lcom/google/android/recaptcha/internal/zzcz;

    .line 562
    .line 563
    new-instance v3, Lw6/b;

    .line 564
    .line 565
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    const/16 v0, 0x23

    .line 569
    .line 570
    aput-object v3, v1, v0

    .line 571
    .line 572
    const/16 v0, 0x28

    .line 573
    .line 574
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    sget-object v2, Lcom/google/android/recaptcha/internal/zzdy;->zza:Lcom/google/android/recaptcha/internal/zzdy;

    .line 579
    .line 580
    new-instance v3, Lw6/b;

    .line 581
    .line 582
    invoke-direct {v3, v0, v2}, Lw6/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    const/16 v0, 0x24

    .line 586
    .line 587
    aput-object v3, v1, v0

    .line 588
    .line 589
    invoke-static {v1}, Lo7/f;->g1([Lw6/b;)Ljava/util/Map;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    return-object v0
.end method
