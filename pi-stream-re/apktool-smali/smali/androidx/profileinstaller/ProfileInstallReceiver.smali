.class public Landroidx/profileinstaller/ProfileInstallReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "androidx.profileinstaller.action.INSTALL_PROFILE"

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    new-instance p2, Lk/a;

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    invoke-direct {p2, v0}, Lk/a;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lk3/d;

    .line 24
    .line 25
    invoke-direct {v0, p0, v2}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-static {p1, p2, v0, v1}, Lcom/bumptech/glide/d;->j0(Landroid/content/Context;Lk/a;Lk3/e;Z)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_1

    .line 33
    .line 34
    :cond_1
    const-string v1, "androidx.profileinstaller.action.SKIP_FILE"

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/16 v3, 0xa

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-eqz p2, :cond_9

    .line 50
    .line 51
    const-string v0, "EXTRA_SKIP_FILE_OPERATION"

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const-string v0, "WRITE_SKIP_FILE"

    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v1, 0x4

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    new-instance p2, Lk3/d;

    .line 67
    .line 68
    invoke-direct {p2, p0, v2}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :try_start_0
    invoke-virtual {v5, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {v0, p1}, Lcom/bumptech/glide/d;->K(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Lf1/k;

    .line 95
    .line 96
    invoke-direct {p1, p2, v3, v4, v1}, Lf1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :catch_0
    move-exception p1

    .line 105
    new-instance v0, Lf1/k;

    .line 106
    .line 107
    const/4 v2, 0x7

    .line 108
    invoke-direct {v0, p2, v2, p1, v1}, Lf1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :cond_2
    const-string v0, "DELETE_SKIP_FILE"

    .line 117
    .line 118
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_9

    .line 123
    .line 124
    new-instance p2, Lk3/d;

    .line 125
    .line 126
    invoke-direct {p2, p0, v2}, Lk3/d;-><init>(Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, Ljava/io/File;

    .line 134
    .line 135
    const-string v2, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    .line 136
    .line 137
    invoke-direct {v0, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 141
    .line 142
    .line 143
    new-instance p1, Lf1/k;

    .line 144
    .line 145
    const/16 v0, 0xb

    .line 146
    .line 147
    invoke-direct {p1, p2, v0, v4, v1}, Lf1/k;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    :cond_3
    const-string v1, "androidx.profileinstaller.action.SAVE_PROFILE"

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    sget-object v2, Lcom/bumptech/glide/d;->i:Lw1/o;

    .line 162
    .line 163
    const/16 v5, 0x18

    .line 164
    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 168
    .line 169
    if-lt p1, v5, :cond_4

    .line 170
    .line 171
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-static {p1, v3}, Landroid/os/Process;->sendSignal(II)V

    .line 176
    .line 177
    .line 178
    const/16 p1, 0xc

    .line 179
    .line 180
    invoke-virtual {v2, p1, v4}, Lw1/o;->l(ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_4
    const/16 p1, 0xd

    .line 188
    .line 189
    invoke-virtual {v2, p1, v4}, Lw1/o;->l(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_5
    const-string v1, "androidx.profileinstaller.action.BENCHMARK_OPERATION"

    .line 197
    .line 198
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-eqz p2, :cond_9

    .line 209
    .line 210
    const-string v0, "EXTRA_BENCHMARK_OPERATION"

    .line 211
    .line 212
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    const-string v0, "DROP_SHADER_CACHE"

    .line 217
    .line 218
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    if-eqz p2, :cond_8

    .line 223
    .line 224
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    if-lt p2, v5, :cond_6

    .line 227
    .line 228
    invoke-static {p1}, Lf1/z;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    goto :goto_0

    .line 237
    :cond_6
    invoke-virtual {p1}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    :goto_0
    invoke-static {p1}, Lj5/a;->r(Ljava/io/File;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_7

    .line 246
    .line 247
    const/16 p1, 0xe

    .line 248
    .line 249
    invoke-virtual {v2, p1, v4}, Lw1/o;->l(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_7
    const/16 p1, 0xf

    .line 257
    .line 258
    invoke-virtual {v2, p1, v4}, Lw1/o;->l(ILjava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 262
    .line 263
    .line 264
    goto :goto_1

    .line 265
    :cond_8
    const/16 p1, 0x10

    .line 266
    .line 267
    invoke-virtual {v2, p1, v4}, Lw1/o;->l(ILjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 271
    .line 272
    .line 273
    :cond_9
    :goto_1
    return-void
.end method
