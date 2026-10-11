.class public final Lcom/bumptech/glide/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/i;


# instance fields
.field public final a:Lm4/e;

.field public final b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lw7/b;->q(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/bumptech/glide/m;->b:Landroid/view/View;

    .line 8
    .line 9
    new-instance v0, Lm4/e;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lm4/e;-><init>(Landroid/widget/ImageView;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/bumptech/glide/m;->a:Lm4/e;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ll4/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/m;->b:Landroid/view/View;

    .line 2
    .line 3
    const v1, 0x7f0a00f0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic d(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(Ljava/lang/Object;Ln4/d;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()Ll4/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/m;->b:Landroid/view/View;

    .line 2
    .line 3
    const v1, 0x7f0a00f0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    instance-of v1, v0, Ll4/c;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, Ll4/c;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v1, "You must not pass non-R.id ids to setTag(id)"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    :goto_0
    return-object v0
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bumptech/glide/m;->a:Lm4/e;

    .line 2
    .line 3
    iget-object v0, p1, Lm4/e;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p1, Lm4/e;->c:Lm4/d;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput-object v0, p1, Lm4/e;->c:Lm4/d;

    .line 22
    .line 23
    iget-object p1, p1, Lm4/e;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final h(Lm4/h;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/m;->a:Lm4/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm4/e;->c()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0}, Lm4/e;->b()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/high16 v3, -0x80000000

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    if-gtz v1, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v6, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    move v6, v5

    .line 23
    :goto_1
    if-eqz v6, :cond_4

    .line 24
    .line 25
    if-gtz v2, :cond_3

    .line 26
    .line 27
    if-ne v2, v3, :cond_2

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move v3, v4

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    :goto_2
    move v3, v5

    .line 33
    :goto_3
    if-eqz v3, :cond_4

    .line 34
    .line 35
    move v4, v5

    .line 36
    :cond_4
    if-eqz v4, :cond_5

    .line 37
    .line 38
    check-cast p1, Ll4/h;

    .line 39
    .line 40
    invoke-virtual {p1, v1, v2}, Ll4/h;->n(II)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_5
    iget-object v1, v0, Lm4/e;->b:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_6

    .line 51
    .line 52
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_6
    iget-object p1, v0, Lm4/e;->c:Lm4/d;

    .line 56
    .line 57
    if-nez p1, :cond_7

    .line 58
    .line 59
    iget-object p1, v0, Lm4/e;->a:Landroid/view/View;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v1, Lm4/d;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lm4/d;-><init>(Lm4/e;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, v0, Lm4/e;->c:Lm4/d;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 73
    .line 74
    .line 75
    :cond_7
    :goto_4
    return-void
.end method

.method public final i(Lm4/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/m;->a:Lm4/e;

    .line 2
    .line 3
    iget-object v0, v0, Lm4/e;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final bridge synthetic j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic k()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Target for: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/bumptech/glide/m;->b:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bumptech/glide/m;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
