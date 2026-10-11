.class public final Landroid/support/v4/media/a;
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
    iput p1, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :pswitch_0
    new-instance v0, Lp2/c;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lp2/c;-><init>(Landroid/os/Parcel;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_1
    new-instance v0, Lp2/b;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lp2/b;-><init>(Landroid/os/Parcel;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_2
    new-instance v0, Lo2/b;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lo2/b;-><init>(Landroid/os/Parcel;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_3
    new-instance v0, Lo2/a;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lo2/a;-><init>(Landroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_4
    new-instance v0, Ln2/a;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Ln2/a;-><init>(Landroid/os/Parcel;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    new-instance v1, Lm2/a;

    .line 50
    .line 51
    invoke-direct {v1, p1, v0}, Lm2/a;-><init>(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_6
    new-instance v0, Lp1/u;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Lp1/u;-><init>(Landroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_7
    new-instance v0, Lp1/v;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Lp1/v;-><init>(Landroid/os/Parcel;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_8
    new-instance v0, Lg1/c;

    .line 68
    .line 69
    invoke-direct {v0, p1}, Lg1/c;-><init>(Landroid/os/Parcel;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_9
    new-instance v0, Lg1/b;

    .line 74
    .line 75
    invoke-direct {v0, p1}, Lg1/b;-><init>(Landroid/os/Parcel;)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_a
    new-instance v0, Lg1/a;

    .line 80
    .line 81
    invoke-direct {v0, p1}, Lg1/a;-><init>(Landroid/os/Parcel;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_b
    new-instance v0, Lc1/a1;

    .line 86
    .line 87
    invoke-direct {v0, p1}, Lc1/a1;-><init>(Landroid/os/Parcel;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_c
    new-instance v0, Lc1/p0;

    .line 92
    .line 93
    invoke-direct {v0, p1}, Lc1/p0;-><init>(Landroid/os/Parcel;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_d
    new-instance v0, Lc1/o;

    .line 98
    .line 99
    invoke-direct {v0, p1}, Lc1/o;-><init>(Landroid/os/Parcel;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_e
    new-instance v0, Lc1/p;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Lc1/p;-><init>(Landroid/os/Parcel;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_f
    new-instance v0, Landroidx/fragment/app/y0;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Landroidx/fragment/app/y0;-><init>(Landroid/os/Parcel;)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_10
    new-instance v0, Landroidx/fragment/app/u0;

    .line 116
    .line 117
    invoke-direct {v0, p1}, Landroidx/fragment/app/u0;-><init>(Landroid/os/Parcel;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_11
    new-instance v0, Landroidx/fragment/app/p0;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Landroidx/fragment/app/p0;-><init>(Landroid/os/Parcel;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_12
    new-instance v0, Landroidx/fragment/app/c;

    .line 128
    .line 129
    invoke-direct {v0, p1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_13
    new-instance v0, Landroidx/fragment/app/b;

    .line 134
    .line 135
    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_14
    new-instance v0, Lk0/l;

    .line 140
    .line 141
    invoke-direct {v0, p1}, Lk0/l;-><init>(Landroid/os/Parcel;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_15
    new-instance v0, Landroidx/appcompat/widget/u0;

    .line 146
    .line 147
    invoke-direct {v0, p1}, Landroidx/appcompat/widget/u0;-><init>(Landroid/os/Parcel;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_16
    new-instance v0, Lc/k;

    .line 152
    .line 153
    invoke-direct {v0, p1}, Lc/k;-><init>(Landroid/os/Parcel;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_17
    new-instance v0, Lc/a;

    .line 158
    .line 159
    invoke-direct {v0, p1}, Lc/a;-><init>(Landroid/os/Parcel;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :pswitch_18
    new-instance v0, La/e;

    .line 164
    .line 165
    invoke-direct {v0, p1}, La/e;-><init>(Landroid/os/Parcel;)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_19
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_1a
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 184
    .line 185
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_1b
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 190
    .line 191
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const/4 v0, 0x0

    .line 196
    if-eqz p1, :cond_5

    .line 197
    .line 198
    check-cast p1, Landroid/media/MediaDescription;

    .line 199
    .line 200
    invoke-static {p1}, Landroid/support/v4/media/b;->g(Landroid/media/MediaDescription;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-static {p1}, Landroid/support/v4/media/b;->i(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {p1}, Landroid/support/v4/media/b;->h(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-static {p1}, Landroid/support/v4/media/b;->c(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {p1}, Landroid/support/v4/media/b;->e(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {p1}, Landroid/support/v4/media/b;->f(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-static {p1}, Landroid/support/v4/media/b;->d(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    if-eqz v5, :cond_0

    .line 229
    .line 230
    invoke-static {v5}, Lw7/b;->Y(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    :cond_0
    const-string v8, "android.support.v4.media.description.MEDIA_URI"

    .line 235
    .line 236
    if-eqz v5, :cond_1

    .line 237
    .line 238
    invoke-virtual {v5, v8}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    check-cast v9, Landroid/net/Uri;

    .line 243
    .line 244
    goto :goto_0

    .line 245
    :cond_1
    move-object v9, v0

    .line 246
    :goto_0
    if-eqz v9, :cond_3

    .line 247
    .line 248
    const-string v10, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 249
    .line 250
    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    if-eqz v11, :cond_2

    .line 255
    .line 256
    invoke-virtual {v5}, Landroid/os/BaseBundle;->size()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    const/4 v12, 0x2

    .line 261
    if-ne v11, v12, :cond_2

    .line 262
    .line 263
    move-object v8, v0

    .line 264
    goto :goto_1

    .line 265
    :cond_2
    invoke-virtual {v5, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    :cond_3
    move-object v8, v5

    .line 272
    :goto_1
    if-eqz v9, :cond_4

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_4
    invoke-static {p1}, Landroid/support/v4/media/c;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object v9, v0

    .line 280
    :goto_2
    new-instance v0, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 281
    .line 282
    move-object v5, v1

    .line 283
    check-cast v5, Ljava/lang/CharSequence;

    .line 284
    .line 285
    move-object v10, v3

    .line 286
    check-cast v10, Ljava/lang/CharSequence;

    .line 287
    .line 288
    move-object v11, v4

    .line 289
    check-cast v11, Ljava/lang/CharSequence;

    .line 290
    .line 291
    move-object v1, v0

    .line 292
    move-object v3, v5

    .line 293
    move-object v4, v10

    .line 294
    move-object v5, v11

    .line 295
    invoke-direct/range {v1 .. v9}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 296
    .line 297
    .line 298
    iput-object p1, v0, Landroid/support/v4/media/MediaDescriptionCompat;->z:Landroid/media/MediaDescription;

    .line 299
    .line 300
    :cond_5
    return-object v0

    .line 301
    :pswitch_1c
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 302
    .line 303
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 304
    .line 305
    .line 306
    return-object v0

    .line 307
    :goto_3
    new-instance v0, Lq2/a;

    .line 308
    .line 309
    invoke-direct {v0, p1}, Lq2/a;-><init>(Landroid/os/Parcel;)V

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroid/support/v4/media/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    new-array p1, p1, [Lp2/c;

    .line 8
    .line 9
    return-object p1

    .line 10
    :pswitch_1
    new-array p1, p1, [Lp2/b;

    .line 11
    .line 12
    return-object p1

    .line 13
    :pswitch_2
    new-array p1, p1, [Lo2/b;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_3
    new-array p1, p1, [Lo2/a;

    .line 17
    .line 18
    return-object p1

    .line 19
    :pswitch_4
    new-array p1, p1, [Ln2/a;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_5
    new-array p1, p1, [Lm2/a;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_6
    new-array p1, p1, [Lp1/u;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_7
    new-array p1, p1, [Lp1/v;

    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_8
    new-array p1, p1, [Lg1/c;

    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_9
    new-array p1, p1, [Lg1/b;

    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_a
    new-array p1, p1, [Lg1/a;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_b
    new-array p1, p1, [Lc1/a1;

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_c
    new-array p1, p1, [Lc1/p0;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_d
    new-array p1, p1, [Lc1/o;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_e
    new-array p1, p1, [Lc1/p;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_f
    new-array p1, p1, [Landroidx/fragment/app/y0;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_10
    new-array p1, p1, [Landroidx/fragment/app/u0;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_11
    new-array p1, p1, [Landroidx/fragment/app/p0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_12
    new-array p1, p1, [Landroidx/fragment/app/c;

    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_13
    new-array p1, p1, [Landroidx/fragment/app/b;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_14
    new-array p1, p1, [Lk0/l;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_15
    new-array p1, p1, [Landroidx/appcompat/widget/u0;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_16
    new-array p1, p1, [Lc/k;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_17
    new-array p1, p1, [Lc/a;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_18
    new-array p1, p1, [La/e;

    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_19
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 83
    .line 84
    return-object p1

    .line 85
    :pswitch_1a
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 86
    .line 87
    return-object p1

    .line 88
    :pswitch_1b
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_1c
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 92
    .line 93
    return-object p1

    .line 94
    :goto_0
    new-array p1, p1, [Lq2/a;

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
