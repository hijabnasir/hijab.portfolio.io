const express = require('express');
const router = express.Router();

router.get('/', (req, res) => {
  const searchTerm = req.query.q; // Get the search term from the query string

  if (searchTerm.toLowerCase() === 'all books') {
    // Redirect to the "All Books" page
    return res.redirect('/catalog/books');
  }

  if (searchTerm.toLowerCase() === 'all authors') {
    // Redirect to the "All Authors" page
    return res.redirect('/catalog/authors');
  }

  if (searchTerm.toLowerCase() === 'all genres') {
    // Redirect to the "All genres" page
    return res.redirect('/catalog/genres');
  }
  
  // Render the search results
  res.render('search', { title: 'Search Results', searchTerm, results });
});

module.exports = router;
