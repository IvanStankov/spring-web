<form action="create-movie" method="post">
    <div class="form-group">
        <label for="name">Name</label>
        <input id="name" name="name" class="form-control" placeholder="Type movie name here">
    </div>
    <div class="form-group">
        <label for="imageUrl">Poster url</label>
        <input id="imageUrl" name="imageUrl" class="form-control" placeholder="Type poster url here">
    </div>
    <div class="form-group">
        <label for="description">Description</label>
        <textarea id="description" name="description" class="form-control" rows="5" placeholder="Type description here">
        </textarea>
    </div>
    <button type="submit" class="btn btn-primary">Save movie</button>
</form>