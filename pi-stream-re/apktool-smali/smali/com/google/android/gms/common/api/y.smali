.class public final Lcom/google/android/gms/common/api/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/common/api/y;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Lcom/google/android/gms/common/internal/j;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/google/android/gms/common/internal/j;->a:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-static {p1, v2, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget v2, p0, Lcom/google/android/gms/common/internal/j;->b:I

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget v2, p0, Lcom/google/android/gms/common/internal/j;->c:I

    .line 21
    .line 22
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/gms/common/internal/j;->d:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {p1, v2, v1, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/gms/common/internal/j;->e:Landroid/os/IBinder;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x5

    .line 38
    invoke-static {v2, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    const/4 v1, 0x6

    .line 49
    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 50
    .line 51
    invoke-static {p1, v1, v2, p2}, Lp7/a0;->r0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x7

    .line 55
    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->x:Landroid/os/Bundle;

    .line 56
    .line 57
    invoke-static {p1, v1, v2, v3}, Lp7/a0;->e0(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 58
    .line 59
    .line 60
    const/16 v1, 0x8

    .line 61
    .line 62
    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->y:Landroid/accounts/Account;

    .line 63
    .line 64
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 65
    .line 66
    .line 67
    const/16 v1, 0xa

    .line 68
    .line 69
    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->z:[Lb5/c;

    .line 70
    .line 71
    invoke-static {p1, v1, v2, p2}, Lp7/a0;->r0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xb

    .line 75
    .line 76
    iget-object v2, p0, Lcom/google/android/gms/common/internal/j;->A:[Lb5/c;

    .line 77
    .line 78
    invoke-static {p1, v1, v2, p2}, Lp7/a0;->r0(Landroid/os/Parcel;I[Landroid/os/Parcelable;I)V

    .line 79
    .line 80
    .line 81
    const/16 p2, 0xc

    .line 82
    .line 83
    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/j;->B:Z

    .line 84
    .line 85
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 86
    .line 87
    .line 88
    const/16 p2, 0xd

    .line 89
    .line 90
    iget v1, p0, Lcom/google/android/gms/common/internal/j;->C:I

    .line 91
    .line 92
    invoke-static {p1, p2, v1}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 93
    .line 94
    .line 95
    const/16 p2, 0xe

    .line 96
    .line 97
    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/j;->D:Z

    .line 98
    .line 99
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 100
    .line 101
    .line 102
    const/16 p2, 0xf

    .line 103
    .line 104
    iget-object p0, p0, Lcom/google/android/gms/common/internal/j;->E:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {p1, p2, p0, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lcom/google/android/gms/common/api/y;->a:I

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x2

    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x0

    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    goto/16 :goto_1f

    .line 20
    .line 21
    :pswitch_0
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    move-object v13, v11

    .line 26
    move-object v14, v13

    .line 27
    move-object v15, v14

    .line 28
    move-object/from16 v16, v15

    .line 29
    .line 30
    move-object/from16 v17, v16

    .line 31
    .line 32
    move-object/from16 v18, v17

    .line 33
    .line 34
    move-object/from16 v19, v18

    .line 35
    .line 36
    move-object/from16 v20, v19

    .line 37
    .line 38
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge v3, v2, :cond_0

    .line 43
    .line 44
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    int-to-char v4, v3

    .line 49
    packed-switch v4, :pswitch_data_1

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v20

    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    sget-object v4, Lo5/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    .line 63
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object/from16 v19, v3

    .line 68
    .line 69
    check-cast v19, Lo5/g;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_3
    sget-object v4, Lo5/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 73
    .line 74
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    move-object/from16 v18, v3

    .line 79
    .line 80
    check-cast v18, Lo5/k;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_4
    sget-object v4, Lo5/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    move-object/from16 v17, v3

    .line 90
    .line 91
    check-cast v17, Lo5/i;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_5
    sget-object v4, Lo5/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    .line 96
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object/from16 v16, v3

    .line 101
    .line 102
    check-cast v16, Lo5/j;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :pswitch_6
    invoke-static {v3, v0}, Lq6/g;->m(ILandroid/os/Parcel;)[B

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    goto :goto_0

    .line 110
    :pswitch_7
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    goto :goto_0

    .line 115
    :pswitch_8
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Lo5/x;

    .line 124
    .line 125
    move-object v12, v0

    .line 126
    invoke-direct/range {v12 .. v20}, Lo5/x;-><init>(Ljava/lang/String;Ljava/lang/String;[BLo5/j;Lo5/i;Lo5/k;Lo5/g;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_9
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    move-object v13, v11

    .line 135
    move-object v14, v13

    .line 136
    move-object v15, v14

    .line 137
    move-object/from16 v16, v15

    .line 138
    .line 139
    move-object/from16 v17, v16

    .line 140
    .line 141
    move-object/from16 v18, v17

    .line 142
    .line 143
    move-object/from16 v19, v18

    .line 144
    .line 145
    move-object/from16 v20, v19

    .line 146
    .line 147
    move-object/from16 v21, v20

    .line 148
    .line 149
    move-object/from16 v22, v21

    .line 150
    .line 151
    move-object/from16 v23, v22

    .line 152
    .line 153
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-ge v3, v2, :cond_1

    .line 158
    .line 159
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    int-to-char v4, v3

    .line 164
    packed-switch v4, :pswitch_data_2

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :pswitch_a
    sget-object v4, Lo5/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 172
    .line 173
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    move-object/from16 v23, v3

    .line 178
    .line 179
    check-cast v23, Lo5/f;

    .line 180
    .line 181
    goto :goto_1

    .line 182
    :pswitch_b
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v22

    .line 186
    goto :goto_1

    .line 187
    :pswitch_c
    sget-object v4, Lo5/l0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 188
    .line 189
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    move-object/from16 v21, v3

    .line 194
    .line 195
    check-cast v21, Lo5/l0;

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :pswitch_d
    invoke-static {v3, v0}, Lq6/g;->R(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v20

    .line 202
    goto :goto_1

    .line 203
    :pswitch_e
    sget-object v4, Lo5/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 204
    .line 205
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    move-object/from16 v19, v3

    .line 210
    .line 211
    check-cast v19, Lo5/m;

    .line 212
    .line 213
    goto :goto_1

    .line 214
    :pswitch_f
    sget-object v4, Lo5/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 215
    .line 216
    invoke-static {v0, v3, v4}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    goto :goto_1

    .line 221
    :pswitch_10
    invoke-static {v3, v0}, Lq6/g;->P(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 222
    .line 223
    .line 224
    move-result-object v17

    .line 225
    goto :goto_1

    .line 226
    :pswitch_11
    sget-object v4, Lo5/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 227
    .line 228
    invoke-static {v0, v3, v4}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 229
    .line 230
    .line 231
    move-result-object v16

    .line 232
    goto :goto_1

    .line 233
    :pswitch_12
    invoke-static {v3, v0}, Lq6/g;->m(ILandroid/os/Parcel;)[B

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    goto :goto_1

    .line 238
    :pswitch_13
    sget-object v4, Lo5/f0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 239
    .line 240
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    move-object v14, v3

    .line 245
    check-cast v14, Lo5/f0;

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :pswitch_14
    sget-object v4, Lo5/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 249
    .line 250
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    move-object v13, v3

    .line 255
    check-cast v13, Lo5/c0;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_1
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 259
    .line 260
    .line 261
    new-instance v0, Lo5/y;

    .line 262
    .line 263
    move-object v12, v0

    .line 264
    invoke-direct/range {v12 .. v23}, Lo5/y;-><init>(Lo5/c0;Lo5/f0;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lo5/m;Ljava/lang/Integer;Lo5/l0;Ljava/lang/String;Lo5/f;)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_15
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    :goto_2
    move-object v3, v11

    .line 273
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-ge v4, v2, :cond_5

    .line 278
    .line 279
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    int-to-char v5, v4

    .line 284
    if-eq v5, v9, :cond_2

    .line 285
    .line 286
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_2
    invoke-static {v4, v0}, Lq6/g;->U(ILandroid/os/Parcel;)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-nez v3, :cond_3

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    new-array v6, v5, [[B

    .line 306
    .line 307
    move v7, v10

    .line 308
    :goto_4
    if-ge v7, v5, :cond_4

    .line 309
    .line 310
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->createByteArray()[B

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    aput-object v8, v6, v7

    .line 315
    .line 316
    add-int/lit8 v7, v7, 0x1

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_4
    add-int/2addr v4, v3

    .line 320
    invoke-virtual {v0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 321
    .line 322
    .line 323
    move-object v3, v6

    .line 324
    goto :goto_3

    .line 325
    :cond_5
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Lo5/s0;

    .line 329
    .line 330
    invoke-direct {v0, v3}, Lo5/s0;-><init>([[B)V

    .line 331
    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_16
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-ge v3, v2, :cond_7

    .line 343
    .line 344
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    int-to-char v4, v3

    .line 349
    if-eq v4, v9, :cond_6

    .line 350
    .line 351
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 352
    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_6
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    goto :goto_5

    .line 360
    :cond_7
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 361
    .line 362
    .line 363
    new-instance v0, Lo5/r0;

    .line 364
    .line 365
    invoke-direct {v0, v11}, Lo5/r0;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_17
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    if-ge v3, v2, :cond_9

    .line 378
    .line 379
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    int-to-char v4, v3

    .line 384
    if-eq v4, v9, :cond_8

    .line 385
    .line 386
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_8
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    goto :goto_6

    .line 395
    :cond_9
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 396
    .line 397
    .line 398
    new-instance v0, Lo5/w;

    .line 399
    .line 400
    invoke-direct {v0, v10}, Lo5/w;-><init>(Z)V

    .line 401
    .line 402
    .line 403
    return-object v0

    .line 404
    :pswitch_18
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    if-ge v3, v2, :cond_b

    .line 413
    .line 414
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    int-to-char v4, v3

    .line 419
    if-eq v4, v9, :cond_a

    .line 420
    .line 421
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 422
    .line 423
    .line 424
    goto :goto_7

    .line 425
    :cond_a
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    goto :goto_7

    .line 430
    :cond_b
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 431
    .line 432
    .line 433
    new-instance v0, Lo5/q0;

    .line 434
    .line 435
    invoke-direct {v0, v10}, Lo5/q0;-><init>(Z)V

    .line 436
    .line 437
    .line 438
    return-object v0

    .line 439
    :pswitch_19
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 444
    .line 445
    .line 446
    move-result v3

    .line 447
    if-ge v3, v2, :cond_d

    .line 448
    .line 449
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    int-to-char v6, v3

    .line 454
    if-eq v6, v9, :cond_c

    .line 455
    .line 456
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 457
    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_c
    invoke-static {v3, v0}, Lq6/g;->S(ILandroid/os/Parcel;)J

    .line 461
    .line 462
    .line 463
    move-result-wide v4

    .line 464
    goto :goto_8

    .line 465
    :cond_d
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 466
    .line 467
    .line 468
    new-instance v0, Lo5/p0;

    .line 469
    .line 470
    invoke-direct {v0, v4, v5}, Lo5/p0;-><init>(J)V

    .line 471
    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_1a
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-ge v3, v2, :cond_f

    .line 483
    .line 484
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    int-to-char v4, v3

    .line 489
    if-eq v4, v9, :cond_e

    .line 490
    .line 491
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 492
    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_e
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    goto :goto_9

    .line 500
    :cond_f
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Lo5/b1;

    .line 504
    .line 505
    invoke-direct {v0, v10}, Lo5/b1;-><init>(Z)V

    .line 506
    .line 507
    .line 508
    return-object v0

    .line 509
    :pswitch_1b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    :try_start_0
    invoke-static {}, Lo5/c;->values()[Lo5/c;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    array-length v3, v2

    .line 518
    :goto_a
    if-ge v10, v3, :cond_11

    .line 519
    .line 520
    aget-object v4, v2, v10

    .line 521
    .line 522
    iget-object v5, v4, Lo5/c;->a:Ljava/lang/String;

    .line 523
    .line 524
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-eqz v5, :cond_10

    .line 529
    .line 530
    return-object v4

    .line 531
    :cond_10
    add-int/lit8 v10, v10, 0x1

    .line 532
    .line 533
    goto :goto_a

    .line 534
    :catch_0
    move-exception v0

    .line 535
    goto :goto_b

    .line 536
    :cond_11
    new-instance v2, Lo5/b;

    .line 537
    .line 538
    invoke-direct {v2, v0}, Lo5/b;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v2
    :try_end_0
    .catch Lo5/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 542
    :goto_b
    new-instance v2, Ljava/lang/RuntimeException;

    .line 543
    .line 544
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 545
    .line 546
    .line 547
    throw v2

    .line 548
    :pswitch_1c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    :try_start_1
    invoke-static {v0}, Lcom/google/android/gms/fido/common/Transport;->d(Ljava/lang/String;)Lcom/google/android/gms/fido/common/Transport;

    .line 553
    .line 554
    .line 555
    move-result-object v0
    :try_end_1
    .catch Ln5/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 556
    return-object v0

    .line 557
    :catch_1
    move-exception v0

    .line 558
    move-object v2, v0

    .line 559
    new-instance v0, Ljava/lang/RuntimeException;

    .line 560
    .line 561
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 562
    .line 563
    .line 564
    throw v0

    .line 565
    :pswitch_1d
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    const-wide/16 v3, -0x1

    .line 570
    .line 571
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 572
    .line 573
    .line 574
    move-result v5

    .line 575
    if-ge v5, v2, :cond_15

    .line 576
    .line 577
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    int-to-char v6, v5

    .line 582
    if-eq v6, v9, :cond_14

    .line 583
    .line 584
    if-eq v6, v8, :cond_13

    .line 585
    .line 586
    if-eq v6, v7, :cond_12

    .line 587
    .line 588
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 589
    .line 590
    .line 591
    goto :goto_c

    .line 592
    :cond_12
    invoke-static {v5, v0}, Lq6/g;->S(ILandroid/os/Parcel;)J

    .line 593
    .line 594
    .line 595
    move-result-wide v3

    .line 596
    goto :goto_c

    .line 597
    :cond_13
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 598
    .line 599
    .line 600
    move-result v10

    .line 601
    goto :goto_c

    .line 602
    :cond_14
    invoke-static {v5, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    goto :goto_c

    .line 607
    :cond_15
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 608
    .line 609
    .line 610
    new-instance v0, Lb5/c;

    .line 611
    .line 612
    invoke-direct {v0, v11, v3, v4, v10}, Lb5/c;-><init>(Ljava/lang/String;JI)V

    .line 613
    .line 614
    .line 615
    return-object v0

    .line 616
    :pswitch_1e
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    move v3, v10

    .line 621
    move-object v4, v11

    .line 622
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    if-ge v5, v2, :cond_1a

    .line 627
    .line 628
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 629
    .line 630
    .line 631
    move-result v5

    .line 632
    int-to-char v12, v5

    .line 633
    if-eq v12, v9, :cond_19

    .line 634
    .line 635
    if-eq v12, v8, :cond_18

    .line 636
    .line 637
    if-eq v12, v7, :cond_17

    .line 638
    .line 639
    if-eq v12, v6, :cond_16

    .line 640
    .line 641
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 642
    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_16
    invoke-static {v5, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    goto :goto_d

    .line 650
    :cond_17
    sget-object v11, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 651
    .line 652
    invoke-static {v0, v5, v11}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    move-object v11, v5

    .line 657
    check-cast v11, Landroid/app/PendingIntent;

    .line 658
    .line 659
    goto :goto_d

    .line 660
    :cond_18
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    goto :goto_d

    .line 665
    :cond_19
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 666
    .line 667
    .line 668
    move-result v10

    .line 669
    goto :goto_d

    .line 670
    :cond_1a
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 671
    .line 672
    .line 673
    new-instance v0, Lb5/a;

    .line 674
    .line 675
    invoke-direct {v0, v10, v3, v11, v4}, Lb5/a;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    return-object v0

    .line 679
    :pswitch_1f
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    move-object v3, v11

    .line 684
    move-object v4, v3

    .line 685
    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 686
    .line 687
    .line 688
    move-result v5

    .line 689
    if-ge v5, v2, :cond_1f

    .line 690
    .line 691
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    int-to-char v6, v5

    .line 696
    if-eq v6, v9, :cond_1e

    .line 697
    .line 698
    if-eq v6, v8, :cond_1c

    .line 699
    .line 700
    if-eq v6, v7, :cond_1b

    .line 701
    .line 702
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 703
    .line 704
    .line 705
    goto :goto_e

    .line 706
    :cond_1b
    sget-object v4, Lg5/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 707
    .line 708
    invoke-static {v0, v5, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    check-cast v4, Lg5/i;

    .line 713
    .line 714
    goto :goto_e

    .line 715
    :cond_1c
    invoke-static {v5, v0}, Lq6/g;->U(ILandroid/os/Parcel;)I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 720
    .line 721
    .line 722
    move-result v5

    .line 723
    if-nez v3, :cond_1d

    .line 724
    .line 725
    move-object v3, v11

    .line 726
    goto :goto_e

    .line 727
    :cond_1d
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 728
    .line 729
    .line 730
    move-result-object v6

    .line 731
    invoke-virtual {v6, v0, v5, v3}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 732
    .line 733
    .line 734
    add-int/2addr v5, v3

    .line 735
    invoke-virtual {v0, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 736
    .line 737
    .line 738
    move-object v3, v6

    .line 739
    goto :goto_e

    .line 740
    :cond_1e
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 741
    .line 742
    .line 743
    move-result v10

    .line 744
    goto :goto_e

    .line 745
    :cond_1f
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 746
    .line 747
    .line 748
    new-instance v0, Lg5/e;

    .line 749
    .line 750
    invoke-direct {v0, v10, v3, v4}, Lg5/e;-><init>(ILandroid/os/Parcel;Lg5/i;)V

    .line 751
    .line 752
    .line 753
    return-object v0

    .line 754
    :pswitch_20
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 755
    .line 756
    .line 757
    move-result v2

    .line 758
    move-object v3, v11

    .line 759
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    if-ge v4, v2, :cond_23

    .line 764
    .line 765
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 766
    .line 767
    .line 768
    move-result v4

    .line 769
    int-to-char v5, v4

    .line 770
    if-eq v5, v9, :cond_22

    .line 771
    .line 772
    if-eq v5, v8, :cond_21

    .line 773
    .line 774
    if-eq v5, v7, :cond_20

    .line 775
    .line 776
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 777
    .line 778
    .line 779
    goto :goto_f

    .line 780
    :cond_20
    sget-object v3, Lg5/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 781
    .line 782
    invoke-static {v0, v4, v3}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    goto :goto_f

    .line 787
    :cond_21
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v11

    .line 791
    goto :goto_f

    .line 792
    :cond_22
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 793
    .line 794
    .line 795
    move-result v10

    .line 796
    goto :goto_f

    .line 797
    :cond_23
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 798
    .line 799
    .line 800
    new-instance v0, Lg5/g;

    .line 801
    .line 802
    invoke-direct {v0, v10, v11, v3}, Lg5/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 803
    .line 804
    .line 805
    return-object v0

    .line 806
    :pswitch_21
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    move-object v3, v11

    .line 811
    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 812
    .line 813
    .line 814
    move-result v4

    .line 815
    if-ge v4, v2, :cond_27

    .line 816
    .line 817
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 818
    .line 819
    .line 820
    move-result v4

    .line 821
    int-to-char v5, v4

    .line 822
    if-eq v5, v9, :cond_26

    .line 823
    .line 824
    if-eq v5, v8, :cond_25

    .line 825
    .line 826
    if-eq v5, v7, :cond_24

    .line 827
    .line 828
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 829
    .line 830
    .line 831
    goto :goto_10

    .line 832
    :cond_24
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v11

    .line 836
    goto :goto_10

    .line 837
    :cond_25
    sget-object v3, Lg5/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 838
    .line 839
    invoke-static {v0, v4, v3}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    goto :goto_10

    .line 844
    :cond_26
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 845
    .line 846
    .line 847
    move-result v10

    .line 848
    goto :goto_10

    .line 849
    :cond_27
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 850
    .line 851
    .line 852
    new-instance v0, Lg5/i;

    .line 853
    .line 854
    invoke-direct {v0, v10, v11, v3}, Lg5/i;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 855
    .line 856
    .line 857
    return-object v0

    .line 858
    :pswitch_22
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 859
    .line 860
    .line 861
    move-result v2

    .line 862
    move-object v3, v11

    .line 863
    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 864
    .line 865
    .line 866
    move-result v4

    .line 867
    if-ge v4, v2, :cond_2b

    .line 868
    .line 869
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 870
    .line 871
    .line 872
    move-result v4

    .line 873
    int-to-char v5, v4

    .line 874
    if-eq v5, v9, :cond_2a

    .line 875
    .line 876
    if-eq v5, v8, :cond_29

    .line 877
    .line 878
    if-eq v5, v7, :cond_28

    .line 879
    .line 880
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 881
    .line 882
    .line 883
    goto :goto_11

    .line 884
    :cond_28
    sget-object v5, Lg5/a;->CREATOR:Lg5/f;

    .line 885
    .line 886
    invoke-static {v0, v4, v5}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    move-object v11, v4

    .line 891
    check-cast v11, Lg5/a;

    .line 892
    .line 893
    goto :goto_11

    .line 894
    :cond_29
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 895
    .line 896
    .line 897
    move-result-object v3

    .line 898
    goto :goto_11

    .line 899
    :cond_2a
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 900
    .line 901
    .line 902
    move-result v10

    .line 903
    goto :goto_11

    .line 904
    :cond_2b
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 905
    .line 906
    .line 907
    new-instance v0, Lg5/h;

    .line 908
    .line 909
    invoke-direct {v0, v11, v3, v10}, Lg5/h;-><init>(Lg5/a;Ljava/lang/String;I)V

    .line 910
    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_23
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    move v3, v10

    .line 918
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 919
    .line 920
    .line 921
    move-result v4

    .line 922
    if-ge v4, v2, :cond_2f

    .line 923
    .line 924
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    int-to-char v5, v4

    .line 929
    if-eq v5, v9, :cond_2e

    .line 930
    .line 931
    if-eq v5, v8, :cond_2d

    .line 932
    .line 933
    if-eq v5, v7, :cond_2c

    .line 934
    .line 935
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 936
    .line 937
    .line 938
    goto :goto_12

    .line 939
    :cond_2c
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 940
    .line 941
    .line 942
    move-result v3

    .line 943
    goto :goto_12

    .line 944
    :cond_2d
    invoke-static {v4, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v11

    .line 948
    goto :goto_12

    .line 949
    :cond_2e
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 950
    .line 951
    .line 952
    move-result v10

    .line 953
    goto :goto_12

    .line 954
    :cond_2f
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 955
    .line 956
    .line 957
    new-instance v0, Lf5/c;

    .line 958
    .line 959
    invoke-direct {v0, v10, v11, v3}, Lf5/c;-><init>(ILjava/lang/String;I)V

    .line 960
    .line 961
    .line 962
    return-object v0

    .line 963
    :pswitch_24
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 964
    .line 965
    .line 966
    move-result v2

    .line 967
    :goto_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 968
    .line 969
    .line 970
    move-result v3

    .line 971
    if-ge v3, v2, :cond_32

    .line 972
    .line 973
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    int-to-char v4, v3

    .line 978
    if-eq v4, v9, :cond_31

    .line 979
    .line 980
    if-eq v4, v8, :cond_30

    .line 981
    .line 982
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 983
    .line 984
    .line 985
    goto :goto_13

    .line 986
    :cond_30
    sget-object v4, Lf5/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 987
    .line 988
    invoke-static {v0, v3, v4}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 989
    .line 990
    .line 991
    move-result-object v11

    .line 992
    goto :goto_13

    .line 993
    :cond_31
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 994
    .line 995
    .line 996
    move-result v10

    .line 997
    goto :goto_13

    .line 998
    :cond_32
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 999
    .line 1000
    .line 1001
    new-instance v0, Lf5/a;

    .line 1002
    .line 1003
    invoke-direct {v0, v10, v11}, Lf5/a;-><init>(ILjava/util/ArrayList;)V

    .line 1004
    .line 1005
    .line 1006
    return-object v0

    .line 1007
    :pswitch_25
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1008
    .line 1009
    .line 1010
    move-result v2

    .line 1011
    :goto_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1012
    .line 1013
    .line 1014
    move-result v3

    .line 1015
    if-ge v3, v2, :cond_35

    .line 1016
    .line 1017
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1018
    .line 1019
    .line 1020
    move-result v3

    .line 1021
    int-to-char v4, v3

    .line 1022
    if-eq v4, v9, :cond_34

    .line 1023
    .line 1024
    if-eq v4, v8, :cond_33

    .line 1025
    .line 1026
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1027
    .line 1028
    .line 1029
    goto :goto_14

    .line 1030
    :cond_33
    sget-object v4, Lf5/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1031
    .line 1032
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v3

    .line 1036
    move-object v11, v3

    .line 1037
    check-cast v11, Lf5/a;

    .line 1038
    .line 1039
    goto :goto_14

    .line 1040
    :cond_34
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1041
    .line 1042
    .line 1043
    move-result v10

    .line 1044
    goto :goto_14

    .line 1045
    :cond_35
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1046
    .line 1047
    .line 1048
    new-instance v0, Lf5/b;

    .line 1049
    .line 1050
    invoke-direct {v0, v10, v11}, Lf5/b;-><init>(ILf5/a;)V

    .line 1051
    .line 1052
    .line 1053
    return-object v0

    .line 1054
    :pswitch_26
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    sget-object v3, Lcom/google/android/gms/common/internal/j;->F:[Lcom/google/android/gms/common/api/Scope;

    .line 1059
    .line 1060
    new-instance v4, Landroid/os/Bundle;

    .line 1061
    .line 1062
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 1063
    .line 1064
    .line 1065
    sget-object v5, Lcom/google/android/gms/common/internal/j;->G:[Lb5/c;

    .line 1066
    .line 1067
    move-object/from16 v18, v3

    .line 1068
    .line 1069
    move-object/from16 v19, v4

    .line 1070
    .line 1071
    move-object/from16 v21, v5

    .line 1072
    .line 1073
    move-object/from16 v22, v21

    .line 1074
    .line 1075
    move v13, v10

    .line 1076
    move v14, v13

    .line 1077
    move v15, v14

    .line 1078
    move/from16 v23, v15

    .line 1079
    .line 1080
    move/from16 v24, v23

    .line 1081
    .line 1082
    move/from16 v25, v24

    .line 1083
    .line 1084
    move-object/from16 v16, v11

    .line 1085
    .line 1086
    move-object/from16 v17, v16

    .line 1087
    .line 1088
    move-object/from16 v20, v17

    .line 1089
    .line 1090
    move-object/from16 v26, v20

    .line 1091
    .line 1092
    :goto_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1093
    .line 1094
    .line 1095
    move-result v3

    .line 1096
    if-ge v3, v2, :cond_37

    .line 1097
    .line 1098
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1099
    .line 1100
    .line 1101
    move-result v3

    .line 1102
    int-to-char v4, v3

    .line 1103
    packed-switch v4, :pswitch_data_3

    .line 1104
    .line 1105
    .line 1106
    :pswitch_27
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_15

    .line 1110
    :pswitch_28
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v26

    .line 1114
    goto :goto_15

    .line 1115
    :pswitch_29
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v25

    .line 1119
    goto :goto_15

    .line 1120
    :pswitch_2a
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1121
    .line 1122
    .line 1123
    move-result v24

    .line 1124
    goto :goto_15

    .line 1125
    :pswitch_2b
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v23

    .line 1129
    goto :goto_15

    .line 1130
    :pswitch_2c
    sget-object v4, Lb5/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1131
    .line 1132
    invoke-static {v0, v3, v4}, Lq6/g;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v3

    .line 1136
    move-object/from16 v22, v3

    .line 1137
    .line 1138
    check-cast v22, [Lb5/c;

    .line 1139
    .line 1140
    goto :goto_15

    .line 1141
    :pswitch_2d
    sget-object v4, Lb5/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1142
    .line 1143
    invoke-static {v0, v3, v4}, Lq6/g;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v3

    .line 1147
    move-object/from16 v21, v3

    .line 1148
    .line 1149
    check-cast v21, [Lb5/c;

    .line 1150
    .line 1151
    goto :goto_15

    .line 1152
    :pswitch_2e
    sget-object v4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1153
    .line 1154
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v3

    .line 1158
    move-object/from16 v20, v3

    .line 1159
    .line 1160
    check-cast v20, Landroid/accounts/Account;

    .line 1161
    .line 1162
    goto :goto_15

    .line 1163
    :pswitch_2f
    invoke-static {v3, v0}, Lq6/g;->l(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v19

    .line 1167
    goto :goto_15

    .line 1168
    :pswitch_30
    sget-object v4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1169
    .line 1170
    invoke-static {v0, v3, v4}, Lq6/g;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v3

    .line 1174
    move-object/from16 v18, v3

    .line 1175
    .line 1176
    check-cast v18, [Lcom/google/android/gms/common/api/Scope;

    .line 1177
    .line 1178
    goto :goto_15

    .line 1179
    :pswitch_31
    invoke-static {v3, v0}, Lq6/g;->U(ILandroid/os/Parcel;)I

    .line 1180
    .line 1181
    .line 1182
    move-result v3

    .line 1183
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1184
    .line 1185
    .line 1186
    move-result v4

    .line 1187
    if-nez v3, :cond_36

    .line 1188
    .line 1189
    move-object/from16 v17, v11

    .line 1190
    .line 1191
    goto :goto_15

    .line 1192
    :cond_36
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v5

    .line 1196
    add-int/2addr v4, v3

    .line 1197
    invoke-virtual {v0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v17, v5

    .line 1201
    .line 1202
    goto :goto_15

    .line 1203
    :pswitch_32
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v16

    .line 1207
    goto :goto_15

    .line 1208
    :pswitch_33
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1209
    .line 1210
    .line 1211
    move-result v15

    .line 1212
    goto :goto_15

    .line 1213
    :pswitch_34
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1214
    .line 1215
    .line 1216
    move-result v14

    .line 1217
    goto :goto_15

    .line 1218
    :pswitch_35
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1219
    .line 1220
    .line 1221
    move-result v13

    .line 1222
    goto/16 :goto_15

    .line 1223
    .line 1224
    :cond_37
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1225
    .line 1226
    .line 1227
    new-instance v0, Lcom/google/android/gms/common/internal/j;

    .line 1228
    .line 1229
    move-object v12, v0

    .line 1230
    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/common/internal/j;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lb5/c;[Lb5/c;ZIZLjava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    return-object v0

    .line 1234
    :pswitch_36
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1235
    .line 1236
    .line 1237
    move-result v2

    .line 1238
    move v5, v10

    .line 1239
    move v6, v5

    .line 1240
    move v8, v6

    .line 1241
    move-object v4, v11

    .line 1242
    move-object v7, v4

    .line 1243
    move-object v9, v7

    .line 1244
    :goto_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1245
    .line 1246
    .line 1247
    move-result v3

    .line 1248
    if-ge v3, v2, :cond_38

    .line 1249
    .line 1250
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    int-to-char v10, v3

    .line 1255
    packed-switch v10, :pswitch_data_4

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_16

    .line 1262
    :pswitch_37
    invoke-static {v3, v0}, Lq6/g;->n(ILandroid/os/Parcel;)[I

    .line 1263
    .line 1264
    .line 1265
    move-result-object v9

    .line 1266
    goto :goto_16

    .line 1267
    :pswitch_38
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1268
    .line 1269
    .line 1270
    move-result v8

    .line 1271
    goto :goto_16

    .line 1272
    :pswitch_39
    invoke-static {v3, v0}, Lq6/g;->n(ILandroid/os/Parcel;)[I

    .line 1273
    .line 1274
    .line 1275
    move-result-object v7

    .line 1276
    goto :goto_16

    .line 1277
    :pswitch_3a
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v6

    .line 1281
    goto :goto_16

    .line 1282
    :pswitch_3b
    invoke-static {v3, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v5

    .line 1286
    goto :goto_16

    .line 1287
    :pswitch_3c
    sget-object v4, Lcom/google/android/gms/common/internal/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1288
    .line 1289
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    move-object v4, v3

    .line 1294
    check-cast v4, Lcom/google/android/gms/common/internal/t;

    .line 1295
    .line 1296
    goto :goto_16

    .line 1297
    :cond_38
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1298
    .line 1299
    .line 1300
    new-instance v0, Lcom/google/android/gms/common/internal/i;

    .line 1301
    .line 1302
    move-object v3, v0

    .line 1303
    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/common/internal/i;-><init>(Lcom/google/android/gms/common/internal/t;ZZ[II[I)V

    .line 1304
    .line 1305
    .line 1306
    return-object v0

    .line 1307
    :pswitch_3d
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1308
    .line 1309
    .line 1310
    move-result v2

    .line 1311
    move-object v3, v11

    .line 1312
    move-object v4, v3

    .line 1313
    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1314
    .line 1315
    .line 1316
    move-result v5

    .line 1317
    if-ge v5, v2, :cond_3d

    .line 1318
    .line 1319
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1320
    .line 1321
    .line 1322
    move-result v5

    .line 1323
    int-to-char v12, v5

    .line 1324
    if-eq v12, v9, :cond_3c

    .line 1325
    .line 1326
    if-eq v12, v8, :cond_3b

    .line 1327
    .line 1328
    if-eq v12, v7, :cond_3a

    .line 1329
    .line 1330
    if-eq v12, v6, :cond_39

    .line 1331
    .line 1332
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_17

    .line 1336
    :cond_39
    sget-object v4, Lcom/google/android/gms/common/internal/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1337
    .line 1338
    invoke-static {v0, v5, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v4

    .line 1342
    check-cast v4, Lcom/google/android/gms/common/internal/i;

    .line 1343
    .line 1344
    goto :goto_17

    .line 1345
    :cond_3a
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1346
    .line 1347
    .line 1348
    move-result v10

    .line 1349
    goto :goto_17

    .line 1350
    :cond_3b
    sget-object v3, Lb5/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1351
    .line 1352
    invoke-static {v0, v5, v3}, Lq6/g;->s(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    check-cast v3, [Lb5/c;

    .line 1357
    .line 1358
    goto :goto_17

    .line 1359
    :cond_3c
    invoke-static {v5, v0}, Lq6/g;->l(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v11

    .line 1363
    goto :goto_17

    .line 1364
    :cond_3d
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1365
    .line 1366
    .line 1367
    new-instance v0, Lcom/google/android/gms/common/internal/m0;

    .line 1368
    .line 1369
    invoke-direct {v0, v11, v3, v10, v4}, Lcom/google/android/gms/common/internal/m0;-><init>(Landroid/os/Bundle;[Lb5/c;ILcom/google/android/gms/common/internal/i;)V

    .line 1370
    .line 1371
    .line 1372
    return-object v0

    .line 1373
    :pswitch_3e
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1374
    .line 1375
    .line 1376
    move-result v2

    .line 1377
    move v12, v10

    .line 1378
    move v13, v12

    .line 1379
    move v14, v13

    .line 1380
    move v15, v14

    .line 1381
    move/from16 v16, v15

    .line 1382
    .line 1383
    :goto_18
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1384
    .line 1385
    .line 1386
    move-result v4

    .line 1387
    if-ge v4, v2, :cond_43

    .line 1388
    .line 1389
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1390
    .line 1391
    .line 1392
    move-result v4

    .line 1393
    int-to-char v5, v4

    .line 1394
    if-eq v5, v9, :cond_42

    .line 1395
    .line 1396
    if-eq v5, v8, :cond_41

    .line 1397
    .line 1398
    if-eq v5, v7, :cond_40

    .line 1399
    .line 1400
    if-eq v5, v6, :cond_3f

    .line 1401
    .line 1402
    if-eq v5, v3, :cond_3e

    .line 1403
    .line 1404
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1405
    .line 1406
    .line 1407
    goto :goto_18

    .line 1408
    :cond_3e
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1409
    .line 1410
    .line 1411
    move-result v16

    .line 1412
    goto :goto_18

    .line 1413
    :cond_3f
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1414
    .line 1415
    .line 1416
    move-result v15

    .line 1417
    goto :goto_18

    .line 1418
    :cond_40
    invoke-static {v4, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v14

    .line 1422
    goto :goto_18

    .line 1423
    :cond_41
    invoke-static {v4, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v13

    .line 1427
    goto :goto_18

    .line 1428
    :cond_42
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1429
    .line 1430
    .line 1431
    move-result v12

    .line 1432
    goto :goto_18

    .line 1433
    :cond_43
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1434
    .line 1435
    .line 1436
    new-instance v0, Lcom/google/android/gms/common/internal/t;

    .line 1437
    .line 1438
    move-object v11, v0

    .line 1439
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/t;-><init>(IZZII)V

    .line 1440
    .line 1441
    .line 1442
    return-object v0

    .line 1443
    :pswitch_3f
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    move v13, v10

    .line 1448
    move/from16 v16, v13

    .line 1449
    .line 1450
    move/from16 v17, v16

    .line 1451
    .line 1452
    move-object v14, v11

    .line 1453
    move-object v15, v14

    .line 1454
    :goto_19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1455
    .line 1456
    .line 1457
    move-result v4

    .line 1458
    if-ge v4, v2, :cond_4a

    .line 1459
    .line 1460
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1461
    .line 1462
    .line 1463
    move-result v4

    .line 1464
    int-to-char v5, v4

    .line 1465
    if-eq v5, v9, :cond_49

    .line 1466
    .line 1467
    if-eq v5, v8, :cond_47

    .line 1468
    .line 1469
    if-eq v5, v7, :cond_46

    .line 1470
    .line 1471
    if-eq v5, v6, :cond_45

    .line 1472
    .line 1473
    if-eq v5, v3, :cond_44

    .line 1474
    .line 1475
    invoke-static {v4, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1476
    .line 1477
    .line 1478
    goto :goto_19

    .line 1479
    :cond_44
    invoke-static {v4, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v17

    .line 1483
    goto :goto_19

    .line 1484
    :cond_45
    invoke-static {v4, v0}, Lq6/g;->N(ILandroid/os/Parcel;)Z

    .line 1485
    .line 1486
    .line 1487
    move-result v16

    .line 1488
    goto :goto_19

    .line 1489
    :cond_46
    sget-object v5, Lb5/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1490
    .line 1491
    invoke-static {v0, v4, v5}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v4

    .line 1495
    move-object v15, v4

    .line 1496
    check-cast v15, Lb5/a;

    .line 1497
    .line 1498
    goto :goto_19

    .line 1499
    :cond_47
    invoke-static {v4, v0}, Lq6/g;->U(ILandroid/os/Parcel;)I

    .line 1500
    .line 1501
    .line 1502
    move-result v4

    .line 1503
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1504
    .line 1505
    .line 1506
    move-result v5

    .line 1507
    if-nez v4, :cond_48

    .line 1508
    .line 1509
    move-object v14, v11

    .line 1510
    goto :goto_19

    .line 1511
    :cond_48
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v10

    .line 1515
    add-int/2addr v5, v4

    .line 1516
    invoke-virtual {v0, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1517
    .line 1518
    .line 1519
    move-object v14, v10

    .line 1520
    goto :goto_19

    .line 1521
    :cond_49
    invoke-static {v4, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1522
    .line 1523
    .line 1524
    move-result v13

    .line 1525
    goto :goto_19

    .line 1526
    :cond_4a
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1527
    .line 1528
    .line 1529
    new-instance v0, Lcom/google/android/gms/common/internal/c0;

    .line 1530
    .line 1531
    move-object v12, v0

    .line 1532
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/internal/c0;-><init>(ILandroid/os/IBinder;Lb5/a;ZZ)V

    .line 1533
    .line 1534
    .line 1535
    return-object v0

    .line 1536
    :pswitch_40
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1537
    .line 1538
    .line 1539
    move-result v2

    .line 1540
    move v3, v10

    .line 1541
    move-object v4, v11

    .line 1542
    :goto_1a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1543
    .line 1544
    .line 1545
    move-result v5

    .line 1546
    if-ge v5, v2, :cond_4f

    .line 1547
    .line 1548
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1549
    .line 1550
    .line 1551
    move-result v5

    .line 1552
    int-to-char v12, v5

    .line 1553
    if-eq v12, v9, :cond_4e

    .line 1554
    .line 1555
    if-eq v12, v8, :cond_4d

    .line 1556
    .line 1557
    if-eq v12, v7, :cond_4c

    .line 1558
    .line 1559
    if-eq v12, v6, :cond_4b

    .line 1560
    .line 1561
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1562
    .line 1563
    .line 1564
    goto :goto_1a

    .line 1565
    :cond_4b
    sget-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1566
    .line 1567
    invoke-static {v0, v5, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v4

    .line 1571
    check-cast v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1572
    .line 1573
    goto :goto_1a

    .line 1574
    :cond_4c
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1575
    .line 1576
    .line 1577
    move-result v3

    .line 1578
    goto :goto_1a

    .line 1579
    :cond_4d
    sget-object v11, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1580
    .line 1581
    invoke-static {v0, v5, v11}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v5

    .line 1585
    move-object v11, v5

    .line 1586
    check-cast v11, Landroid/accounts/Account;

    .line 1587
    .line 1588
    goto :goto_1a

    .line 1589
    :cond_4e
    invoke-static {v5, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1590
    .line 1591
    .line 1592
    move-result v10

    .line 1593
    goto :goto_1a

    .line 1594
    :cond_4f
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1595
    .line 1596
    .line 1597
    new-instance v0, Lcom/google/android/gms/common/internal/b0;

    .line 1598
    .line 1599
    invoke-direct {v0, v10, v11, v3, v4}, Lcom/google/android/gms/common/internal/b0;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 1600
    .line 1601
    .line 1602
    return-object v0

    .line 1603
    :pswitch_41
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1604
    .line 1605
    .line 1606
    move-result v2

    .line 1607
    const/4 v3, -0x1

    .line 1608
    move/from16 v23, v3

    .line 1609
    .line 1610
    move-wide/from16 v16, v4

    .line 1611
    .line 1612
    move-wide/from16 v18, v16

    .line 1613
    .line 1614
    move v13, v10

    .line 1615
    move v14, v13

    .line 1616
    move v15, v14

    .line 1617
    move/from16 v22, v15

    .line 1618
    .line 1619
    move-object/from16 v20, v11

    .line 1620
    .line 1621
    move-object/from16 v21, v20

    .line 1622
    .line 1623
    :goto_1b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    if-ge v3, v2, :cond_50

    .line 1628
    .line 1629
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1630
    .line 1631
    .line 1632
    move-result v3

    .line 1633
    int-to-char v4, v3

    .line 1634
    packed-switch v4, :pswitch_data_5

    .line 1635
    .line 1636
    .line 1637
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1638
    .line 1639
    .line 1640
    goto :goto_1b

    .line 1641
    :pswitch_42
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1642
    .line 1643
    .line 1644
    move-result v23

    .line 1645
    goto :goto_1b

    .line 1646
    :pswitch_43
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1647
    .line 1648
    .line 1649
    move-result v22

    .line 1650
    goto :goto_1b

    .line 1651
    :pswitch_44
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v21

    .line 1655
    goto :goto_1b

    .line 1656
    :pswitch_45
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v20

    .line 1660
    goto :goto_1b

    .line 1661
    :pswitch_46
    invoke-static {v3, v0}, Lq6/g;->S(ILandroid/os/Parcel;)J

    .line 1662
    .line 1663
    .line 1664
    move-result-wide v18

    .line 1665
    goto :goto_1b

    .line 1666
    :pswitch_47
    invoke-static {v3, v0}, Lq6/g;->S(ILandroid/os/Parcel;)J

    .line 1667
    .line 1668
    .line 1669
    move-result-wide v16

    .line 1670
    goto :goto_1b

    .line 1671
    :pswitch_48
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1672
    .line 1673
    .line 1674
    move-result v15

    .line 1675
    goto :goto_1b

    .line 1676
    :pswitch_49
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1677
    .line 1678
    .line 1679
    move-result v14

    .line 1680
    goto :goto_1b

    .line 1681
    :pswitch_4a
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1682
    .line 1683
    .line 1684
    move-result v13

    .line 1685
    goto :goto_1b

    .line 1686
    :cond_50
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v0, Lcom/google/android/gms/common/internal/q;

    .line 1690
    .line 1691
    move-object v12, v0

    .line 1692
    invoke-direct/range {v12 .. v23}, Lcom/google/android/gms/common/internal/q;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 1693
    .line 1694
    .line 1695
    return-object v0

    .line 1696
    :pswitch_4b
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1697
    .line 1698
    .line 1699
    move-result v2

    .line 1700
    :goto_1c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1701
    .line 1702
    .line 1703
    move-result v3

    .line 1704
    if-ge v3, v2, :cond_53

    .line 1705
    .line 1706
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1707
    .line 1708
    .line 1709
    move-result v3

    .line 1710
    int-to-char v4, v3

    .line 1711
    if-eq v4, v9, :cond_52

    .line 1712
    .line 1713
    if-eq v4, v8, :cond_51

    .line 1714
    .line 1715
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1716
    .line 1717
    .line 1718
    goto :goto_1c

    .line 1719
    :cond_51
    sget-object v4, Lcom/google/android/gms/common/internal/q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1720
    .line 1721
    invoke-static {v0, v3, v4}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v11

    .line 1725
    goto :goto_1c

    .line 1726
    :cond_52
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1727
    .line 1728
    .line 1729
    move-result v10

    .line 1730
    goto :goto_1c

    .line 1731
    :cond_53
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1732
    .line 1733
    .line 1734
    new-instance v0, Lcom/google/android/gms/common/internal/u;

    .line 1735
    .line 1736
    invoke-direct {v0, v10, v11}, Lcom/google/android/gms/common/internal/u;-><init>(ILjava/util/List;)V

    .line 1737
    .line 1738
    .line 1739
    return-object v0

    .line 1740
    :pswitch_4c
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1741
    .line 1742
    .line 1743
    move-result v2

    .line 1744
    move v13, v10

    .line 1745
    move v14, v13

    .line 1746
    move-object v15, v11

    .line 1747
    move-object/from16 v16, v15

    .line 1748
    .line 1749
    move-object/from16 v17, v16

    .line 1750
    .line 1751
    :goto_1d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1752
    .line 1753
    .line 1754
    move-result v3

    .line 1755
    if-ge v3, v2, :cond_59

    .line 1756
    .line 1757
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1758
    .line 1759
    .line 1760
    move-result v3

    .line 1761
    int-to-char v4, v3

    .line 1762
    if-eq v4, v9, :cond_58

    .line 1763
    .line 1764
    if-eq v4, v8, :cond_57

    .line 1765
    .line 1766
    if-eq v4, v7, :cond_56

    .line 1767
    .line 1768
    if-eq v4, v6, :cond_55

    .line 1769
    .line 1770
    const/16 v5, 0x3e8

    .line 1771
    .line 1772
    if-eq v4, v5, :cond_54

    .line 1773
    .line 1774
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1775
    .line 1776
    .line 1777
    goto :goto_1d

    .line 1778
    :cond_54
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1779
    .line 1780
    .line 1781
    move-result v13

    .line 1782
    goto :goto_1d

    .line 1783
    :cond_55
    sget-object v4, Lb5/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1784
    .line 1785
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1786
    .line 1787
    .line 1788
    move-result-object v3

    .line 1789
    move-object/from16 v17, v3

    .line 1790
    .line 1791
    check-cast v17, Lb5/a;

    .line 1792
    .line 1793
    goto :goto_1d

    .line 1794
    :cond_56
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1795
    .line 1796
    invoke-static {v0, v3, v4}, Lq6/g;->o(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v3

    .line 1800
    move-object/from16 v16, v3

    .line 1801
    .line 1802
    check-cast v16, Landroid/app/PendingIntent;

    .line 1803
    .line 1804
    goto :goto_1d

    .line 1805
    :cond_57
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v15

    .line 1809
    goto :goto_1d

    .line 1810
    :cond_58
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1811
    .line 1812
    .line 1813
    move-result v14

    .line 1814
    goto :goto_1d

    .line 1815
    :cond_59
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1816
    .line 1817
    .line 1818
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 1819
    .line 1820
    move-object v12, v0

    .line 1821
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/api/Status;-><init>(IILjava/lang/String;Landroid/app/PendingIntent;Lb5/a;)V

    .line 1822
    .line 1823
    .line 1824
    return-object v0

    .line 1825
    :pswitch_4d
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1826
    .line 1827
    .line 1828
    move-result v2

    .line 1829
    :goto_1e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1830
    .line 1831
    .line 1832
    move-result v3

    .line 1833
    if-ge v3, v2, :cond_5c

    .line 1834
    .line 1835
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1836
    .line 1837
    .line 1838
    move-result v3

    .line 1839
    int-to-char v4, v3

    .line 1840
    if-eq v4, v9, :cond_5b

    .line 1841
    .line 1842
    if-eq v4, v8, :cond_5a

    .line 1843
    .line 1844
    invoke-static {v3, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1845
    .line 1846
    .line 1847
    goto :goto_1e

    .line 1848
    :cond_5a
    invoke-static {v3, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1849
    .line 1850
    .line 1851
    move-result-object v11

    .line 1852
    goto :goto_1e

    .line 1853
    :cond_5b
    invoke-static {v3, v0}, Lq6/g;->Q(ILandroid/os/Parcel;)I

    .line 1854
    .line 1855
    .line 1856
    move-result v10

    .line 1857
    goto :goto_1e

    .line 1858
    :cond_5c
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1859
    .line 1860
    .line 1861
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 1862
    .line 1863
    invoke-direct {v0, v10, v11}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    return-object v0

    .line 1867
    :goto_1f
    invoke-static/range {p1 .. p1}, Lq6/g;->q0(Landroid/os/Parcel;)I

    .line 1868
    .line 1869
    .line 1870
    move-result v2

    .line 1871
    move-object v3, v11

    .line 1872
    move-object v4, v3

    .line 1873
    :goto_20
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1874
    .line 1875
    .line 1876
    move-result v5

    .line 1877
    if-ge v5, v2, :cond_60

    .line 1878
    .line 1879
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    .line 1880
    .line 1881
    .line 1882
    move-result v5

    .line 1883
    int-to-char v9, v5

    .line 1884
    if-eq v9, v8, :cond_5f

    .line 1885
    .line 1886
    if-eq v9, v7, :cond_5e

    .line 1887
    .line 1888
    if-eq v9, v6, :cond_5d

    .line 1889
    .line 1890
    invoke-static {v5, v0}, Lq6/g;->l0(ILandroid/os/Parcel;)V

    .line 1891
    .line 1892
    .line 1893
    goto :goto_20

    .line 1894
    :cond_5d
    sget-object v4, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1895
    .line 1896
    invoke-static {v0, v5, v4}, Lq6/g;->t(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v4

    .line 1900
    goto :goto_20

    .line 1901
    :cond_5e
    invoke-static {v5, v0}, Lq6/g;->m(ILandroid/os/Parcel;)[B

    .line 1902
    .line 1903
    .line 1904
    move-result-object v3

    .line 1905
    goto :goto_20

    .line 1906
    :cond_5f
    invoke-static {v5, v0}, Lq6/g;->p(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v11

    .line 1910
    goto :goto_20

    .line 1911
    :cond_60
    invoke-static {v2, v0}, Lq6/g;->w(ILandroid/os/Parcel;)V

    .line 1912
    .line 1913
    .line 1914
    new-instance v0, Lo5/z;

    .line 1915
    .line 1916
    invoke-direct {v0, v11, v3, v4}, Lo5/z;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    .line 1917
    .line 1918
    .line 1919
    return-object v0

    .line 1920
    nop

    .line 1921
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_36
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_9
        :pswitch_0
    .end packed-switch

    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_27
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
    .end packed-switch

    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/y;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    new-array p1, p1, [Lo5/x;

    .line 8
    .line 9
    return-object p1

    .line 10
    :pswitch_1
    new-array p1, p1, [Lo5/y;

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_2
    new-array p1, p1, [Lo5/s0;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_3
    new-array p1, p1, [Lo5/r0;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_4
    new-array p1, p1, [Lo5/w;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_5
    new-array p1, p1, [Lo5/q0;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_6
    new-array p1, p1, [Lo5/p0;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_7
    new-array p1, p1, [Lo5/b1;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_8
    new-array p1, p1, [Lo5/c;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_9
    new-array p1, p1, [Lcom/google/android/gms/fido/common/Transport;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_a
    new-array p1, p1, [Lb5/c;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_b
    new-array p1, p1, [Lb5/a;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_c
    new-array p1, p1, [Lg5/e;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_d
    new-array p1, p1, [Lg5/g;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_e
    new-array p1, p1, [Lg5/i;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_f
    new-array p1, p1, [Lg5/h;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_10
    new-array p1, p1, [Lf5/c;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_11
    new-array p1, p1, [Lf5/a;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_12
    new-array p1, p1, [Lf5/b;

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_13
    new-array p1, p1, [Lcom/google/android/gms/common/internal/j;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_14
    new-array p1, p1, [Lcom/google/android/gms/common/internal/i;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_15
    new-array p1, p1, [Lcom/google/android/gms/common/internal/m0;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_16
    new-array p1, p1, [Lcom/google/android/gms/common/internal/t;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_17
    new-array p1, p1, [Lcom/google/android/gms/common/internal/c0;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_18
    new-array p1, p1, [Lcom/google/android/gms/common/internal/b0;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_19
    new-array p1, p1, [Lcom/google/android/gms/common/internal/q;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_1a
    new-array p1, p1, [Lcom/google/android/gms/common/internal/u;

    .line 86
    .line 87
    return-object p1

    .line 88
    :pswitch_1b
    new-array p1, p1, [Lcom/google/android/gms/common/api/Status;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_1c
    new-array p1, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 92
    .line 93
    return-object p1

    .line 94
    :goto_0
    new-array p1, p1, [Lo5/z;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
