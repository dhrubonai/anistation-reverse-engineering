.class public final Landroidx/activity/f;
.super Lc/h;
.source "SourceFile"


# instance fields
.field public final synthetic i:Landroidx/activity/j;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/b0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/f;->i:Landroidx/activity/j;

    .line 2
    .line 3
    invoke-direct {p0}, Lc/h;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(ILd/a;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/activity/f;->i:Landroidx/activity/j;

    .line 2
    .line 3
    invoke-virtual {p2, v0, p3}, Ld/a;->b(Landroidx/activity/j;Ljava/lang/Object;)Landroidx/fragment/app/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance p2, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance p3, La/d;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p3, p0, p1, v1, v0}, La/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p2, v0, p3}, Ld/a;->a(Landroidx/activity/j;Ljava/lang/Object;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p3}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    if-nez p3, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    const-string p3, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 56
    .line 57
    invoke-virtual {p2, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p2, p3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v7, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 p3, 0x0

    .line 73
    move-object v7, p3

    .line 74
    :goto_0
    const-string p3, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    if-eqz p3, :cond_c

    .line 85
    .line 86
    const-string p3, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 87
    .line 88
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const/4 p3, 0x0

    .line 93
    if-nez p2, :cond_3

    .line 94
    .line 95
    new-array p2, p3, [Ljava/lang/String;

    .line 96
    .line 97
    :cond_3
    sget v1, Lw/g;->a:I

    .line 98
    .line 99
    new-instance v1, Ljava/util/HashSet;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 102
    .line 103
    .line 104
    move v2, p3

    .line 105
    :goto_1
    array-length v3, p2

    .line 106
    if-ge v2, v3, :cond_6

    .line 107
    .line 108
    aget-object v3, p2, v2

    .line 109
    .line 110
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_5

    .line 115
    .line 116
    invoke-static {}, Lcom/bumptech/glide/d;->G()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_4

    .line 121
    .line 122
    aget-object v3, p2, v2

    .line 123
    .line 124
    const-string v4, "android.permission.POST_NOTIFICATIONS"

    .line 125
    .line 126
    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    new-instance p3, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v0, "Permission request for permissions "

    .line 147
    .line 148
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    const-string v0, " must not contain null or empty values"

    .line 156
    .line 157
    invoke-static {p3, p2, v0}, La3/g;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :cond_6
    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-lez v2, :cond_7

    .line 170
    .line 171
    array-length v3, p2

    .line 172
    sub-int/2addr v3, v2

    .line 173
    new-array v3, v3, [Ljava/lang/String;

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    move-object v3, p2

    .line 177
    :goto_2
    if-lez v2, :cond_a

    .line 178
    .line 179
    array-length v4, p2

    .line 180
    if-ne v2, v4, :cond_8

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_8
    move v2, p3

    .line 184
    :goto_3
    array-length v4, p2

    .line 185
    if-ge p3, v4, :cond_a

    .line 186
    .line 187
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-nez v4, :cond_9

    .line 196
    .line 197
    add-int/lit8 v4, v2, 0x1

    .line 198
    .line 199
    aget-object v5, p2, p3

    .line 200
    .line 201
    aput-object v5, v3, v2

    .line 202
    .line 203
    move v2, v4

    .line 204
    :cond_9
    add-int/lit8 p3, p3, 0x1

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_a
    instance-of p3, v0, Lw/e;

    .line 208
    .line 209
    if-eqz p3, :cond_b

    .line 210
    .line 211
    move-object p3, v0

    .line 212
    check-cast p3, Lw/e;

    .line 213
    .line 214
    invoke-interface {p3, p1}, Lw/e;->validateRequestPermissionsRequestCode(I)V

    .line 215
    .line 216
    .line 217
    :cond_b
    invoke-static {v0, p2, p1}, Lw/c;->b(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_c
    const-string p3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 222
    .line 223
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    if-eqz p3, :cond_d

    .line 232
    .line 233
    const-string p3, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 234
    .line 235
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    check-cast p2, Lc/k;

    .line 240
    .line 241
    :try_start_0
    iget-object v1, p2, Lc/k;->a:Landroid/content/IntentSender;

    .line 242
    .line 243
    iget-object v3, p2, Lc/k;->b:Landroid/content/Intent;

    .line 244
    .line 245
    iget v4, p2, Lc/k;->c:I

    .line 246
    .line 247
    iget v5, p2, Lc/k;->d:I

    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    sget p2, Lw/g;->a:I

    .line 251
    .line 252
    move v2, p1

    .line 253
    invoke-static/range {v0 .. v7}, Lw/a;->c(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :catch_0
    move-exception p2

    .line 258
    new-instance p3, Landroid/os/Handler;

    .line 259
    .line 260
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 265
    .line 266
    .line 267
    new-instance v0, La/d;

    .line 268
    .line 269
    const/4 v1, 0x2

    .line 270
    invoke-direct {v0, p0, p1, p2, v1}, La/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_d
    sget p3, Lw/g;->a:I

    .line 278
    .line 279
    invoke-static {v0, p2, p1, v7}, Lw/a;->b(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 280
    .line 281
    .line 282
    :goto_4
    return-void
.end method
