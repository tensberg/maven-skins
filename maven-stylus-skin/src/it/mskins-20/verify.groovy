File index = new File( basedir, "target/site/index.html" )
assert index.exists()
assert 1 == index.getText().count( 'Last Published: 1970-01-01' )
assert 0 == index.getText().count( 'Generated by Apache Maven Doxia at')